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
import br.edu.unifacear.bo.PaisBo;
import br.edu.unifacear.classes.Continente;
import br.edu.unifacear.classes.Pais;
import br.edu.unifacear.classes.Pais;

public class Cadastro_Pais extends JFrame {
	
	private JTextField txtNome;
	private JTextField txtId;
	public Cadastro_Pais() {
		setTitle("Manter Paises");
		getContentPane().setBackground(new Color(255, 255, 204));
		getContentPane().setLayout(null);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setForeground(new Color(255, 204, 51));
		lblPais.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblPais.setBounds(142, 37, 73, 96);
		getContentPane().add(lblPais);
		
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
				Cadastro_Pais.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 23, 83, 25);
		getContentPane().add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(255, 204, 51));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Pais pais = new Pais();
				pais.setNome(getName());
				//(txtNome.getText());
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
		btnSalvar.setBounds(97, 323, 159, 25);
		getContentPane().add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEditar.setBackground(new Color(255, 204, 51));
		btnEditar.setBounds(137, 266, 90, 25);
		getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.setBackground(new Color(255, 204, 51));
		btnExcluir.setBounds(264, 266, 90, 25);
		getContentPane().add(btnExcluir);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBounds(20, 268, 90, 20);
		getContentPane().add(txtId);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblId.setBounds(20, 243, 46, 25);
		getContentPane().add(lblId);
		
		JLabel lblContinente = new JLabel("Continente");
		lblContinente.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblContinente.setBounds(20, 186, 73, 25);
		getContentPane().add(lblContinente);
		
		JComboBox comboContinente = new JComboBox();
		comboContinente.setBounds(20, 210, 334, 22);
		getContentPane().add(comboContinente);
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(380, 420);
		this.setResizable(false);
		
		
		
		this.setVisible(true);
	}
	
	public static void main(String []agrs) {
		
		Cadastro_Pais pais = new Cadastro_Pais();
		
	}
}
