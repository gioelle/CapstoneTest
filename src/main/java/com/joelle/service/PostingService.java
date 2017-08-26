package com.joelle.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joelle.entity.Posting;
import com.joelle.entity.Transaction;
import com.joelle.entity.User;
import com.joelle.repository.PostRepository;

import org.springframework.transaction.annotation.Transactional;


@Service
public class PostingService {
	@PersistenceContext
	private EntityManager entityManager;
	
	private String getAllPosts = "Select P.* from post P where P.instances>0";
	private String getItemPosts = "Select P.* from post P where P.instances>0 AND P.type ='item'";
	private String getResourcePosts = "Select P.* from post P where P.instances>0 AND P.type ='resource'";
	private String getServicePosts = "Select P.* from post P where P.instances>0 AND P.type ='service'";
	private String deleteAPost = "Delete from post where id =:id";

	@Autowired 
	private PostRepository postRepository;
	@Autowired
	private PersonService personService;
	@Autowired
	private TransactionService transactionService;
	@Autowired
	private SendMail emailService;
	
	@Transactional
	public void deletePost(String id) {
		Long deleteId = Long.parseLong(id);
		entityManager.createNativeQuery(deleteAPost, Posting.class).setParameter("id", deleteId).executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public ArrayList<Posting> getAllPosts() {
		return (ArrayList<Posting>) entityManager.createNativeQuery(getAllPosts, Posting.class).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public ArrayList<Posting> getItemPosts() {
		return (ArrayList<Posting>) entityManager.createNativeQuery(getItemPosts, Posting.class).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public ArrayList<Posting> getResourcePosts() {
		return (ArrayList<Posting>) entityManager.createNativeQuery(getResourcePosts, Posting.class).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public ArrayList<Posting> getServicePosts() {
		return (ArrayList<Posting>) entityManager.createNativeQuery(getServicePosts, Posting.class).getResultList();
	}
	
	@Transactional
	public Posting findByID(Long postID) {
		return (Posting) postRepository.findOne(postID);
	}
	
	@Transactional
	public void save(Posting post) {
		this.entityManager.persist(post);
	}
	
	@Transactional
	public void save2(Posting post) {
		this.postRepository.save(post);
	}
	
	@Transactional
	public void swap(long postID, User buyingUser) {
		Posting postSwap = this.findByID(postID);
		postSwap.setInstances((postSwap.getInstances()-1));
		//save the post with the updated instances value
		this.save2(postSwap);
		//change swapoints of the user transacting

		buyingUser.setSwaPointsBalance(buyingUser.getSwaPointsBalance()-postSwap.getValue());
		personService.save2(buyingUser);
		
		//change swapoints of user who created the post
		User postedUser = personService.findByEmail(postSwap.getEmail());
		postedUser.setSwaPointsBalance(postedUser.getSwaPointsBalance()+postSwap.getValue());
		personService.save(postedUser);
	
		
		//create a transaction & save it
		Transaction transaction = new Transaction(postSwap.getEmail(), postSwap.getTitle(), postSwap.getValue(), buyingUser.getEmail(), postSwap.getType());
		transactionService.save(transaction);
		

	}
	public void createMail(User loggedInUser, User postedUser, Posting post) {
		emailService.sendSwapBuyerEmail(loggedInUser, postedUser, post);
		emailService.sendSwapSellerEmail(loggedInUser, postedUser, post);
//		String activeMessage = "Hello, " + loggedInUser.getFirstName()+ ". Thank you for selecting to swap " + post.getTitle() + " with " + postedUser.getFirstName() + ". <br> In order to arrange details of the swap, please contact " + postedUser.getFirstName() + " at " + postedUser.getEmail() + ".  <br> The post you selected and your swaPoints balance now reflect the swap. <br> Your new swaPoints balance is: " + loggedInUser.getSwaPointsBalance() + ".  <br> Once you have completed the swap, you’ll be asked to rate your interaction with " + postedUser.getFirstName() + " in order to keep our community honest. " + postedUser.getFirstName() + " will be asked to rate you, as well. We hope that your experience using SwaProcity has been good, and that you find " + post.getTitle() + " to be exactly what you expected. <br> Thanks again for doing your part to invest in your community, reduce consumption of brand new goods, and help shape the future of our environment.";
//		String subj = "SwaProcity - Thanks for Swapping By!";
//		emailService.sendMail(loggedInUser.getEmail(), subj, activeMessage);
//		String postMessage = "Hello, " + postedUser.getFirstName()+ ". Your post " + post.getTitle() + " has been swapped with" + loggedInUser.getFirstName() + "! They should be reaching out to you to organize the details of swapping your  " + post.getType() + " but you’re welcome to send them a note at: " + loggedInUser.getEmail() + ".  <br> Your post and your swaPoints balance now reflect the swap. <br> Your new swaPoints balance is: " + postedUser.getSwaPointsBalance() + ".  <br> Once you have completed the swap, you are asked to rate your interaction with " + loggedInUser.getFirstName() + " in order to keep our community honest. " + loggedInUser.getFirstName() + " will be asked to rate you, as well. We hope that your experience using SwaProcity has been good, and that your exchange with " + loggedInUser.getFirstName() +" is as smooth as you expected. <br> Thanks again for doing your part to invest in your community, reduce consumption of brand new goods, and help shape the future of our environment.";
//		emailService.sendMail(postedUser.getEmail(), subj, postMessage);
	}

}
