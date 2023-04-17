package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.Distribuicao;
import br.edu.unifacear.classes.Distribuicao;
import br.edu.unifacear.jdbc.Fabrica;



public class DistribuicaoDao {

	
	public DistribuicaoDao () {}
	
		
	public void selecionarDistribuicao(Distribuicao Distribuicao) throws SQLException {
		Connection con = null;
	
	try {
		con	= new Fabrica().getConnection();
		System.out.println("Conectado ao Banco");
		
		String sql = "SELECT * FROM DISTRIBUICAO";
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
		System.out.println("Erro ao selecionar Distribuicao \n" + e.getMessage());
	}
	finally {
		con.close();
	}
	
	System.out.println("Distribuicao Selecionado");
	
	}

	public void salvarDistribuicao(Distribuicao distribuicao) throws SQLException {
		
		Connection con =null;
		try {

			System.out.println("Conectado ao Banco");
			con = new Fabrica().getConnection();
			String sql = "INSERT INTO Distribuicao (NOME)" + "VALUES (?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, distribuicao.getDescricao());
			pst.execute();
			pst.close();
			
		}catch(Exception e) {
			System.out.println("Erro ao gravar Distribuicao \n" + e.getMessage());
		}
		finally {
			con.close();
		}
		
		
		System.out.println("Distribuicao Salvo");
	}
		
//		public void inserirColecao(Colecao colecao) {
//		System.out.println("Colecao Inserido");
//		}
		
		public void editarDistribuicao(Distribuicao distribuicao) {
			System.out.println("Distribuição Editado");		
		}
		
		public void deletarDistribuicao(int id) {
			System.out.println("Distribuição Deletado");		
		}		
		
		public List<Distribuicao> listarDistribuicao() {
			System.out.println("Lista Distribuição");	
			List<Distribuicao> lista = new ArrayList<Distribuicao>(); 
			return lista;
		}	
		
	
}
