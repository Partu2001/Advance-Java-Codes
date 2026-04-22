package com.partu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Institute {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "inst_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name="inst_seq")
	int instituteId;
	String instituteName;
	
	@OneToOne (mappedBy = "institute")
	InstituteHistory institutehistory;

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institute(int instituteId, String instituteName, InstituteHistory institutehistory) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.institutehistory = institutehistory;
	}

	public Institute(String instituteName, InstituteHistory institutehistory) {
		super();
		this.instituteName = instituteName;
		this.institutehistory = institutehistory;
	}

	public int getInstituteId() {
		return instituteId;
	}


	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public InstituteHistory getInstitutehistory() {
		return institutehistory;
	}

	public void setInstitutehistory(InstituteHistory institutehistory) {
		this.institutehistory = institutehistory;
	}

	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", institutehistory="
				+ institutehistory + "]";
	}
	
	
	
	
	
	
}
