package com.partu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.partu.entity.Address;
import com.partu.entity.PrimaryStudent;
import com.partu.entity.SecondaryStudent;
import com.partu.entity.Student;
import com.partu.utility.HibernetConnection;

public class MainStudent {

	public static void main(String[] args) {
		
		Session session=HibernetConnection.getsession();
		Transaction tx=session.beginTransaction();
		
	    Address adr=new Address();
	    adr.setCity("Sangli");
	    adr.setStreet("100 Futi Road");
	    adr.setCountry("India");
	    adr.setPincode("416416");
	    
	    Student s=new Student();
	    s.setStudentName("Prathmesh Kumbhar");
	    s.setAdmissionDate("15/10/2023");
	    s.setAdr(adr);
	    
	    PrimaryStudent p=new PrimaryStudent();
	    p.setStudentName("Tushar Jadhav");
	    p.setAdmissionDate("15/9/2024");
	    p.setGrade("A");
	    p.setAdr(adr);
	    
	    SecondaryStudent ss=new SecondaryStudent();
	    ss.setStudentName("Vinit Terdale");
	    ss.setAdmissionDate("12/8/2025");
	    ss.setPercentage(85);
	    ss.setAdr(adr);
	    
	    session.save(s);
	    session.save(p);
	    session.save(ss);
	    tx.commit();
	    
	    PrimaryStudent pget=session.get(PrimaryStudent.class, 2);
	    System.out.println(pget.getRollno());
	    System.out.println(pget.getStudentName());
	    System.out.println(pget.getAdmissionDate());
	    System.out.println(pget.getGrade());
	    System.out.println(pget.getAdr());
	   
	    
	    
	    

	}

}
