package br.edu.unifacear.bo;

import java.sql.SQLException;
import java.util.*;

import br.edu.unifacear.classes.EstadoConservacao;
import br.edu.unifacear.dao.EstadoConservacaoDao;


public class EstadoConservacaoBo {
	
public EstadoConservacaoBo() {	}
	
	public void salvarEstadoConservacao(EstadoConservacao estadoConservacao) throws Exception {

//		if (estadoConservacao.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
//		}
		if (estadoConservacao.getDescricao().equals("")) {
			throw new Exception ("Descrição deve estar preenchido!");
		}
		
		System.out.println("Validações de Estado de Conservação - OK");
		
		EstadoConservacaoDao estadoConservacaoDao = new EstadoConservacaoDao();
		estadoConservacaoDao.salvarEstadoConservacao(estadoConservacao);
	}
	
		public void selecionarEstadoConservacao(EstadoConservacao estadoConservacao) {
			EstadoConservacaoDao estadoConservacaoDao = new EstadoConservacaoDao();
			try {
				estadoConservacaoDao.selecionarEstadoConservacao(estadoConservacao);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
	//	public void inserirEstadoConservacao(EstadoConservacao estadoConservacao) {
	//		EstadoConservacaoDao estadoConservacaoDao = new EstadoConservacaoDao();
	//		estadoConservacaoDao.inserirEstadoConservacao(estadoConservacao);	
	//	}
		
		public void editarEstadoConservacao(EstadoConservacao estadoConservacao) {
			EstadoConservacaoDao estadoConservacaoDao = new EstadoConservacaoDao();
			estadoConservacaoDao.editarEstadoConservacao(estadoConservacao);
		}
	
		public void deletarEstadoConservacao(int id) {
			EstadoConservacaoDao estadoConservacaoDao = new EstadoConservacaoDao();
			estadoConservacaoDao.deletarEstadoConservacao(id);
		}
	
		public List<EstadoConservacao> listaEstadoConservacao(){
			EstadoConservacaoDao estadoConservacaoDao = new EstadoConservacaoDao();
			return estadoConservacaoDao.listarEstadoConservacao();
		}
		
}
	
		
