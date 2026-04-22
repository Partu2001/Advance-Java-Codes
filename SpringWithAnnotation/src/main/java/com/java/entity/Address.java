package com.java.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address {
	
	int pincode;
	String city,state;

}
