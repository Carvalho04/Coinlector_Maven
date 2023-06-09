package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ConsultarAdm_Adm extends JFrame{

	
	private JTextField txtAdm;
	private JTable table;
	public ConsultarAdm_Adm() {
		setTitle("Consultar Administradores");
		getContentPane().setBackground(new Color(255, 255, 204));
		getContentPane().setLayout(null);
		
		JLabel lblAdm = new JLabel("Administradores");
		lblAdm.setForeground(new Color(255, 204, 51));
		lblAdm.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblAdm.setBounds(125, 11, 261, 99);
		getContentPane().add(lblAdm);
		
		txtAdm = new JTextField();
		txtAdm.setBounds(71, 111, 298, 20);
		getContentPane().add(txtAdm);
		txtAdm.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBackground(new Color(255, 204, 51));
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPesquisar.setBounds(379, 110, 100, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblNome.setBounds(10, 102, 71, 44);
		getContentPane().add(lblNome);
		
		table = new JTable();
		table.setBounds(57, 142, 383, 363);
		getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBackground(new Color(255, 204, 51));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Menu_Adm menu = new Menu_Adm();
				ConsultarAdm_Adm.this.dispose();
				
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Novo");
		btnCadastrar.setBackground(new Color(255, 204, 51));
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrar.setToolTipText("Adicionar novo administrador");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Adm cadastro_adm = new Cadastro_Adm();
				ConsultarAdm_Adm.this.dispose();
				
			}
		});
		btnCadastrar.setBounds(199, 11, 89, 23);
		getContentPane().add(btnCadastrar);
		
		JButton btnTipoUsu = new JButton("Novo Tipo de Usuário");
		btnTipoUsu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTipoUsu.setBackground(new Color(255, 204, 51));
		btnTipoUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_TipoUsuario TipoUser = new Cadastro_TipoUsuario();
				ConsultarAdm_Adm.this.dispose();
			}
		});
		btnTipoUsu.setBounds(170, 517, 152, 23);
		getContentPane().add(btnTipoUsu);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 590);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	
	public static void main (String []args) {
		
		ConsultarAdm_Adm consultaAdm = new ConsultarAdm_Adm();
	}
}
