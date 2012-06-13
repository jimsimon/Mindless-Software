package com.mindless.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountServiceTests {
	
	@Test
	public void createAccount() throws Exception {
		AccountService accountService = new AccountService();
		Account actualAccount = accountService.createAccount(new Account());
		assertNotNull("Account is not null", actualAccount);
	}
	
	@Test
	public void updateAccountName(Account account, String name) throws Exception{
		AccountService accountService = new AccountService();
		Account actualAccount = accountService.updateAccountName(account, "new name");
		assertEquals("Name is updated", actualAccount.getName(), "new name");
	}
	
	@Test
	public void authenticateAccount() throws Exception {
		AccountService accountService = new AccountService();
		Account expected = new Account();
		expected.setUsername("testUsername");
		Account actual = accountService.authenticateAccount("testUsername", "abc123");
		assertNotNull("Account is null", actual);
		assertEquals(expected.getUsername(), actual.getUsername());
	}
}
