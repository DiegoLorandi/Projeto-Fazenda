package ProjetoFazendaPOO;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.TextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSobre frame = new frmSobre();
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
	public frmSobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSobre = new JLabel("SOBRE");
		lblSobre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSobre.setBounds(10, 11, 260, 36);
		contentPane.add(lblSobre);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar.setBounds(98, 311, 89, 21);
		contentPane.add(btnVoltar);
		
		JTextPane txtpnSistemaCriadoPara = new JTextPane();
		txtpnSistemaCriadoPara.setEditable(false);
		txtpnSistemaCriadoPara.setEnabled(false);
		txtpnSistemaCriadoPara.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnSistemaCriadoPara.setText("Sistema criado para gerenciamento de\r\ninforma\u00E7\u00F5es otimizado para atender as\r\nnecessidades do neg\u00F3cio. Possui uma \r\ninterface gr\u00E1fica intuitiva para facilitar a\r\nnavega\u00E7\u00E3o do usu\u00E1rio e uma integra\u00E7\u00E3o\r\nr\u00E1pida na coleta e analise de dados dos\r\nanimais, das vendas e dos compradores.\r\n\r\nDesenvolvedores:\r\nCIRO ESTEVES VIEIRA\r\nDIEGO DE S\u00C1 LORANDI\r\nELVIS DO AMARAL OLIVEIRA\r\n\r\nVers\u00E3o Basic_Free 2021\r\nRegistro SI03-Proj2021_Ver0721");
		txtpnSistemaCriadoPara.setBounds(10, 58, 260, 242);
		contentPane.add(txtpnSistemaCriadoPara);
	}
}
