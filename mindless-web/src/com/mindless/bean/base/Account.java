package com.mindless.bean.base;

import java.sql.Timestamp;

/**
 * @author mcchicken
 * 
 * @version 0.1
 * 
 */
public abstract class Account {
	private String guid;
	private String name;
	private Timestamp createdOn;
	
	public void setGuid(String guid) {
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
}
