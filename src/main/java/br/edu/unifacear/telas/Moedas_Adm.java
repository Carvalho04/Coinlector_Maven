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

public class Moedas_Adm extends JFrame {
	

		private JTextField txtNome;
		private JTextField txtCunhagem;
		private JTextField txtEmail;
		private JTextField txtPeso;
		private JTextField txtDiametro;
		private JTextField txtEspessura;
		private JTextField txtFimProd;
		private JTextField txtCircunferencia;
		private JTextField txtValorFace;
		private JTextField txtCod;
		private JTextField txtId;
		public Moedas_Adm() {
			setTitle("Manter Moeda");
			getContentPane().setBackground(new Color(128, 128, 0));
			getContentPane().setLayout(null);
			
			JLabel lblMoeda = new JLabel("Moeda");
			lblMoeda.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
			lblMoeda.setBounds(320, 28, 108, 96);
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
			
			JButton btnEditar = new JButton("Editar");
			btnEditar.setBounds(70, 507, 120, 25);
			getContentPane().add(btnEditar);
			
			JButton btnExcluir = new JButton("Excluir");
			btnExcluir.setBounds(534, 507, 120, 25);
			getContentPane().add(btnExcluir);
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Catalogo_Adm catalogo = new Catalogo_Adm();
				Moedas_Adm.this.dispose();
				
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
			lblCircunferencia.setBounds(261, 315, 120, 14);
			getContentPane().add(lblCircunferencia);
			
			txtCircunferencia = new JTextField();
			txtCircunferencia.setColumns(10);
			txtCircunferencia.setBounds(261, 340, 200, 20);
			getContentPane().add(txtCircunferencia);
			
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
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(261, 400, 200, 21);
			comboBox.addItem("Aprovado");
			comboBox.addItem("Reprovado");
			comboBox.addItem("Em Análise");
			getContentPane().add(comboBox);
			
			JButton btnFotos = new JButton("Fotos");
			btnFotos.setBounds(590, 11, 89, 23);
			getContentPane().add(btnFotos);
			
			JButton btnSalvar = new JButton("Salvar");
			btnSalvar.setBounds(308, 507, 120, 25);
			getContentPane().add(btnSalvar);
			
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
			lblDistribuicao.setBounds(479, 315, 127, 14);
			getContentPane().add(lblDistribuicao);
			
			JLabel lblComposicao = new JLabel("Composição");
			lblComposicao.setBounds(479, 376, 127, 14);
			getContentPane().add(lblComposicao);
			
			txtCod = new JTextField();
			txtCod.setColumns(10);
			txtCod.setBounds(34, 457, 200, 20);
			getContentPane().add(txtCod);
			
			JLabel lblCod = new JLabel("Código de Mercado");
			lblCod.setBounds(34, 432, 127, 14);
			getContentPane().add(lblCod);
			
			txtId = new JTextField();
			txtId.setEditable(false);
			txtId.setColumns(10);
			txtId.setBounds(261, 457, 200, 20);
			getContentPane().add(txtId);
			
			JLabel lblId = new JLabel("Id");
			lblId.setBounds(261, 432, 68, 14);
			getContentPane().add(lblId);
			
			JComboBox ComboComposicao = new JComboBox();
			ComboComposicao.setBounds(481, 400, 198, 22);
			getContentPane().add(ComboComposicao);
			
			JComboBox ComboDistribuicao = new JComboBox();
			ComboDistribuicao.setBounds(481, 339, 198, 22);
			getContentPane().add(ComboDistribuicao);
			
			JComboBox ComboForma = new JComboBox();
			ComboForma.setBounds(481, 283, 198, 22);
			getContentPane().add(ComboForma);
			
			JComboBox ComboBorda = new JComboBox();
			ComboBorda.setBounds(481, 227, 198, 22);
			getContentPane().add(ComboBorda);
			
			JComboBox ComboPais = new JComboBox();
			ComboPais.setBounds(481, 171, 198, 22);
			getContentPane().add(ComboPais);
			
			JComboBox ComboContinente = new JComboBox();
			ComboContinente.setBounds(481, 455, 198, 22);
			getContentPane().add(ComboContinente);
			
			JLabel lblContinente = new JLabel("Continente");
			lblContinente.setBounds(479, 431, 127, 14);
			getContentPane().add(lblContinente);
		
		
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(720, 640);
			this.setResizable(false);
			
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			

			final JMenuItem itemContinente = new JMenuItem("Continente");
			itemContinente.setBackground(Color.LIGHT_GRAY);
			itemContinente.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				itemContinente.setBackground(Color.white);
			}
			public void mouseExited (MouseEvent e) {
				itemContinente.setBackground(Color.LIGHT_GRAY);
			}
			public void mousePressed(MouseEvent e) {
				
				Cadastro_Continente continente = new Cadastro_Continente();
				Moedas_Adm.this.dispose();
			}
			});
			menuBar.add(itemContinente);
			
			final JMenuItem itemBorda = new JMenuItem("Borda");
			itemBorda.setBackground(Color.LIGHT_GRAY);
			itemBorda.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				itemBorda.setBackground(Color.white);
			}
			public void mouseExited (MouseEvent e) {
				itemBorda.setBackground(Color.LIGHT_GRAY);
			}
			public void mousePressed(MouseEvent e) {
				
				Cadastro_Borda borda = new Cadastro_Borda();
				Moedas_Adm.this.dispose();
			}
			});
			menuBar.add(itemBorda);
			
			final JMenuItem itemDistribuicao = new JMenuItem("Distribuição");
			itemDistribuicao.setBackground(Color.LIGHT_GRAY);
			itemDistribuicao.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				itemDistribuicao.setBackground(Color.white);
			}
			public void mouseExited (MouseEvent e) {
				itemDistribuicao.setBackground(Color.LIGHT_GRAY);
			}
			public void mousePressed(MouseEvent e) {
				
				Cadastro_Distribuicao distribuicao = new Cadastro_Distribuicao();
				Moedas_Adm.this.dispose();
			}
			});
			menuBar.add(itemDistribuicao);
			
			final JMenuItem itemForma = new JMenuItem("Forma");
			itemForma.setBackground(Color.LIGHT_GRAY);
			itemForma.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				itemForma.setBackground(Color.white);
			}
			public void mouseExited (MouseEvent e) {
				itemForma.setBackground(Color.LIGHT_GRAY);
			}
			public void mousePressed(MouseEvent e) {
				
				Cadastro_Forma forma = new Cadastro_Forma();
				Moedas_Adm.this.dispose();
			}
			});
			menuBar.add(itemForma);
			
			final JMenuItem itemComposicao = new JMenuItem("Composição");
			itemComposicao.setBackground(Color.LIGHT_GRAY);
			itemComposicao.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				itemComposicao.setBackground(Color.white);
			}
			public void mouseExited (MouseEvent e) {
				itemComposicao.setBackground(Color.LIGHT_GRAY);
			}
			public void mousePressed(MouseEvent e) {
				
				Cadastro_Composicao composicao = new Cadastro_Composicao();
				Moedas_Adm.this.dispose();
			}
			});
			menuBar.add(itemComposicao);
			
			final JMenuItem itemPais = new JMenuItem("Paises");
			itemPais.setBackground(Color.LIGHT_GRAY);
			itemPais.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				itemPais.setBackground(Color.white);
			}
			public void mouseExited (MouseEvent e) {
				itemPais.setBackground(Color.LIGHT_GRAY);
			}
			public void mousePressed(MouseEvent e) {
				
				Cadastro_Pais pais = new Cadastro_Pais();
				Moedas_Adm.this.dispose();
			}
			});
			menuBar.add(itemPais);
			
			
			
			this.setVisible(true);
		}
		
		public static void main(String []args) {
			
			Moedas_Adm moedas = new Moedas_Adm ();
			
		}
}
