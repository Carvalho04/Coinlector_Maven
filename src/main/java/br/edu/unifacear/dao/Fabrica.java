package br.edu.unifacear.dao;

import java.sql.*;

import javax.persistence.*;

public class Fabrica {
	
		static EntityManagerFactory emf = 
				 Persistence.createEntityManagerFactory("Coinlector");

		public static EntityManager getEntityManager() { // getConnection() {
			return emf.createEntityManager();
		}
		
}
