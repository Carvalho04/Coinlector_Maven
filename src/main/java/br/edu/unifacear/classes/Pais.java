package br.edu.unifacear.classes;

import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Pais implements EntityBase{

	//Attribute
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	@ManyToOne 
	private Continente continente;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "pais")
	@JoinColumn (name = "id_Pais")
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@JoinColumn(name = "id_Continente")
	public Continente getContinente() {
		return continente;
	}
	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	
	//Constructors
	
	public Pais() {
		super();
	}

	public Pais(int id, String nome, Continente continente) {
		super();
		this.id = id;
		this.nome = nome;
		this.continente = continente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(continente, id, nome);
	}

	
	//Methods
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(continente, other.continente) && id == other.id && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", continente=" + continente.getId() + "]";
	}
	
	
}
	