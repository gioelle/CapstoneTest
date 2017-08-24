package com.joelle.capstone;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.joelle.entity.Posting;
import com.joelle.entity.Transaction;
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
		session.setAttribute("ratedUser", userToRate);
		return "rating";
	}
	
	@RequestMapping(value="/rateUser", method=RequestMethod.POST)
	public String ratingsHandler(Model model, @RequestParam("avgRating") String avgRating, HttpSession session)/**/ {
		System.out.println("avgRating = "  + avgRating);
		User userToRate = (User) session.getAttribute("ratedUser");
		userToRate.setCount(userToRate.getCount() + 1);
		Double rating = Double.parseDouble(avgRating);
		System.out.println("rating = "  + rating);
		userToRate.setRating(userToRate.getRating()+rating);
		personService.save(userToRate);
		User userLogin = (User) session.getAttribute("userLogin");
		getPosts(model, userLogin.getEmail());
		getTransactions(model, userLogin.getEmail());
		model.addAttribute("newPost", new Posting());
		return "home";
	}
	
	private void getPosts(Model model, String email) {
		ArrayList<Posting> posts = personService.getUsersPosts(email);		
		model.addAttribute("myUserPost", posts);
	}
	
	private void getTransactions(Model model, String email) {
		ArrayList<Transaction> trans = transactionService.getUsersTrans(email);		
		model.addAttribute("transactions", trans);
	}

	
}
