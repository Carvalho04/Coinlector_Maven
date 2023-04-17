package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.Forma;
import br.edu.unifacear.classes.Forma;
import br.edu.unifacear.jdbc.Fabrica;


public class FormaDao {
	
	public FormaDao () {}
	
	public void selecionarForma(Forma Forma) throws SQLException {
		Connection con = null;
	
	try {
		con	= new Fabrica().getConnection();
		System.out.println("Conectado ao Banco");
		
		String sql = "SELECT * FROM FORMA";
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
		System.out.println("Erro ao selecionar Forma \n" + e.getMessage());
	}
	finally {
		con.close();
	}
	
	System.out.println("Forma Selecionado");
	
	}

	public void salvarForma(Forma forma) throws SQLException {
		
		Connection con =null;
		try {

			System.out.println("Conectado ao Banco");
			con = new Fabrica().getConnection();
			String sql = "INSERT INTO Forma (NOME)" + "VALUES (?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, forma.getDescricao());
			pst.execute();
			pst.close();
			
		}catch(Exception e) {
			System.out.println("Erro ao gravar Forma \n" + e.getMessage());
		}
		finally {
			con.close();
		}
		
		
		System.out.println("Forma Salvo");
	}
		
//		public void inserirForma(Forma forma) {
//		System.out.println("Forma Inserido");
//	}
		
		public void editarForma(Forma forma) {
			System.out.println("Forma Editado");		
		}
		
		public void deletarForma(int id) {
			System.out.println("Forma Deletado");		
		}	
		
		public List<Forma> listarForma() {
			System.out.println("Lista Forma");	
			List<Forma> lista = new ArrayList<Forma>(); 
			return lista;
		}	

}
