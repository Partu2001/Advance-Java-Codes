package com.partu.entity;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@DiscriminatorValue(value="perm")
@Entity
@Table (name = "perm_emp")
@PrimaryKeyJoinColumn(name="e_p_id")
public class Permenent extends EmployeeTable {
	
	String designation;
	String department;
	
	public Permenent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permenent(String designation, String department) {
		super();
		this.designation = designation;
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Permenent [designation=" + designation + ", department=" + department + ", id=" + id + ", name=" + name
				+ ", salary=" + salary + ", adr=" + adr + "]";
	}
	
	
	

}
