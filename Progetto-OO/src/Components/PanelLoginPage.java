package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Controller.Controllore;
import GUI.Home;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelLoginPage extends JPanel {
	private JTextField txtUsername;
	private JPasswordField passwordField;
	/**
	 * Create the panel.
	 */
	public PanelLoginPage() {
		Controllore controller = new Controllore();
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 550);
		add(panel);
		panel.setLayout(null);
		
		PanelCustomBlue panel_1 = new PanelCustomBlue();
		panel_1.setBackground(new Color(132, 225, 254 ));
		panel_1.setBounds(0, 0, 450, 550);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUsername.setText("");
			}
		});
		txtUsername.setForeground(Color.WHITE);
	
		txtUsername.setBorder(null);
		txtUsername.setBackground(SystemColor.controlShadow);
		txtUsername.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtUsername.setText("    Username");
		txtUsername.setBounds(156, 171, 178, 28);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.setOpaque(false);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setText("Password");
		passwordField.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusGained(FocusEvent e) {
				passwordField.setText("");
			}
		});
		passwordField.setToolTipText("\r\n");
		passwordField.setBorder(null);
		passwordField.setBackground(SystemColor.controlShadow);
		passwordField.setBounds(156, 248, 178, 28);
		passwordField.setOpaque(false);
		panel_1.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(135, 152, 157 ));
		separator.setBounds(156, 197, 178, 29);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(135, 152, 157 ));
		separator_1.setBounds(156, 271, 178, 28);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/media/user_25px.png")));
		lblNewLabel.setBounds(101, 171, 45, 37);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/media/password_20px.png")));
		lblNewLabel_1.setBounds(101, 248, 45, 43);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password dimenticata ?");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2.setBounds(156, 300, 151, 28);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlShadow);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(123, 366, 211, 28);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		JLabel LoginLabel = new JLabel("                  LOGIN");
	LoginLabel.setBounds(10, 6, 191, 19);
	
			
				
		
		
		LoginLabel.setForeground(Color.WHITE);
		LoginLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		panel_2.add(LoginLabel);
		
		JPanel panel_4 = new JPanel();
	
		panel_4.setBackground(new Color(0, 0, 0,70));
		
		panel_4.setBounds(0, 0, 450, 105);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("ACCESSO");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_7.setBounds(179, 10, 115, 48);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Accedi alla tua area riservata per la gestione del Centro ");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_8.setBounds(77, 52, 325, 23);
		panel_4.add(lblNewLabel_8);
		
		JLabel GoHome = new JLabel("");
	
		GoHome.setIcon(new ImageIcon(PanelLoginPage.class.getResource("/Media/home_50px.png")));
		GoHome.setBounds(10, 443, 45, 48);
		panel_1.add(GoHome);
		
		
		
		
		
		//ACTION 
		LoginLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nome = txtUsername.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				if(nome.isEmpty())
				{alertNomeUtenteNonInserito();}
				else if(password.isEmpty())
					alertPasswordNonInserita();
				else
					{
					boolean flag =controller.CheckLogin(nome, password);
					if(flag)
					{	
						controller.gotodashboard(PanelLoginPage.this,nome);
						
					}
					else
						alertLogInFallito();
					}
				}
		});
		GoHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.GoToHome(PanelLoginPage.this);
			}
		});
	
	
	}
		
	
	
		//ALERT
		public void alertLogInFallito() {
			JOptionPane.showMessageDialog(this, "Nome utente o password non trovati, riprova.","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}

		public void alertNomeUtenteNonInserito() {
			JOptionPane.showMessageDialog(this, "Nome Utente non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}

		public void alertPasswordNonInserita() {
			JOptionPane.showMessageDialog(this, "Password non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}
}
