package br.edu.unifacear.telas;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;

import br.edu.unifacear.bo.PaisBo;
import br.edu.unifacear.bo.UsuarioBo;
import br.edu.unifacear.classes.Pais;
import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.classes.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro_Usuario extends JFrame {
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtLogin;
	private JTextField txtSenha;
	
	public Cadastro_Usuario() {
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
				tipo.setId(2);
				Usuario usuario = new Usuario();
				usuario.setNome(txtNome.getText());
				usuario.setCpf(txtCpf.getText());
				usuario.setEmail(txtEmail.getText());
				usuario.setLogin(txtLogin.getText());
				usuario.setSenha(txtSenha.getText());
				usuario.setTipoUsuario(tipo);
				UsuarioBo userBo = new UsuarioBo();
				try {
				userBo.salvarUsuario(usuario);
				TelaLogin login = new TelaLogin();
				Cadastro_Usuario.this.dispose();
				}catch (Exception eE) {
					System.out.println("Erro ao salvar pais \n" + eE.getMessage());
				}
			}
		});
				
		btnCadastrar.setBounds(286, 206, 110, 23);
		getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaLogin login = new TelaLogin();
				Cadastro_Usuario.this.dispose();
				
			}
		});
		btnVoltar.setBounds(414, 206, 110, 23);
		getContentPane().add(btnVoltar);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(565, 330);
		this.setResizable(false);		
		this.setVisible(true);	
		
	}

	public static void main (String []args) {
		
		Cadastro_Usuario telaCadastro = new Cadastro_Usuario();
		
	}
}
