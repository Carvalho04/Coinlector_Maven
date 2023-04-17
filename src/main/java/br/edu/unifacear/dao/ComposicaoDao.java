package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import br.edu.unifacear.classes.Composicao;
import br.edu.unifacear.classes.Composicao;
import br.edu.unifacear.jdbc.Fabrica;

public class ComposicaoDao {
	
	public ComposicaoDao () {}
		
	public void selecionarComposicao(Composicao Composicao) throws SQLException {
		Connection con = null;
	
	try {
		con	= new Fabrica().getConnection();
		System.out.println("Conectado ao Banco");
		
		String sql = "SELECT * FROM COMPOSICAO";
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
		System.out.println("Erro ao selecionar Composicao \n" + e.getMessage());
	}
	finally {
		con.close();
	}
	
	System.out.println("Composicao Selecionado");
	
	}

	public void salvarComposicao(Composicao composicao) throws SQLException {
		
		Connection con =null;
		try {

			System.out.println("Conectado ao Banco");
			con = new Fabrica().getConnection();
			String sql = "INSERT INTO Composicao (NOME)" + "VALUES (?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, composicao.getDescricao());
			pst.execute();
			pst.close();
			
		}catch(Exception e) {
			System.out.println("Erro ao gravar Composicao \n" + e.getMessage());
		}
		finally {
			con.close();
		}
		
		
		System.out.println("Composicao Salvo");
	}	
		
//		public void inserirComposicao(Composicao composicao) {
//			System.out.println("Composicao Inserido");
//		}
		
		public void editarComposicao(Composicao composicao) {
			System.out.println("Composição Editado");		
		}
		
		public void deletarComposicao(int id) {
			System.out.println("Composição Deletado");		
		}
		
		public List<Composicao> listarComposicao() {
			System.out.println("Lista Composição");	
			List<Composicao> lista = new ArrayList<Composicao>(); 
			return lista;
		}	
		
	}
