package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.Continente;
import br.edu.unifacear.classes.Continente;
import br.edu.unifacear.jdbc.Fabrica;

public class ContinenteDao {


	public ContinenteDao() { 	}
	
	public void selecionarContinente(Continente Continente) throws SQLException {
		Connection con = null;
	
	try {
		con	= new Fabrica().getConnection();
		System.out.println("Conectado ao Banco");
		
		String sql = "SELECT * FROM CONTINENTE";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			int id = rs.getInt(1);
			String nome = rs.getString(2);
			System.out.println(id + " - " + nome);
		}
		rs.close();
		pst.close();
		System.out.println("Select OK");

	}catch (SQLException e) {
		System.out.println("Erro ao selecionar Continente \n" + e.getMessage());
	}
	finally {
		con.close();
	}
	
	System.out.println("Continente Selecionado");
	
	}

	public void salvarContinente(Continente continente) throws SQLException {
		
		Connection con =null;
		try {

			System.out.println("Conectado ao Banco");
			con = new Fabrica().getConnection();
			String sql = "INSERT INTO Continente (NOME)" + "VALUES (?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, continente.getDescricao());
			pst.execute();
			pst.close();
			
		}catch(Exception e) {
			System.out.println("Erro ao gravar Continente \n" + e.getMessage());
		}
		finally {
			con.close();
		}
		
		
		System.out.println("Continente Salvo");
	}
		
//		public void inserirContinente(Continente Continente) {
//		System.out.println("Continente Inserido");
//		}
		
		public void editarContinente(Continente Continente) {
			System.out.println("Continente Editado");
		}
		
		public void deletarContinente(int id) {
			System.out.println("Continente Deletado");
		}
		
		public List<Continente> listarContinente() {
			System.out.println("Lista de Continente");	
			List<Continente> lista = new ArrayList<Continente>(); 
			return lista;
		}
		
	
	
}
