package br.edu.unifacear.classes;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Borda implements EntityBase{

	
	//Attributes
	@Id
	// SQLSERVER
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	// MYSQL
	@GeneratedValue(strategy=GenerationType.SEQUENCE)	
	//Firebird
	//@SequenceGenerator( name = "SEQ", sequenceName = "SEQ_GRUPO_ID", allocationSize = 1 )
	//@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ" )
	private int id;
	
	//@Column // opcional	
	//@Column(name = "nome_borda")  // nome da coluna no BD
	private String descricao;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "borda")
	@JoinColumn (name = "id_Borda")
	private List <Moeda> moedas;
	
	//Properties
	
	public List<Moeda> getMoedas() {
		return moedas;
	}

	public void setMoedas(List<Moeda> moedas) {
		this.moedas = moedas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	//Constructor
	
	public Borda() {
		super();
	}
	
	
	public Borda(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	
	}
	
	
	//Methods	
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Borda other = (Borda) obj;
		return Objects.equals(descricao, other.descricao) && id == other.id;
	}
	
	
	@Override
	public String toString() {
		return "Borda [id=" + id + ", descricao=" + descricao + "]";
	}

}

