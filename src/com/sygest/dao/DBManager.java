package com.sygest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	private static Connection connection = null;
	private DBManager () {}
	
	public static Connection getConnection () throws Exception {
		try {
			// Chargement du driver jdbc mysql
			Class.forName ("com.mysql.cj.jdbc.Driver");

			// Ouverture de la connexion
			connection = DriverManager.getConnection ("jdbc:mysql://54.198.195.253/dbsysget?serverTimezone=UTC", "usersysget", "myUserSysget@2021");

			return connection;
		} catch (ClassNotFoundException e) {
			throw new Exception ("ClassNotFoundException:'" + e.getMessage () + "' ");
		} catch (SQLException e) {
			throw new Exception ("SQLException:Connection failed:" + e.getMessage());
		}
	}
	
}
