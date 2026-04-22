package com.partu.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int rollno;
	String studentName;
	String admissionDate;
	@Embedded
	Address adr;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String studentName, String admissionDate, Address adr) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.admissionDate = admissionDate;
		this.adr = adr;
	}

	public Student(String studentName, String admissionDate, Address adr) {
		super();
		this.studentName = studentName;
		this.admissionDate = admissionDate;
		this.adr = adr;
	}

	public int getRollno() {
		return rollno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentName=" + studentName + ", admissionDate=" + admissionDate
				+ ", adr=" + adr + "]";
	}
	
	

}
