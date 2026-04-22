package com.java.util;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class GiftUtility {
	
	@Bean
	public DataSource getConnection() {
		DriverManagerDataSource dm=new DriverManagerDataSource();
		dm.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dm.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dm.setUsername("system");
		dm.setPassword("system");
		return dm;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getConnection());
	}

}
