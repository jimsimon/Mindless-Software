package com.mindless.service;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mindless.bean.Account;

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
	
	@Test (expected=NullPointerException.class)
	public void updateAccountNameToNullThrowsNullPointerException() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setName(null);
		testAccountService.updateAccountName(expectedAccount);
	}

	@Test
	public void updateAccountFirstName() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setFirstName("first name");
		Account actualAccount = testAccountService.updateAccountFirstName(expectedAccount);
		assertEquals("First name is not updated", actualAccount.getFirstName(), "first name");
	}
	
	@Test (expected=NullPointerException.class)
	public void updateAccountFirstNameToNullThrowsNullPointerException() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setFirstName(null);
		testAccountService.updateAccountFirstName(expectedAccount);
	} 
	
	@Test
	public void updateAccountLastName() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setLastName("last name");
		Account actualAccount = testAccountService.updateAccountLastName(expectedAccount);
		assertEquals("Last name is not updated", actualAccount.getLastName(), "last name");
	}
	
	@Test (expected=NullPointerException.class)
	public void updateAccountLastNameToNullThrowsNullPointerException() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setLastName(null);
		testAccountService.updateAccountLastName(expectedAccount);
	} 
	
	@Test
	public void makeAccountAnAdministrator() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setAdmin(true);
		Account actualAccount = testAccountService.makeAccountAnAdministrator(expectedAccount);
		assertTrue("Account admin flag is not updated", actualAccount.isAdmin());
	}
	
	@Test
	public void revokeAdministratorPrivilegeFromAccount() throws Exception{
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setAdmin(false);
		Account actualAccount = testAccountService.revokeAdministratorPrivilegeFromAccount(expectedAccount);
		assertFalse("Account admin flag is false", actualAccount.isAdmin());
	}
	
	@Test
	public void authenticateAccountIsUsernameEqual() throws Exception {
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setUsername("testUsername");
		Account actualAccount = testAccountService.authenticateAccount("testUsername", "abc123");
		assertEquals("Username does not match", "testUsername", actualAccount.getUsername());
	}
	
	@Test
	public void updateAccountUsername() throws Exception {
		expectedAccount = vanillaExpectedAccount();
		expectedAccount.setUsername("username");
		Account actualAccount = testAccountService.updateAccountUsername(expectedAccount);
		assertEquals("Username is not updated", "username", actualAccount.getUsername());
	}
	
	@Test //Not quite sure this is a good test??
	public void updateAccountPassword() throws Exception {
		Account actualAccount = testAccountService.updateAccountPassword(expectedAccount, "abc123");
		assertThat("Password is not updated", expectedAccount.getLastPasswordChangeDate(), not(actualAccount.getLastPasswordChangeDate()));
	}
	
	@Test
	public void banAccount() throws Exception {
		expectedAccount = vanillaExpectedAccount();
		Account actualAccount = testAccountService.banAccount(expectedAccount);
		assertTrue("Account is not banned", actualAccount.isBanned());
	}
	
	@Test
	public void unbanAccount() throws Exception {
		expectedAccount = vanillaExpectedAccount();
		Account actualAccount = testAccountService.unbanAccount(expectedAccount);
		assertFalse("Account is not banned", actualAccount.isBanned());
	}
	
	@Test
	public void getAccountByGuid() throws Exception {
		Account actualAccount = testAccountService.getAccountByGuid("12345-abcde-54321-edcba-00000");
		assertEquals("Guid is different", "12345-abcde-54321-edcba-00000", actualAccount.getGuid());
	}
	
	@Test
	public void deleteAccount() throws Exception {
		expectedAccount = vanillaExpectedAccount();
		Account actualAccount =	testAccountService.deleteAccount(expectedAccount);
		assertTrue("Account is not deleted", actualAccount.isDeleted());
	}
	
	private Account vanillaExpectedAccount(){
		return new Account();
	}
}
