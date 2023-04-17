package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.EstadoConservacao;
import br.edu.unifacear.classes.EstadoConservacao;
import br.edu.unifacear.jdbc.Fabrica;



public class EstadoConservacaoDao {

	public EstadoConservacaoDao () {}
		
	public void selecionarEstadoConservacao(EstadoConservacao EstadoConservacao) throws SQLException {
		Connection con = null;
	
	try {
		con	= new Fabrica().getConnection();
		System.out.println("Conectado ao Banco");
		
		String sql = "SELECT * FROM ESTADOCONSERVACAO";
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
		System.out.println("Erro ao selecionar EstadoConservacao \n" + e.getMessage());
	}
	finally {
		con.close();
	}
	
	System.out.println("EstadoConservacao Selecionado");
	
	}

	public void salvarEstadoConservacao(EstadoConservacao estadoConservacao) throws SQLException {
		
		Connection con =null;
		try {

			System.out.println("Conectado ao Banco");
			con = new Fabrica().getConnection();
			String sql = "INSERT INTO EstadoConservacao (NOME)" + "VALUES (?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, estadoConservacao.getDescricao());
			pst.execute();
			pst.close();
			
		}catch(Exception e) {
			System.out.println("Erro ao gravar EstadoConservacao \n" + e.getMessage());
		}
		finally {
			con.close();
		}
		
		
		System.out.println("EstadoConservacao Salvo");
	}
	
		
//		public void inserirEstadoConservacao(EstadoConservacao estadoConservacao) {
//			System.out.println("Estado de Conservação Inserido");
//		}
		
		public void editarEstadoConservacao(EstadoConservacao estadoConservacao) {
			System.out.println("Estado de Conservação Editado");		
		}
		
		public void deletarEstadoConservacao(int id) {
			System.out.println("Estado de Conservação Deletado");		
		}		
		
		public List<EstadoConservacao> listarEstadoConservacao() {
			System.out.println("Lista de Estado de Conservação");	
			List<EstadoConservacao> lista = new ArrayList<EstadoConservacao>(); 
			return lista;
		}
}
