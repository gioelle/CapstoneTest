package com.joelle.capstone;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.joelle.entity.Posting;
import com.joelle.entity.Transaction;
import com.joelle.entity.User;
import com.joelle.repository.PersonRepository;
import com.joelle.service.PersonService;
import com.joelle.service.PostingService;
import com.joelle.service.TransactionService;

@Controller
public class PostingController {
	@Autowired
	PostingService postingService;
	@Autowired
	TransactionService transactionService;
	@Autowired
	PersonService personService;

	
	@RequestMapping(value = "/CreatePosting", method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("posting") Posting posting,
			@RequestParam("file") MultipartFile file) {
		if (posting != null) {
			System.out.println(posting.getTitle());
			if (!file.isEmpty()) {
				try {
					String fileName = file.getOriginalFilename();
					String basePath = "C:\\Users\\Joelle\\Workspace\\SwaProcity\\src\\main\\resources\\static\\img";
					String uploadPath = basePath + "\\" + posting.getEmail() + "\\" + fileName;
					String path = "/img/" + posting.getEmail() + "/" + fileName;
					File fileToUpload = new File(uploadPath);
					FileUtils.writeByteArrayToFile(fileToUpload, file.getBytes());
					// TODO fix this too (both lines)
					posting.setPicture(path);

				} catch (Exception e) {

				}
			}
			postingService.save(posting);
//			model.addAttribute(posting);
			model.addAttribute("myUserPost", (ArrayList<Posting>) personService.getUsersPosts(posting.getEmail()));
    		model.addAttribute("newPost", new Posting());
    		model.addAttribute("userLogin", personService.findByEmail(posting.getEmail()));
			return "home";
		} else {
			model.addAttribute("error", "Please enter posting details");
			return "home";
		}
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String toPostings(Model model, @ModelAttribute("term") String keyword) {
		ArrayList<Posting> posts = postingService.getAllPosts();
		model.addAttribute("post", posts);
		model.addAttribute("postSwap",new Posting());
		return "postings";
	}

	@RequestMapping(value="/item", method=RequestMethod.GET)
	public String getItemPosts(Model model, @ModelAttribute("userLogin") User userLogin) {
		ArrayList<Posting> posts = postingService.getItemPosts();
		System.out.println("Item Posts: "+ posts.size());
		model.addAttribute("postSwap",new Posting());
		model.addAttribute("post", posts);
		model.addAttribute("userLogin", userLogin);
		return "postings";
	}

	@RequestMapping(value="/resource", method=RequestMethod.GET)
	public String getResourcePosts(Model model, @ModelAttribute("userLogin") User userLogin) {
		ArrayList<Posting> posts = postingService.getResourcePosts();
		System.out.println("Resource Posts: "+posts.size());
		model.addAttribute("postSwap",new Posting());
		model.addAttribute("post", posts);
		model.addAttribute("userLogin", userLogin);
		return "postings";
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public String getPostsAllTypes(Model model, @ModelAttribute("userLogin") User userLogin) {
		ArrayList<Posting> posts = postingService.getAllPosts();
		model.addAttribute("postSwap",new Posting());
		model.addAttribute("post", posts);
		model.addAttribute("userLogin", userLogin);
		return "postings";
	}

	@RequestMapping(value="/service", method=RequestMethod.GET)
	public String getServicePosts(Model model, @ModelAttribute("userLogin") User userLogin) {
		ArrayList<Posting> posts = postingService.getServicePosts();
		model.addAttribute("postSwap",new Posting());
		model.addAttribute("post", posts);
		model.addAttribute("userLogin", userLogin);
		return "postings";
	}

	@RequestMapping(value="/swapPost", method=RequestMethod.POST)
	public String processSwap(Model model, @RequestParam("postId")Long postID, HttpSession session) {
		User loggedInUser = (User) session.getAttribute("userLogin");
		postingService.swap(postID, loggedInUser);
		
		ArrayList<Transaction> transactions = personService.getUsersTrans(loggedInUser.getEmail());		
		model.addAttribute("transaction", transactions);
		ArrayList<Posting> posts = personService.getUsersPosts(loggedInUser.getEmail());		
		model.addAttribute("myUserPost", posts);
		model.addAttribute("newPost", new Posting());
		return "home";
	}

}
