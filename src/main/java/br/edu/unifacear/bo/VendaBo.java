package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.Venda;
import br.edu.unifacear.dao.VendaDao;

public class VendaBo {
	
	public VendaBo () { 	}

	public void salvarVenda(Venda venda) throws Exception {
		
		if (venda.getId() <= 0) {
			throw new Exception ("Id não pode ser igual ou menor que zero(0)");
		}
		
		System.out.println("OK");
		
		VendaDao vendaDao = new VendaDao();
		vendaDao.salvarVenda(venda);	
	}
	
	public void selecionarVenda(Venda venda) {
		VendaDao vendaDao = new VendaDao();
		vendaDao.selecionarVenda(venda);		
	}
	
//	public void inserirVenda(Venda venda) {
//		VendaDao vendaDao = new VendaDao();
//		vendaDao.inserirVenda(venda);	
//	}
	
	public void editarVenda(Venda venda) {
		VendaDao vendaDao = new VendaDao();
		vendaDao.editarVenda(venda);
	}
	
	public void deletarVenda(int id) {
		VendaDao vendaDao = new VendaDao();
		vendaDao.deletarVenda(id);
	}
	
	public List<Venda> listarVenda() {
		VendaDao vendaDao = new VendaDao();
		return vendaDao.listarVenda();
	}		
	
	

}
