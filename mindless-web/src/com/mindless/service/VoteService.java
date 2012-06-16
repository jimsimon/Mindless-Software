package com.mindless.service;

import com.mindless.bean.Poll;

public class VoteService {

	public Poll addPositiveVote(Poll poll) {
		poll.setPositiveVotes(poll.getPositiveVotes() + 1);
		return poll;
	}

	public Poll addNegativeVote(Poll poll) {
		poll.setNegativeVotes(poll.getNegativeVotes() + 1);
		return poll;
	}

}
