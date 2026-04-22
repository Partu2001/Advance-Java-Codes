package com.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.entity.Employee;

public class MainEmployee2 {

	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("ConstructorApp.xml");
		Employee e=(Employee) app.getBean("emp");
		System.out.println(e);
	}

}
