package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Components.*;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import java.awt.Font;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private PanelWhite test;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelWhite test1 = new PanelWhite();
		contentPane.add(test1);
		test1.setBounds(0, 0, 800, 500);
		test1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(41, 147, 140, 25);
		test1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(243, 147, 140, 25);
		test1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(456, 147, 140, 25);
		test1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(41, 227, 140, 25);
		test1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(243, 227, 140, 25);
		test1.add(textField_4);
		textField_4.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(456, 227, 140, 25);
		test1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(41, 317, 140, 25);
		test1.add(passwordField_1);
		
		JLabel lblNewLabel = new JLabel("Nome : ");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setBounds(41, 124, 45, 13);
		test1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cognome");
		lblNewLabel_1.setBounds(243, 125, 45, 13);
		test1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("e-mail : ");
		lblNewLabel_2.setBounds(456, 125, 45, 13);
		test1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(41, 204, 45, 13);
		test1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(243, 204, 45, 13);
		test1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(456, 204, 45, 13);
		test1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(41, 294, 45, 13);
		test1.add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 790, 79);
		test1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("REGISTRATI ");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_7.setBounds(308, 10, 198, 26);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Registrati per accedere alla tua area riservata nel Centro.");
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_8.setBounds(211, 46, 341, 13);
		panel.add(lblNewLabel_8);
		
	}
}
