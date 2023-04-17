package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import br.edu.unifacear.classes.Borda;
import br.edu.unifacear.jdbc.Fabrica;

public class BordaDao {
	
	public BordaDao() { 	}
	
		public void selecionarBorda(Borda Borda) throws SQLException {
			Connection con = null;
		
		try {
			con	= new Fabrica().getConnection();
			System.out.println("Conectado ao Banco");
			
			String sql = "SELECT * FROM BORDA";
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
			System.out.println("Erro ao selecionar Borda \n" + e.getMessage());
		}
		finally {
			con.close();
		}
		
		System.out.println("Borda Selecionado");
		
		}
	
		public void salvarBorda(Borda borda) throws SQLException {
			
			Connection con =null;
			try {

				System.out.println("Conectado ao Banco");
				con = new Fabrica().getConnection();
				String sql = "INSERT INTO Borda (NOME)" + "VALUES (?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, borda.getDescricao());
				pst.execute();
				pst.close();
				
			}catch(Exception e) {
				System.out.println("Erro ao gravar Borda \n" + e.getMessage());
			}
			finally {
				con.close();
			}
			
			
			System.out.println("Borda Salvo");
		}
		
//		public void inserirBorda(Borda Borda) {
//		System.out.println("Borda Inserido");
//		}
		
		public void editarBorda(Borda Borda) {
			System.out.println("Borda Editado");
		}
		
		public void deletarBorda(int id) {
			System.out.println("Borda Deletado");
		}
		
		public List<Borda> listarBorda() {
			System.out.println("Lista de Borda");	
			List<Borda> lista = new ArrayList<Borda>(); 
			return lista;
		}
		
	
}
