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

	public Account updateAccountName(Account account) {
		if(null == account.getName()){
			throw new RuntimeException();
		}
		return account;
	}
	
	public Account updateAccountFirstName(Account account){
		if(null == account.getFirstName()){
			throw new RuntimeException();
		}
		return account;
	}

	public Account updateAccountLastName(Account account) {
		if(null == account.getLastName()){
			throw new RuntimeException();
		}
		return account;
	}

	public Account makeAccountAnAdministrator(Account account) {
		return account;
	}

	public Account updateAccountUsername(Account account) {
		return account;
	}

	public Account updateAccountPassword(Account account, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account revokeAdministratorPrivilegeFromAccount(
			Account account) {
		return account;
	}

}
