package com.partu.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.partu.entity.EmpTable;

public class MainEmpTable2 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(EmpTable.class);
	    SessionFactory factory=cfg.buildSessionFactory();
	    Session session=factory.openSession();
	    Transaction tx=session.beginTransaction();
	   
	    
	    Query query=session.createQuery("from EmpTable");
	    List <EmpTable> e= query.list();
	    for(EmpTable employee:e) {
	    	System.out.println(employee.getId());
	    	System.out.println(employee.getName());
	    	System.out.println(employee.getSalary());
	    }
	    
	    
	    	// 2.From - select particular Row with Condition
	    	Query query1=session.createQuery("from EmpTable where id=3");
	    	EmpTable e2= (EmpTable) query1.uniqueResult();
	    	System.out.println(e2);
	    	
	    	
	    	// 3.Native Query - using SQL Query database table name and also class name
	    	Query query3=session.createNativeQuery("select * from EmpTable ",EmpTable.class);
	    	List<EmpTable> e3=query3.list();
	    	for(EmpTable emp:e3) {
	    		System.out.println(emp);
	    	}
	    		
	    	// 4. select clause fetch particular data
	    	Query query4=session.createNativeQuery("select * from EmpTable where id=2",EmpTable.class);
	   		EmpTable e4=(EmpTable) query4.uniqueResult();
	   		System.out.println(e4);
	    		
	   		//select clause-fetch for multiple data in HQL 
	   		 Query quary5 = session.createQuery("select name, salary from EmpTable");
	   		 List <Object[]> list = quary5.list();
	   		 for(Object[] obj : list) {
	   		     System.out.println("Name: " + obj[0] + " Salary: " + obj[1]);
	   		 }
	   		 
	   		 
	   		//select clause-fetch for particular data in HQL
	   		 Query query6 = session.createQuery("select e.name, e.salary from EmpTable e");	
	   		 List<String> e5=query6.list();
	   		 for(String emp1:e5) {
	   			 System.out.println(emp1);
	   		 }
	   		 
	   		 
	   		 Query query7=session.createQuery("from EmpTable where id=?1");
	   		 query7.setParameter(1,3);
	   		 EmpTable e6= (EmpTable) query7.uniqueResult();
	   		 System.out.println(e6);
	   		 
	   		 
	   		 Query query8=session.createQuery("from EmpTable where id=:id");
	   		 query8.setParameter("id", 2);
	   		 EmpTable e7= (EmpTable) query8.uniqueResult();
	   		 System.out.println(e7);
	   		 
	   		 
	   		 Query query9=session.createQuery("update EmpTable set name=:name where id=:id");
	   		 query9.setParameter("name", "Tush");
	   		 query9.setParameter("id",3);
	   		 int row=query9.executeUpdate();
	   		 System.out.println(row);
	   		 tx.commit();
	   		 
	   		 
	         Query query10=session.createQuery("delete from EmpTable where id=:id");
	         query10.setParameter("id",3);
	         int row1=query10.executeUpdate();
	         System.out.println(row1);
	         tx.commit();
	   		 
	   		 
	   		 
	   		 
	}    
}


