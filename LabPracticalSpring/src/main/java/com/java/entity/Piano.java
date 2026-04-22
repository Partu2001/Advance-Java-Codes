package com.java.entity;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instruments {
	
	public void play() {
		System.out.println("Playing Piano..");
	}

}
