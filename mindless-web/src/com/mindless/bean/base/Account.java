package com.mindless.bean.base;

/**
 * @author mcchicken
 * 
 * @version 0.1
 * 
 */
public abstract class Account {
	private String guid;
	
	public void setGuid(String guid) {
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
}
