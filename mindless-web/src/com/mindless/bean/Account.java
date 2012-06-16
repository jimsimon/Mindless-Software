package com.mindless.bean;

import java.util.Date;

public class Account {

	private String name, firstName, lastName, userName, guid;
	private boolean admin, banned;
	
	public void setUsername(String userName) {
		this.userName = userName;
	}

	public String getUsername() {
		return userName;
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

	public boolean isBanned() {
		return banned;
	}

	public Object getGuid() {
		return guid;
	}

	public void setBanned(boolean banned) {
		this.banned = banned;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}
}
