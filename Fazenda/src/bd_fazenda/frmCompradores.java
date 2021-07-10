package bd_fazenda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class frmCompradores {

	private JFrame frame;
	private JTextField txtidcomprador;
	private JTextField txtnome;
	private JTextField txtcodigocomprador;
	private JTextField txtendereco;
	private JTextField txtUF;
	private JTextField txtcidade;
	private JTextField txttelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCompradores window = new frmCompradores();
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
	public frmCompradores() {
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
		
		JLabel lblCadastroDeCompradores = new JLabel("CADASTRO DE COMPRADORES");
		lblCadastroDeCompradores.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeCompradores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCadastroDeCompradores.setBounds(10, 11, 501, 36);
		frame.getContentPane().add(lblCadastroDeCompradores);
		
		JLabel lblNewLabel_2 = new JLabel("Identifica\u00E7\u00E3o:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 83, 81, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtidcomprador = new JTextField();
		txtidcomprador.setColumns(10);
		txtidcomprador.setBounds(89, 86, 51, 20);
		frame.getContentPane().add(txtidcomprador);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nome:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(157, 83, 51, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		txtnome = new JTextField();
		txtnome.setColumns(10);
		txtnome.setBounds(206, 86, 305, 20);
		frame.getContentPane().add(txtnome);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Telefone:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(157, 119, 58, 25);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		txtcodigocomprador = new JTextField();
		txtcodigocomprador.setColumns(10);
		txtcodigocomprador.setBounds(61, 122, 81, 20);
		frame.getContentPane().add(txtcodigocomprador);
		
		JLabel lblNewLabel_2_3 = new JLabel("C\u00F3digo:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(10, 119, 51, 25);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Endere\u00E7o:");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2_2.setBounds(10, 155, 65, 25);
		frame.getContentPane().add(lblNewLabel_2_2_2);
		
		txtendereco = new JTextField();
		txtendereco.setColumns(10);
		txtendereco.setBounds(71, 158, 353, 20);
		frame.getContentPane().add(txtendereco);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("UF:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setBounds(434, 155, 29, 25);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		txtUF = new JTextField();
		txtUF.setColumns(10);
		txtUF.setBounds(460, 158, 51, 20);
		frame.getContentPane().add(txtUF);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Cidade:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_3.setBounds(334, 119, 51, 25);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		txtcidade = new JTextField();
		txtcidade.setColumns(10);
		txtcidade.setBounds(381, 122, 130, 20);
		frame.getContentPane().add(txtcidade);
		
		txttelefone = new JTextField();
		txttelefone.setColumns(10);
		txttelefone.setBounds(216, 122, 103, 20);
		frame.getContentPane().add(txttelefone);
		
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
		
		JButton btnConsultarCid = new JButton("Consultar por Cidade");
		btnConsultarCid.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultarCid.setBounds(265, 249, 202, 23);
		frame.getContentPane().add(btnConsultarCid);
		
		JButton btnConsultarID = new JButton("Consultar por ID");
		btnConsultarID.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultarID.setBounds(54, 249, 202, 23);
		frame.getContentPane().add(btnConsultarID);
		
		JButton btnEstatistica = new JButton("Gerar Estat\u00EDstica");
		btnEstatistica.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEstatistica.setBounds(54, 283, 202, 23);
		frame.getContentPane().add(btnEstatistica);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setBounds(267, 284, 95, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(372, 283, 95, 23);
		frame.getContentPane().add(btnVoltar);
	}

}