package com.partu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.partu.entity.EmpTable;
import com.partu.entity.EmployeeTable;
import com.partu.entity.Permenent;
import com.partu.entity.Temporary;

public class HibernateConnectivity {
	
	static Session getsession(){
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(EmployeeTable.class).addAnnotatedClass(Temporary.class).addAnnotatedClass(Permenent.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		return session;
		
	}

}
