package br.edu.unifacear.telas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import javax.swing.JButton;

public class Perfil_Usuario extends JFrame{
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JTextField txtConfSenha;
	public Perfil_Usuario() {
		setTitle("Meu Perfil");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblMeuPerfil = new JLabel("Meu Perfil");
		lblMeuPerfil.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblMeuPerfil.setBounds(157, 31, 169, 96);
		getContentPane().add(lblMeuPerfil);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(34, 147, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(34, 228, 46, 14);
		getContentPane().add(lblCpf);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(34, 308, 46, 14);
		getContentPane().add(lblEmail);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(261, 147, 46, 14);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(261, 228, 46, 14);
		getContentPane().add(lblSenha);
		
		JLabel lblPix = new JLabel("Chave Pix");
		lblPix.setBounds(261, 308, 48, 14);
		getContentPane().add(lblPix);
		
		txtNome = new JTextField();
		txtNome.setBounds(34, 172, 180, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(34, 253, 180, 20);
		getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(34, 333, 180, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(261, 172, 180, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(261, 253, 180, 20);
		getContentPane().add(txtSenha);
		txtSenha.setColumns(10);
		
		txtConfSenha = new JTextField();
		txtConfSenha.setBounds(261, 333, 180, 20);
		getContentPane().add(txtConfSenha);
		txtConfSenha.setColumns(10);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(75, 400, 89, 23);
		getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(309, 400, 89, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu_Usuario Menu = new Menu_Usuario();
				Perfil_Usuario.this.dispose();
				
			}
		});
		btnVoltar.setBounds(192, 438, 89, 23);
		getContentPane().add(btnVoltar);
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 555);
		this.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		setJMenuBar(menuBar);
		
		final JMenuItem ItemVendas = new JMenuItem("Meus Itens A Venda");
		ItemVendas.setBackground(Color.LIGHT_GRAY);
		ItemVendas.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				ItemVendas.setBackground(Color.white);
			}
			public void mouseExited (MouseEvent e) {
				ItemVendas.setBackground(Color.LIGHT_GRAY);
			}
			public void mousePressed(MouseEvent e) {

				Venda_Usuario venda = new Venda_Usuario();
				Perfil_Usuario.this.dispose();
				
			}
			});
		
		menuBar.add(ItemVendas);
		
		
		
		final JMenuItem ItemMinhaColecao = new JMenuItem("Minha Coleção");
		ItemMinhaColecao.setBackground(Color.LIGHT_GRAY);
		ItemMinhaColecao.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e) {
			ItemMinhaColecao.setBackground(Color.white);
		}
		public void mouseExited (MouseEvent e) {
			ItemMinhaColecao.setBackground(Color.LIGHT_GRAY);
		}
		public void mousePressed(MouseEvent e) {
			
			Colecao_Usuario colecao = new Colecao_Usuario();
			Perfil_Usuario.this.dispose();
			
		}
		});
		
		menuBar.add(ItemMinhaColecao);
		
		
		
		final JMenuItem ItemMinhasCompras = new JMenuItem("Minhas Compras");
		ItemMinhasCompras.setBackground(Color.LIGHT_GRAY);
		ItemMinhasCompras.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e) {
			ItemMinhasCompras.setBackground(Color.white);
		}
		public void mouseExited (MouseEvent e) {
			ItemMinhasCompras.setBackground(Color.LIGHT_GRAY);
		}
		public void mousePressed(MouseEvent e) {
			
			Compras_Usuario compras = new Compras_Usuario();
			Perfil_Usuario.this.dispose();
			
		}
		});
		
		menuBar.add(ItemMinhasCompras);
		
		
		
		this.setVisible(true);
	}
	

	public static void main (String [] args) {
		
		Perfil_Usuario pfU = new Perfil_Usuario();
		
	}
}

