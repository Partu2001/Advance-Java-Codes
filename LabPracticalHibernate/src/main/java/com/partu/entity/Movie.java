package com.partu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mov_seq")
	@SequenceGenerator(allocationSize = 1,initialValue = 101,name="mov_seq")
	int movieId;
	String movieName;
	String releaseDate;
	float budget;
	
	@ManyToOne
	Director director;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int movieId, String movieName, String releaseDate, float budget, Director director) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.budget = budget;
		this.director = director;
	}

	public Movie(String movieName, String releaseDate, float budget, Director director) {
		super();
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.budget = budget;
		this.director = director;
	}

	public int getMovieId() {
		return movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", releaseDate=" + releaseDate + ", budget="
				+ budget + ", director=" + director + "]";
	}
	
	
	
	

}
