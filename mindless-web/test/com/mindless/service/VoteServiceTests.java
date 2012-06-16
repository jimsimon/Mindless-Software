package com.mindless.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mindless.bean.Poll;

public class VoteServiceTests {
	private VoteService testVoteService = new VoteService();
	
	@Test
	public void votePositiveForPollUpdatesPositiveVoteCount(){
		Poll expectedPoll = new Poll();
		expectedPoll.setPositiveVotes(0);
		Poll actualPoll = testVoteService.addPositiveVote(expectedPoll);
		assertEquals("Vote total is one", 1, actualPoll.getPositiveVotes());
	}
}
