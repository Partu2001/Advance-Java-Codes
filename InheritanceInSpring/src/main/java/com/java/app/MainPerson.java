package com.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.entity.Person;

public class MainPerson {

	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("App.xml");
		
		Person p=(Person) app.getBean("doctor");
		System.out.println(p);
		
		Person p1=(Person) app.getBean("developer");
		System.out.println(p1);
		// TODO Auto-generated method stub

	}

}
