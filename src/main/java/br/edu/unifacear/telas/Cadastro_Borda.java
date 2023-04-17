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

import br.edu.unifacear.bo.BordaBo;
import br.edu.unifacear.classes.Borda;

public class Cadastro_Borda extends JFrame {
	
	private JTextField txtNome;
	public Cadastro_Borda() {
		setTitle("Manter Borda");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblBorda = new JLabel("Borda");
		lblBorda.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblBorda.setBounds(189, 23, 90, 96);
		getContentPane().add(lblBorda);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 130, 46, 14);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 155, 424, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Borda.this.dispose();
				
			}
		});
		
		btnVoltar.setBounds(10, 23, 83, 25);
		getContentPane().add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Borda borda = new Borda();
				borda.setDescricao(txtNome.getText());
				BordaBo bordaBo = new BordaBo();
				try {
				bordaBo.salvarBorda(borda);
				Moedas_Adm moedas = new Moedas_Adm();
				Cadastro_Borda.this.dispose();
				}catch (Exception eE) {
					System.out.println("Erro ao salvar borda \n" + eE.getMessage());
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
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 310);
		this.setResizable(false);
		
		
		
		this.setVisible(true);
	}
	
	public static void main(String []agrs) {
			Cadastro_Borda borda = new Cadastro_Borda();
	}
	
}
