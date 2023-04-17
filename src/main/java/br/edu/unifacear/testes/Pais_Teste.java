package br.edu.unifacear.testes;

import br.edu.unifacear.bo.PaisBo;
import br.edu.unifacear.classes.Pais;

public class Pais_Teste {

	public static void main(String []args) {
		
		Pais pais = new Pais();
		
//		pais.setId(9);
//		pais.setNome("Brasil");
//		pais.setContinente("America do Sul");

		PaisBo paisbo = new PaisBo();
		try {
			paisbo.salvarPais(pais);
			System.out.println("Ok");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(pais);
		
	}
}
