package com.joelle.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joelle.entity.Posting;
import com.joelle.entity.Transaction;
import com.joelle.repository.PostRepository;
import com.joelle.repository.TransRepository;

@Service	
public class TransactionService {
	@PersistenceContext
	private EntityManager entityManager;
	
	private String getAllTrans = "Select T.* from transaction T";
	private String getUserTrans = "select T.* from transaction T where T.email=:email";
	private String getUserItemTrans = "Select T.* from post T where T.type = 'item' AND T.email=:email";
	private String getUserResourceTrans = "Select T.* from post T where T.type = 'resource' AND T.email=:email";
	private String getUserServiceTrans = "Select T.* from post T where T.type = 'service' AND T.email=:email";

	@Autowired 
	private TransRepository transRepository;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public ArrayList<Transaction> getUserTrans(String email){
		System.out.println("user email: " + email);return (ArrayList<Transaction>) entityManager.createNativeQuery(getUserTrans, Transaction.class).setParameter("email", email).getResultList();
	}
	
}
