package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;

public class Sugestao_Usuario extends JFrame {
	

		private JTextField txtNome;
		private JTextField txtCunhagem;
		private JTextField txtEmail;
		private JTextField txtPeso;
		private JTextField txtDiametro;
		private JTextField txtEspessura;
		private JTextField txtFimProd;
		private JTextField txtValorFace;
		private JTextField txtCircunferencia;
		public Sugestao_Usuario() {
			setTitle("Sugerir Moeda");
			getContentPane().setBackground(new Color(128, 128, 0));
			getContentPane().setLayout(null);
			
			JLabel lblMoeda = new JLabel("Moeda");
			lblMoeda.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
			lblMoeda.setBounds(305, 40, 108, 96);
			getContentPane().add(lblMoeda);
			
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(34, 147, 46, 14);
			getContentPane().add(lblNome);
			
			JLabel lblCpf = new JLabel("Cunhagem");
			lblCpf.setBounds(34, 203, 89, 14);
			getContentPane().add(lblCpf);
			
			JLabel lblAno_Lanca = new JLabel("Ano de Lançamento");
			lblAno_Lanca.setBounds(34, 259, 108, 14);
			getContentPane().add(lblAno_Lanca);
			
			JLabel lblPeso = new JLabel("Peso");
			lblPeso.setBounds(261, 147, 46, 14);
			getContentPane().add(lblPeso);
			
			JLabel lblDiametro = new JLabel("Diametro");
			lblDiametro.setBounds(261, 203, 48, 14);
			getContentPane().add(lblDiametro);
			
			JLabel lblEspessura = new JLabel("Espessura");
			lblEspessura.setBounds(261, 259, 61, 14);
			getContentPane().add(lblEspessura);
			
			txtNome = new JTextField();
			txtNome.setBounds(34, 172, 200, 20);
			getContentPane().add(txtNome);
			txtNome.setColumns(10);
			
			txtCunhagem = new JTextField();
			txtCunhagem.setBounds(34, 228, 200, 20);
			getContentPane().add(txtCunhagem);
			txtCunhagem.setColumns(10);
			
			txtEmail = new JTextField();
			txtEmail.setBounds(34, 284, 200, 20);
			getContentPane().add(txtEmail);
			txtEmail.setColumns(10);
			
			txtPeso = new JTextField();
			txtPeso.setBounds(261, 172, 200, 20);
			getContentPane().add(txtPeso);
			txtPeso.setColumns(10);
			
			txtDiametro = new JTextField();
			txtDiametro.setBounds(261, 228, 200, 20);
			getContentPane().add(txtDiametro);
			txtDiametro.setColumns(10);
			
			txtEspessura = new JTextField();
			txtEspessura.setBounds(261, 284, 200, 20);
			getContentPane().add(txtEspessura);
			txtEspessura.setColumns(10);
			
			JButton btnAdc = new JButton("Sugerir");
			btnAdc.setBounds(261, 460, 200, 25);
			getContentPane().add(btnAdc);
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Catalogo_Usuario Catalogo = new Catalogo_Usuario();
					Sugestao_Usuario.this.dispose();
					
				}
			});
			btnVoltar.setBounds(10, 10, 83, 25);
			getContentPane().add(btnVoltar);
			
			txtFimProd = new JTextField();
			txtFimProd.setColumns(10);
			txtFimProd.setBounds(34, 340, 200, 20);
			getContentPane().add(txtFimProd);
			
			JLabel lblFimProd = new JLabel("Fim de Produção");
			lblFimProd.setBounds(34, 315, 89, 14);
			getContentPane().add(lblFimProd);
			
			JLabel lblCircunferencia = new JLabel("Circunferencia");
			lblCircunferencia.setBounds(261, 315, 89, 14);
			getContentPane().add(lblCircunferencia);
			
			txtValorFace = new JTextField();
			txtValorFace.setColumns(10);
			txtValorFace.setBounds(34, 401, 200, 20);
			getContentPane().add(txtValorFace);
			
			JLabel lblValorFace = new JLabel("Valor de Face");
			lblValorFace.setBounds(34, 376, 89, 14);
			getContentPane().add(lblValorFace);
			
			JLabel lblSituacao = new JLabel("Situação");
			lblSituacao.setBounds(261, 376, 89, 14);
			getContentPane().add(lblSituacao);
			
//			JComboBox comboBox = new JComboBox();
//			comboBox.setBounds(261, 400, 200, 21);
//			comboBox.addItem("Aprovado");
//			comboBox.addItem("Reprovado");
//			comboBox.addItem("Em Análise");
//			getContentPane().add(comboBox);
//			
			
			JLabel lblPais = new JLabel("Pais");
			lblPais.setBounds(481, 147, 46, 14);
			getContentPane().add(lblPais);
			
			JLabel lblBorda = new JLabel("Borda");
			lblBorda.setBounds(479, 203, 46, 14);
			getContentPane().add(lblBorda);
			
			JLabel lblForma = new JLabel("Forma");
			lblForma.setBounds(479, 259, 46, 14);
			getContentPane().add(lblForma);
			
			JLabel lblDistribuicao = new JLabel("Distribuição");
			lblDistribuicao.setBounds(479, 315, 68, 14);
			getContentPane().add(lblDistribuicao);
			
			JLabel lblComposicao = new JLabel("Composição");
			lblComposicao.setBounds(479, 376, 68, 14);
			getContentPane().add(lblComposicao);
			
			JComboBox ComboDistribuicao = new JComboBox();
			ComboDistribuicao.setBounds(481, 339, 200, 22);
			getContentPane().add(ComboDistribuicao);
			
			JComboBox ComboComposicao = new JComboBox();
			ComboComposicao.setBounds(481, 400, 200, 22);
			getContentPane().add(ComboComposicao);
			
			JComboBox ComboPais = new JComboBox();
			ComboPais.setBounds(479, 171, 200, 22);
			getContentPane().add(ComboPais);
			
			JComboBox ComboForma = new JComboBox();
			ComboForma.setBounds(481, 283, 200, 22);
			getContentPane().add(ComboForma);
			
			JComboBox ComboBorda = new JComboBox();
			ComboBorda.setBounds(481, 228, 200, 22);
			getContentPane().add(ComboBorda);
			
			txtCircunferencia = new JTextField();
			txtCircunferencia.setColumns(10);
			txtCircunferencia.setBounds(261, 340, 200, 20);
			getContentPane().add(txtCircunferencia);
		
		
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(720, 557);
			this.setResizable(false);
			
			
			
			this.setVisible(true);
		}
		
		public static void main(String []args) {
			
			Sugestao_Usuario moedas = new Sugestao_Usuario ();
			
		}
}
