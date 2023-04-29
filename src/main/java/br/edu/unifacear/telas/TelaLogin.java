package br.edu.unifacear.telas;

import javax.swing.*;

import br.edu.unifacear.dao.Fabrica;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame{
	
	public String acesso;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	public String Acesso;
	
	
	public TelaLogin() {
		setTitle("Coinlector");
		
		JPanel jpn = new JPanel();
		jpn.setBackground(new Color(255, 255, 204));
		getContentPane().add(jpn, BorderLayout.CENTER);
		jpn.setLayout(null);
		
		JLabel lblTitle = new JLabel("COINLECTOR");
		lblTitle.setForeground(new Color(255, 204, 51));
		lblTitle.setBackground(new Color(255, 255, 255));
		lblTitle.setBounds(118, 64, 219, 59);
		lblTitle.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		jpn.add(lblTitle);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblLogin.setBounds(57, 153, 46, 30);
		jpn.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblSenha.setBounds(57, 199, 46, 33);
		jpn.add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setToolTipText("Coloque sua matricula de login");
		txtLogin.setBounds(109, 155, 263, 20);
		jpn.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(109, 202, 263, 20);
		jpn.add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(new Color(255, 204, 51));
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
//				boolean resposta = consultar(txtLogin.getSelectedText().toString(), txtSenha.getPassword());//Pego usuario e senha digitados e jogo no metodo consultar para validar
//		        if (resposta == true) {//Se Usuario e senha estiverem corretos
//		            if (Acesso == "Usuario") { //Aqui é a variável se for "Inventario" abro a tela RDI
//		                TelaLogin.this.dispose();
//		                Cadastro_Usuario usuario = new Cadastro_Usuario();
//		            }else if(Acesso == "Administrador"){ //Aqui é a variável se for "Operacao" abro a tela RDIOpe
//		                TelaLogin.this.dispose();
//		                Cadastro_Adm Adm = new Cadastro_Adm();
//		            }
//		        } else {
//		            JOptionPane.showMessageDialog(rootPane, "Usuário e(ou) senha incorretos!\nEntre em contato com setor de Inventário");
//		        }
		    }    

							
		});
				
		btnEntrar.setBounds(57, 249, 134, 23);
		jpn.add(btnEntrar);
		
		JButton btnCadastro = new JButton("Cadastre-se");
		btnCadastro.setBackground(new Color(255, 204, 51));
		btnCadastro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Usuario cadastro = new Cadastro_Usuario();
				TelaLogin.this.dispose();
				
			}
		});
		btnCadastro.setBounds(154, 313, 119, 23);
		jpn.add(btnCadastro);
		
		JButton btnEsqueciSenha = new JButton("Esqueci a senha");
		btnEsqueciSenha.setBackground(new Color(255, 204, 51));
		btnEsqueciSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEsqueciSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEsqueciSenha.setBounds(238, 249, 134, 23);
		jpn.add(btnEsqueciSenha);
		
		JLabel lblCadastro = new JLabel("Ainda não tem cadastro?");
		lblCadastro.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblCadastro.setBounds(144, 288, 150, 28);
		jpn.add(lblCadastro);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(449, 394);
		this.setResizable(false);		
		this.setVisible(true);	
		
		
	}
	
//	
//	public boolean consultar(String login, String senha) {
//        boolean autenticado = false;
//        String sql;
//        Connection conn;
//        try {
//        	conn = new Fabrica().getConnection();
//
//            sql = "SELECT login, senha, acesso FROM Usuario WHERE login=? and senha=? ";
//            PreparedStatement ps;
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, login);
//            ps.setString(2, senha);
//
//
//            ResultSet rs;
//            rs = ps.executeQuery();
//
//            if (rs.next()) {
//            	Acesso = rs.getString(acesso);
//                String log = rs.getString("login");
//                String pass = rs.getString("senha");
//                
//                autenticado = true;
//            } else {
//                ps.close();
//                return autenticado;
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(this, e);
//        }
//        return autenticado;
//    }
	
	
	public static void main (String []args) {
	
	TelaLogin telaLogin = new TelaLogin();
}
	
	
	
}