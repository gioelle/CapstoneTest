package com.joelle.capstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joelle.entity.User;
import com.joelle.service.PersonService;

@Controller
public class LoginController {
//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String init(Model model) {
//        model.addAttribute("msg", "Please Enter Your Login Details");
//        return "login.jsp";
//    }
	@Autowired
	PersonService personService;
	
    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) {
    	
    	System.out.println("inside loginbean" + loginBean.getUserName() + loginBean.getPassword());
    	//Checks that the loginbean isn't empty, that username and password aren't empty
        if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
            if (loginBean.getUserName().equals("user@user.com") && loginBean.getPassword().equals("pass")) {
            	//Make a method call to DAO to get the user/account model object.
            	
            	User user = new User(); 
            	user.setFirstName("Joelle");
            	user.setPostings(null);
            	user.setTransactions(null);
            	user.setSwaPointsBalance(51);
          // 	user.setPostings(//userservice.getPostingList());
            	//userService.find(loginBean.getUserName(), loginBean.getPassword())
            //	user.setTransactions(userService.getTransaction(user.getEmail()));
            	model.addAttribute("u", user);
                return "home";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "about";
            }
        }
        return "about";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String submit(Model model,
    		@ModelAttribute("user") User user) {
    	if(user != null) {
    		personService.save(user);
    		model.addAttribute("u", user);
    		return "home";
    	} else {
    		return "about";
    	}
    }
    
    @RequestMapping(value = "/logout", method= RequestMethod.POST)
    public String logout(Model model) {
    		
    		return"about";
    }
    	
}
