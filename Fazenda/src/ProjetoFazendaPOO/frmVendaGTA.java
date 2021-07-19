package ProjetoFazendaPOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frmVendaGTA extends JFrame{

	private JPanel contentPane;
	private JTextField txtGTA;
	private JTextField txtIDcomprador;
	private JTextField txtvalortotal;
	private JTextField txtdata;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVendaGTA frame = new frmVendaGTA();
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
	public frmVendaGTA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaPorCidade = new JLabel("Venda por GTA");
		lblConsultaPorCidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaPorCidade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConsultaPorCidade.setBounds(48, 11, 356, 36);
		contentPane.add(lblConsultaPorCidade);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(273, 313, 109, 36);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("GTA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(149, 72, 36, 16);
		contentPane.add(lblNewLabel);
		
		txtGTA = new JTextField();
		txtGTA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtGTA.setBounds(213, 70, 133, 22);
		contentPane.add(txtGTA);
		txtGTA.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID Comprador");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(48, 113, 117, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Valor Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(48, 234, 90, 16);
		contentPane.add(lblNewLabel_3);
		
		txtIDcomprador = new JTextField();
		txtIDcomprador.setEnabled(false);
		txtIDcomprador.setEditable(false);
		txtIDcomprador.setBounds(192, 111, 116, 22);
		contentPane.add(txtIDcomprador);
		txtIDcomprador.setColumns(10);
		
		txtvalortotal = new JTextField();
		txtvalortotal.setEnabled(false);
		txtvalortotal.setEditable(false);
		txtvalortotal.setBounds(192, 232, 116, 22);
		contentPane.add(txtvalortotal);
		txtvalortotal.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data da Venda");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(48, 174, 117, 16);
		contentPane.add(lblNewLabel_1);
		
		txtdata = new JTextField();
		txtdata.setEnabled(false);
		txtdata.setEditable(false);
		txtdata.setBounds(192, 172, 116, 22);
		contentPane.add(txtdata);
		txtdata.setColumns(10);
		
		JButton btnConsultarGTA = new JButton("Consultar");
		btnConsultarGTA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vendas v = new Vendas();
				v.setGta(txtGTA.getText());
				try {
					v.ConsultarGTA();
					txtIDcomprador.setText(v.getIdcomprador());
					txtdata.setText(v.getDatavenda());
					txtvalortotal.setText(Float.toString(v.getValorvenda()));
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				}
		});
		btnConsultarGTA.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnConsultarGTA.setBounds(76, 313, 109, 36);
		contentPane.add(btnConsultarGTA);
		
		
	}
}
