package com.mindless.bean;

public class Poll {

	private long positiveVotes, negativeVotes;
	private boolean closed;

	public long getPositiveVotes() {
		return positiveVotes;
	}

	public void setPositiveVotes(long positiveVotes) {
		this.positiveVotes = positiveVotes;
	}

	public void setNegativeVotes(long negativeVotes) {
		this.negativeVotes = negativeVotes;
	}

	public long getNegativeVotes() {
		return negativeVotes;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public boolean isClosed() {
		return closed;
	}
}
