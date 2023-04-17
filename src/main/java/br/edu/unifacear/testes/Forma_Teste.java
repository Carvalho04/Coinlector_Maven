package br.edu.unifacear.testes;

import br.edu.unifacear.bo.FormaBo;
import br.edu.unifacear.classes.Forma;

public class Forma_Teste {
	
	public static void main(String []args) {
		
		Forma forma = new Forma();
		
		forma.setId(8);
		forma.setDescricao("Circular");
		
		FormaBo formaBo = new FormaBo();
		try {
			formaBo.salvarForma(forma);
	System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(forma);
		
	}

}
