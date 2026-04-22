package com.student.app;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.student.entity.Laptop;
import com.student.entity.Student;
import com.student.utility.HibernateConnectivity;

public class Main {

	public static void main(String[] args) {

		Session session = HibernateConnectivity.getSession();
		Transaction tx = session.beginTransaction();

		Student s1 = new Student();
		s1.setName("Prathmesh");

		Student s2 = new Student();
		s2.setName("Vinit");
		
		Student s3 = new Student();
		s3.setName("Tush");

		
		Laptop l1 = new Laptop();
		l1.setName("Dell");
        l1.setStudent(Arrays.asList(s1,s2,s3));
		
		Laptop l2 = new Laptop();
		l2.setName("HP");
		l2.setStudent(Arrays.asList(s1,s2));

		Laptop l3 = new Laptop();
		l3.setName("Lenevo");
		l3.setStudent(Arrays.asList(s1,s3));

		Laptop l4 = new Laptop();
		l4.setName("MAC");

		Laptop l5 = new Laptop();
		l5.setName("Asus");

		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		session.save(l1);
		session.save(l2);
		session.save(l3);
		session.save(l4);
		session.save(l5);

		

		tx.commit();

	}

}
