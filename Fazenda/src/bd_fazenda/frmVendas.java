package bd_fazenda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmVendas {

	private JFrame frame;
	private JTextField txtidvenda;
	private JTextField txtGTA;
	private JTextField txtidcomprador;
	private JTextField txtidanimal;
	private JTextField txtdatavenda;
	private JTextField txtvalor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVendas window = new frmVendas();
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
	public frmVendas() {
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
		
		JLabel lblPedidoDeVenda = new JLabel("PEDIDOS DE VENDA");
		lblPedidoDeVenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidoDeVenda.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPedidoDeVenda.setBounds(10, 11, 501, 36);
		frame.getContentPane().add(lblPedidoDeVenda);
		
		JLabel lblNewLabel_2 = new JLabel("N\u00FAmero:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 83, 81, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtidvenda = new JTextField();
		txtidvenda.setColumns(10);
		txtidvenda.setBounds(67, 86, 73, 20);
		frame.getContentPane().add(txtidvenda);
		
		JLabel lblNewLabel_2_1 = new JLabel("GTA:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(157, 83, 37, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		txtGTA = new JTextField();
		txtGTA.setColumns(10);
		txtGTA.setBounds(197, 86, 314, 20);
		frame.getContentPane().add(txtGTA);
		
		JLabel lblNewLabel_2_3 = new JLabel("Comprador:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(10, 119, 87, 25);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		txtidcomprador = new JTextField();
		txtidcomprador.setColumns(10);
		txtidcomprador.setBounds(89, 122, 51, 20);
		frame.getContentPane().add(txtidcomprador);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Animal:");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_3.setBounds(157, 119, 51, 25);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		txtidanimal = new JTextField();
		txtidanimal.setColumns(10);
		txtidanimal.setBounds(207, 122, 51, 20);
		frame.getContentPane().add(txtidanimal);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Data:");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2_2.setBounds(10, 155, 37, 25);
		frame.getContentPane().add(lblNewLabel_2_2_2);
		
		txtdatavenda = new JTextField();
		txtdatavenda.setColumns(10);
		txtdatavenda.setBounds(44, 158, 95, 20);
		frame.getContentPane().add(txtdatavenda);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Valor:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setBounds(157, 155, 65, 25);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		txtvalor = new JTextField();
		txtvalor.setColumns(10);
		txtvalor.setBounds(199, 158, 58, 20);
		frame.getContentPane().add(txtvalor);
		
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
		
		JButton btnConsultar = new JButton("Consultar Venda");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(54, 249, 202, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnMaior = new JButton("Maior Comprador");
		btnMaior.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMaior.setBounds(265, 249, 202, 23);
		frame.getContentPane().add(btnMaior);
		
		JButton btnVendas = new JButton("Vendas por Data");
		btnVendas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVendas.setBounds(54, 283, 202, 23);
		frame.getContentPane().add(btnVendas);
		
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