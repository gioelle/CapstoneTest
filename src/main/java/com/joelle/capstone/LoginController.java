package com.joelle.capstone;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.joelle.entity.Posting;
import com.joelle.entity.Transaction;
import com.joelle.entity.User;
import com.joelle.service.PersonService;
import com.joelle.service.PostingService;
import com.joelle.service.SendMail;
import com.joelle.service.TransactionService;
/**
 * Handles requests for the application landing page "about.jsp"
 */
@Controller
public class LoginController {
	@Autowired
	PersonService personService;
	@Autowired
	PostingService postingService;
	@Autowired
	TransactionService transactionService;
	
	@Autowired
	private SendMail emailService;
	private final static String newUserMessage = "We're so happy you've joined our community. To learn more please visit our website.";
	private final static String newUserSubject = "Welcome to SwaProcity!";
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("user") User user, HttpSession session) {
    	if(user != null) {
    		personService.save(user);
    		model.addAttribute("loggedInUser", user);
    		model.addAttribute("newPost", new Posting());
    		emailService.sendMail(user.getEmail(), newUserSubject, newUserMessage);
    		session.setAttribute("userLogin", user);
    		return "home";
    	} else {
    		return "about";
    	}
    }
    
    @RequestMapping(value = "/logout", method= RequestMethod.GET)
    public String logout(Model model, HttpSession session) {
    		model.addAttribute("userLogin", new User());
    		session.removeAttribute("loggedInUser");
    		return "about";
    }

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
			model.addAttribute("userLogin", new User());
		return "about";
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		return "home";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLogin(Model model, @ModelAttribute("userLogin") User userLogin, HttpSession session) {
		
		User u = this.personService.login(userLogin.getEmail(), userLogin.getPassword());
	
		if(u == null) {
			model.addAttribute("loginError", "invalid username or password");
			return "about";
		} else {
			ArrayList<Posting> posts = personService.getUsersPosts(userLogin.getEmail());		
			System.out.println("size of record: " + posts.size());
			for (Posting posting : posts) {
				System.out.println(posting.getType());
			}
			model.addAttribute("myUserPost", posts);
    		model.addAttribute("newPost", new Posting());
    		getTransactions(model, userLogin.getEmail());
			model.addAttribute("userLogin", u);
			session.setAttribute("userLogin", u);
			return "home";
		}

	}
	
	private void getTransactions(Model model, String email) {
		ArrayList<Transaction> trans = transactionService.getUsersTrans(email);		
		model.addAttribute("transactions", trans);
	}
}
