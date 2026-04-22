package model;

public class Student {
	
	String name;
	int age,contact;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int age, int contact) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
	
	
	
	

}
