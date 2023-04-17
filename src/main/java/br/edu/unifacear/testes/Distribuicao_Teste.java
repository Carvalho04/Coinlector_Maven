package br.edu.unifacear.testes;

import br.edu.unifacear.bo.DistribuicaoBo;
import br.edu.unifacear.classes.Distribuicao;

public class Distribuicao_Teste {

	public static void main (String []args) {
			
			Distribuicao distribuicao = new Distribuicao();
			
			distribuicao.setId(88);
			distribuicao.setDescricao("Casa da Moeda RJ");
			
			DistribuicaoBo distribuicaoBo = new DistribuicaoBo();
			try {
				distribuicaoBo.salvarDistribuicao(distribuicao);
				System.out.println("OK");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			System.out.println(distribuicao);
		}
	
}
