package com.joelle.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="transaction")
public class Transaction {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id", updatable=false, nullable=false)
	private long id;
	@CreationTimestamp	
	@Column(name="transaction_date")
	private Timestamp date;
	@Column(name="value")
	private int value;
	@Column(name="user")
	private String buyingUser;
	@Column(name="title")
	private String title;
	@Column(name="type") 
	private String type;
	@Column(name="email")
	private String email;
	@Column(name="rated")
	private boolean rated;
	
	//@OneToOne
	//@JoinColumn(name="email", insertable=false, updatable=false)
	//private User user;

	public Transaction() {};
	public Transaction(String email, String title, int value, String buyingUser, String type) {
		this.email = email;
		this.title = title;
		this.value = value;
		this.buyingUser = buyingUser;
		this.type = type;
	}
	
	public boolean isRated() {
		return rated;
	}
	public void setRated(boolean rated) {
		this.rated = rated;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Timestamp getDate() {
		return date;
	}


	public void setDate(Timestamp date) {
		this.date = date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBuyingUser() {
		return buyingUser;
	}


	public void setBuyingUser(String buyingUser) {
		this.buyingUser = buyingUser;
	}

	public double getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
