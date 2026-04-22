package com.java.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.entity.Address;
import com.java.entity.Student;
import com.java.entity.Student1;
import com.java.entity.Student2;

public class MainStudent {
	
	public static void main(String[] args) {
		
		ApplicationContext app=new AnnotationConfigApplicationContext("com");
		
		Address adr=app.getBean(Address.class);
		adr.setPincode(416101);
		adr.setCity("Kolhapur");
		adr.setState("Maharashtra");
		
//		Student s=app.getBean(Student.class);
//		s.setId(101);
//		s.setName("Partu");
//		s.setAdr(adr);
//		System.out.println(s);
		 
//		Student1 s1=app.getBean(Student1.class);
//		s1.setId(101);
//		s1.setName("Prathmesh");
//		s1.setAdr(adr);
//		s1.setS_Type("MCA");
//		
//		System.out.println(s1);
		
		Student2 s2=app.getBean(Student2.class);
		s2.setId(102);
		s2.setName("Vinit");
		s2.setAdr(adr);
		s2.setS_Type("BCA");
		
		System.out.println(s2);

		 
		 
	     	 
	}

}
