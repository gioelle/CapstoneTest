package com.joelle.capstone;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
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
import com.joelle.entity.Transaction;
import com.joelle.entity.User;
import com.joelle.service.PersonService;
import com.joelle.service.PostingService;
import com.joelle.service.TransactionService;

/**
 * Handles requests for the application home page, after user is logged in.
 */
@Controller
public class HomeController {
	@Autowired
	private PersonService personService;
	@Autowired
	private PostingService postingService;
	@Autowired
	private TransactionService transactionService;
	//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String toHome(Model model, HttpSession session) {
		User userLogin = (User) session.getAttribute("userLogin");
		getPosts(model, userLogin.getEmail());
		getTransactions(model, userLogin.getEmail());
		model.addAttribute("newPost", new Posting());
		return "home";
	}

	@RequestMapping(value="/uploadProfile", method=RequestMethod.POST)
	public String uploadFileHandler(@RequestParam("file") MultipartFile file, Model model,HttpSession session) {
		User userLogin = (User) session.getAttribute("userLogin");
		System.out.println("Uploading Profile Pic....!!!!!"+userLogin.getEmail());

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
				personService.save2(userLogin);
				session.setAttribute("loggedInUser", userLogin);
				
			}
			getPosts(model, userLogin.getEmail());
			getTransactions(model, userLogin.getEmail());

		//	model.addAttribute("transaction", transaction);

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

	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(Model model, @RequestParam("id")String id, HttpSession session) {
		postingService.deletePost(id);
		User userLogin = (User) session.getAttribute("userLogin");
		getPosts(model, userLogin.getEmail());
		getTransactions(model, userLogin.getEmail());
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


