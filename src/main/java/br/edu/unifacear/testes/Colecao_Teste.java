package br.edu.unifacear.testes;

import java.time.LocalDate;

import br.edu.unifacear.bo.ColecaoBo;
import br.edu.unifacear.classes.Colecao;
import br.edu.unifacear.classes.EstadoConservacao;
import br.edu.unifacear.classes.Moeda;
import br.edu.unifacear.classes.Usuario;

public class Colecao_Teste {

	public static void main(String []args) {
		
		Moeda moeda = new Moeda();
		moeda.setId(4);
		
		Usuario colecionador = new Usuario();
		colecionador.setId(7);
		
		EstadoConservacao estadoConservacao = new EstadoConservacao();
		estadoConservacao.setId(6);
		
		Colecao colecao = new Colecao();
		
		colecao.setId(7);
		colecao.setAno(LocalDate.now());
		colecao.setColecionador(colecionador);
		colecao.setMoeda(moeda);
		colecao.setEstadoConservacao(estadoConservacao);
		
		ColecaoBo colecaoBo = new ColecaoBo();
		try {
			colecaoBo.salvarColecao(colecao);
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(colecao);
		
	}

}
