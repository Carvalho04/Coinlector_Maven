package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.Colecao;


public class ColecaoDao {

	public ColecaoDao () {}
	
		public void selecionarColecao(Colecao colecao) {
			System.out.println("Coleção Selecionado");		
		}
		
		public void salvarColecao(Colecao colecao) {
			System.out.println("Coleção Salvo");		
		}
		
//		public void inserirColecao(Colecao colecao) {
//		System.out.println("Coleção Inserido");
//	}
		
		public void editarColecao(Colecao colecao) {
			System.out.println("Coleção Editado");		
		}
		
		public void deletarColecao(int id) {
			System.out.println("Coleção Deletado");		
		}
		
		public List<Colecao> listarColecao() {
			System.out.println("Lista Coleção");	
			List<Colecao> lista = new ArrayList<Colecao>(); 
			return lista;
		}	
	
}
