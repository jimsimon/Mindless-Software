package com.mindless.service;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

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
		assertEquals("Name is not updated", actualAccount.getName(), "new name");
	}

	@Test
	public void updateAccountFirstName() throws Exception{
		Account actualAccount = testAccountService.updateAccountFirstName(expectedAccount, "first name");
		assertEquals("First name is not updated", actualAccount.getFirstName(), "first name");
	}
	
	@Test
	public void updateAccountLastName() throws Exception{
		Account actualAccount = testAccountService.updateAccountLastName(expectedAccount, "last name");
		assertEquals("Last name is not updated", actualAccount.getLastName(), "last name");
	}
	
	@Test
	public void makeAccountAnAdministrator() throws Exception{
		boolean admin = true;
		Account actualAccount = testAccountService.makeAccountAnAdministrator(expectedAccount, admin);
		assertEquals("Account admin flag is not updated", actualAccount.isAdmin(), admin);
	}
	
	@Test
	public void authenticateAccountIsUsernameEqual() throws Exception {
		expectedAccount.setUsername("testUsername");
		Account actualAccount = testAccountService.authenticateAccount("testUsername", "abc123");
		assertEquals(expectedAccount.getUsername(), actualAccount.getUsername());
	}
	
	@Test
	public void updateAccountUsername() throws Exception {
		Account actualAccount = testAccountService.updateAccountUsername(expectedAccount, "username");
		assertEquals("Username is not updated", actualAccount.getUsername(), "username");
	}
	
	@Test //Not quite sure this is a good test??
	public void updateAccountPassword() throws Exception {
		Account actualAccount = testAccountService.updateAccountPassword(expectedAccount, "abc123");
		assertThat("Password is not updated", actualAccount.getLastPasswordChangeDate(), not(expectedAccount.getLastPasswordChangeDate()));
	}
}
