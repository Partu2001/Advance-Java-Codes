package com.java.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student1 extends Student {
	
	String s_Type;

	@Override
	public String toString() {
		return "Student1 [s_Type=" + s_Type + ", id=" + id + ", name=" + name + ", adr=" + adr + "]";
	}
	
	

}
