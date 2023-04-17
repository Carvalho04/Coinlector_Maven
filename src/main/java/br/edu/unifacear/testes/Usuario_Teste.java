package br.edu.unifacear.testes;

import br.edu.unifacear.bo.UsuarioBo;
import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.classes.Usuario;

public class Usuario_Teste {

public static void main(String []args) {
		
		TipoUsuario tipoUsuario = new TipoUsuario();
		tipoUsuario.setId(5);
	
		Usuario usuario = new Usuario();

		usuario.setId(5);
		usuario.setNome("Amanda");
		usuario.setEmail("amanda@gmail.com");
		usuario.setCpf("000.000.000-00");
		usuario.setLogin("Amanda");
		usuario.setSenha("Amanda0909");
		usuario.setTipoUsuario(tipoUsuario);
		
		UsuarioBo usuarioBo = new UsuarioBo();
		try {
			usuarioBo.salvarUsuario(usuario);
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(usuario);
		
	}
	
}
