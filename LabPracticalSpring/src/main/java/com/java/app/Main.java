package com.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.entity.Address;
import com.java.entity.Customer;
import com.java.entity.MyConfig;
import com.java.entity.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Address adr=app.getBean(Address.class);
		adr.setCity("Kolhapur");
		adr.setState("Maharashtra");
		adr.setCountry("India");
		adr.setPincode(416101);
		
		Customer c=app.getBean(Customer.class);
		c.setCusId(101);
		c.setCusName("Prathmesh");
		c.setAdr(adr);
		System.out.println(c);
		
		
		
		Product p1 = (Product) app.getBean("second");
		System.out.println(p1);

	}

}
