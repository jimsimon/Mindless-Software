package com.mindless.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mindless.bean.Account;
import com.mindless.bean.Permission;
import com.mindless.bean.Role;

public class SecurityServiceTests {
	Account adminAccount = new Account();
	Account userAccount = new Account();
	SecurityService securityService = new SecurityService();
	
	@Test
	public void createRole() throws Exception {
		Role actualRole = securityService.createRole(adminAccount, "role name");
		assertEquals(actualRole.getName(), "role name");
	}
	
	@Test //not sure how to verify this test
	public void assignRole() throws Exception {
		securityService.assignRole(adminAccount, userAccount, "role name");
	}
	
	@Test //not sure how to verify this test
	public void unassignRole() throws Exception {
		securityService.unassignRole(adminAccount, userAccount, "role name");
	}
	
	@Test
	public void getRolesForAccount() throws Exception {
		List<Role> actualRoles = securityService.getRolesForAccount(adminAccount, userAccount);
		assertNotNull(actualRoles);  //Result should at least be an empty list
	}
	
	@Test  //This one seems weird...I used assertTrue because the auto-generated impl returns false by default.
	public void isRoleAssignedToAccount() throws Exception {
		boolean actualHasRole = securityService.isRoleAssignedToAccount(adminAccount, userAccount, "role name");
		assertTrue(actualHasRole);
	}
	
	@Test //not sure how to verify this test
	public void deleteRole() throws Exception {
		securityService.deleteRole(adminAccount, "role name");
	}
	
	@Test
	public void getRolesAndPermissionsForAccount() throws Exception {
		Map<Role, List<Permission>> actualRolesAndPermissions = securityService.getRolesAndPermissionsForAccount(adminAccount, userAccount);
		assertNotNull(actualRolesAndPermissions); //Result should at least be an empty map
	}
	
	@Test //This one seems weird...I used assertTrue because the auto-generated impl returns false by default.
	public void isRoleAvailable() throws Exception {
		boolean actualRoleExists = securityService.isRoleAvailable(adminAccount, "role name");
		assertTrue(actualRoleExists);
	}
}
