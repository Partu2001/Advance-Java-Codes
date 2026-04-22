package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class CarAspects {
	
	@Before ("execution (* com.entity.Car.run(..))")
	public void before() {
		System.out.println("Car is starting..");
	}
	
	@After ("execution (* com.entity.Car.run(..))")
	public void after() {
		System.out.println("Car is Stoped..");
	}

	@Around ("execution (* com.entity.Car.run(..))")
	public void around() {
		System.out.println("Driver is Driving..");
	}
	
	@AfterThrowing ("execution (* com.entity.Car.run(..))")
	public void thrwoing() {
		System.out.println("Error Occured..");
	}
}
