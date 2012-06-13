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
	
}
