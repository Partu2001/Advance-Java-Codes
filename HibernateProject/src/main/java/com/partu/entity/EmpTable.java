package com.partu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class EmpTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	long salary;
	
	public EmpTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpTable(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmpTable(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpTable [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
