package com.partu.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@DiscriminatorValue(value="temp")
@Entity
@Table (name = "temp_emp")
@PrimaryKeyJoinColumn(name="e_t_id")
public class Temporary extends EmployeeTable {
	
	String desingnation;
	String department;
	
	public Temporary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Temporary(String desingnation, String department) {
		super();
		this.desingnation = desingnation;
		this.department = department;
	}

	public String getDesingnation() {
		return desingnation;
	}

	public void setDesingnation(String desingnation) {
		this.desingnation = desingnation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Temporary [desingnation=" + desingnation + ", department=" + department + ", id=" + id + ", name="
				+ name + ", salary=" + salary + ", adr=" + adr + "]";
	}
	
	
	
	

}
