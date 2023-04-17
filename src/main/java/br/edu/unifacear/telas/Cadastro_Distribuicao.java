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

import br.edu.unifacear.bo.DistribuicaoBo;
import br.edu.unifacear.classes.Distribuicao;

public class Cadastro_Distribuicao extends JFrame {
	
	private JTextField txtNome;
	private JTextField txtId;
	public Cadastro_Distribuicao() {
		setTitle("Manter Distribuicao");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblDistribuicao = new JLabel("Distribuição");
		lblDistribuicao.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblDistribuicao.setBounds(137, 23, 189, 96);
		getContentPane().add(lblDistribuicao);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 130, 46, 14);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 155, 365, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Distribuicao.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 23, 83, 25);
		getContentPane().add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Distribuicao distribuicao = new Distribuicao();
				distribuicao.setDescricao(txtNome.getText());
				DistribuicaoBo distribuicaoBo = new DistribuicaoBo();
				try {
				distribuicaoBo.salvarDistribuicao(distribuicao);
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Distribuicao.this.dispose();
				}catch (Exception eE) {
					System.out.println("Erro ao salvar distribuicao \n" + eE.getMessage());
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
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBounds(413, 155, 41, 20);
		getContentPane().add(txtId);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(413, 130, 46, 14);
		getContentPane().add(lblId);
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 310);
		this.setResizable(false);
		
		
		
		this.setVisible(true);
	}
	
	public static void main(String []agrs) {
		
		Cadastro_Distribuicao distribuicao = new Cadastro_Distribuicao();
		
	}
	
	
}
