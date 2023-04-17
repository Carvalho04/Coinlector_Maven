package br.edu.unifacear.testes;

import br.edu.unifacear.bo.TipoUsuarioBo;
import br.edu.unifacear.classes.TipoUsuario;

public class TipoUsuario_Teste {

	public static void main (String []args) {
		
		TipoUsuario tpUsuario = new TipoUsuario ();
		
		tpUsuario.setId(1);
		tpUsuario.setTipo("Adm");
		
		TipoUsuarioBo tpUsuarioBo = new TipoUsuarioBo();
		try {
			tpUsuarioBo.salvarTipoUsuario(tpUsuario);
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(tpUsuario);
		
	}
}
