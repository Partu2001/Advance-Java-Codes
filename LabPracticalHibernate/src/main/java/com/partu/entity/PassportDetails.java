package com.partu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class PassportDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pass_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name="pass_seq")
	int passportNo;
	String firstName,lastName,gender,nationality,countryCode,birthPlace;
	String dob,expiryDate,issueDate;
	
	
	@OneToOne(mappedBy = "pDetails")
	Customer customer;


	public PassportDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PassportDetails(int passportNo, String firstName, String lastName, String gender, String nationality,
			String countryCode, String birthPlace, String dob, String expiryDate, String issueDate, Customer customer) {
		super();
		this.passportNo = passportNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.nationality = nationality;
		this.countryCode = countryCode;
		this.birthPlace = birthPlace;
		this.dob = dob;
		this.expiryDate = expiryDate;
		this.issueDate = issueDate;
		this.customer = customer;
	}


	public PassportDetails(String firstName, String lastName, String gender, String nationality, String countryCode,
			String birthPlace, String dob, String expiryDate, String issueDate, Customer customer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.nationality = nationality;
		this.countryCode = countryCode;
		this.birthPlace = birthPlace;
		this.dob = dob;
		this.expiryDate = expiryDate;
		this.issueDate = issueDate;
		this.customer = customer;
	}


	public int getPassportNo() {
		return passportNo;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getBirthPlace() {
		return birthPlace;
	}


	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public String getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "PassportDetails [passportNo=" + passportNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", nationality=" + nationality + ", countryCode=" + countryCode
				+ ", birthPlace=" + birthPlace + ", dob=" + dob + ", expiryDate=" + expiryDate + ", issueDate="
				+ issueDate + ", customer=" + customer + "]";
	}
	
	
	
	
	

}
