package com.partu.entity;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.partu.entity.Address;

@Table
@Entity
@Inheritance(strategy  = InheritanceType.JOINED)
@DiscriminatorColumn(name="etype")
public class EmployeeTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 100, name="emp_seq")
	
	int id;
	String name;
	long salary;
	
	@Embedded
	Address adr;

	public EmployeeTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeTable(int id, String name, long salary, Address adr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.adr = adr;
	}

	public EmployeeTable(String name, long salary, Address adr) {
		super();
		this.name = name;
		this.salary = salary;
		this.adr = adr;
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

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "EmployeeTable [id=" + id + ", name=" + name + ", salary=" + salary + ", adr=" + adr + "]";
	}
	
	
	
	
	
}