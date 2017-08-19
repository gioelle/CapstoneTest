package com.joelle.entity;


import java.sql.Blob;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private Blob profilePic; 
	
	@Column(name="swaPointsBalance")
	private int swaPointsBalance;
	
	@Column(name="rating")
	private ArrayList<Double> rating;
	
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


	public Blob getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(Blob profilePic) {
		this.profilePic = profilePic;
	}

	public int getSwaPointsBalance() {
		return swaPointsBalance;
	}

	public void setSwaPointsBalance(int swaPointsBalance) {
		this.swaPointsBalance = swaPointsBalance;
	}

	public ArrayList<Double> getRating() {
		return rating;
	}

	public void setRating(ArrayList<Double> rating) {
		this.rating = rating;
	}



}
