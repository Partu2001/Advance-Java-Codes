 package com.java.entity;

public class Developer extends Person {
	
	int id;
	String developer_Type;
	String company_Name;
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int id, String developer_Type, String company_Name) {
		super();
		this.id = id;
		this.developer_Type = developer_Type;
		this.company_Name = company_Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeveloper_Type() {
		return developer_Type;
	}

	public void setDeveloper_Type(String developer_Type) {
		this.developer_Type = developer_Type;
	}

	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", developer_Type=" + developer_Type + ", company_Name=" + company_Name
				+ ", name=" + name + ", age=" + age + "]";
	}
	
	

}
