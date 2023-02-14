package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import Components.PanelCustomBlue;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class InserimentoTartaruga extends JFrame {

	private JPanel contentPane;
	private PanelCustomBlue sfondo;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserimentoTartaruga frame = new InserimentoTartaruga();
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
	public InserimentoTartaruga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(0, 0, 450, 650);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 116);
		sfondo.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(0,0,0,70));
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(InserimentoTartaruga.class.getResource("/Media/turtle_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tartaruga ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 160, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati della tartaruga");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 241, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 174, 45, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Età : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 239, 45, 13);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Data accoglienza Centro : ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 311, 147, 13);
		sfondo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Centro : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 383, 62, 13);
		sfondo.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(147, 171, 169, 19);
		sfondo.add(textField);
		textField.setColumns(10);
		textField.setOpaque(false);
		textField.setBorder(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 236, 187, 19);
		sfondo.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setOpaque(false);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(167, 311, 167, 19);
		sfondo.add(dateChooser);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(147, 200, 179, 38);
		sfondo.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(147, 265, 169, 38);
		sfondo.add(separator_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 380, 187, 21);
		sfondo.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(InserimentoTartaruga.class.getResource("/Media/cross_mark_button_50px.png")));
		lblNewLabel_7.setBounds(268, 451, 53, 50);
		sfondo.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(InserimentoTartaruga.class.getResource("/Media/save_50px.png")));
		lblNewLabel_8.setBounds(364, 451, 62, 50);
		sfondo.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Cancella");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(268, 498, 63, 13);
		sfondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Salva");
		lblNewLabel_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(374, 498, 45, 13);
		sfondo.add(lblNewLabel_10);
	
	}
}
