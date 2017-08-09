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
	
	@Autowired 
	private PostRepository postRepository;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public ArrayList<Posting> getAllPosts() {
		return (ArrayList<Posting>) entityManager.createNativeQuery(getAllPosts, Posting.class).getResultList();
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
