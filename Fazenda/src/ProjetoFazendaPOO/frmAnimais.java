	package ProjetoFazendaPOO;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class frmAnimais extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDanimal;
	private JTextField txtcodanimal;
	private JTextField txtraca;
	private JTextField txtdtnascimento;
	private JTextField txtpai;
	private JTextField txtmae;
	private JTextField txtpeso;
	private JTextField txtsituacao;
	private JTextField txtsexo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAnimais frame = new frmAnimais();
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
	public frmAnimais() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeAnimais = new JLabel("CADASTRO DE ANIMAIS");
		lblCadastroDeAnimais.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeAnimais.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCadastroDeAnimais.setBounds(10, 11, 504, 36);
		contentPane.add(lblCadastroDeAnimais);
		
		JLabel lblNewLabel_1 = new JLabel("Identifica\u00E7\u00E3o:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 77, 80, 17);
		contentPane.add(lblNewLabel_1);
		
		txtIDanimal = new JTextField();
		txtIDanimal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtIDanimal.setBounds(87, 77, 86, 20);
		contentPane.add(txtIDanimal);
		txtIDanimal.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(185, 77, 46, 17);
		contentPane.add(lblNewLabel_1_1);
		
		txtcodanimal = new JTextField();
		txtcodanimal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtcodanimal.setColumns(10);
		txtcodanimal.setBounds(233, 77, 86, 20);
		contentPane.add(txtcodanimal);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sexo:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(335, 79, 46, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ra\u00E7a:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 104, 35, 17);
		contentPane.add(lblNewLabel_1_2);
		
		txtraca = new JTextField();
		txtraca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtraca.setColumns(10);
		txtraca.setBounds(47, 104, 159, 20);
		contentPane.add(txtraca);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Data de Nascimento:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(221, 105, 126, 17);
		contentPane.add(lblNewLabel_1_2_1);
		
		txtdtnascimento = new JTextField();
		txtdtnascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtdtnascimento.setColumns(10);
		txtdtnascimento.setBounds(345, 104, 168, 20);
		contentPane.add(txtdtnascimento);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Pai:");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(10, 132, 35, 17);
		contentPane.add(lblNewLabel_1_2_2);
		
		txtpai = new JTextField();
		txtpai.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpai.setColumns(10);
		txtpai.setBounds(35, 132, 43, 20);
		contentPane.add(txtpai);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("M\u00E3e:");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1.setBounds(87, 132, 35, 17);
		contentPane.add(lblNewLabel_1_2_2_1);
		
		txtmae = new JTextField();
		txtmae.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtmae.setColumns(10);
		txtmae.setBounds(121, 132, 43, 20);
		contentPane.add(txtmae);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Peso:");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1.setBounds(183, 132, 35, 17);
		contentPane.add(lblNewLabel_1_2_2_1_1);
		
		txtpeso = new JTextField();
		txtpeso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpeso.setColumns(10);
		txtpeso.setBounds(221, 133, 43, 20);
		contentPane.add(txtpeso);
		
		JLabel lblNewLabel_1_2_2_1_2 = new JLabel("Situa\u00E7\u00E3o:");
		lblNewLabel_1_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_2.setBounds(285, 133, 62, 17);
		contentPane.add(lblNewLabel_1_2_2_1_2);
		
		txtsituacao = new JTextField();
		txtsituacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtsituacao.setColumns(10);
		txtsituacao.setBounds(355, 133, 159, 20);
		contentPane.add(txtsituacao);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Animais a = new Animais();
				a.setId(txtIDanimal.getText());
				a.setCodigoanimal(txtcodanimal.getText());
				a.setSexo(txtsexo.getText());
				a.setRaca(txtraca.getText());
				a.setDatanascimento(txtdtnascimento.getText());
				a.setPai(txtpai.getText());
				a.setMae(txtmae.getText());
				a.setPeso(txtpeso.getText());
				a.setSituacao(txtsituacao.getText());		
				try {
					a.InsereAnimal();
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btnInserir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInserir.setBounds(47, 205, 126, 23);
		contentPane.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Animais a = new Animais();
				a.setId(txtIDanimal.getText());
				a.setCodigoanimal(txtcodanimal.getText());
				a.setSexo(txtsexo.getText());
				a.setRaca(txtraca.getText());
				a.setDatanascimento(txtdtnascimento.getText());
				a.setPai(txtpai.getText());
				a.setMae(txtmae.getText());
				a.setPeso(txtpeso.getText());
				a.setSituacao(txtsituacao.getText());
				try {
				a.AlteraAnimal();	
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
				Animais a = new Animais();
				a.setId(txtIDanimal.getText());
				try {
				a.RemoveAnimal();	
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
				Animais a = new Animais();
				a.setId(txtIDanimal.getText());
				try {
				a.ConsultaAnimalID();
				txtIDanimal.setText(a.getId());
				txtcodanimal.setText(a.getCodigoanimal());
				txtsexo.setText(a.getSexo());
				txtraca.setText(a.getRaca());
				txtdtnascimento.setText(a.getDatanascimento());
				txtpai.setText(a.getPai());
				txtmae.setText(a.getMae());
				txtpeso.setText(a.getPeso());
				txtsituacao.setText(a.getSituacao());
			} catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
			}
		});
		btnConsultarID.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultarID.setBounds(284, 241, 189, 23);
		contentPane.add(btnConsultarID);
		
		JButton btnGerarEstatstica = new JButton("Gerar Estat\u00EDstica");
		btnGerarEstatstica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEstatisticas es = new frmEstatisticas();
				es.setVisible(true);
			}
		});
		btnGerarEstatstica.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerarEstatstica.setBounds(47, 241, 189, 23);
		contentPane.add(btnGerarEstatstica);
		
		JButton btnVoltar = new JButton("Voltar ao Principal");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(170, 277, 188, 23);
		contentPane.add(btnVoltar);
		
		txtsexo = new JTextField();
		txtsexo.setBounds(397, 76, 116, 22);
		contentPane.add(txtsexo);
		txtsexo.setColumns(10);
	}
}
