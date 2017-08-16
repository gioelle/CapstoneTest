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
	
	@Transactional
	public void deletePost(String id) {
		System.out.println("Id = " + id);
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
}
