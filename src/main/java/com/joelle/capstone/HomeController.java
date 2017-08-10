package com.joelle.capstone;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.joelle.entity.Posting;
import com.joelle.entity.User;
import com.joelle.service.PersonService;

/**
 * Handles requests for the application home page, after user is logged in.
 */
@Controller
public class HomeController {
	@Autowired
	private PersonService personService;
	//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String toHome(Model model, @ModelAttribute("userLogin") User userLogin) {
		model.addAttribute("userLogin", userLogin);
		return "home";
	}

	@RequestMapping(value="/uploadProfile", method=RequestMethod.POST)
	public String uploadFileHandler(@RequestParam("file") MultipartFile file, Model model,HttpSession session) {
		User loggedInUser = (User) session.getAttribute("loggedInUser");
		System.out.println("Uploading Profile Pic....!!!!!"+loggedInUser.getEmail());
		
		try {
			if(!file.isEmpty()) {
				String fileName = file.getOriginalFilename();
				String basePath = "C:\\Users\\Joelle\\Workspace\\SwaProcity\\src\\main\\resources\\static\\img";
				String uploadPath = basePath+"\\"+loggedInUser.getEmail()+"\\"+fileName;
				String profilePath = "/img/" + loggedInUser.getEmail() + "/" + fileName;
				File fileToUpload = new File(uploadPath);
				FileUtils.writeByteArrayToFile(fileToUpload, file.getBytes());
				
				System.out.println("Profile Pic path:  "+profilePath);
				loggedInUser.setProfilePic(profilePath);
				session.setAttribute("loggedInUser", loggedInUser);
				personService.save2(loggedInUser);
			}
			
			ArrayList<Posting> posts = personService.getUsersPosts(loggedInUser.getEmail());		
			System.out.println("size of record: " + posts.size());
			for (Posting posting : posts) {
				System.out.println(posting.getType());
			}
			model.addAttribute("myUserPost", posts);
		}catch(Exception e) {

		}
		return "home";
	}

	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String toAbout(Model model, @ModelAttribute("userLogin") User userLogin) {
		System.out.println("Logged in User: "+userLogin.getEmail());
		model.addAttribute("userLogin", userLogin);
		return "about";
	}
}


