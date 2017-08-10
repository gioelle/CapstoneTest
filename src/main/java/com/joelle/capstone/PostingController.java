package com.joelle.capstone;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.joelle.entity.Posting;
import com.joelle.entity.User;
import com.joelle.service.PersonService;
import com.joelle.service.PostingService;

@Controller
public class PostingController {
	@Autowired
	PostingService postingService;

	@RequestMapping(value = "/CreatePosting", method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("posting") Posting posting,
			@RequestParam("file") MultipartFile file) {
		if (posting != null) {

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

			// TODO add this posting to my user's array list of postings in the database
			// model.addAttribute( /* how ever i call the posting*/, posting);
			postingService.save(posting);
			model.addAttribute(posting);
			return "home";
		} else {
			model.addAttribute("error", "Please enter posting details");
			return "home";
		}
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String toPostings(Model model, @ModelAttribute("term") String keyword) {
		System.out.println("search controller" + keyword);
		ArrayList<Posting> posts = postingService.getAllPosts();
		model.addAttribute("post", posts);
		return "postings";
	}
	
	@RequestMapping(value="/item", method=RequestMethod.GET)
	public String getItemPosts(Model model, @ModelAttribute("userLogin") User userLogin) {
		ArrayList<Posting> posts = postingService.getItemPosts();
		System.out.println("Item Posts: "+posts.size());
		model.addAttribute("post", posts);
		return "postings";
	}

	@RequestMapping(value="/resource", method=RequestMethod.GET)
	public String getResourcePosts(Model model, @ModelAttribute("userLogin") User userLogin) {
		ArrayList<Posting> posts = postingService.getResourcePosts();
		System.out.println("Resource Posts: "+posts.size());
		model.addAttribute("post", posts);
		return "postings";
	}
	
	@RequestMapping(value="/service", method=RequestMethod.GET)
	public String getServicePosts(Model model, @ModelAttribute("userLogin") User userLogin) {
		ArrayList<Posting> posts = postingService.getServicePosts();
		System.out.println("Service Posts: "+posts.size());
		model.addAttribute("post", posts);
		return "postings";
	}
}
