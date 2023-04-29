package br.edu.unifacear.classes;

import java.util.Objects;
import javax.persistence.*;

@Entity
public class Moeda implements EntityBase{
	
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String descricao;
	private String cunhagem;
	private double peso;
	private double diametro;
	private double espessura;
	private double valor_face;
	private int ano;
	@ManyToOne 
	private Forma forma;
	@ManyToOne 
	private Distribuicao distribuicao;
	@ManyToOne 
	private Composicao composicao;
	@ManyToOne 
	private Borda borda;
	@ManyToOne 
	private Pais pais;
	
	
	//Properties
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCunhagem() {
		return cunhagem;
	}
	public void setCunhagem(String cunhagem) {
		this.cunhagem = cunhagem;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getEspessura() {
		return espessura;
	}
	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}
	public double getValor_face() {
		return valor_face;
	}
	public void setValor_face(int valor_face) {
		this.valor_face = valor_face;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@JoinColumn(name = "id_Forma")
	public Forma getForma() {
		return forma;
	}
	public void setForma(Forma forma) {
		this.forma = forma;
	}
	@JoinColumn(name = "id_Distribuicao")
	public Distribuicao getDistribuicao() {
		return distribuicao;
	}
	public void setDistribuicao(Distribuicao distribuicao) {
		this.distribuicao = distribuicao;
	}
	@JoinColumn(name = "id_Composicao")
	public Composicao getComposicao() {
		return composicao;
	}
	public void setComposicao(Composicao composicao) {
		this.composicao = composicao;
	}
	@JoinColumn(name = "id_Borda")
	public Borda get() {
		return borda;
	}
	public void setBorda(Borda borda) {
		this.borda = borda;
	}
	@JoinColumn(name = "id_Pais")
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	//Constructor
	
	public Moeda() {
		forma = new Forma();
		distribuicao = new Distribuicao();
		composicao = new Composicao();
		borda = new Borda();
		pais = new Pais();
	}
	
	public Moeda(int id, String nome, String descricao, String cunhagem, double peso, double diametro,
			 double espessura, int valor_face, int ano, Forma forma, 
			Distribuicao distribuicao, Composicao composicao, Borda borda, Pais pais) {
		
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.cunhagem = cunhagem;
		this.peso = peso;
		this.diametro = diametro;
		this.espessura = espessura;
		this.valor_face = valor_face;
		this.ano = ano;
		this.forma = forma;
		this.distribuicao = distribuicao;
		this.composicao = composicao;
		this.borda = borda;
		this.pais = pais;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ano, composicao, cunhagem, descricao, diametro, distribuicao, espessura,
				forma, id, nome, pais, peso, borda, valor_face);
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
		Moeda other = (Moeda) obj;
		return Objects.equals(ano, other.ano)
				&& Objects.equals(composicao, other.composicao) && Objects.equals(cunhagem, other.cunhagem)
				&& Objects.equals(descricao, other.descricao)
				&& Double.doubleToLongBits(diametro) == Double.doubleToLongBits(other.diametro)
				&& Objects.equals(distribuicao, other.distribuicao)
				&& Double.doubleToLongBits(espessura) == Double.doubleToLongBits(other.espessura)
				&& Objects.equals(forma, other.forma) && id == other.id && Objects.equals(nome, other.nome)
				&& Objects.equals(pais, other.pais)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Objects.equals(borda, other.borda) && valor_face == other.valor_face;
	}
	@Override
	public String toString() {
		return "Moeda [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", cunhagem=" + cunhagem + ", peso="
				+ peso + ", diametro=" + diametro + ", espessura=" + espessura + ", valor_face=" + valor_face 
				+ ", ano=" + ano + ", forma=" + forma.getId() + ", distribuicao=" + distribuicao.getId()
				+ ", composicao=" + composicao.getId() + ", borda=" + borda.getId() + ", pais=" + pais.getId() + "]";
	}
	

}
