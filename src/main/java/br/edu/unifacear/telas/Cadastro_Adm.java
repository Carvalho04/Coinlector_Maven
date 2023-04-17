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
		setTitle("Cadastro");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblCadastre = new JLabel("Cadastre-se");
		lblCadastre.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblCadastre.setBounds(174, 40, 183, 61);
		getContentPane().add(lblCadastre);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(43, 117, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(43, 164, 46, 14);
		getContentPane().add(lblCpf);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(43, 210, 46, 14);
		getContentPane().add(lblEmail);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(286, 117, 46, 14);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(286, 164, 46, 14);
		getContentPane().add(lblSenha);
		
		txtNome = new JTextField();
		txtNome.setBounds(83, 114, 193, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(83, 161, 193, 20);
		getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(83, 207, 193, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(331, 114, 193, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(331, 161, 193, 20);
		getContentPane().add(txtSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
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
		btnCadastrar.setBounds(225, 249, 132, 23);
		getContentPane().add(btnCadastrar);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(286, 207, 46, 14);
		getContentPane().add(lblCargo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(331, 204, 193, 20);
		getContentPane().add(textField);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ConsultarAdm_Adm consultar = new ConsultarAdm_Adm();
				Cadastro_Adm.this.dispose();
				
			}
		});
		
		
		btnVoltar.setBounds(392, 249, 132, 23);
		getContentPane().add(btnVoltar);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBounds(83, 250, 112, 20);
		getContentPane().add(txtId);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(43, 253, 46, 14);
		getContentPane().add(lblId);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(565, 360);
		this.setResizable(false);		
		this.setVisible(true);	
		
	}

	public static void main (String []args) {
		
		Cadastro_Adm cadastro_adm = new Cadastro_Adm();
		
	}
}
