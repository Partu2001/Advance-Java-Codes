package com.partu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Meeting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "meet_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name = "meet_seq")
	int meetingId;
	String agenda;
	String meetingDate;
	String meetingTime;
	
	@ManyToMany
	List<Employee> employee;

	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meeting(int meetingId, String agenda, String meetingDate, String meetingTime, List<Employee> employee) {
		super();
		this.meetingId = meetingId;
		this.agenda = agenda;
		this.meetingDate = meetingDate;
		this.meetingTime = meetingTime;
		this.employee = employee;
	}

	public Meeting(String agenda, String meetingDate, String meetingTime, List<Employee> employee) {
		super();
		this.agenda = agenda;
		this.meetingDate = meetingDate;
		this.meetingTime = meetingTime;
		this.employee = employee;
	}

	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}

	public String getMeetingTime() {
		return meetingTime;
	}

	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", agenda=" + agenda + ", meetingDate=" + meetingDate
				+ ", meetingTime=" + meetingTime + ", employee=" + employee + "]";
	}
	
	

}
