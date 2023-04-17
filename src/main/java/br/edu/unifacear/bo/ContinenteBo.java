package br.edu.unifacear.bo;

import java.sql.SQLException;
import java.util.List;

import br.edu.unifacear.classes.Continente;
import br.edu.unifacear.dao.ContinenteDao;

public class ContinenteBo {

	public ContinenteBo () { 	}

	public void salvarContinente(Continente Continente) throws Exception {
		
//		if (Continente.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor que zero(0)");
//		}
		if (Continente.getDescricao().equals("")) {
			throw new Exception ("Descrição deve estar preenchido!");
		}
		
		System.out.println("Validações de  Continente - OK");
		
		ContinenteDao ContinenteDao = new ContinenteDao();
		ContinenteDao.salvarContinente(Continente);	
	}
	
	public void selecionarContinente(Continente Continente) {
		ContinenteDao ContinenteDao = new ContinenteDao();
		try {
			ContinenteDao.selecionarContinente(Continente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}		
	}
	
//	public void inserirContinente(Continente Continente) {
//		ContinenteDao ContinenteDao = new ContinenteDao();
//		ContinenteDao.inserirContinente(Continente);	
//	}
	
	public void editarContinente(Continente Continente) {
		ContinenteDao ContinenteDao = new ContinenteDao();
		ContinenteDao.editarContinente(Continente);
	}
	
	public void deletarContinente(int id) {
		ContinenteDao ContinenteDao = new ContinenteDao();
		ContinenteDao.deletarContinente(id);
	}
	
	public List<Continente> listarContinente() {
		ContinenteDao ContinenteDao = new ContinenteDao();
		return ContinenteDao.listarContinente();
	}		
	
	
	
}
