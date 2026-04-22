package com.partu.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class InstituteHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "inst_history_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name="inst_history_seq")
	int instituteId;
	String founder;
	String foundationDate;
	
	@Embedded
	Address adr;

	@OneToOne 
	Institute institute;

	public InstituteHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstituteHistory(int instituteId, String founder, String foundationDate, Address adr, Institute institute) {
		super();
		this.instituteId = instituteId;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.adr = adr;
		this.institute = institute;
	}

	public InstituteHistory(String founder, String foundationDate, Address adr, Institute institute) {
		super();
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.adr = adr;
		this.institute = institute;
	}

	public int getInstituteId() {
		return instituteId;
	}


	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	@Override
	public String toString() {
		return "InstituteHistory [instituteId=" + instituteId + ", founder=" + founder + ", foundationDate="
				+ foundationDate + ", adr=" + adr + ", institute=" + institute + "]";
	}
	
	
	
	
	
	
}
