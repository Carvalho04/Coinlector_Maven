package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.unifacear.bo.UsuarioBo;
import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.classes.Usuario;

public class Cadastro_Adm extends JFrame{

	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JTextField textField;
	private JTextField txtId;
	
	public Cadastro_Adm() {
		setTitle("Cadastro de Administradores");
		getContentPane().setBackground(new Color(255, 255, 204));
		getContentPane().setLayout(null);
		
		JLabel lblCadastre = new JLabel("Cadastre-se");
		lblCadastre.setForeground(new Color(255, 204, 51));
		lblCadastre.setBackground(new Color(255, 204, 51));
		lblCadastre.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblCadastre.setBounds(83, 40, 183, 61);
		getContentPane().add(lblCadastre);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblNome.setBounds(20, 112, 46, 30);
		getContentPane().add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblCpf.setBounds(20, 162, 46, 25);
		getContentPane().add(lblCpf);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblEmail.setBounds(20, 207, 46, 26);
		getContentPane().add(lblEmail);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblLogin.setBounds(20, 254, 46, 27);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblSenha.setBounds(20, 302, 46, 28);
		getContentPane().add(lblSenha);
		
		txtNome = new JTextField();
		txtNome.setBounds(61, 114, 252, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(61, 161, 252, 20);
		getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(61, 207, 252, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(61, 254, 252, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(61, 303, 252, 20);
		getContentPane().add(txtSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(255, 204, 51));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				TipoUsuario tipo = new TipoUsuario();
				tipo.setId(1);
				Usuario usuario = new Usuario();
				usuario.setNome(txtNome.getText());
				usuario.setCpf(txtCpf.getText());
				usuario.setEmail(txtEmail.getText());
				usuario.setLogin(txtLogin.getText());
				usuario.setSenha(txtSenha.getText());
				usuario.setTipoUsuario(tipo);
				
				
			}
		});
		btnCadastrar.setBounds(118, 441, 132, 23);
		getContentPane().add(btnCadastrar);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblCargo.setBounds(20, 347, 46, 30);
		getContentPane().add(lblCargo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(61, 349, 252, 20);
		getContentPane().add(textField);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(255, 204, 51));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ConsultarAdm_Adm consultar = new ConsultarAdm_Adm();
				Cadastro_Adm.this.dispose();
				
			}
		});
		
		
		btnVoltar.setBounds(10, 11, 88, 23);
		getContentPane().add(btnVoltar);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBounds(61, 396, 252, 20);
		getContentPane().add(txtId);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblId.setBounds(20, 397, 46, 25);
		getContentPane().add(lblId);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(370, 530);
		this.setResizable(false);		
		this.setVisible(true);	
		
	}

	public static void main (String []args) {
		
		Cadastro_Adm cadastro_adm = new Cadastro_Adm();
		
	}
}
