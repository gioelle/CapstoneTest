package com.joelle.capstone;

import java.io.File;

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
	public ModelAndView toHome(Model model, @ModelAttribute("userLogin") User userLogin) {
		return new ModelAndView("home", "userLogin", userLogin );
	}

	@RequestMapping(value="/uploadProfile", method=RequestMethod.POST)
	public String uploadFileHandler(@RequestParam("file") MultipartFile file, Model model,@Valid @ModelAttribute ("userLogin") User userLogin ,HttpSession session) {
			
		System.out.println("Uploading Profile Pic....!!!!!"+userLogin.getEmail()+model.containsAttribute("userLogin"));
		
		try {
			if(!file.isEmpty()) {
				String fileName = file.getOriginalFilename();
				String basePath = "C:\\Users\\Joelle\\Workspace\\SwaProcity\\src\\main\\resources\\static\\img";
				String uploadPath = basePath+"\\"+userLogin.getEmail()+"\\"+fileName;
				String profilePath = "/img/" + userLogin.getEmail() + "/" + fileName;
				File fileToUpload = new File(uploadPath);
				FileUtils.writeByteArrayToFile(fileToUpload, file.getBytes());
				
				System.out.println("Profile Pic path:  "+profilePath);
				userLogin.setProfilePic(profilePath);
				model.addAttribute("userLogin",userLogin);
				personService.save2(userLogin);
			}
		}catch(Exception e) {

		}
		return "home";
	}

	@RequestMapping(value="/about", method=RequestMethod.GET)
	public ModelAndView toAbout(Model model, @ModelAttribute("userLogin") User userLogin) {
		System.out.println("Logged in User: "+userLogin.getEmail());
		return new ModelAndView("about", "userLogin", userLogin );
	}
}


