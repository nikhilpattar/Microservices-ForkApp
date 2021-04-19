package com.forkapp.orderservice.model;

public class User 
{
	private String uId;
	private String uFirstName;
	private String uSecondName;
	private String uEmail;
	private String uUsername;
	private String uPassword;
	
	public User() {
		
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuFirstName() {
		return uFirstName;
	}

	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}

	public String getuSecondName() {
		return uSecondName;
	}

	public void setuSecondName(String uSecondName) {
		this.uSecondName = uSecondName;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuUsername() {
		return uUsername;
	}

	public void setuUsername(String uUsername) {
		this.uUsername = uUsername;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
}	
