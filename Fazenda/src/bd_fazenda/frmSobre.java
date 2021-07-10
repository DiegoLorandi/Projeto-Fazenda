package bd_fazenda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.DropMode;

public class frmSobre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSobre window = new frmSobre();
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
	public frmSobre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 295, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SOBRE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 260, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSair.setBounds(100, 275, 89, 41);
		frame.getContentPane().add(btnSair);
		
		JTextPane txtpnSistemaCriadoPara = new JTextPane();
		txtpnSistemaCriadoPara.setEnabled(false);
		txtpnSistemaCriadoPara.setEditable(false);
		txtpnSistemaCriadoPara.setDropMode(DropMode.ON);
		txtpnSistemaCriadoPara.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnSistemaCriadoPara.setText("O sistema tem uma interface gr\u00E1fica amig\u00E1vel e autoexplicativa ao usu\u00E1rio facilitando na coleta e analise de dados b\u00E1sicos dos animais, das vendas e dos compradores. Por ainda ser uma fazenda de pequeno porte, tivemos como objetivo adequar o programa as atuais necessidades do neg\u00F3cio, customizando o banco de dados e o funcionamento do sistema para gerar a melhor experi\u00EAncia poss\u00EDvel no manuseio di\u00E1rio do propriet\u00E1rio.");
		txtpnSistemaCriadoPara.setBounds(10, 58, 260, 201);
		frame.getContentPane().add(txtpnSistemaCriadoPara);
	}
}
