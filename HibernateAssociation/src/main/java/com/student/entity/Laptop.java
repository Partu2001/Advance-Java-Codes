package com.student.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "lap_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name = "lap_seq")
	int id;
	String name;
	
	@ManyToMany
	@JoinTable(name="Student_laptop_data",joinColumns = @JoinColumn(name="laptop_id"),inverseJoinColumns = @JoinColumn(name="student_id"))
	List<Student> student;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int id, String name, List<Student> student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}

	public Laptop(String name, List<Student> student) {
		super();
		this.name = name;
		this.student = student;
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

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", student=" + student + "]";
	}

	
	

	
	

	
}
