package com.qintess.banco.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() {
		System.out.println("Conectando ao banco de dados");
		try {
			
			return
			DriverManager.getConnection("jdbc:h2:tcp://localhost:8082/", "SA", "");
			
		}catch (Exception e) {
			throw new RuntimeException (e);
		}
	}

}
