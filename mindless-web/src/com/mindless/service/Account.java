package com.mindless.service;

import java.util.Date;

public class Account {

	private String name, firstName, lastName;
	private boolean admin;
	
	public void setUsername(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}
	
	public String getFirstName(){
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Date getLastPasswordChangeDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
