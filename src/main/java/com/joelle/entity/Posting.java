package com.joelle.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="post")
public class Posting {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id", updatable=false, nullable=false)
	private long id;
	@Column(name="email")
	private String email;
	@Column(name="created_date")
	private Timestamp createdDate;
	@Column(name="type")
	private String type;
	@Column(name="title")
	private String title;
	@Column(name="value")
	private int value;
	@Column(name="description")
	private String description;
	@Column(name="instances")
	private int instances;
	//@OneToMany
	@Transient
	private ImageFiles imageFiles;
	
	//private ArrayList<ImageFiles> images = new ArrayList<ImageFiles>();
	
	//default constructor
	public Posting () {}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getInstances() {
		return instances;
	}
	public void setInstances(int instances) {
		this.instances = instances;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Timestamp getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}


	public ImageFiles getImageFiles() {
		return imageFiles;
	}


	public void setImageFiles(ImageFiles imageFiles) {
		this.imageFiles = imageFiles;
	}
	
}
