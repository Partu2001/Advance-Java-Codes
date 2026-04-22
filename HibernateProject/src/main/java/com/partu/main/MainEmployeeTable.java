
package com.partu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.partu.entity.Address;
import com.partu.entity.EmployeeTable;
import com.partu.entity.Permenent;
import com.partu.entity.Temporary;

public class MainEmployeeTable {

	public static void main(String[] args) {
		
		Session session=HibernateConnectivity.getsession();
		Transaction tx=session.beginTransaction();
		
		Address adr=new Address();
		adr.setCity("Kolhapur");
		adr.setState("Maharashtra");
		adr.setPincode(416101);
		
		EmployeeTable e=new EmployeeTable();
		e.setName("Partu");
		e.setSalary(100000);
		e.setAdr(adr);
		
		
		Temporary t=new Temporary();
		t.setAdr(adr);
		t.setName("Prathmesh");
		t.setSalary(50000);
		t.setDepartment("IT");
		t.setDesingnation("Java Developer");
		
		Permenent p=new Permenent();
		p.setAdr(adr);
		p.setName("Tushar");
		p.setSalary(30000);
		p.setDepartment("IT");
		p.setDesignation("Data Analytics");
		
		session.save(e);
		session.save(p);
		session.save(t);
		tx.commit();
	

	}

}
