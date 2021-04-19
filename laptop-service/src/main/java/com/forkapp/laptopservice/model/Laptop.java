package com.forkapp.laptopservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "laptop")
public class Laptop 
{
	@Id
	private int lId;
	private String lName;
	private String lImage;
	private int lPrice;
	private String lDescription;
	
	public Laptop() {
		
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getlImage() {
		return lImage;
	}

	public void setlImage(String lImage) {
		this.lImage = lImage;
	}

	public int getlPrice() {
		return lPrice;
	}

	public void setlPrice(int lPrice) {
		this.lPrice = lPrice;
	}

	public String getlDescription() {
		return lDescription;
	}

	public void setlDescription(String lDescription) {
		this.lDescription = lDescription;
	}
}