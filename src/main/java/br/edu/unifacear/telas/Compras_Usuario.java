package br.edu.unifacear.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Compras_Usuario extends JFrame {
	private JTextField txtCompras;
	private JTable table;
	public Compras_Usuario() {
		setTitle("Minhas Compras");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblMinhasCompras = new JLabel("Minhas Compras");
		lblMinhasCompras.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblMinhasCompras.setBounds(116, 11, 264, 99);
		getContentPane().add(lblMinhasCompras);
		
		txtCompras = new JTextField();
		txtCompras.setBounds(71, 111, 298, 20);
		getContentPane().add(txtCompras);
		txtCompras.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(379, 110, 100, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblCompras = new JLabel("Compras");
		lblCompras.setBounds(10, 114, 51, 14);
		getContentPane().add(lblCompras);
		
		table = new JTable();
		table.setBounds(57, 142, 383, 363);
		getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Perfil_Usuario perfil = new Perfil_Usuario();
				Compras_Usuario.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVoltar);
		
		JButton btnCatalogo = new JButton("Catálogo");
		btnCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Catalogo_Usuario catalogo = new Catalogo_Usuario();
				Compras_Usuario.this.dispose();
				
			}
		});
		btnCatalogo.setBounds(390, 11, 89, 23);
		getContentPane().add(btnCatalogo);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 555);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	public static void main (String []args) {
		Compras_Usuario compras = new Compras_Usuario();
	}
	
}
