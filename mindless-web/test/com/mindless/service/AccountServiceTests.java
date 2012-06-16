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
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setName("new name");
		Account actualAccount = testAccountService.updateAccountName(expectedAccount);
		assertEquals("Name is not updated", actualAccount.getName(), "new name");
	}

	@Test
	public void updateAccountFirstName() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setFirstName("first name");
		Account actualAccount = testAccountService.updateAccountFirstName(expectedAccount);
		assertEquals("First name is not updated", actualAccount.getFirstName(), "first name");
	}
	
	@Test
	public void updateAccountLastName() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setLastName("last name");
		Account actualAccount = testAccountService.updateAccountLastName(expectedAccount);
		assertEquals("Last name is not updated", actualAccount.getLastName(), "last name");
	}
	
	@Test
	public void makeAccountAnAdministrator() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setAdmin(true);
		Account actualAccount = testAccountService.makeAccountAnAdministrator(expectedAccount);
		assertEquals("Account admin flag is not updated", actualAccount.isAdmin(), true);
	}
	
	@Test
	public void authenticateAccountIsUsernameEqual() throws Exception {
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setUsername("testUsername");
		Account actualAccount = testAccountService.authenticateAccount("testUsername", "abc123");
		assertEquals(expectedAccount.getUsername(), actualAccount.getUsername());
	}
	
	@Test
	public void updateAccountUsername() throws Exception {
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setUsername("username");
		Account actualAccount = testAccountService.updateAccountUsername(expectedAccount);
		assertEquals("Username is not updated", actualAccount.getUsername(), "username");
	}
	
	@Test //Not quite sure this is a good test??
	public void updateAccountPassword() throws Exception {
		Account actualAccount = testAccountService.updateAccountPassword(expectedAccount, "abc123");
		assertThat("Password is not updated", actualAccount.getLastPasswordChangeDate(), not(expectedAccount.getLastPasswordChangeDate()));
	}
	
	private Account vanillaExpectedAccount(){
		return new Account();
	}
}
