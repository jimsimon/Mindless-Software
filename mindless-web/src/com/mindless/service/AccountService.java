package com.mindless.service;

import com.mindless.bean.Account;

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
			throw new NullPointerException();
		}
		return account;
	}
	
	public Account updateAccountFirstName(Account account){
		if(null == account.getFirstName()){
			throw new NullPointerException();
		}
		return account;
	}

	public Account updateAccountLastName(Account account) {
		if(null == account.getLastName()){
			throw new NullPointerException();
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

	public Account banAccount(Account account) {
		account.setBanned(true);
		return account;
	}

	public Account unbanAccount(Account account) {
		account.setBanned(false);
		return account;
	}

	public Account deleteAccount(Account account) {
		account.setDeleted(true);
		return account;
	}

	public Account getAccountByGuid(String guid) {
		Account account = new Account();
		account.setGuid(guid);
		return account;
	}
	
	public Account revokeAdministratorPrivilegeFromAccount(
			Account account) {
		return account;
	}

}
