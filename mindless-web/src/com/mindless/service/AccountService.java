package com.mindless.service;

import com.mindless.bean.base.Account;
import com.mindless.bean.base.Avatar;
import com.mindless.bean.base.Notification;
import com.mindless.exception.MindlessRuntimeException;

public interface AccountService {
	public Account getAccountByGuid(String guid) throws MindlessRuntimeException;
	public Account createAccount(Account account) throws MindlessRuntimeException;
	public void notifyAccount(Notification notification, Account account) throws MindlessRuntimeException;
	public void createAvatarForAccount(Avatar avatar, Account account) throws MindlessRuntimeException;
	
	//Administration API
	public void creditPointsToAccount(long numberOfPoints) throws MindlessRuntimeException;
	public void banAccount(String guid) throws MindlessRuntimeException;
	public void lockAccountForTimePeriod(long milliseconds) throws MindlessRuntimeException;
	public void upgradeAccount(long newAccountLevel) throws MindlessRuntimeException;
}
