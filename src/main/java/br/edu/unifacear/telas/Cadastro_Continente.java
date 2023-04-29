package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.unifacear.bo.ContinenteBo;
import br.edu.unifacear.bo.ContinenteBo;
import br.edu.unifacear.classes.Continente;
import br.edu.unifacear.classes.Continente;

public class Cadastro_Continente extends JFrame{
	
	private JTextField txtNome;
	private JTextField txtId;
	public Cadastro_Continente() {
		setTitle("Manter Continente");
		getContentPane().setBackground(new Color(255, 255, 204));
		getContentPane().setLayout(null);
		
		JLabel lblContinente = new JLabel("Continente");
		lblContinente.setForeground(new Color(255, 204, 51));
		lblContinente.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblContinente.setBounds(97, 48, 165, 96);
		getContentPane().add(lblContinente);
		
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
				Cadastro_Continente.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 23, 83, 25);
		getContentPane().add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(255, 204, 51));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Continente continente = new Continente();
				continente.setDescricao(txtNome.getText());
				ContinenteBo continenteBo = new ContinenteBo();
				try {
				continenteBo.salvar(continente);
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Continente.this.dispose();
				}catch (Exception eE) {
					System.out.println("Erro ao salvar continente \n" + eE.getMessage());
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
		
		Cadastro_Continente continente = new Cadastro_Continente();
		
	}
	
}
