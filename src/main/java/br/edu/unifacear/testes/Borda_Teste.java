package br.edu.unifacear.testes;

import br.edu.unifacear.bo.BordaBo;
import br.edu.unifacear.classes.Borda;

public class Borda_Teste {

	public static void main (String []args) {
		
		Borda Borda = new Borda();
		
		Borda.setId(7);
		Borda.setDescricao("Serrilhada");
		
		BordaBo BordaBo = new BordaBo();
		try {
			BordaBo.salvarBorda(Borda);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println(Borda);
	}
	
}
