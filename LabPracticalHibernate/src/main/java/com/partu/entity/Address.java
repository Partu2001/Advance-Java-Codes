package com.partu.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
@Embeddable
public class Address {
	
	String street;
	String city;
	String country;
	String pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, String country, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}

	
	
}
