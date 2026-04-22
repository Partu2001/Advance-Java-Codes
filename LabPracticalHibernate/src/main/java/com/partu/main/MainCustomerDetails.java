package com.partu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.partu.entity.Address;
import com.partu.entity.Customer;
import com.partu.entity.PassportDetails;
import com.partu.utility.HibernetConnection;

public class MainCustomerDetails {

	public static void main(String[] args) {
		
		Session session=HibernetConnection.getsession();
		Transaction tx=session.beginTransaction();
		
//		Address adr=new Address();
//		adr.setCity("Pune");
//		adr.setStreet("FC Road");
//		adr.setPincode("416111");
//		adr.setCountry("India");
//		
//		PassportDetails pd=new PassportDetails();
//		pd.setFirstName("Prathmesh");
//		pd.setLastName("Kumbhar");
//		pd.setDob("9/10/2001");
//		pd.setBirthPlace("Kothali");
//		pd.setGender("Male");
//		pd.setNationality("Indian");
//		pd.setCountryCode("1001");
//		pd.setExpiryDate("10/10/2010");
//		pd.setIssueDate("10/10/2011");
//	
//		Customer c=new Customer();
//		c.setCustName("Partu");
//		c.setContactNo(8765435);
//		c.setAdr(adr);
//		
//		c.setpDetails(pd);
//
//        session.save(pd);
//		session.save(c);
		
		tx.commit();
		
		Customer cget=session.get(Customer.class, 101);
		System.out.println(cget.getCustName());
		System.out.println(cget.getContactNo());
		System.out.println(cget.getpDetails().getNationality());
		System.out.println(cget.getpDetails().getPassportNo());
		
		
		// TODO Auto-generated method stub

	}

}
