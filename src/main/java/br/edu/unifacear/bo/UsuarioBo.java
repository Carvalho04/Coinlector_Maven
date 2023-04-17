package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.Usuario;
import br.edu.unifacear.dao.UsuarioDao;

public class UsuarioBo {

public UsuarioBo() {	}
	
	public void salvarUsuario(Usuario usuario) throws Exception {

//		if (usuario.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
//		}
		if (usuario.getNome() == "") {
			throw new Exception ("Nome deve estar preenchido");
		}
		if (usuario.getCpf() == "") {
			throw new Exception ("CPF deve estar preenchido");
		}
		if (usuario.getEmail() == "") {
			throw new Exception ("E-mail deve estar preenchido");
		}
		if (usuario.getLogin() == "") {
			throw new Exception ("Login deve estar preenchido");
		}
		if (usuario.getSenha() == "") {
			throw new Exception ("Senha deve estar preenchido");
		}	
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.salvarUsuario(usuario);	
	}

	public void selecionarUsuario(Usuario usuario) {
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.selecionarUsuario(usuario);		
	}
	
//	public void inserirUsuario(Usuario usuario) {
//		UsuarioDao usuarioDao = new UsuarioDao();
//		usuarioDao.inserirUsuario(usuario);	
//	}
	
	public void editarUsuario(Usuario usuario) {
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.editarUsuario(usuario);		
	}
	
	public void deletarUsuario(int id) {
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.deletarUsuario(id);	
	}
	
	public List<Usuario> listarUsuario() {
		UsuarioDao usuarioDao = new UsuarioDao();
		return usuarioDao.listarUsuario();
	}		
	
	
}
