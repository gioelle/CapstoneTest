package com.joelle.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joelle.entity.Posting;
import com.joelle.entity.User;
import com.joelle.repository.PersonRepository;

@Service
public class PersonService {
	@PersistenceContext
	private EntityManager entityManager;
	
	private String loginSql = "select U.* from user U where U.email=:email and U.password=:password";
	private String getUsersPosts = "select P.* from post P where P.email=:email";
	
	@Autowired
	private PersonRepository personRepository;
	
	@Transactional
	public User login(String email, String password) {
		return (User) entityManager.createNativeQuery(loginSql, User.class).setParameter("email", email).setParameter("password", password).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public ArrayList<Posting> getUsersPosts(String email){
		return (ArrayList<Posting>) entityManager.createNativeQuery(getUsersPosts, Posting.class).setParameter("email", email).getResultList();
	}
	
	@Transactional
	public void save(User user) {
		this.entityManager.persist(user);
	}
	
	@Transactional
	public void save2(User user) {
		this.personRepository.save(user);
	}
}
