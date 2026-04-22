package com.student.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.student.entity.Laptop;
import com.student.entity.Student;

public class HibernateConnectivity {
	
	public static Session getSession() {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		return session;
	}

}
