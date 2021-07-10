package bd_fazenda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class frmAnimais {

	private JFrame frame;
	private JTextField txtidanimal;
	private JTextField txtcodigoanimal;
	private JTextField txtraca;
	private JTextField txtdatanascimento;
	private JTextField txtpeso;
	private JTextField txtsituacao;
	private JTextField txtpai;
	private JTextField txtmae;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAnimais window = new frmAnimais();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmAnimais() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE ANIMAIS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 501, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Identifica\u00E7\u00E3o:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 83, 81, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(205, 83, 51, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Sexo:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(371, 83, 40, 25);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		txtidanimal = new JTextField();
		txtidanimal.setBounds(89, 86, 95, 20);
		frame.getContentPane().add(txtidanimal);
		txtidanimal.setColumns(10);
		
		txtcodigoanimal = new JTextField();
		txtcodigoanimal.setColumns(10);
		txtcodigoanimal.setBounds(254, 86, 95, 20);
		frame.getContentPane().add(txtcodigoanimal);
		
		JComboBox txtsexo = new JComboBox();
		txtsexo.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Macho", "F\u00EAmea"}));
		txtsexo.setBounds(410, 85, 101, 22);
		frame.getContentPane().add(txtsexo);
		
		JLabel lblNewLabel_2_3 = new JLabel("Ra\u00E7a:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(10, 119, 81, 25);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		txtraca = new JTextField();
		txtraca.setColumns(10);
		txtraca.setBounds(46, 122, 180, 20);
		frame.getContentPane().add(txtraca);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Data de Nascimento:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(245, 119, 144, 25);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		txtdatanascimento = new JTextField();
		txtdatanascimento.setColumns(10);
		txtdatanascimento.setBounds(367, 122, 144, 20);
		frame.getContentPane().add(txtdatanascimento);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Peso:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setBounds(216, 155, 40, 25);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		txtpeso = new JTextField();
		txtpeso.setColumns(10);
		txtpeso.setBounds(254, 158, 51, 20);
		frame.getContentPane().add(txtpeso);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Pai:");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2_2.setBounds(10, 155, 29, 25);
		frame.getContentPane().add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("M\u00E3e:");
		lblNewLabel_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2_2_1.setBounds(111, 155, 29, 25);
		frame.getContentPane().add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Situa\u00E7\u00E3o:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_3.setBounds(325, 155, 51, 25);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		txtsituacao = new JTextField();
		txtsituacao.setColumns(10);
		txtsituacao.setBounds(386, 158, 125, 20);
		frame.getContentPane().add(txtsituacao);
		
		txtpai = new JTextField();
		txtpai.setColumns(10);
		txtpai.setBounds(40, 158, 51, 20);
		frame.getContentPane().add(txtpai);
		
		txtmae = new JTextField();
		txtmae.setColumns(10);
		txtmae.setBounds(144, 158, 51, 20);
		frame.getContentPane().add(txtmae);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInserir.setBounds(54, 215, 130, 23);
		frame.getContentPane().add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlterar.setBounds(197, 215, 130, 23);
		frame.getContentPane().add(btnAlterar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemover.setBounds(337, 215, 130, 23);
		frame.getContentPane().add(btnRemover);
		
		JButton btnConsultar = new JButton("Consultar por ID");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(54, 249, 202, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnEstatistica = new JButton("Gerar Estat\u00EDstica");
		btnEstatistica.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEstatistica.setBounds(54, 283, 202, 23);
		frame.getContentPane().add(btnEstatistica);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(372, 283, 95, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar Peso Animal");
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtualizar.setBounds(265, 249, 202, 23);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setBounds(267, 284, 95, 23);
		frame.getContentPane().add(btnLimpar);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
