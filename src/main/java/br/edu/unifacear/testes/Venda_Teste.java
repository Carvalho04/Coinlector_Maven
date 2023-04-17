package br.edu.unifacear.testes;

import br.edu.unifacear.bo.VendaBo;
import br.edu.unifacear.classes.Venda;

public class Venda_Teste {

	
	public static void main (String []args) {
//		
//		Date data = new Date();
//		System.out.println(data.toString());
//
		
	Venda venda = new Venda();
			
			venda.setId(9);
			
			VendaBo vendabo = new VendaBo();
			try {
				vendabo.salvarVenda(venda);
				System.out.println("Ok");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(venda);
			
		
	}
}
