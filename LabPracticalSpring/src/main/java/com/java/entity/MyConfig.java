package com.java.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com")
public class MyConfig {
	
    @Bean("guitar")
	public Guitar getGuitar() {
		return new Guitar();
	}
    
    @Bean("piano")
   	public Piano getPiano() {
   		return new Piano();
   	}

}
