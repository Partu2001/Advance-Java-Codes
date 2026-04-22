package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public void run() {
		System.out.println("car is Running..");
		System.out.println(10/0);
		
	}
	

}
