package com.partu.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ptype")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int playerId;
	String playerName;
	int numMatches;
	
	@Embedded
	Address adr;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playerName, int numMatches, Address adr) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.numMatches = numMatches;
		this.adr = adr;
	}

	public Player(String playerName, int numMatches, Address adr) {
		super();
		this.playerName = playerName;
		this.numMatches = numMatches;
		this.adr = adr;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getNumMatches() {
		return numMatches;
	}

	public void setNumMatches(int numMatches) {
		this.numMatches = numMatches;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", numMatches=" + numMatches + ", adr="
				+ adr + "]";
	}
	
	
	
	
	

}
