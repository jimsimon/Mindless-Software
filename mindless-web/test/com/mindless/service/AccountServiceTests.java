package com.mindless.service;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
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
		assertEquals("Name is not updated", "new name", actualAccount.getName());
	}

	@Test
	public void updateAccountFirstName() throws Exception{
		Account actualAccount = testAccountService.updateAccountFirstName(expectedAccount, "first name");
		assertEquals("First name is not updated", "first name", actualAccount.getFirstName());
	}
	
	@Test
	public void updateAccountLastName() throws Exception{
		Account actualAccount = testAccountService.updateAccountLastName(expectedAccount, "last name");
		assertEquals("Last name is not updated", "last name", actualAccount.getLastName());
	}
	
	@Test
	public void makeAccountAnAdministrator() throws Exception{
		Account actualAccount = testAccountService.makeAccountAnAdministrator(expectedAccount, true);
		assertTrue("Account admin flag is not updated", actualAccount.isAdmin());
	}
	
	@Test
	public void authenticateAccountIsUsernameEqual() throws Exception {
		Account actualAccount = testAccountService.authenticateAccount("testUsername", "abc123");
		assertEquals("Username does not match", "testUsername", actualAccount.getUsername());
	}
	
	@Test
	public void updateAccountUsername() throws Exception {
		Account actualAccount = testAccountService.updateAccountUsername(expectedAccount, "username");
		assertEquals("Username is not updated", "username", actualAccount.getUsername());
	}
	
	@Test //Not quite sure this is a good test??
	public void updateAccountPassword() throws Exception {
		Account actualAccount = testAccountService.updateAccountPassword(expectedAccount, "abc123");
		assertThat("Password is not updated", expectedAccount.getLastPasswordChangeDate(), not(actualAccount.getLastPasswordChangeDate()));
	}
	
	@Test
	public void banAccount() throws Exception {
		Account actualAccount = testAccountService.banAccount(expectedAccount);
		assertTrue("Account is not banned", actualAccount.isBanned());
	}
	
	@Test
	public void unbanAccount() throws Exception {
		Account actualAccount = testAccountService.unbanAccount(expectedAccount);
		assertFalse("Account is not banned", actualAccount.isBanned());
	}
	
	@Test
	public void getAccountByGuid() throws Exception {
		Account actualAccount = testAccountService.getAccountByGuid("12345-abcde-54321-edcba-00000");
		assertEquals("Guid is different", "12345-abcde-54321-edcba-00000", actualAccount.getGuid());
	}
	
	@Test
	@Ignore //Not sure how to verify this without mocking the dao call...and don't say return a boolean, because that's pointless...
	public void deleteAccount() throws Exception {
		testAccountService.deleteAccount(expectedAccount);
	}
}
