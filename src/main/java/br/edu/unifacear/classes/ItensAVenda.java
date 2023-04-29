package br.edu.unifacear.classes;

import java.util.Objects;
import javax.persistence.*;

@Entity
//@SequenceGenerator (name = "itensVenda_seq", sequenceName = "itensVenda_seq", initialValue = 1, allocationSize = 1)
public class ItensAVenda implements EntityBase{

	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private int quantidade;
	private double valor;
	private double total;
	@OneToOne
	private Usuario colecionador;
	@OneToOne
	private Colecao colecao;
	@ManyToOne
	private Venda venda;
	
	
	//Properties
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@JoinColumn(name = "id_Usuario")
	public Usuario getColecionador() {
		return colecionador;
	}
	public void setColecionador(Usuario colecionador) {
		this.colecionador = colecionador;
	}
	@JoinColumn(name = "id_Colecao")
	public Colecao getColecao() {
		return colecao;
	}
	public void setColecao(Colecao colecao) {
		this.colecao = colecao;
	}
	@JoinColumn(name = "id_Venda")
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	
	//Constructors
	
	public ItensAVenda() {
		super();
		venda = new Venda();
		colecao = new Colecao();
		colecionador = new Usuario();
	}
	
	
	public ItensAVenda(int id, int quantidade, double valor, double total, Usuario colecionador, Colecao colecao,
			Venda venda) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.valor = valor;
		this.total = total;
		this.colecionador = colecionador;
		this.colecao = colecao;
		this.venda = venda;
	}
	
	//Methods
	
	
	@Override
	public int hashCode() {
		return Objects.hash(colecao, colecionador, id, quantidade, total, valor, venda);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItensAVenda other = (ItensAVenda) obj;
		return Objects.equals(colecao, other.colecao) && Objects.equals(colecionador, other.colecionador)
				&& id == other.id && quantidade == other.quantidade
				&& Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor)
				&& Objects.equals(venda, other.venda);
	}
	@Override
	public String toString() {
		return "ItensAVenda [id=" + id + ", quantidade=" + quantidade + ", valor=" + valor + ", total=" + total
				+ ", colecionador=" + colecionador.getId() + ", colecao=" + colecao.getId() + ", venda=" + venda.getId() + "]";
	}

	
		
}
