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
		// TODO Auto-generated method stub
		return null;
	}
	
	public Account updateAccountFirstName(Account account, String firstName){
		return null;
	}

	public Account updateAccountLastName(Account testAccount, String string) {
		return null;
	}

	public Account makeAccountAnAdministrator(Account expectedAccount,
			boolean admin) {
		// TODO Auto-generated method stub
		return null;
	}

}
