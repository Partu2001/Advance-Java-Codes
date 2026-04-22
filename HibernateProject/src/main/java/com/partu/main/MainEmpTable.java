package com.partu.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.partu.entity.EmpTable;

public class MainEmpTable {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(EmpTable.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
//		
		System.out.println("Table Created");
		
		//Insert Data
		EmpTable e=new EmpTable();
		e.setName("Partu");
     	e.setSalary(50000);
		
		session.save(e);
		tx.commit();
		
		//Get Data
		EmpTable eget=session.get(EmpTable.class, 1);
		System.out.println(eget.getId());
		System.out.println(eget.getName());
		System.out.println(eget.getSalary());
		
		//Update
		EmpTable eupdate=session.get(EmpTable.class, 1);
		eupdate.setName("Prathmesh");
		eupdate.setSalary(100000);
		session.save(eupdate);
		tx.commit();
		
		//Delete
		EmpTable edelete=session.get(EmpTable.class, 1);
		session.delete(edelete);
		tx.commit();
		
		//Save Or Update
		EmpTable e1=session.get(EmpTable.class, 2);
		e1.setName("Prathmesh");
		e1.setSalary(10000);
		session.saveOrUpdate(e1);
		tx.commit();
	}

}
