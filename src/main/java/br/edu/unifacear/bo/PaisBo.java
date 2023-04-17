package br.edu.unifacear.bo;

import java.sql.SQLException;
import java.util.*;

import br.edu.unifacear.classes.Pais;
import br.edu.unifacear.dao.PaisDao;

public class PaisBo {
	
	public PaisBo () {	}

	public void salvarPais(Pais pais) throws Exception{
		
//		if (pais.getId() <= 0) {
//			throw new Exception("Id não pode ser igual ou menor que zero(0)");
//		} 
		if (pais.getNome().equals("")) {
			throw new Exception ("Nome deve estar preenchido");
		}
		if (pais.getContinente().equals("")) {
			throw new Exception ("Continente deve estar selecionado");
		}
		
		System.out.println("Validações do Pais - OK");

		PaisDao paisdao = new PaisDao();
		paisdao.salvarPais(pais);		
	}
	
	public void selecionarPais(Pais pais) {
		PaisDao paisDao = new PaisDao();
		try {
			paisDao.selecionarPais(pais);
		} catch (SQLException e) {
			e.getMessage();
		}		
	}
	
//	public void inserirPais(Pais pais) {
//		PaisDao paisDao = new PaisDao();
//		paisDao.inserirPais(pais);	
//	}
	
	public void editarPais(Pais pais) {
		PaisDao paisDao = new PaisDao();
		paisDao.editarPais(pais);		
	}
	public void deletarPais(int id) {
		PaisDao paisDao = new PaisDao();
		paisDao.deletarPais(id);	
	}		
	public List<Pais> listarPais() {
		PaisDao paisDao = new PaisDao();
		return paisDao.listarPais();
	}
	
}
