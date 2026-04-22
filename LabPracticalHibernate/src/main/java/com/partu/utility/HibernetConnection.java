package com.partu.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.partu.entity.Batsman;
import com.partu.entity.Bowler;
import com.partu.entity.Customer;
import com.partu.entity.Director;
import com.partu.entity.Institute;
import com.partu.entity.InstituteHistory;
import com.partu.entity.Movie;
import com.partu.entity.PassportDetails;
import com.partu.entity.Player;
import com.partu.entity.PrimaryStudent;
import com.partu.entity.SecondaryStudent;
import com.partu.entity.Student;

public class HibernetConnection {
	
	public static Session getsession() {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Director.class).addAnnotatedClass(Movie.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		return session;
		
	}

}
