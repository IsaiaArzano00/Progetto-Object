package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import Components.PanelWhite;
import Controller.Controllore;

public class VisualizzaCartellaMedica extends JDialog {
	private JPanel contentPane;
	private PanelWhite sfondo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private Controllore controller;
	
	public VisualizzaCartellaMedica(Controllore contr, String idTartaruga) {
		controller = contr;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 981, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelWhite sfondo = new PanelWhite();
		sfondo.setBounds(0, -16, 977, 579);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 977, 91);
		sfondo.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(10, 10, 84, 80);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(InserimentoCartellaMedicapt1.class.getResource("/Media/health_book_80px.png")));
		
		JLabel lblNewLabel_1 = new JLabel("MODIFICA CARTELLA MEDICA");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(104, 29, 289, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Peso : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 167, 45, 16);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Lunghezza : ");
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 209, 85, 21);
		sfondo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Larghezza : ");
		lblNewLabel_3_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(10, 254, 85, 21);
		sfondo.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Specie : ");
		lblNewLabel_3_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(10, 307, 56, 21);
		sfondo.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Luogo di ritrovamento : ");
		lblNewLabel_3_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(10, 358, 147, 21);
		sfondo.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Data apertura cartella : ");
		lblNewLabel_3_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(11, 413, 157, 21);
		sfondo.add(lblNewLabel_3_5);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(178, 415, 171, 19);
		sfondo.add(dateChooser);
		
		textField = new JTextField();
		textField.setBounds(178, 160, 147, 19);
		sfondo.add(textField);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setOpaque(false);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(178, 211, 147, 19);
		sfondo.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(178, 256, 147, 19);
		sfondo.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setOpaque(false);
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(178, 360, 147, 19);
		sfondo.add(textField_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(167, 187, 171, 21);
		sfondo.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(167, 230, 171, 21);
		sfondo.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(167, 273, 168, 19);
		sfondo.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(178, 377, 171, 21);
		sfondo.add(separator_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("SansSerif", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tartaruga comune (Caretta caretta)", "Tartaruga verde (Chelonia mydas)", "Tartaruga liuto (Dermochelys coriacea)", "Tartaruga embricata (Eretmochelys imbricata)", "Tartaruga bastarda (Lepidochelys kempii)", "Tartaruga olivacea (Lepidochelys olivacea)", "Tartaruga piatta (Natator depressus)"}));
		comboBox.setBounds(167, 307, 205, 21);
		sfondo.add(comboBox);
		
		JLabel lblNewLabel_3_6 = new JLabel("Condizioni Generali : ");
		lblNewLabel_3_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_6.setBounds(10, 489, 136, 16);
		sfondo.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Condizioni Testa :");
		lblNewLabel_3_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7.setBounds(436, 167, 136, 16);
		sfondo.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Condizioni Occhi : ");
		lblNewLabel_3_8.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_8.setBounds(436, 212, 136, 16);
		sfondo.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Condizioni Pinne : ");
		lblNewLabel_3_9.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_9.setBounds(436, 264, 136, 16);
		sfondo.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("Condizioni Naso : ");
		lblNewLabel_3_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_10.setBounds(436, 318, 136, 16);
		sfondo.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_11 = new JLabel("Condizioni Becco : ");
		lblNewLabel_3_11.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_11.setBounds(436, 371, 136, 16);
		sfondo.add(lblNewLabel_3_11);
		
		JLabel lblNewLabel_3_12 = new JLabel("ID Tartaruga : ");
		lblNewLabel_3_12.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_12.setBounds(10, 119, 147, 16);
		sfondo.add(lblNewLabel_3_12);
		
		JTextField idTartaruga_in = new JTextField();
		idTartaruga_in.setEditable(false);
		idTartaruga_in.setBounds(167, 115, 182, 21);
		idTartaruga_in.setText(idTartaruga);
		sfondo.add(idTartaruga_in);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("Condizioni Collo  :");
		lblNewLabel_3_7_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7_1.setBounds(436, 122, 136, 16);
		sfondo.add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_3_7_2 = new JLabel("Condizioni Coda  :");
		lblNewLabel_3_7_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7_2.setBounds(436, 418, 136, 16);
		sfondo.add(lblNewLabel_3_7_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBox_2.setBounds(582, 118, 171, 21);
		sfondo.add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBox_2_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox_2_1.setBounds(582, 166, 171, 21);
		sfondo.add(comboBox_2_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBox_2_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox_2_2.setBounds(582, 210, 171, 21);
		sfondo.add(comboBox_2_2);
		
		JComboBox comboBox_2_3 = new JComboBox();
		comboBox_2_3.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBox_2_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox_2_3.setBounds(582, 264, 171, 21);
		sfondo.add(comboBox_2_3);
		
		JComboBox comboBox_2_3_1 = new JComboBox();
		comboBox_2_3_1.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBox_2_3_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox_2_3_1.setBounds(582, 317, 171, 21);
		sfondo.add(comboBox_2_3_1);
		
		JComboBox comboBox_2_3_2 = new JComboBox();
		comboBox_2_3_2.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBox_2_3_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox_2_3_2.setBounds(582, 371, 171, 21);
		sfondo.add(comboBox_2_3_2);
		
		JComboBox comboBox_2_3_3 = new JComboBox();
		comboBox_2_3_3.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBox_2_3_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox_2_3_3.setBounds(582, 414, 171, 21);
		sfondo.add(comboBox_2_3_3);
		
		JComboBox comboBox_2_4 = new JComboBox();
		comboBox_2_4.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBox_2_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox_2_4.setBounds(167, 488, 171, 21);
		sfondo.add(comboBox_2_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(InserimentoCartellaMedicapt1.class.getResource("/Media/save_50px.png")));
		lblNewLabel_4.setBounds(826, 481, 56, 61);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(InserimentoCartellaMedicapt1.class.getResource("/Media/cross_mark_button_50px.png")));
		lblNewLabel_5.setBounds(708, 481, 56, 61);
		sfondo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cancella");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setBounds(708, 524, 58, 32);
		sfondo.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Salva");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(836, 534, 45, 13);
		sfondo.add(lblNewLabel_7);
		
		setModal(true);
		setVisible(true);
	}
}
