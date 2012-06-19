package com.mindless.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	
	@Test
	public void createPoll(){
		Poll actualPoll = testPollService.createPoll(expectedPoll);
		assertNotNull("Poll is null", actualPoll);
	}
	
	@Test
	public void closePoll(){
		Poll actualPoll = testPollService.closePoll(expectedPoll);
		assertEquals("Poll is not closed", actualPoll.isClosed(), true);
	}
}
