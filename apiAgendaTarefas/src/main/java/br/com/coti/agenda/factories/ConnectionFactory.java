package br.com.coti.agenda.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			
			String host = "jdbc:postgresql://localhost:5432/bd_agendatarefas";
			String user = "postgres";
			String pass = "q1w2e3r4";
			
			return DriverManager.getConnection(host, user, pass);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
