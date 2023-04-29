package br.edu.unifacear.classes;

import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Composicao implements EntityBase{
	
	//Attributes
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)	
	private int id;
	
	private String descricao;
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "composicao")
	@JoinColumn (name = "id_Composicao")
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
	
	public Composicao() {
		super();
	}
	
	
	public Composicao(int id, String descricao) {
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
		Composicao other = (Composicao) obj;
		return Objects.equals(descricao, other.descricao) && id == other.id;
	}
	
	
	@Override
		public String toString() {
			return "Forma [id=" + id + ", descricao=" + descricao + "]";
		}
	
	
}
