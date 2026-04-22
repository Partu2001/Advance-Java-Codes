package com.partu.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cust_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name="cust_seq")
	int custId;
	String custName;
	long contactNo;
	
	@Embedded
	Address adr;
	
	@OneToOne
	@JoinColumn(name="passport_id")
	PassportDetails pDetails;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName, long contactNo, Address adr, PassportDetails pDetails) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.contactNo = contactNo;
		this.adr = adr;
		this.pDetails = pDetails;
	}

	public Customer(String custName, long contactNo, Address adr, PassportDetails pDetails) {
		super();
		this.custName = custName;
		this.contactNo = contactNo;
		this.adr = adr;
		this.pDetails = pDetails;
	}

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public PassportDetails getpDetails() {
		return pDetails;
	}

	public void setpDetails(PassportDetails pDetails) {
		this.pDetails = pDetails;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", contactNo=" + contactNo + ", adr=" + adr
				+ ", pDetails=" + pDetails + "]";
	}
	
	
	
	

}
