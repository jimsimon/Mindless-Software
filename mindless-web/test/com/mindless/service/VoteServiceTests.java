package com.mindless.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	
	@Test
	public void votePositiveForPollUpdatesPositiveVoteCount(){
		expectedPoll.setPositiveVotes(0);
		Poll actualPoll = testVoteService.addPositiveVote(expectedPoll);
		assertEquals("Vote total is not one", 1, actualPoll.getPositiveVotes());
	}
	
	@Test
	public void voteNegativeForPollUpdatesNegativeVoteCount(){
		expectedPoll.setNegativeVotes(0);
		Poll actualPoll = testVoteService.addNegativeVote(expectedPoll);
		assertEquals("Vote total is not one", 1, actualPoll.getNegativeVotes());
	}
}
