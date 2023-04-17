package br.edu.unifacear.bo;

import java.sql.SQLException;
import java.util.*;
import br.edu.unifacear.classes.Borda;
import br.edu.unifacear.dao.BordaDao;

public class BordaBo {
	
	public BordaBo () { 	}

	public void salvarBorda(Borda Borda) throws Exception {
		
//		if (Borda.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor que zero(0)");
//		}
		if (Borda.getDescricao().equals("")) {
			throw new Exception ("Descrição deve estar preenchido!");
		}
		
		System.out.println("Validações de  Borda - OK");
		
		BordaDao BordaDao = new BordaDao();
		BordaDao.salvarBorda(Borda);	
		
	}
	
	public void selecionarBorda(Borda Borda) {
		BordaDao BordaDao = new BordaDao();
		try {
			BordaDao.selecionarBorda(Borda);
		} catch (SQLException e) {
			e.getMessage();
		}		
	}
	
//	public void inserirBorda(Borda Borda) {
//		BordaDao BordaDao = new BordaDao();
//		BordaDao.inserirBorda(Borda);	
//	}
	
	public void editarBorda(Borda Borda) {
		BordaDao BordaDao = new BordaDao();
		BordaDao.editarBorda(Borda);
	}
	
	public void deletarBorda(int id) {
		BordaDao BordaDao = new BordaDao();
		BordaDao.deletarBorda(id);
	}
	
	public List<Borda> listarBorda() {
		BordaDao BordaDao = new BordaDao();
		return BordaDao.listarBorda();
	}		
	
	
}
