package br.edu.unifacear.classes;

import java.time.LocalDate;
import java.util.Objects;

public class Colecao {
	
	 //Attributes
	
	 private int id;
	 private LocalDate ano;
	 private Usuario colecionador;
	 private Moeda moeda;
	 private EstadoConservacao estadoConservacao;
	  
	 
	 //Properties
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getAno() {
		return ano;
	}
	public void setAno(LocalDate ano) {
		this.ano = ano;
	}
	public Usuario getColecionador() {
		return colecionador;
	}
	public void setColecionador(Usuario colecionador) {
		this.colecionador = colecionador;
	}
	public Moeda getMoeda() {
		return moeda;
	}
	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	public EstadoConservacao getEstadoConservacao() {
		return estadoConservacao;
	}
	public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
	
	//Constructors 
	
	public Colecao() {
		super();
		moeda = new Moeda();
		estadoConservacao = new EstadoConservacao();
		colecionador = new Usuario();
		
	}
	
	public Colecao(int id, LocalDate ano, Usuario colecionador, Moeda moeda, EstadoConservacao estadoConservacao) {
		super();
		this.id = id;
		this.ano = ano;
		this.colecionador = colecionador;
		this.moeda = moeda;
		this.estadoConservacao = estadoConservacao;
	}
	
	
	//Methods
	
	@Override
	public int hashCode() {
		return Objects.hash(ano, colecionador, estadoConservacao, id, moeda);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colecao other = (Colecao) obj;
		return ano == other.ano && Objects.equals(colecionador, other.colecionador)
				&& Objects.equals(estadoConservacao, other.estadoConservacao) && id == other.id
				&& Objects.equals(moeda, other.moeda);
	}
	@Override
	public String toString() {
		return "Colecao [id=" + id + ", ano=" + ano + ", colecionador=" + colecionador.getId() + ", moeda=" + moeda.getId()
				+ ", estadoConservacao=" + estadoConservacao.getId() + "]";
	}
	
	  
	  
}
