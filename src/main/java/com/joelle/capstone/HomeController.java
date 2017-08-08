package com.joelle.capstone;

import java.util.Locale;

import javax.servlet.http.HttpSession;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.joelle.entity.User;
import com.joelle.service.PersonService;
import com.joelle.service.SendMail;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private PersonService personService;
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private SendMail emailService;
	private final static String newUserMessage = "We're so happy you've joined our community. To learn more please visit our website.";
	private final static String newUserSubject = "Welcome to SwaProcity!";
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		String formattedDate = dateFormat.format(date);
//		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userLogin", new User());
		model.addAttribute("newUser", new User());
		return "about";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public ModelAndView signup(Model model) {	
		return new ModelAndView("signup", "newUser", new User());
	}
	
	//Do error handling try catch here to avoid problems with internet on demo day
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public ModelAndView handleSignup(Model model, @ModelAttribute("newUser") User newPerson) {
		this.personService.save(newPerson);
		emailService.sendMail(newPerson.getEmail(), newUserSubject,  newUserMessage);
//		System.out.println(newPerson.getEmail() + newUserSubject);	
		return login(model);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(Model model) {
		return new ModelAndView("home", "userLogin", new User());
	}
	
	@RequestMapping("/") //use spring to create a servlet for your index page --- if user doesn't enter a path this is the default
	public String index() {
		return "about"; //tell spring to find and display the index page
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLogin(Model model, @ModelAttribute("userLogin") User userLogin, HttpSession session) {
		User u = this.personService.login(userLogin.getEmail(), userLogin.getPassword());
		if(u == null) {
			model.addAttribute("loginError", "username or password invalid");
			return "about";
		} else {
			session.setAttribute("u", u);
			return "home";
		}
		
	}
}
	

