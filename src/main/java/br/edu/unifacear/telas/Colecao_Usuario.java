package br.edu.unifacear.telas;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class Colecao_Usuario extends JFrame{
	private JTextField textField;
	private JTable table;
	public Colecao_Usuario() {
		setTitle("Minha Coleção");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblColecao = new JLabel("Minha Coleção");
		lblColecao.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblColecao.setBounds(137, 11, 232, 99);
		getContentPane().add(lblColecao);
		
		textField = new JTextField();
		textField.setBounds(71, 111, 298, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(379, 110, 100, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblItens = new JLabel("Meus itens");
		lblItens.setBounds(10, 114, 51, 14);
		getContentPane().add(lblItens);
		
		table = new JTable();
		table.setBounds(57, 142, 383, 363);
		getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Perfil_Usuario perfil = new Perfil_Usuario();
				Colecao_Usuario.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVoltar);
		
		JButton btnCatalogo = new JButton("Catálogo");
		btnCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Catalogo_Usuario catalogo = new Catalogo_Usuario();
				Colecao_Usuario.this.dispose();
				
			}
		});
		btnCatalogo.setBounds(390, 11, 89, 23);
		getContentPane().add(btnCatalogo);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 555);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	
	public static void main(String []agrs) {
		
		Colecao_Usuario colecao= new Colecao_Usuario();
		
	}
}
