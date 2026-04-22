package com.partu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name = "emp_seq")
	int empId;
	String empName;
	String jdate;
	
	@ManyToMany
	List<Meeting> meeting;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String jdate, List<Meeting> meeting) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jdate = jdate;
		this.meeting = meeting;
	}

	public Employee(String empName, String jdate, List<Meeting> meeting) {
		super();
		this.empName = empName;
		this.jdate = jdate;
		this.meeting = meeting;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJdate() {
		return jdate;
	}

	public void setJdate(String jdate) {
		this.jdate = jdate;
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<Meeting> meeting) {
		this.meeting = meeting;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jdate=" + jdate + ", meeting=" + meeting + "]";
	}
	
	
	

}
