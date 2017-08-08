package com.joelle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="imageFiles")
public class ImageFiles {
	
	@Id
	@Column(name="imgId")
	private int imgId;
	
	

	public ImageFiles() {
		super();
	}

	public ImageFiles(int imgId) {
		super();
		this.imgId = imgId;
	}

	public int getImgId() {
		return imgId;
	}

	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
	
	

}
