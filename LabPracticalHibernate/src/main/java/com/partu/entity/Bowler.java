package com.partu.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ball")
public class Bowler extends Player {
	
	int numWickets;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int numWickets) {
		super();
		this.numWickets = numWickets;
	}

	public int getNumWickets() {
		return numWickets;
	}

	public void setNumWickets(int numWickets) {
		this.numWickets = numWickets;
	}

	@Override
	public String toString() {
		return "Bowler [numWickets=" + numWickets + ", playerId=" + playerId + ", playerName=" + playerName
				+ ", numMatches=" + numMatches + ", adr=" + adr + "]";
	}
	
	

}
