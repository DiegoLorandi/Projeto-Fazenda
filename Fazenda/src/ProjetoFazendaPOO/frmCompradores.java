package ProjetoFazendaPOO;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class frmCompradores extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDcomprador;
	private JTextField txtnome;
	private JTextField txtcodcomprador;
	private JTextField txttelefone;
	private JTextField txtendereco;
	private JTextField txtUF;
	private JTextField txtcidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCompradores frame = new frmCompradores();
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
	public frmCompradores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeCompradores = new JLabel("CADASTRO DE COMPRADORES");
		lblCadastroDeCompradores.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeCompradores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCadastroDeCompradores.setBounds(10, 11, 504, 36);
		contentPane.add(lblCadastroDeCompradores);
		
		JLabel lblNewLabel_1 = new JLabel("Identifica\u00E7\u00E3o:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 77, 80, 17);
		contentPane.add(lblNewLabel_1);
		
		txtIDcomprador = new JTextField();
		txtIDcomprador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtIDcomprador.setColumns(10);
		txtIDcomprador.setBounds(87, 77, 86, 20);
		contentPane.add(txtIDcomprador);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(185, 77, 46, 17);
		contentPane.add(lblNewLabel_1_1);
		
		txtnome = new JTextField();
		txtnome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtnome.setColumns(10);
		txtnome.setBounds(233, 77, 281, 20);
		contentPane.add(txtnome);
		
		JLabel lblNewLabel_1_2 = new JLabel("C\u00F3digo:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 104, 53, 17);
		contentPane.add(lblNewLabel_1_2);
		
		txtcodcomprador = new JTextField();
		txtcodcomprador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtcodcomprador.setColumns(10);
		txtcodcomprador.setBounds(62, 104, 86, 20);
		contentPane.add(txtcodcomprador);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Telefone:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(158, 105, 62, 17);
		contentPane.add(lblNewLabel_1_2_1);
		
		txttelefone = new JTextField();
		txttelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txttelefone.setColumns(10);
		txttelefone.setBounds(221, 105, 107, 20);
		contentPane.add(txttelefone);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(10, 134, 68, 17);
		contentPane.add(lblNewLabel_1_2_2);
		
		txtendereco = new JTextField();
		txtendereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtendereco.setColumns(10);
		txtendereco.setBounds(72, 132, 374, 20);
		contentPane.add(txtendereco);
		
		JLabel lblNewLabel_1_2_2_1_2 = new JLabel("UF:");
		lblNewLabel_1_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_2.setBounds(456, 134, 27, 17);
		contentPane.add(lblNewLabel_1_2_2_1_2);
		
		txtcidade = new JTextField();
		txtcidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtcidade.setColumns(10);
		txtcidade.setBounds(387, 104, 127, 20);
		contentPane.add(txtcidade);
		
		txtUF = new JTextField();
		txtUF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUF.setColumns(10);
		txtUF.setBounds(479, 133, 35, 20);
		contentPane.add(txtUF);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compradores c = new Compradores();
				c.setId(txtIDcomprador.getText());
				c.setNome(txtnome.getText());
				c.setCnpj(txtcodcomprador.getText());
				c.setTelefone(txttelefone.getText());
				c.setCidade(txtcidade.getText());
				c.setEndereco(txtendereco.getText());
				c.setUf(txtUF.getText());	
				try {
					c.InsereComprador();
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btnInserir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInserir.setBounds(55, 205, 126, 23);
		contentPane.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compradores c = new Compradores();
				c.setId(txtIDcomprador.getText());
				c.setNome(txtnome.getText());
				c.setCnpj(txtcodcomprador.getText());
				c.setTelefone(txttelefone.getText());
				c.setCidade(txtcidade.getText());
				c.setEndereco(txtendereco.getText());
				c.setUf(txtUF.getText());	
				try {
				c.AlteraComprador();
			} catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlterar.setBounds(202, 205, 126, 23);
		contentPane.add(btnAlterar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compradores c = new Compradores();
				c.setId(txtIDcomprador.getText());
				try {
				c.RemoveComprador();	
			} catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
			}
		});
		btnRemover.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemover.setBounds(347, 205, 126, 23);
		contentPane.add(btnRemover);
		
		JButton btnConsultarID = new JButton("Consultar por ID");
		btnConsultarID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compradores c = new Compradores();
				c.setId(txtIDcomprador.getText());
				try {
					c.ConsultarCompradorID();
					txtIDcomprador.setText(c.getId());
					txtnome.setText(c.getNome());
					txtcodcomprador.setText(c.getCnpj());
					txttelefone.setText(c.getTelefone());
					txtcidade.setText(c.getCidade());
					txtendereco.setText(c.getEndereco());
					txtUF.setText(c.getUf());
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btnConsultarID.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultarID.setBounds(55, 239, 189, 23);
		contentPane.add(btnConsultarID);
		
		JButton btnConsultarCidade = new JButton("Consultar por Cidade");
		btnConsultarCidade.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frmConsultaCompCid fp = new frmConsultaCompCid();
			fp.setVisible(true);
		}
		});
		btnConsultarCidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultarCidade.setBounds(284, 240, 189, 23);
		contentPane.add(btnConsultarCidade);
		
		JButton btnVoltar = new JButton("Voltar ao Principal");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(171, 275, 188, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Cidade:");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(336, 106, 46, 17);
		contentPane.add(lblNewLabel_1_2_1_1);
		
	}

}