package com.student.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="stud_seq")
	@SequenceGenerator(allocationSize = 1,initialValue =101,name="stud_seq")
	int id;
	String name;
	
	@ManyToMany (mappedBy = "student")
	List<Laptop> laptop;

	public Student() {
		super();
	}

	public Student(int id, String name, List<Laptop> laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	}

	public Student(String name, List<Laptop> laptop) {
		super();
		this.name = name;
		this.laptop = laptop;
	}

	public int getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}

	
	
	
	
	

}
