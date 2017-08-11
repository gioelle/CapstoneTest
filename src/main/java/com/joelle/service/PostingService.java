package com.joelle.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joelle.entity.Posting;
import com.joelle.repository.PostRepository;

import org.springframework.transaction.annotation.Transactional;


@Service
public class PostingService {
	@PersistenceContext
	private EntityManager entityManager;
	
	private String getAllPosts = "Select P.* from post P where P.instances>0";
	private String getItemPosts = "Select P.* from post P where P.instances>0 AND P.type = 'item'";
	private String getResourcePosts = "Select P.* from post P where P.instances>0 AND P.type = 'resource'";
	private String getServicePosts = "Select P.* from post P where P.instances>0 AND P.type = 'service'";
	

	@Autowired 
	private PostRepository postRepository;
	
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
	public void save(Posting post) {
		this.entityManager.persist(post);
	}
	
	@Transactional
	public void save2(Posting post) {
		this.postRepository.save(post);
	}
}
