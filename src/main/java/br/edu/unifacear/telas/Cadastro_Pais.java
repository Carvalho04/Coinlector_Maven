package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.unifacear.bo.PaisBo;
import br.edu.unifacear.classes.Continente;
import br.edu.unifacear.classes.Pais;

public class Cadastro_Pais extends JFrame {
	
	private JTextField txtNome;
	private JTextField textField;
	private JTextField textField_1;
	public Cadastro_Pais() {
		setTitle("Manter Pais");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblPais.setBounds(196, 23, 67, 96);
		getContentPane().add(lblPais);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 106, 46, 14);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 124, 200, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Pais.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 23, 83, 25);
		getContentPane().add(btnVoltar);
		
		JLabel lblContinente = new JLabel("Continente");
		lblContinente.setBounds(20, 155, 67, 14);
		getContentPane().add(lblContinente);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Continente continente = new Continente();
				
				Pais pais = new Pais();
				pais.setNome(txtNome.getText());
//				pais.setContinente(continente);
				PaisBo paisBo = new PaisBo();
				try {
				paisBo.salvar(pais);
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Pais.this.dispose();
				}catch (Exception eE) {
					System.out.println("Erro ao salvar pais \n" + eE.getMessage());
				}
			}
		});
		btnSalvar.setBounds(196, 217, 83, 25);
		getContentPane().add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(20, 217, 83, 25);
		getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(361, 218, 83, 25);
		getContentPane().add(btnExcluir);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(244, 124, 200, 20);
		getContentPane().add(textField);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(244, 106, 46, 14);
		getContentPane().add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(20, 180, 424, 20);
		getContentPane().add(textField_1);
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 310);
		this.setResizable(false);
		
		
		
		this.setVisible(true);
	}
	
	
	
//	public void salvar(){
//		
//		String nome = txtNome.getText();
//		String continente = txtContinente.getText();
//		
//		Pais p1 = new Pais();
//		
//		p1.setNome(nome);
//		p1.setContinente(continente);
//		
//		
//		}
	
	
	public static void main (String []args) {
		
		Cadastro_Pais pais = new Cadastro_Pais();		
		}
}
