package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entity.Car;

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app=new AnnotationConfigApplicationContext("com");
	    Car c=	app.getBean(Car.class);
	    c.run();

	}

}
