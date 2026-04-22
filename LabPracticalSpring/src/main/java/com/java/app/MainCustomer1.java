package com.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.entity.Address;
import com.java.entity.Customer1;
import com.java.entity.MyDate;

public class MainCustomer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app= new AnnotationConfigApplicationContext("com");
		
		Address adr=app.getBean(Address.class);
		adr.setCity("Kolhapur");
		adr.setState("Maharashtra");
		adr.setCountry("India");
		adr.setPincode(416101);
		
		MyDate d=app.getBean(MyDate.class);
		d.setDay(9);
		d.setMonth(10);
		d.setYear(2001);
		
		Customer1 c=app.getBean(Customer1.class);
		c.setCusId(101);
		c.setCusName("Partu");
		c.setAdr(adr);
		c.setDate(d);
		
		System.out.println(c);
		
		
		

	}

}
