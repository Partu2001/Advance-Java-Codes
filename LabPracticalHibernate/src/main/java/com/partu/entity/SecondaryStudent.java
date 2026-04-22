package com.partu.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue(value="s_Student")
public class SecondaryStudent extends Student {
	
	float percentage;

	public SecondaryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondaryStudent(float percentage) {
		super();
		this.percentage = percentage;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "SecondaryStudent [percentage=" + percentage + ", rollno=" + rollno + ", studentName=" + studentName
				+ ", admissionDate=" + admissionDate + ", adr=" + adr + "]";
	}
	
	

}
