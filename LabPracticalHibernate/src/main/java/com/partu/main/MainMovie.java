package com.partu.main;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.partu.entity.Director;
import com.partu.entity.Movie;
import com.partu.utility.HibernetConnection;

public class MainMovie {

	public static void main(String[] args) {
		
		Session session=HibernetConnection.getsession();
		Transaction tx=session.beginTransaction();
		
		Director d=new Director();
	    d.setDirectorName("Rajmoli");
		
		Movie m=new Movie();
		m.setMovieName("Bahubali");
		m.setBudget(20000000);
        m.setReleaseDate("12/5/2015");	
        m.setDirector(d);
        
        Movie m1=new Movie();
		m1.setMovieName("3 Idits");
		m1.setBudget(40000000);
        m1.setReleaseDate("11/4/2013");	
        m.setDirector(d);
        
        Movie m2=new Movie();
		m2.setMovieName("Animal");
		m2.setBudget(500000000);
        m2.setReleaseDate("21/3/2021");	
        m.setDirector(d);
		
      
		d.setMovie(Arrays.asList(m,m1,m2));
        
		
		session.save(d);
		
		session.save(m);
		session.save(m1);
		session.save(m2);
		
		tx.commit();
		
	

	}

}
