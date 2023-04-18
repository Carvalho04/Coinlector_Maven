package br.edu.unifacear.testes;

import java.util.List;

import br.edu.unifacear.bo.TipoUsuarioBo;
import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.classes.TipoUsuario;

public class TipoUsuario_Teste {

	public static void main (String []args) {
		
		TipoUsuario tipoUsuario = new TipoUsuario ();
		
		tipoUsuario.setTipo("teste");
		
		TipoUsuarioBo tipoUsuarioBo = new TipoUsuarioBo();
		try {
			tipoUsuarioBo.salvar(tipoUsuario);
			System.out.println("TipoUsuario inserido - " + tipoUsuario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			List <TipoUsuario> lista = tipoUsuarioBo.consultar("A");
			for (TipoUsuario tipoUsuario2 : lista) {
				System.out.println(">>>" + tipoUsuario2);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
