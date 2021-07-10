package bd_fazenda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class AW_Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_Principal window = new AW_Principal();
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
	public AW_Principal() {
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
		
		JLabel lblNewLabel = new JLabel("FAZENDA SANTA SOFIA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 260, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema de Vendas de Animais");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 47, 260, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnAnimais = new JButton("ANIMAIS");
		btnAnimais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnimais.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnimais.setBounds(42, 98, 198, 41);
		frame.getContentPane().add(btnAnimais);
		
		JButton btnCompradores = new JButton("COMPRADORES");
		btnCompradores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCompradores.setBounds(42, 150, 198, 41);
		frame.getContentPane().add(btnCompradores);
		
		JButton btnVendas = new JButton("VENDAS");
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVendas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVendas.setBounds(42, 202, 198, 41);
		frame.getContentPane().add(btnVendas);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSair.setBounds(42, 254, 89, 41);
		frame.getContentPane().add(btnSair);
		
		JButton btnSobre = new JButton("SOBRE");
		btnSobre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSobre.setBounds(151, 254, 89, 41);
		frame.getContentPane().add(btnSobre);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}