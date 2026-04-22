package com.partu.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue(value="p_student")
public class PrimaryStudent extends Student {
	
	String grade;

	public PrimaryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrimaryStudent(String grade) {
		super();
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PrimaryStudent [grade=" + grade + ", rollno=" + rollno + ", studentName=" + studentName
				+ ", admissionDate=" + admissionDate + ", adr=" + adr + "]";
	}

	
	

}
