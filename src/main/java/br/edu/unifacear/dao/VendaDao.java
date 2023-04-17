package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.Venda;

public class VendaDao {

	
	public VendaDao() { 	}
		
		public void selecionarVenda(Venda venda) {
			System.out.println("Venda Selecionado");		
		}
		
		public void salvarVenda(Venda venda) {
			System.out.println("Tipo Borda Salvo");
		}
		
//		public void inserirVenda(Venda venda) {
//		System.out.println("Venda Inserido");
//		}
		
		public void editarVenda(Venda venda) {
			System.out.println("Tipo Borda Editado");
		}
		
		public void deletarVenda(int id) {
			System.out.println("Tipo Borda Deletado");
		}
		
		public List<Venda> listarVenda() {
			System.out.println("Lista Tipo Borda");	
			List<Venda> lista = new ArrayList<Venda>(); 
			return lista;
		}	
	
}
