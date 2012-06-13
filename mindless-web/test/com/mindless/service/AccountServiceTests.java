package com.mindless.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.mindless.service.impl.AccountServiceImpl;

public class AccountServiceTests {
	private AccountService testAccountService = mock(AccountServiceImpl.class);
	
	@Test
	public void getAccountByGuid_requestsAccountWithPassedInGuid(){
		ArgumentCaptor<String> accountGuidCaptor = ArgumentCaptor.forClass(String.class);
		
		testAccountService.getAccountByGuid("test_guid");
		verify(testAccountService).getAccountByGuid(accountGuidCaptor.capture());
		assertEquals("test_guid", accountGuidCaptor.getValue());
	}
	
	@Test
	public void doJimSucksTest() {
		assertEquals("Jim Sucks", "Jim Sucks");
	}
}
