package com.java.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Customer1 {
	int cusId;
	String cusName;
	
	@Autowired
	Address adr;
	
	@Autowired
	MyDate date;

}
