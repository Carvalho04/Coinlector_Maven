package br.edu.unifacear.testes;

import java.util.List;

import br.edu.unifacear.bo.PaisBo;
import br.edu.unifacear.classes.Pais;
import br.edu.unifacear.classes.Pais;

public class Pais_Teste {

	public static void main(String []args) {
		
		Pais pais = new Pais();
		
		pais.setNome("Brasil");

		PaisBo paisBo = new PaisBo();
		try {
			paisBo.salvar(pais);
			System.out.println("Pais inserido - " + pais);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			List <Pais> lista = paisBo.consultar("A");
			for (Pais pais2 : lista) {
				System.out.println(">>>" + pais2);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
