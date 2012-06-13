package com.mindless.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountServiceTests {
	
	@Test
	public void createAccount() throws Exception {
		AccountService accountService = new AccountService();
		Account accountActual = accountService.createAccount(new Account());
		assertNotNull("Account is null", accountActual);
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
