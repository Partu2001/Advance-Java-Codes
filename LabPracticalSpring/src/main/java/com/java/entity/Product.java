package com.java.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Product {
	
	int code;
	String name;
	double price;
	
	public Product(int code, String name, double price) {
		this.code=code;
		this.name=name;
		this.price=price;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

}
