package com.forkapp.mobileservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mobile")
public class Mobile 
{
	@Id
	private int mId;
	private String mName;
	private String mImage;
	private int mPrice;
	private String mDescription;
	
	public Mobile() {
		
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmImage() {
		return mImage;
	}

	public void setmImage(String mImage) {
		this.mImage = mImage;
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	public String getmDescription() {
		return mDescription;
	}

	public void setmDescription(String mDescription) {
		this.mDescription = mDescription;
	}
	
}
