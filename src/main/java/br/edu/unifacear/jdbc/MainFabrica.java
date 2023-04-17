package br.edu.unifacear.jdbc;

import java.sql.*;

public class MainFabrica {

	public static void main(String [ ]args) {
		try {
			
			Connection con = new Fabrica().getConnection();
			System.out.println("Conectado ao BD");
			con.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
