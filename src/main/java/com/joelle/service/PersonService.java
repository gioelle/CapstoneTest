package com.joelle.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joelle.entity.User;
import com.joelle.repository.PersonRepository;

@Service
public class PersonService {
	@PersistenceContext
	private EntityManager entityManager;
	private String loginSql = "select U.* from user U where U.email=:email and U.password=:password";
	
	@Autowired
	private PersonRepository personRepository;
	
	@Transactional
	public User login(String email, String password) {
		return (User) entityManager.createNativeQuery(loginSql, User.class).setParameter("email", email).setParameter("password", password).getSingleResult();
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
