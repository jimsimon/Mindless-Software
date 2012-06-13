package com.mindless.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountServiceTests {
	Account expectedAccount = new Account();
	AccountService testAccountService = new AccountService();
	
	@Test
	public void createAccount() throws Exception {
		AccountService accountService = new AccountService();
		Account actualAccount = accountService.createAccount(new Account());
		assertNotNull("Account is not null", actualAccount);
	}
	
	@Test
	public void updateAccountName() throws Exception{
		Account actualAccount = testAccountService.updateAccountName(expectedAccount, "new name");
		assertEquals("Name is updated", actualAccount.getName(), "new name");
	}

	@Test
	public void updateAccountFirstName() throws Exception{
		Account actualAccount = testAccountService.updateAccountFirstName(expectedAccount, "first name");
		assertEquals("First name is updated", actualAccount.getFirstName(), "first name");
	}
	
	@Test
	public void updateAccountLastName() throws Exception{
		Account actualAccount = testAccountService.updateAccountLastName(expectedAccount, "last name");
		assertEquals("Last name is updated", actualAccount.getLastName(), "last name");
	}
	
	@Test
	public void authenticateAccount() throws Exception {
		expectedAccount.setUsername("testUsername");
		Account actualAccount = testAccountService.authenticateAccount("testUsername", "abc123");
		assertNotNull("Account is null", actualAccount);
		assertEquals(expectedAccount.getUsername(), actualAccount.getUsername());
	}
}
