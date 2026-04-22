package com.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.entity.Employee;

public class MainEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app=new ClassPathXmlApplicationContext("app1.xml");
		Employee e=(Employee) app.getBean("employee");
		
		System.out.println(e);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAdr().getCity());
		System.out.println(e.getAdr().getState());
		System.out.println(e.getAdr().getPincode());

	}

}
