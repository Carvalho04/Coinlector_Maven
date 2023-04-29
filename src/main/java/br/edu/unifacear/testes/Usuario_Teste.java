package br.edu.unifacear.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.bo.UsuarioBo;
import br.edu.unifacear.classes.Usuario;
import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.classes.Usuario;

public class Usuario_Teste {

public static void main(String []args) {
		
		TipoUsuario tipoUsuario = new TipoUsuario();
		tipoUsuario.setTipo("Adm");
	
		List<Usuario> usuarios = new ArrayList();
		usuarios.add(tipoUsuario);
		
		Usuario usuario = new Usuario();

		usuario.setNome("Amanda");
		usuario.setEmail("amanda@gmail.com");
		usuario.setCpf("000.000.000-00");
		usuario.setLogin("Amanda");
		usuario.setSenha("Amanda0909");
		usuario.setTipoUsuario(tipoUsuario);
		
		tipoUsuario.setUsuarios(usuarios);
		
		UsuarioBo usuarioBo = new UsuarioBo();
		try {
			usuarioBo.salvar(usuario);
			System.out.println("Usuario inserido - " + usuario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			List <Usuario> lista = usuarioBo.consultar("A");
			for (Usuario usuario2 : lista) {
				System.out.println(">>>" + usuario2);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
