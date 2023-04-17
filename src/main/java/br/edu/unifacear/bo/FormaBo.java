package br.edu.unifacear.bo;

import java.sql.SQLException;
import java.util.List;

import br.edu.unifacear.classes.Forma;
import br.edu.unifacear.dao.FormaDao;


public class FormaBo {

	public FormaBo() {	}
	
	public void salvarForma(Forma forma) throws Exception {

//		if (forma.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
//		}
		if (forma.getDescricao().equals("")) {
			throw new Exception ("Descrição deve estar preenchido!");
		}
		
		System.out.println("Validaçẽos de Forma - OK");
		
		FormaDao formaDao = new FormaDao();
		formaDao.salvarForma(forma);	
	}
	
	public void selecionarForma(Forma forma) {
		FormaDao formaDao = new FormaDao();
		try {
			formaDao.selecionarForma(forma);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
//	public void inserirForma(Forma forma) {
//		FormaDao formaDao = new FormaDao();
//		formaDao.inserirForma(forma);	
//	}
	
	public void editarForma(Forma forma) {
		FormaDao formaDao = new FormaDao();
		formaDao.editarForma(forma);		
	}
	public void deletarForma(int id) {
		FormaDao formaDao = new FormaDao();
		formaDao.deletarForma(id);	
	}		
	public List<Forma> listarForma() {
		FormaDao formaDao = new FormaDao();
		return formaDao.listarForma();
	}	
}
