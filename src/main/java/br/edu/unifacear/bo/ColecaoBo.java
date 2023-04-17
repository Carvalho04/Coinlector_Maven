package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.Colecao;
import br.edu.unifacear.dao.ColecaoDao;

public class ColecaoBo {

	
	public ColecaoBo() {	}
	
	public void selecionarColecao(Colecao colecao) {
		ColecaoDao colecaoDao = new ColecaoDao();
		colecaoDao.selecionarColecao(colecao);		
	}
	
	public void salvarColecao(Colecao colecao) throws Exception {

//		if (colecao.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
//		}
		
		ColecaoDao colecaoDao = new ColecaoDao();
		colecaoDao.salvarColecao(colecao);	
	}
	
//	public void inserirColecao(Colecao colecao) {
//		ColecaoDao colecaoDao = new ColecaoDao();
//		colecaoDao.inserirColecao(colecao);	
//	}
	
	public void editarColecao(Colecao colecao) {
		ColecaoDao colecaoDao = new ColecaoDao();
		colecaoDao.editarColecao(colecao);		
	}
	
	public void deletarColecao(int id) {
		ColecaoDao colecaoDao = new ColecaoDao();
		colecaoDao.deletarColecao(id);	
	}
	
	public List<Colecao> listarColecao() {
		ColecaoDao colecaoDao = new ColecaoDao();
		return colecaoDao.listarColecao();
	}		
	
}
