package com.partu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Director {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "direct_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name="direct_seq")
	int directorId;
	String directorName;
	
	@OneToMany
	List <Movie> movie;

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(int directorId, String directorName, List<Movie> movie) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.movie = movie;
	}

	public Director(String directorName, List<Movie> movie) {
		super();
		this.directorName = directorName;
		this.movie = movie;
	}

	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", directorName=" + directorName + ", movie=" + movie + "]";
	}

	
	
	
	

}
