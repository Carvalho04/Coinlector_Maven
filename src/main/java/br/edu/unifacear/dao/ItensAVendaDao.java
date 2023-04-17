package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;
import br.edu.unifacear.classes.ItensAVenda;

public class ItensAVendaDao {

	public ItensAVendaDao () {}
		
		public void selecionarItensAVenda(ItensAVenda itensAVendaDao) {
			System.out.println("Itens A Venda Selecionado");		
		}
		
		public void salvarItensAVenda(ItensAVenda itensAVenda) {
			System.out.println("Itens A Venda Salvo");		
		}	
		
	//	public void inserirItensAVenda(ItensAVenda itensAVenda) {
	//		System.out.println("Itens A Venda Inserido");
	//	}
		
		public void editarItensAVenda(ItensAVenda itensAVenda) {
			System.out.println("Itens A Venda Editado");		
		}
		
		public void deletarItensAVenda(int id) {
			System.out.println("Itens A Venda Deletado");		
		}
		
		public List<ItensAVenda> listarItensAVenda() {
			System.out.println("Lista Itens A Venda");	
			List<ItensAVenda> lista = new ArrayList<ItensAVenda>(); 
			return lista;
		}	
		
		
}
