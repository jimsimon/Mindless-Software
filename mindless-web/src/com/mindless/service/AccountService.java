package com.mindless.service;

import com.mindless.bean.base.Account;
import com.mindless.bean.base.Notification;
import com.mindless.exception.MindlessRuntimeException;

public interface AccountService {
	public Account getAccountByGuid(String guid) throws MindlessRuntimeException;
	public void notifyAccount(Notification notification, Account account) throws MindlessRuntimeException;
	
	//Administration API
	public void creditPointsToAccount(long numberOfPoints) throws MindlessRuntimeException;
	public void banAccount(String guid) throws MindlessRuntimeException;
	public void upgradeAccount(long newAccountLevel) throws MindlessRuntimeException;
}
