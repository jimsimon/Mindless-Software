package com.mindless.service;

import com.mindless.bean.Account;
import com.mindless.exception.MindlessRuntimeException;

public interface AccountService {
	public Account getAccountByGuid(String guid) throws MindlessRuntimeException;
	public void creditPointsToAccount(long numberOfPoints) throws MindlessRuntimeException;
	public void banAccount(String guid) throws MindlessRuntimeException;
	public void upgradeAccount(long newAccountLevel) throws MindlessRuntimeException;
}
