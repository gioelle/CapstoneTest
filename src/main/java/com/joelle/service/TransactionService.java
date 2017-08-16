package com.joelle.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joelle.entity.Posting;
import com.joelle.entity.Transaction;
import com.joelle.repository.TransRepository;

@Service	
public class TransactionService {
	@PersistenceContext
	private EntityManager entityManager;

//	private String getAllTrans = "Select T from transaction T";
	private String getUserTrans = "select T.* from transaction T where T.user=:email OR T.email=:email";
//	private String getUserItemTrans = "Select T from post T where T.type = 'item' AND T.email=:email";
//	private String getUserResourceTrans = "Select T from post T where T.type = 'resource' AND T.email=:email";
//	private String getUserServiceTrans = "Select T from post T where T.type = 'service' AND T.email=:email";

	@Autowired 
	private TransRepository transRepository;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public ArrayList<Transaction> getUsersTrans(String email){
		System.out.println("user email: " + email);
		ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		transactions = (ArrayList<Transaction>)entityManager.createNativeQuery(getUserTrans, Transaction.class).setParameter("email", email).getResultList();
		for (Transaction transaction : transactions) {
			System.out.println(transaction.getTitle());
		}
		return transactions;
	}
	
	@Transactional
	public void save(Transaction transaction) {
		this.entityManager.persist(transaction);
	}
	
	@Transactional
	public void save2(Transaction transaction) {
		this.transRepository.save(transaction);
	}
}
