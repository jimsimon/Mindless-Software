package com.mindless.bean.account;

import com.mindless.bean.base.Account;
import com.mindless.service.AccountService;
import com.mindless.service.CategoryService;
import com.mindless.service.ChatService;
import com.mindless.service.PollService;

public class UserAccount extends Account {
	private AccountService userAccountService;
	private PollService userPollService;
	private ChatService userChatService;
	private CategoryService userCategoryService;
	
	public UserAccount(PollService pollService, ChatService chatService
			, CategoryService categoryService, AccountService accountService){
		this.userPollService = pollService;
		this.userChatService = chatService;
		this.userCategoryService = categoryService;
		this.userAccountService = accountService;
	}
}
