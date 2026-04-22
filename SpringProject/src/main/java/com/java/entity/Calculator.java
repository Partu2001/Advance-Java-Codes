package com.java.entity;

public class Calculator {
	
	int n1;
	int n2;
	
	
	
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculator(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "Calculator [n1=" + n1 + ", n2=" + n2 + "]";
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public void add() {
		System.out.println("Addition :" +getN1()+getN2());
	}
	
	public void sub() {
		System.out.println( getN1()-getN2());
	}
	
	public void mul() {
		System.out.println("Multiplication :" +getN1()*getN2());
	}
	
	public void div() {
		System.out.println("Division :" +getN1()/getN2());
	}

}
