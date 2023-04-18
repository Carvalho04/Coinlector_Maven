package br.edu.unifacear.classes;

import java.util.Objects;
import javax.persistence.*;

@Entity
public class TipoUsuario {
	
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String tipo;
	
	
	//Properties
	
	public int getId() {
	return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
	
	//Constructor
	
	public TipoUsuario() {
		super();
	}
	
	public TipoUsuario(int id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}
		
	
	//Methods
	
	@Override
	public int hashCode() {
		return Objects.hash(tipo, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoUsuario other = (TipoUsuario) obj;
		return Objects.equals(tipo, other.tipo) && id == other.id;
	}
	
	
	@Override
	public String toString() {
		return "TipoUsuario [id=" + id + ", tipo=" + tipo + "]";
	}

	
}
