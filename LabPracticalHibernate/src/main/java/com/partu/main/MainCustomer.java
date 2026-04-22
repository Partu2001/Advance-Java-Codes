package com.partu.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.partu.entity.Address;
import com.partu.entity.CustomerInfo;

public class MainCustomer {

	public static void main(String[] args) {
	
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(CustomerInfo.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
	    Transaction tx=session.beginTransaction();
	 
	 System.out.println("Table Created..");
	 
	 Scanner sc = new Scanner(System.in);
	 List<CustomerInfo> list =new ArrayList<CustomerInfo>();
	 
	 System.out.println("Enter Number of Customer Details You Want to Add :");
	 int n=sc.nextInt();
	 sc.nextLine();
	 
	 for(int i=0;i<n;i++) {
		 CustomerInfo c=new CustomerInfo();
		 System.out.println("Enter Customer Name :");
		 c.setCustomerName(sc.next());
		 sc.nextLine();
		 
		 System.out.println("Enter Customer Contact :");
		 c.setCustomerContact(sc.nextLong());
		 sc.nextLine();
		 
		 System.out.println("Enter Customer Birth Data :");
		 c.setBirthDate(sc.next());
		 sc.nextLine();
		 
		 Address adr=new Address();
		 System.out.println("Enter Street Name :");
		 adr.setStreet(sc.next());
		 sc.nextLine();
		 
		 System.out.println("Enter City Name :");
		 adr.setCity(sc.next());
		 sc.nextLine();
		 
		 System.out.println("Enter Country Name :");
		 adr.setCountry(sc.next());
		 sc.nextLine();
		 
		 System.out.println("Enter Pincode :");
		 adr.setPincode(sc.next());
		 sc.nextLine();
		 
		 c.setAdr(adr);
		 list.add(c);
		 	 
	 }
	 
	 for(CustomerInfo ci:list) {
		 session.save(ci);
		 System.out.println("Data Inserted..");
	 }
	 
	 tx.commit();
	 
	 Query query=session.createQuery("from CustomerInfo where id =3");
	 CustomerInfo c1=(CustomerInfo) query.uniqueResult();
	 System.out.println(c1);
	 
	 CustomerInfo cget=session.get(CustomerInfo.class, 4);
	 cget.getAdr();
	 cget.getCustomerId();
	 cget.getCustomerName();
	 cget.getCustomerContact();
	 cget.getBirthDate();
	 
	

	}

}
