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

import br.edu.unifacear.bo.FormaBo;
import br.edu.unifacear.bo.FormaBo;
import br.edu.unifacear.classes.Forma;
import br.edu.unifacear.classes.Forma;

public class Cadastro_Forma extends JFrame {
	
	private JTextField txtNome;
	private JTextField txtId;
	public Cadastro_Forma() {
		setTitle("Manter Forma");
		getContentPane().setBackground(new Color(255, 255, 204));
		getContentPane().setLayout(null);
		
		JLabel lblForma = new JLabel("Forma");
		lblForma.setForeground(new Color(255, 204, 51));
		lblForma.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblForma.setBounds(130, 43, 97, 96);
		getContentPane().add(lblForma);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblNome.setBounds(20, 130, 46, 25);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 155, 334, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBackground(new Color(255, 204, 51));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Forma.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 23, 83, 25);
		getContentPane().add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(255, 204, 51));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Forma forma = new Forma();
				forma.setDescricao(txtNome.getText());
				FormaBo formaBo = new FormaBo();
				try {
				formaBo.salvar(forma);
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Forma.this.dispose();
				}catch (Exception eE) {
					System.out.println("Erro ao salvar forma \n" + eE.getMessage());
				}
			
			}
		});
		btnSalvar.setBounds(97, 275, 159, 25);
		getContentPane().add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEditar.setBackground(new Color(255, 204, 51));
		btnEditar.setBounds(137, 205, 90, 25);
		getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.setBackground(new Color(255, 204, 51));
		btnExcluir.setBounds(264, 205, 90, 25);
		getContentPane().add(btnExcluir);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBounds(20, 207, 90, 20);
		getContentPane().add(txtId);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblId.setBounds(20, 182, 46, 25);
		getContentPane().add(lblId);
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(380, 390);
		this.setResizable(false);
		
		
		
		this.setVisible(true);
	}
	
	public static void main(String []agrs) {
		
		Cadastro_Forma forma = new Cadastro_Forma();
		
	}
	
	
}
