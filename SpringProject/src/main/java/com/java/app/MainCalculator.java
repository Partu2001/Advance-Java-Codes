package com.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.entity.Calculator;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app= new ClassPathXmlApplicationContext("app.xml");
		
		Calculator c=(Calculator) app.getBean("cal");
 
		c.add();
		c.div();
		c.mul();
		c.div();
	}

}
