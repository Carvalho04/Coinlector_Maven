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
import br.edu.unifacear.bo.TipoUsuarioBo;
import br.edu.unifacear.classes.Pais;
import br.edu.unifacear.classes.TipoUsuario;

public class Cadastro_TipoUsuario extends JFrame {
	
	private JTextField txtTipo;
	public Cadastro_TipoUsuario() {
		setTitle("Manter Borda");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblTipoUsuario = new JLabel("Tipo de Usuário");
		lblTipoUsuario.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblTipoUsuario.setBounds(113, 25, 257, 96);
		getContentPane().add(lblTipoUsuario);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(20, 130, 46, 14);
		getContentPane().add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(20, 155, 424, 20);
		getContentPane().add(txtTipo);
		txtTipo.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConsultarAdm_Adm consultarAdm = new ConsultarAdm_Adm();
				Cadastro_TipoUsuario.this.dispose();
				
			}
		});
		
		btnVoltar.setBounds(10, 23, 83, 25);
		getContentPane().add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				TipoUsuario tpUser = new TipoUsuario();
				tpUser.setTipo(txtTipo.getText());
				
				try {
				TipoUsuarioBo tipoUsuarioBo = new TipoUsuarioBo();
				tipoUsuarioBo.salvar(tpUser);
				ConsultarAdm_Adm consultarAdm = new ConsultarAdm_Adm();
				Cadastro_TipoUsuario.this.dispose();
				}catch (Exception eE) {
					System.out.println("Erro ao salvar pais \n" + eE.getMessage());
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
	
	public static void main (String [ ]args) {
		
		Cadastro_TipoUsuario TipoUser = new Cadastro_TipoUsuario();
	}
	
}
