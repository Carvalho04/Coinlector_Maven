package br.edu.unifacear.classes;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;

@Entity
public class Venda implements EntityBase{

	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private LocalDate data;
	@OneToOne
	private Usuario usuarioComprador;
	@OneToOne
	private Usuario usuarioVendedor;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "venda")
	@JoinColumn(name = "id_Venda")
	private List<ItensAVenda> itensAVenda;
	
	//Properties
	
	public List<ItensAVenda> getItensAVenda() {
		return itensAVenda;
	}
	public void setItensAVenda(List<ItensAVenda> itensAVenda) {
		this.itensAVenda = itensAVenda;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@JoinColumn(name = "id_UsuarioComprador")
	public Usuario getUsuraioComprador() {
		return usuarioComprador;
	}
	public void setUsuraioComprador(Usuario usuarioComprador) {
		this.usuarioComprador = usuarioComprador;
	}
	@JoinColumn(name = "id_UsuarioVendedor")
	public Usuario getUsuarioVendedor() {
		return usuarioVendedor;
	}
	public void setUsuarioVendedor(Usuario usuarioVendedor) {
		this.usuarioVendedor = usuarioVendedor;
	}
	
	
	//Constructor
	
	public Venda() {
		super();
		usuarioComprador = new Usuario();
		usuarioVendedor = new Usuario();
	}
	
	public Venda(int id, LocalDate data, Usuario usuarioComprador, Usuario usuarioVendedor) {
		super();
		this.id = id;
		this.data = data;
		this.usuarioComprador = usuarioComprador;
		this.usuarioVendedor = usuarioVendedor;
	}
	
	
	//Methods
	
	@Override
	public int hashCode() {
		return Objects.hash(data, id, usuarioComprador, usuarioVendedor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(data, other.data) && id == other.id
				&& Objects.equals(usuarioComprador, other.usuarioComprador)
				&& Objects.equals(usuarioVendedor, other.usuarioVendedor);
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", data=" + data + ", usuarioComprador=" + usuarioComprador.getId() + ", usuarioVendedor="
				+ usuarioVendedor.getId() + "]";
	}
		
}