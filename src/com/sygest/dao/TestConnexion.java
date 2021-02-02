package com.sygest.dao;

import java.sql.Connection;

import javax.swing.JOptionPane;


public class TestConnexion {

	public static void main(String[] args) {
		try (Connection connection = DBManager.getConnection()) {
			JOptionPane.showMessageDialog(null, "Connexion a la base  Ok");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}
