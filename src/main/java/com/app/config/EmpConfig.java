package com.app.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class EmpConfig {

	@Bean
	public DriverManagerDataSource ds() {
		DriverManagerDataSource dsobj=new DriverManagerDataSource();
		dsobj.setDriverClassName("com.mysql.jdbc.Driver");
		dsobj.setUrl("jdbc:mysql://localhost:3306/test");
		dsobj.setUsername("root");
		dsobj.setPassword("admin");
		return dsobj;
	}
	@Bean
	public JdbcTemplate jt() {
		JdbcTemplate j=new JdbcTemplate();
		j.setDataSource(ds());
		return j;
	}
	
}
