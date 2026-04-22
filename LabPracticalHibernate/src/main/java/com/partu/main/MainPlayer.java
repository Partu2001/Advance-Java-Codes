package com.partu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.partu.entity.Address;
import com.partu.entity.Batsman;
import com.partu.entity.Bowler;
import com.partu.utility.HibernetConnection;

public class MainPlayer {
	
	public static void main(String[] args) {
		
		Session session=HibernetConnection.getsession();
		Transaction tx=session.beginTransaction();
		
		
		
		Address a=new Address();
		a.setCity("Sangli");
		a.setStreet("Shivaji Chowk");
		a.setCountry("India");
		a.setPincode("416416");
		
//		Batsman b=new Batsman();
//		b.setPlayerName("Prathmesh");
//		b.setNumMatches(100);
//		b.setNumRuns(10000);
//		b.setAdr(a);
		
		Bowler bb=new Bowler();
		bb.setPlayerName("Partu");
		bb.setNumMatches(50);
		bb.setNumWickets(150);
		bb.setAdr(a);
		session.save(bb);
		tx.commit();
		
		Batsman pget=session.get(Batsman.class, 1);
		System.out.println(pget.getPlayerId());
		System.out.println(pget.getPlayerName());
		System.out.println(pget.getNumMatches());
		System.out.println(pget.getNumRuns());
		
	}

}
