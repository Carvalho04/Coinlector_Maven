package br.edu.unifacear.testes;

import br.edu.unifacear.bo.MoedaBo;
import br.edu.unifacear.classes.Composicao;
import br.edu.unifacear.classes.Distribuicao;
import br.edu.unifacear.classes.Forma;
import br.edu.unifacear.classes.Moeda;
import br.edu.unifacear.classes.Pais;
import br.edu.unifacear.classes.Borda;

public class Moeda_Teste {

	public static void main (String []args) {
		
		Forma forma = new Forma();
		forma.setId(7);
		
		Distribuicao distribuicao = new Distribuicao();
		distribuicao.setId(8);
		
		Composicao composicao = new Composicao();
		composicao.setId(9);
		
		Borda tipoBorda = new Borda();
		tipoBorda.setId(6);
		
		Pais pais = new Pais();
		pais.setId(5);
		
		Moeda moeda = new Moeda();
		
		moeda.setId(4);
		moeda.setNome("1 real");
		moeda.setDescricao("Moeda brasileira de Um real atual");
		moeda.setCunhagem("3.870.550.000");
		moeda.setPeso(0.7);
		moeda.setCircunferencia(0.25);
		moeda.setEspessura(1.95);
		moeda.setValor_face(1);
		moeda.setAno(1995);
		moeda.setForma(forma);
		moeda.setDistribuicao(distribuicao);
		moeda.setComposicao(composicao);
		moeda.setTipoborda(tipoBorda);
		moeda.setPais(pais);
	
	MoedaBo moedaBo = new MoedaBo();
	try {
		moedaBo.salvarMoeda(moeda);
		System.out.println("OK");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println(moeda);
	
	}
	
}