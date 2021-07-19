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

public class frmConsultaCompCid extends JFrame{

	private JPanel contentPane;
	private JTextField txtcidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultaCompCid frame = new frmConsultaCompCid();
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
	public frmConsultaCompCid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaPorCidade = new JLabel("CONSULTA COMPRADORES POR CIDADE");
		lblConsultaPorCidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaPorCidade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConsultaPorCidade.setBounds(48, 11, 356, 36);
		contentPane.add(lblConsultaPorCidade);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 92, 426, 236);
		contentPane.add(textArea);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSair.setBounds(306, 346, 98, 36);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 60, 56, 16);
		contentPane.add(lblNewLabel);
		
		txtcidade = new JTextField();
		txtcidade.setBounds(80, 58, 116, 22);
		contentPane.add(txtcidade);
		txtcidade.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compradores c = new Compradores();
				c.setCidade(txtcidade.getText());
				try {
					textArea.append(c.ConsultarCompradorCidade());
			} catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConsultar.setBounds(80, 346, 97, 34);
		contentPane.add(btnConsultar);
	}
}