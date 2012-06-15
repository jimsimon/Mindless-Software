package com.mindless.service;

public class AccountService {

	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return account;
	}

	public Account authenticateAccount(String username, String password) {
		Account account = new Account();
		account.setUsername(username);
		return account;
	}

	public Account updateAccountName(Account account, String name) {
		account.setName(name);
		return account;
	}
	
	public Account updateAccountFirstName(Account account, String firstName){
		account.setFirstName(firstName);
		return account;
	}

	public Account updateAccountLastName(Account account, String lastName) {
		account.setLastName(lastName);
		return account;
	}

	public Account makeAccountAnAdministrator(Account account,
			boolean admin) {
		account.setAdmin(admin);
		return account;
	}

	public Account updateAccountUsername(Account expectedAccount, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account updateAccountPassword(Account expectedAccount, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
