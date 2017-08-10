package com.joelle.capstone;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joelle.entity.Posting;
import com.joelle.entity.User;
import com.joelle.service.PersonService;
import com.joelle.service.PostingService;

@Controller
public class LoginController {
//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String init(Model model) {
//        model.addAttribute("msg", "Please Enter Your Login Details");
//        return "login.jsp";
//    }
	@Autowired
	PersonService personService;
	@Autowired
	PostingService postingService;
    
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
    		model.addAttribute("userLogin", null);
    		return"about";
    }
    	
}
