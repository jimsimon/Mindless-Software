package com.mindless.service;

import org.junit.After;
import org.junit.Before;

import com.mindless.bean.Poll;

public class VoteServiceTests {
	private VoteService testVoteService = new VoteService();
	private Poll expectedPoll;
	
	@Before
	public void intializeExpectedPoll(){
		this.expectedPoll = new Poll();
	}
	
	@After
	public void destroyExpectedPoll(){
		this.expectedPoll = null;
	}
	
}
