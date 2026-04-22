package com.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.entity.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		Employee e=(Employee) app.getBean("emp1");
		e.setId(101);
		e.setName("Prathmesh");
		
		System.out.println(e);
		System.out.println("ID:"+e.getId());
		System.out.println("Name :" +e.getName());
		
		
		
		

	}

}
