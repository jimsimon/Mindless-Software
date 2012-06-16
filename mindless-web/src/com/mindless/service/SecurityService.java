package com.mindless.service;

import java.util.List;
import java.util.Map;

import com.mindless.bean.Account;
import com.mindless.bean.Permission;
import com.mindless.bean.Role;

public class SecurityService {

	public Role createRole(Account account, String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void assignRole(Account adminAccount, Account userAccount,
			String roleName) {
		// TODO Auto-generated method stub
		
	}

	public void unassignRole(Account adminAccount, Account userAccount,
			String roleName) {
		// TODO Auto-generated method stub
		
	}

	public List<Role> getRolesForAccount(Account adminAccount,
			Account userAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteRole(Account adminAccount, String roleName) {
		// TODO Auto-generated method stub
		
	}

	public boolean isRoleAssignedToAccount(Account adminAccount, Account userAccount,
			String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public Map<Role, List<Permission>> getRolesAndPermissionsForAccount(
			Account adminAccount, Account userAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isRoleAvailable(Account adminAccount, String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
