package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.Moeda;

public class MoedaDao {

	public MoedaDao () {}

		public void selecionarMoeda(Moeda moeda) {
			System.out.println("Moeda Selecionado");		
		}
	
		public void salvarMoeda(Moeda moeda) {
			System.out.println("Moeda Salvo");		
		}	
		
	//	public void inserirMoeda(Moeda moeda) {
	//		System.out.println("Moeda Inserido");
	//	}
		
		public void editarMoeda(Moeda moeda) {
			System.out.println("Moeda Editado");		
		}
		
		public void deletarMoeda(int id) {
			System.out.println("Moeda Deletado");		
		}
		
		public List<Moeda> listarMoeda() {
			System.out.println("Lista Moeda");	
			List<Moeda> lista = new ArrayList<Moeda>(); 
			return lista;
		}	
		
}
