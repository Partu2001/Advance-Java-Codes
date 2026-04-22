package com.partu.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="bat")
public class Batsman extends Player {
	
	int numRuns;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int numRuns) {
		super();
		this.numRuns = numRuns;
	}

	public int getNumRuns() {
		return numRuns;
	}

	public void setNumRuns(int numRuns) {
		this.numRuns = numRuns;
	}

	@Override
	public String toString() {
		return "Batsman [numRuns=" + numRuns + ", playerId=" + playerId + ", playerName=" + playerName + ", numMatches="
				+ numMatches + ", adr=" + adr + "]";
	}
	
	
	

}
