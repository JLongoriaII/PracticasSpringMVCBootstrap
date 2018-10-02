package com.practicasspringbootstrap.connection;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Connector {
	
	public DriverManagerDataSource connector(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/springbootstrap?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
}
