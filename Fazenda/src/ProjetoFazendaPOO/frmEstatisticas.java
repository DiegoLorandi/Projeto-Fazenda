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

public class frmEstatisticas extends JFrame{

	private JPanel contentPane;
	private JTextField txttotal;
	private JTextField txtfemea;
	private JTextField txtmacho;
	private JTextField txtpeso;
	private JTextField txtvalor;
	private JTextField txtlucro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEstatisticas frame = new frmEstatisticas();
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
	public frmEstatisticas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Dados do Rebanho");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(48, 11, 356, 36);
		contentPane.add(lblTitulo);
		txttotal = new JTextField();
		txttotal.setBounds(27, 75, 116, 22);
		contentPane.add(txttotal);
		txttotal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(58, 52, 35, 16);
		contentPane.add(lblNewLabel);
		
		txtfemea = new JTextField();
		txtfemea.setBounds(175, 75, 116, 22);
		contentPane.add(txtfemea);
		txtfemea.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("F\u00EAmeas");
		lblNewLabel_1.setBounds(205, 52, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		txtmacho = new JTextField();
		txtmacho.setBounds(318, 75, 116, 22);
		contentPane.add(txtmacho);
		txtmacho.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Machos");
		lblNewLabel_2.setBounds(348, 52, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Peso M\u00E9dio");
		lblNewLabel_3.setBounds(27, 134, 77, 16);
		contentPane.add(lblNewLabel_3);
		
		txtpeso = new JTextField();
		txtpeso.setBounds(127, 131, 116, 22);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Valor Rebanho");
		lblNewLabel_4.setBounds(27, 182, 88, 16);
		contentPane.add(lblNewLabel_4);
		
		txtvalor = new JTextField();
		txtvalor.setBounds(127, 179, 116, 22);
		contentPane.add(txtvalor);
		txtvalor.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Lucro Bruto");
		lblNewLabel_5.setBounds(27, 231, 77, 16);
		contentPane.add(lblNewLabel_5);
		
		txtlucro = new JTextField();
		txtlucro.setBounds(127, 228, 116, 22);
		contentPane.add(txtlucro);
		txtlucro.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(273, 313, 109, 36);
		contentPane.add(btnSair);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculos cc = new Calculos();
				try {
				String tot = cc.TotalAnimais();
				txttotal.setText(tot);
				String fem = cc.TotalAnimaisFemeas();
				txtfemea.setText(fem);
				String mac = cc.TotalAnimaisMachos();
				txtmacho.setText(mac);
				String pes = cc.PesoMedio();
				txtpeso.setText(pes);
				String val = Float.toString(cc.ValorRebanho());
				txtvalor.setText(val);
				String luc = cc.LucroTotal();
				txtlucro.setText(luc);
				} catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
				}
			});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnConsultar.setBounds(76, 313, 109, 36);
		contentPane.add(btnConsultar);
		
	}
}
