package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import br.edu.unifacear.classes.Pais;
import br.edu.unifacear.jdbc.Fabrica;

public class PaisDao {

	public PaisDao() {   }
	
		public void selecionarPais(Pais pais) throws SQLException {
			Connection con = null;
			
			try {
				con	= new Fabrica().getConnection();
				System.out.println("Conectado ao Banco");
				
				String sql = "SELECT * FROM PAIS";
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
				System.out.println("Erro ao selecionar Pais \n" + e.getMessage());
			}
			
			finally {
				con.close();
			}
			
			
			
			System.out.println("Pais Selecionado");		
		}
		
		public void salvarPais(Pais pais) throws SQLException {
			Connection con =null;
			try {

				System.out.println("Conectado ao Banco");
				con = new Fabrica().getConnection();
				String sql = "INSERT INTO PAIS 	(NOME, CONTINENTE)" + "VALUES (?, ?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, pais.getNome());
				pst.setInt(2, pais.getContinente().getId());
				pst.execute();
				pst.close();
				
			}catch(Exception e) {
				System.out.println("Erro ao gravar Pais \n" + e.getMessage());
			}
			finally {
				con.close();
			}
			
			
			System.out.println("Pais Salvo");
		}
		
//		public void inserirPais(Pais pais) {
//		System.out.println("Pais Inserido");
//		}
		
		public void editarPais(Pais pais) {
			System.out.println("Pais Editado");
		}
		
		public void deletarPais(int id) {
			System.out.println("Pais Deletado");
		}
		
		public List <Pais> listarPais(){
			System.out.println("Lista Pais");
			List<Pais> lista = new ArrayList<Pais>();
			return lista;
		}
}
