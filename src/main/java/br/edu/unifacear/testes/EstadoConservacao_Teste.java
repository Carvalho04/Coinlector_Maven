package br.edu.unifacear.testes;

import br.edu.unifacear.bo.EstadoConservacaoBo;
import br.edu.unifacear.classes.EstadoConservacao;

public class EstadoConservacao_Teste {

	public static void main(String []args) {
			
			EstadoConservacao estadoConservacao = new EstadoConservacao();
			
			estadoConservacao.setId(8);
			estadoConservacao.setDescricao("Circular");
			
			EstadoConservacaoBo estadoConservacaoBo = new EstadoConservacaoBo();
			try {
				estadoConservacaoBo.salvarEstadoConservacao(estadoConservacao);
		System.out.println("OK");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(estadoConservacao);
			
		}

	
}
