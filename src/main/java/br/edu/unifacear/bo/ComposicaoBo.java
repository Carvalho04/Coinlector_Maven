package br.edu.unifacear.bo;

import java.sql.SQLException;
import java.util.List;

import br.edu.unifacear.classes.Composicao;
import br.edu.unifacear.dao.ComposicaoDao;

public class ComposicaoBo {
	
	public ComposicaoBo() {	}

	public void selecionarComposicao(Composicao composicao) {
		ComposicaoDao composicaoDao = new ComposicaoDao();
		try {
			composicaoDao.selecionarComposicao(composicao);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void salvarComposicao(Composicao composicao) throws Exception {

//		if (composicao.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
//		}
		if (composicao.getDescricao().equals("")) {
			throw new Exception ("Descrição deve estar preenchido!");
		}
		

		System.out.println("Validações de Composição - OK");
		
		
		ComposicaoDao composicaoDao = new ComposicaoDao();
		composicaoDao.salvarComposicao(composicao);	
	}
	
//	public void inserirComposicao(Composicao composicao) {
//		ComposicaoDao composicaoDao = new ComposicaoDao();
//		composicaoDao.inserirComposicao(composicao);	
//	}
	
	public void editarComposicao(Composicao composicao) {
		ComposicaoDao composicaoDao = new ComposicaoDao();
		composicaoDao.editarComposicao(composicao);		
	}
	
	public void deletarComposicao(int id) {
		ComposicaoDao composicaoDao = new ComposicaoDao();
		composicaoDao.deletarComposicao(id);
		
	}
	
	public List<Composicao> listarComposicao() {
		ComposicaoDao composicaoDao = new ComposicaoDao();
		return composicaoDao.listarComposicao();
	}		
	



}
