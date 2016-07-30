package com.java.may.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn =  DriverManager.getConnection("jdbc:mysql://localhost/sakila?" +
				                                   "user=root&password=root");
			
		} catch (Exception ex) {
			System.out.println("Error in the DBConnection.getConnection" + ex);
		}
		return conn; // handing it over 
	}
	
	
	
	

}
