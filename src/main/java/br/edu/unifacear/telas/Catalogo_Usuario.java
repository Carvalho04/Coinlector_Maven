package br.edu.unifacear.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Catalogo_Usuario extends JFrame{
	private JTable table;
	private JTextField txtAno;
	private JTextField textField;
	public Catalogo_Usuario() {
		setTitle("Catálogo");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblCatalogo = new JLabel("Catálogo");
		lblCatalogo.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblCatalogo.setBounds(183, 11, 134, 99);
		getContentPane().add(lblCatalogo);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnPesquisar.setBounds(183, 493, 134, 23);
		getContentPane().add(btnPesquisar);
		
		table = new JTable();
		table.setBounds(57, 166, 383, 304);
		getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu_Usuario menu = new Menu_Usuario();
				Catalogo_Usuario.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVoltar);
		
		JButton btnSugestão = new JButton("?");
		btnSugestão.setToolTipText("Sugerir nova adição de moeda");
		btnSugestão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sugestao_Usuario sugestao = new Sugestao_Usuario();
				Catalogo_Usuario.this.dispose();
			}
		});
		btnSugestão.setBounds(428, 11, 51, 23);
		getContentPane().add(btnSugestão);
		
		JLabel lblBorda = new JLabel("Borda");
		lblBorda.setBounds(57, 114, 46, 14);
		getContentPane().add(lblBorda);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(57, 133, 120, 22);
		getContentPane().add(comboBox);
		
		JLabel lblAno = new JLabel("Ano Inicio");
		lblAno.setBounds(183, 114, 72, 14);
		getContentPane().add(lblAno);
		
		JLabel lblAnoFinal = new JLabel("Ano Final");
		lblAnoFinal.setBounds(315, 114, 72, 14);
		getContentPane().add(lblAnoFinal);
		
		txtAno = new JTextField();
		txtAno.setBounds(183, 134, 125, 20);
		getContentPane().add(txtAno);
		txtAno.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(315, 134, 125, 20);
		getContentPane().add(textField);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 555);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	
	public static void main (String []args) {
		
		Catalogo_Usuario catalogo = new Catalogo_Usuario();
	}
}
