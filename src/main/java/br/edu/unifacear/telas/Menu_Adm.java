package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu_Adm extends JFrame{
	
	public Menu_Adm() {
		setTitle("Menu");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo");
		lblBemVindo.setForeground(Color.BLACK);
		lblBemVindo.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblBemVindo.setBounds(162, 11, 171, 75);
		getContentPane().add(lblBemVindo);
		
		JButton btnConsultaCatalogo = new JButton("Consultar Catálogo");
		btnConsultaCatalogo.setForeground(new Color(128, 128, 0));
		btnConsultaCatalogo.setBackground(Color.BLACK);
		btnConsultaCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Catalogo_Adm catalogo = new Catalogo_Adm();
				Menu_Adm.this.dispose();
				
			}
		});
		btnConsultaCatalogo.setBounds(46, 97, 195, 54);
		getContentPane().add(btnConsultaCatalogo);
		
		JButton btnConsultaPerfil = new JButton("Consultar Perfil");
		btnConsultaPerfil.setForeground(new Color(128, 128, 0));
		btnConsultaPerfil.setBackground(Color.BLACK);
		btnConsultaPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Perfil_Adm perfil = new Perfil_Adm();
				Menu_Adm.this.dispose();
				
			}
		});
		btnConsultaPerfil.setBounds(251, 97, 195, 54);
		getContentPane().add(btnConsultaPerfil);
		
		JButton btnConsultaColecionador = new JButton("Consultar Colecionadores");
		btnConsultaColecionador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ConsultarColecionadores_Adm colecionadores = new ConsultarColecionadores_Adm();
				Menu_Adm.this.dispose();
				
			}
		});
		btnConsultaColecionador.setForeground(new Color(128, 128, 0));
		btnConsultaColecionador.setBackground(Color.BLACK);
		btnConsultaColecionador.setBounds(251, 162, 195, 54);
		getContentPane().add(btnConsultaColecionador);
		
		JButton btnConsultaAdm = new JButton("Consultar Administradores");
		btnConsultaAdm.setForeground(new Color(128, 128, 0));
		btnConsultaAdm.setBackground(Color.BLACK);
		btnConsultaAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ConsultarAdm_Adm administradores = new ConsultarAdm_Adm();
				Menu_Adm.this.dispose();
				
			}
		});
				
		btnConsultaAdm.setBounds(46, 162, 195, 54);
		getContentPane().add(btnConsultaAdm);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(524, 305);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main (String [] args) {
		
		Menu_Adm menuA = new Menu_Adm();

}

}
