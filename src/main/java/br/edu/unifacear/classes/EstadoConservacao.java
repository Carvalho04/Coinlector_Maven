package br.edu.unifacear.classes;

import java.util.Objects;


public class EstadoConservacao {

		//Attributes
		
			private int id;
			private String descricao;
			
			
			//Properties
			
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
			
			public EstadoConservacao() {
				super();
			}
			
			public EstadoConservacao(int id, String descricao) {
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
				EstadoConservacao other = (EstadoConservacao) obj;
				return Objects.equals(descricao, other.descricao) && id == other.id;
			}
			@Override
			public String toString() {
				return "EstadoConservacao [id=" + id + ", descricao=" + descricao + "]";
			}
			
			
}