package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CatalogoVenda_Adm extends JFrame{
	
	private JTextField txtCompras;
	private JTable table;
	public CatalogoVenda_Adm() {
		setTitle(" Itens a Venda");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblItensVenda = new JLabel("Itens a Venda");
		lblItensVenda.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblItensVenda.setBounds(132, 11, 247, 99);
		getContentPane().add(lblItensVenda);
		
		txtCompras = new JTextField();
		txtCompras.setBounds(71, 111, 298, 20);
		getContentPane().add(txtCompras);
		txtCompras.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(379, 110, 100, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblMoedas = new JLabel("Moedas");
		lblMoedas.setBounds(10, 114, 51, 14);
		getContentPane().add(lblMoedas);
		
		table = new JTable();
		table.setBounds(57, 142, 383, 363);
		getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVoltar);
		
		JButton btnAdicionarNovo = new JButton("Adicionar Novo");
		btnAdicionarNovo.setBounds(10, 522, 122, 23);
		getContentPane().add(btnAdicionarNovo);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(357, 522, 122, 23);
		getContentPane().add(btnExcluir);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 595);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main (String []args) {
		
		CatalogoVenda_Adm vendas = new CatalogoVenda_Adm();
		
	}

}
