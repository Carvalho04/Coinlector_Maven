
package br.edu.unifacear.testes;

import br.edu.unifacear.bo.ComposicaoBo;
import br.edu.unifacear.classes.Composicao;

public class Composicao_Teste {

public static void main (String []args) {
		
		Composicao composicao = new Composicao(7,"Cobre");
		
		System.out.println(composicao);

//		composicao.setId(7);
//		composicao.setDescricao("Cobre");
		
		ComposicaoBo composicaoBo = new ComposicaoBo();
		try {
			composicaoBo.salvarComposicao(composicao);
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		composicaoBo.editarComposicao(composicao = new Composicao(8,"Ouro"));

		System.out.println(composicao);

		
		composicaoBo.deletarComposicao(8);

		System.out.println(composicao);
		
		composicaoBo.listarComposicao();
		
		System.out.println(composicao);
	}
	
}
