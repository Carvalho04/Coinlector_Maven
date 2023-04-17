package br.edu.unifacear.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.jdbc.Fabrica;

public class TipoUsuarioDao {
	
	public TipoUsuarioDao() { 	}
		
		public void selecionarTipoUsuario(TipoUsuario tipoUsuario) throws SQLException {
			
			Connection con = null;
			
		try {
			con	= new Fabrica().getConnection();
			System.out.println("Conectado ao Banco");
			
			String sql = "SELECT * FROM TIPODEUSUARIO";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String tipo = rs.getString(2);
				System.out.println(id + " - " + tipo);
			}
			rs.close();
			pst.close();
			System.out.println("Select OK");

		}catch (SQLException e) {
			System.out.println("Erro ao selecionar Tipo Usuario \n" + e.getMessage());
		}
		finally {
			con.close();
		}
		
		System.out.println("Tipo Usuario Selecionado");
		
		}
	
		public void salvarTipoUsuario(TipoUsuario tpUsuario) {
			
			Connection con =null;
			try {
				con = new Fabrica().getConnection();
				System.out.println("Conectado ao Banco");
				
				String sql = "INSERT INTO TipoDeUsuario (TIPO)" + "VALUES (?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, tpUsuario.getTipo());
				pst.execute();
				pst.close();
				
			}catch(SQLException e) {
				System.out.println("Erro ao gravar Pais \n" + e.getMessage());
			}
			finally {
		//		con.close();
			}
			
			
			System.out.println("Tipo de Usuario Salvo");
		}
		
//		public void inserirColecao(TipoUsuario tipoUsuario) {
//		System.out.println("Tipo de Usuario Inserido");
//		}
		
		public void editarTipoUsuario(TipoUsuario tpUsuario) {
			System.out.println("Tipo de Usuario Editado");
		}
		
		public void deletarTipoUsuario(int id) {
			System.out.println("Tipo de Usuario Deletado");
		}
		
		public List<TipoUsuario> listarTipoUsuario() {
			System.out.println("Lista Tipo de Usuario");	
			List<TipoUsuario> lista = new ArrayList<TipoUsuario>(); 
			return lista;
		}	
		
		
}
