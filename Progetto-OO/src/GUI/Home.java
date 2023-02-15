package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Components.PanelCustomBlue;
import Components.PanelHome;
import Components.PanelLoginPage;
import Components.PanelPersonale;
import Components.PanelRegister;
import Controller.Controllore;
import javax.swing.JButton;

public class Home extends JFrame {
	private Controllore controller;
	private PanelCustomBlue BluePanel;
	private PanelRegister Register;
	private JPanel contentPane;
	private JPanel PanelAccess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Controllore controller = new Controllore();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param controllore 
	 */
	public Home() {
		controller = new Controllore();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomBlue panel = new PanelCustomBlue();
		panel.setBounds(0, 0, 450, 550);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtrBenvenutoNelSoftware = new JTextArea();
		txtrBenvenutoNelSoftware.setEditable(false);
		txtrBenvenutoNelSoftware.setForeground(new Color(255, 255, 255));
		txtrBenvenutoNelSoftware.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtrBenvenutoNelSoftware.setText("Benvenuto nel Software per la gestione dei Centri di Recupero per\r\n Tartarughe Marine.\r\n\r\nSi prega di effettuare l'accesso oppure di registrarsi per \r\naccedere all'area personale.");
		txtrBenvenutoNelSoftware.setBounds(10, 82, 430, 122);
		panel.add(txtrBenvenutoNelSoftware);
		txtrBenvenutoNelSoftware.setOpaque(false);
		
		JLabel lblNewLabel = new JLabel("Centro di Recupero Tartarughe Marine");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(36, 10, 378, 94);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(450, 0, 450, 550);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		PanelHome Home = new PanelHome();
		Home.setBounds(0, 0, 450, 550);
		panel_1.add(Home);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				controller.SetLoginPage(panel, panel_1);
				
			}
		});
		
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 24));
		btnNewButton.setBounds(74, 233, 291, 64);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTRATI");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.SetRegistrerPage(panel, panel_1);
				
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 24));
		btnNewButton_1.setBounds(74, 334, 291, 64);
		panel.add(btnNewButton_1);
		
	}
}
