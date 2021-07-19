package ProjetoFazendaPOO;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class frmVendas extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDVenda;
	private JTextField txtIDcomprador;
	private JTextField txtGTA;
	private JTextField txtIDanimal;
	private JTextField txtdata;
	private JTextField txtvalor;
	private JTextField txtvalortotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVendas frame = new frmVendas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmVendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPedidosDeVenda = new JLabel("VENDAS");
		lblPedidosDeVenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidosDeVenda.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPedidosDeVenda.setBounds(10, 11, 504, 36);
		contentPane.add(lblPedidosDeVenda);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 77, 80, 17);
		contentPane.add(lblNewLabel_1);
		
		txtIDVenda = new JTextField();
		txtIDVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtIDVenda.setColumns(10);
		txtIDVenda.setBounds(66, 75, 100, 20);
		contentPane.add(txtIDVenda);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comprador:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(290, 77, 71, 17);
		contentPane.add(lblNewLabel_1_1);
		
		txtIDcomprador = new JTextField();
		txtIDcomprador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtIDcomprador.setColumns(10);
		txtIDcomprador.setBounds(373, 75, 100, 20);
		contentPane.add(txtIDcomprador);
		
		JLabel lblNewLabel_1_2 = new JLabel("GTA:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 104, 35, 17);
		contentPane.add(lblNewLabel_1_2);
		
		txtGTA = new JTextField();
		txtGTA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGTA.setColumns(10);
		txtGTA.setBounds(65, 104, 100, 20);
		contentPane.add(txtGTA);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Animal:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 137, 43, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtIDanimal = new JTextField();
		txtIDanimal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtIDanimal.setColumns(10);
		txtIDanimal.setBounds(66, 135, 100, 20);
		contentPane.add(txtIDanimal);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Data:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(290, 104, 71, 17);
		contentPane.add(lblNewLabel_1_1_2);
		
		txtdata = new JTextField();
		txtdata.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtdata.setColumns(10);
		txtdata.setBounds(373, 102, 100, 20);
		contentPane.add(txtdata);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Valor/@:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(290, 134, 71, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtvalor = new JTextField();
		txtvalor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtvalor.setColumns(10);
		txtvalor.setBounds(373, 132, 100, 20);
		contentPane.add(txtvalor);
		
		JLabel lblNewLabel = new JLabel("Valor Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(133, 178, 100, 16);
		contentPane.add(lblNewLabel);
		
		txtvalortotal = new JTextField();
		txtvalortotal.setBounds(245, 176, 116, 22);
		contentPane.add(txtvalortotal);
		txtvalortotal.setColumns(10);

		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vendas v = new Vendas();
				Animais a = new Animais();
				Float ValorTotal;
				v.setId(txtIDVenda.getText());
				v.setIdcomprador(txtIDcomprador.getText());
				v.setGta(txtGTA.getText());
				v.setIdanimal(txtIDanimal.getText());
				v.setDatavenda(txtdata.getText());
				a.setValorarroba(Float.parseFloat(txtvalor.getText()));
				a.setId(txtIDanimal.getText());
			try {
				ValorTotal = a.CalculaValorAnimal();
				v.setValorvenda(ValorTotal);
				txtvalortotal.setText(Float.toString(ValorTotal));
				v.InsereVenda();	
			} catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
			}
		});
		btnInserir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInserir.setBounds(61, 205, 194, 23);
		contentPane.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vendas v = new Vendas();
				v.setId(txtIDVenda.getText());
				v.setIdcomprador(txtIDcomprador.getText());
				v.setGta(txtGTA.getText());
				v.setIdanimal(txtIDanimal.getText());
				v.setDatavenda(txtdata.getText());
				v.setValorvenda(Float.valueOf(txtvalortotal.getText()));
			try {
				v.AlteraVenda();
			} catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlterar.setBounds(319, 239, 126, 23);
		contentPane.add(btnAlterar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vendas v = new Vendas();
				v.setId(txtIDVenda.getText());
				try {
				v.RemoveVenda();	
			} catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
			}
		});
		btnRemover.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemover.setBounds(319, 205, 126, 23);
		contentPane.add(btnRemover);
		
		JButton btnConsultarVenda = new JButton("Consultar por N\u00FAmero");
		btnConsultarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vendas v = new Vendas();
				v.setId(txtIDVenda.getText());
				try {
				v.ConsultarVenda();
				txtIDVenda.setText(v.getId());
				txtIDcomprador.setText(v.getIdcomprador());
				txtGTA.setText(v.getGta());
				txtIDanimal.setText(v.getIdanimal());
				txtdata.setText(v.getDatavenda());
				txtvalortotal.setText(Float.toString(v.getValorvenda()));
			} catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
			}
		});
		btnConsultarVenda.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultarVenda.setBounds(61, 239, 194, 23);
		contentPane.add(btnConsultarVenda);
		
		JButton brnVendasGTA = new JButton("Vendas GTA");
		brnVendasGTA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVendaGTA vgta = new frmVendaGTA();
				vgta.setVisible(true);
			}
		});
		brnVendasGTA.setFont(new Font("Tahoma", Font.BOLD, 12));
		brnVendasGTA.setBounds(61, 274, 194, 23);
		contentPane.add(brnVendasGTA);
		
		JButton btnVoltar = new JButton("Voltar ao Principal");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(285, 274, 188, 23);
		contentPane.add(btnVoltar);
		
	}
}
