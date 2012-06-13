package com.mindless.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountServiceTests {
	
	@Test
	public void createAccount() throws Exception {
		AccountService accountService = new AccountService();
		Account accountActual = accountService.createAccount(new Account());
		assertNotNull("Account is not null", accountActual);
	}
	
}
