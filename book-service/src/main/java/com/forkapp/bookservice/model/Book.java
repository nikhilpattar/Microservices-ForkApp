package com.forkapp.bookservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Book 
{
	@Id
	private String bId;
	private String bName;
	private String bImage;
	private int bPrice;
	private String bDescription;
	
	public Book() {
		
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbImage() {
		return bImage;
	}

	public void setbImage(String bImage) {
		this.bImage = bImage;
	}

	public int getbPrice() {
		return bPrice;
	}

	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}

	public String getbDescription() {
		return bDescription;
	}

	public void setbDescription(String bDescription) {
		this.bDescription = bDescription;
	}
}
