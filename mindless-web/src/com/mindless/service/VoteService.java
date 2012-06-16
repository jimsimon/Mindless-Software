package com.mindless.service;

import com.mindless.bean.Poll;

public class VoteService {

	public Poll addPositiveVote(Poll expectedPoll) {
		expectedPoll.setPositiveVotes(expectedPoll.getPositiveVotes() + 1);
		return expectedPoll;
	}

}
