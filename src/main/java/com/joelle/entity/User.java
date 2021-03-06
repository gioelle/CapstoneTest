package com.joelle.entity;


import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="last_name")
	private String firstName;
	
	@Column(name="first_name")
	private String lastName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="profile_pic")
	private byte[] profilePic; 
	
	@Column(name="swaPointsBalance")
	private int swaPointsBalance;
	
	@Column(name="rating")
	private Double rating;
	
	@Column(name="transaction_count")
	private int count;
	
	@Transient
	private double avgRating;
	
	//How to map to these?
	@Transient
	private Address address;
	
	//default constructor
	public User() {
		address = new Address();
	}
	//parameterized constructor
	
	public User(String firstName, String lastName, String email, String password, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
	}
	

	
	public String showPicture(){
	    String encoded = "";
	    if(profilePic != null && profilePic.length>0){

	            encoded = Base64.getEncoder().encodeToString(profilePic);
	      }
	     return encoded;
	}
	
	public Double getRating(int count, double rating) {
		avgRating = rating/count;
		return avgRating;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}

	public int getSwaPointsBalance() {
		return swaPointsBalance;
	}

	public void setSwaPointsBalance(int swaPointsBalance) {
		this.swaPointsBalance = swaPointsBalance;
	}


	public double getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}




}
