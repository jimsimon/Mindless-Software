package com.mindless.service;

import org.junit.After;
import org.junit.Before;

import com.mindless.bean.Poll;

public class PollServiceTests {
	Poll expectedPoll = new Poll();
	PollService testPollService = new PollService();
	
	@Before
	public void initializeExpectedPoll(){
		this.expectedPoll = new Poll();
	}
	
	@After
	public void destroyExpectedPoll(){
		this.expectedPoll = null;
	}
}
