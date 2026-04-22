package com.partu.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class CustomerInfo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int customerId;
	String customerName;
	long customerContact;
	String birthDate;
	@Embedded
	Address adr;
	
	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerInfo(int customerId, String customerName, long customerContact, String birthDate, Address adr) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.birthDate = birthDate;
		this.adr = adr;
	}

	public CustomerInfo(String customerName, long customerContact, String birthDate, Address adr) {
		super();
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.birthDate = birthDate;
		this.adr = adr;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", birthDate=" + birthDate + ", adr=" + adr + "]";
	}

	

	
	
	
	

	

}
