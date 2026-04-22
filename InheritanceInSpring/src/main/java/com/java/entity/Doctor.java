package com.java.entity;

public class Doctor extends Person {
	
	int id;
	String docto_Type;
	String hospital_Name;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int id, String docto_Type, String hospital_Name) {
		super();
		this.id = id;
		this.docto_Type = docto_Type;
		this.hospital_Name = hospital_Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocto_Type() {
		return docto_Type;
	}

	public void setDocto_Type(String docto_Type) {
		this.docto_Type = docto_Type;
	}

	public String getHospital_Name() {
		return hospital_Name;
	}

	public void setHospital_Name(String hospital_Name) {
		this.hospital_Name = hospital_Name;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", docto_Type=" + docto_Type + ", hospital_Name=" + hospital_Name + ", name=" + name
				+ ", age=" + age + "]";
	}
	
	

}
