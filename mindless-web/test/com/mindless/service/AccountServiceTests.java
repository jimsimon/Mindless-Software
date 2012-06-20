package com.mindless.service;

import org.junit.After;
import org.junit.Before;

import com.mindless.bean.Account;

public class AccountServiceTests {
	Account expectedAccount = new Account();
	AccountService testAccountService = new AccountService();
	
	@Before
	public void initializeExpectedAccount(){
		this.expectedAccount = new Account();
	}
	
	@After
	public void destroyExpectedAccount(){
		this.expectedAccount = null;
	}
}
