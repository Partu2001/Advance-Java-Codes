package com.java.entity;

public class Employee {
	
	int id;
	String name;
	
	Address adr;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Address adr) {
		super();
		this.id = id;
		this.name = name;
		this.adr = adr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adr=" + adr + "]";
	}

	

}
