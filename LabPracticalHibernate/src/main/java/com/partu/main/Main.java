package com.partu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.partu.entity.Address;
import com.partu.entity.Institute;
import com.partu.entity.InstituteHistory;
import com.partu.utility.HibernetConnection;

public class Main {
	
	public static void main(String[] args) {
		
		Session session =HibernetConnection.getsession();
		Transaction tx=session.beginTransaction();
		
		Institute i1=new Institute();
		i1.setInstituteName("Seed Infotech");

		
		Address adr=new Address();
		adr.setCity("Kolhapur");
		adr.setStreet("Main Road Kothali");
		adr.setCountry("India");
		adr.setPincode("416101");
		
	
		InstituteHistory history=new InstituteHistory();
		history.setFounder("Prathmesh Kumbhar");
		history.setFoundationDate("9/10/2001");
		history.setAdr(adr);
	    
		history.setInstitute(i1);
		i1.setInstitutehistory(history);
		
		session.save(i1);
		session.save(history);
		
		tx.commit();
		
		Institute iget=session.get(Institute.class, 101);
		System.out.println(iget.getInstituteId());
		System.out.println(iget.getInstituteName());
		System.out.println(iget.getInstitutehistory().getFounder());
		System.out.println(iget.getInstitutehistory().getAdr().getCity());
		System.out.println(iget.getInstitutehistory().getAdr().getCountry());
	
		
		
	}

}
