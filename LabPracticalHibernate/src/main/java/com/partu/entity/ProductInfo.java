package com.partu.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class ProductInfo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int code;
	String name;
	double price;
	String brand;
	String manufacturingdate;
	
	public ProductInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductInfo(int code, String name, double price, String brand, String manufacturingdate) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.manufacturingdate = manufacturingdate;
	}

	
	public ProductInfo(String name, double price, String brand, String manufacturingdate) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.manufacturingdate = manufacturingdate;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getManufacturingdate() {
		return manufacturingdate;
	}

	public void setManufacturingdate(String manufacturingdate) {
		this.manufacturingdate = manufacturingdate;
	}

	@Override
	public String toString() {
		return "ProductInfo [code=" + code + ", name=" + name + ", price=" + price + ", brand=" + brand
				+ ", manufacturingdate=" + manufacturingdate + "]";
	}
	
	
}
