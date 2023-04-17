package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.classes.Usuario;
import br.edu.unifacear.jdbc.Fabrica;

public class UsuarioDao {

public UsuarioDao () {}
	
		public void selecionarUsuario(Usuario usuario) {
		System.out.println("Usuario Selecionado");		
		}
		
		public void salvarUsuario(Usuario usuario) {
			
			Connection con =null;
			try {
				con = new Fabrica().getConnection();
				System.out.println("Conectado ao Banco");
				
				String sql = "INSERT INTO Usuario(NOME, CPF, EMAIL, LOGIN, SENHA, ID_TPUSUARIO)" + 
				"VALUES (?, ?, ?, ?, ?, ?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, usuario.getNome());
				pst.setString(2, usuario.getCpf());
				pst.setString(3, usuario.getEmail());
				pst.setString(4, usuario.getLogin());
				pst.setString(5, usuario.getSenha());
				pst.setInt(6, usuario.getTipoUsuario().getId());
				pst.execute();
				pst.close();
				
			}catch(SQLException e) {
				System.out.println("Erro ao gravar Usuario \n" + e.getMessage());
			}
			finally {
		//		con.close();
			}
			
			System.out.println("Usuario Salvo");		
		}	
		
//		public void inserirUsuario(Usuario usuario) {
//		System.out.println("Usuario Inserido");
//		}
		
		public void editarUsuario(Usuario usuario) {
			System.out.println("Usuario Editado");		
		}
		
		public void deletarUsuario(int id) {
			System.out.println("Usuario Deletado");		
		}
		
		public List<Usuario> listarUsuario() {
			System.out.println("Lista Usuario");	
			List<Usuario> lista = new ArrayList<Usuario>(); 
			return lista;
		}	
		
//		 public Ususario consultar(Usuario usuario) {
//		        boolean autenticado = false;
//		        String sql;
//		        try {
//		        	TipoUsuario tpUsuario = new TipoUsuario();
//		        	Connection conn = null;
//		            conn = new Fabrica().getConnection();
//
//		            sql = "SELECT login, senha, id_TpUsuario FROM usuarios" 
//		            	+ "WHERE login=? and senha=?";
//		            PreparedStatement ps;
//		            ps = conn.prepareStatement(sql);
//		            ps.setString(1, usuario.getLogin());
//		            ps.setString(2, usuario.getSenha());
//		       //     ps.setInt(3, usuario.getTipoUsuario().getId());
//
//		            ResultSet rs;
//		            rs = ps.executeQuery();
//
//		            if (rs.next()) {
//		                String login = rs.getString("login");
//		                String senha = rs.getString("senha");
//	//	                int tpUsuario = rs.getInt("id_TpUsuario");
//		                
//		                //autenticado = true;
//		                
//		                return usuario;
//		            } else {
//		                
//		            	ps.close();
//		                return null;
//		             }
//		             
//		        } catch (SQLException e) {
//		            e.getMessage();
//		        }
//		        return autenticado;
//		    }

}

