package com.mindless.service.impl;

import com.mindless.bean.base.Account;
import com.mindless.bean.base.Avatar;
import com.mindless.bean.base.Notification;
import com.mindless.exception.MindlessRuntimeException;
import com.mindless.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Override
	public Account getAccountByGuid(String guid)
			throws MindlessRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account createAccount(Account account)
			throws MindlessRuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void notifyAccount(Notification notification, Account account)
			throws MindlessRuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void createAvatarForAccount(Avatar avatar, Account account)
			throws MindlessRuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void creditPointsToAccount(long numberOfPoints)
			throws MindlessRuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void banAccount(String guid) throws MindlessRuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void lockAccountForTimePeriod(long milliseconds)
			throws MindlessRuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void upgradeAccount(long newAccountLevel)
			throws MindlessRuntimeException {
		// TODO Auto-generated method stub

	}

}
