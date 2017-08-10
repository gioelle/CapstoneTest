package com.joelle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.joelle.entity.Posting;
import com.joelle.entity.Transaction;

public interface TransRepository extends JpaRepository<Transaction, String>{
	@Query("Select T.* from Transaction T")
	public Transaction getAllTrans(); 
}

