package br.edu.unifacear.classes;


import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Continente implements EntityBase{
	
	//Attributes
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private int id;
		
		private String descricao;
		
		@OneToMany (cascade = CascadeType.ALL, mappedBy = "continente")
		@JoinColumn(name = "id_Continente")
		private List<Pais> paises;
		
		//Properties
		
		public List<Pais> getPaises() {
			return paises;
		}
		public void setPaises(List<Pais> paises) {
			this.paises = paises;
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
		
		public Continente() {
			super();
		}
		
		
		public Continente(int id, String descricao) {
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
			Continente other = (Continente) obj;
			return Objects.equals(descricao, other.descricao) && id == other.id;
		}
		
		
		@Override
		public String toString() {
			return "TipoContinente [id=" + id + ", descricao=" + descricao + "]";
		}


}
