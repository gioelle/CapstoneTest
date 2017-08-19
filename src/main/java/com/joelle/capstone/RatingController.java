package com.joelle.capstone;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.joelle.entity.User;
import com.joelle.service.PersonService;
import com.joelle.service.PostingService;
import com.joelle.service.TransactionService;

@Controller
public class RatingController {

	@Autowired
	private PersonService personService;
	@Autowired
	private PostingService postingService;
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value="/rate", method=RequestMethod.GET)
	public String rateButtonHandler(Model model, @RequestParam("ratedUser")String email, HttpSession session) {
		User userToRate = personService.findByEmail(email);
		model.addAttribute("ratedUser", userToRate);
		return "rating";
	}
	
	@RequestMapping(value="/rateUser", method=RequestMethod.GET)
	public String ratingsHandler(Model model, @RequestParam("ratedUser")String email, @RequestParam("avgRating") Double avgRating, HttpSession session) {
		User userToRate = personService.findByEmail(email);
		userToRate.getRating().add(avgRating);
		return "home";
	}
	
}
