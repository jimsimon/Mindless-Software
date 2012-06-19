package com.mindless.service;

import com.mindless.bean.Poll;

public class PollService {

	public Poll createPoll(Poll poll) {
		return poll;
	}

	public Poll closePoll(Poll poll) {
		poll.setClosed(true);
		return poll;
	}

}
