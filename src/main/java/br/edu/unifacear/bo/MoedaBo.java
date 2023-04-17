package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.Moeda;
import br.edu.unifacear.dao.MoedaDao;

public class MoedaBo {

	public MoedaBo() {	}
	
	public void salvarMoeda(Moeda moeda) throws Exception {

//		if (moeda.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
//		}
		if (moeda.getNome() == "") {
			throw new Exception ("Nome deve estar preenchido");
		}
		if (moeda.getDescricao() == "") {
			throw new Exception ("Descrição deve estar preenchida");
		}
		if (moeda.getCunhagem() == "") {
			throw new Exception ("Cunhagem deve estar preenchido");
		}
		if (moeda.getPeso() == 0.0) {
			throw new Exception ("Peso deve ser superior a zero (0.0)");
		}
		if (moeda.getDiametro() == 0.0) {
			throw new Exception ("Diametro deve ser superior a zero (0.0)");
		}
		if (moeda.getCircunferencia() == 0.0) {
			throw new Exception ("Circunferencia deve ser superior a zero (0.0)");
		}
		if (moeda.getEspessura() == 0.0) {
			throw new Exception ("Espessura deve ser superior a zero (0.0)");
		}
		if (moeda.getValor_face() == 0.0) {
			throw new Exception ("Valor de Face deve ser superior a zero (0.0)");
		}
		if (moeda.getAno() == 0) {
			throw new Exception ("Ano deve ser superior a zero (0)");
		}
		
		
		MoedaDao moedaDao = new MoedaDao();
		moedaDao.salvarMoeda(moeda);	
	}
	
	public void selecionarMoeda(Moeda moeda) {
		MoedaDao moedaDao = new MoedaDao();
		moedaDao.selecionarMoeda(moeda);		
	}
	
//	public void inserirMoeda(Moeda moeda) {
//		MoedaDao moedaDao = new MoedaDao();
//		moedaDao.inserirMoeda(moeda);	
//	}
	
	public void editarMoeda(Moeda moeda) {
		MoedaDao moedaDao = new MoedaDao();
		moedaDao.editarMoeda(moeda);		
	}
	
	public void deletarMoeda(int id) {
		MoedaDao moedaDao = new MoedaDao();
		moedaDao.deletarMoeda(id);	
	}
	
	public List<Moeda> listarMoeda() {
		MoedaDao moedaDao = new MoedaDao();
		return moedaDao.listarMoeda();
	}		
	
}
