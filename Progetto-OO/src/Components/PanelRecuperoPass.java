package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Controller.Controllore;
import GUI.Home;

public class PanelRecuperoPass extends JPanel {
	private JTextField UserField;
	private JTextField e_mailField;
	private JPasswordField passwordField;
	private JPasswordField repeatPasswordField;
	/**
	 * Create the panel.
	 */
	public PanelRecuperoPass() {
Controllore controller = new Controllore();
		
		setLayout(null);
		
		PanelCustomBlue panel = new PanelCustomBlue();
		panel.setBounds(0, 0, 450, 550);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 450, 105);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color (0,0,0,70));
		
		JLabel lblNewLabel = new JLabel("RECUPERA PASSWORD\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(93, 10, 248, 45);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Crea una nuova password da assegnare al tuo account ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_1.setBounds(49, 50, 337, 45);
		panel_1.add(lblNewLabel_1);
		
		JLabel USER = new JLabel("");
		USER.setIcon(new ImageIcon(PanelRecuperoPass.class.getResource("/Media/user_25px.png")));
		USER.setForeground(new Color(255, 255, 255));
		USER.setFont(new Font("SansSerif", Font.BOLD, 12));
		USER.setBounds(95, 119, 39, 25);
		panel.add(USER);
		
		JLabel e_mail = new JLabel("");
		e_mail.setIcon(new ImageIcon(PanelRecuperoPass.class.getResource("/Media/secured_letter_25px.png")));
		e_mail.setForeground(Color.WHITE);
		e_mail.setFont(new Font("SansSerif", Font.BOLD, 12));
		e_mail.setBounds(95, 182, 39, 25);
		panel.add(e_mail);
		
		JLabel Password = new JLabel("Password : ");
		Password.setForeground(Color.WHITE);
		Password.setFont(new Font("SansSerif", Font.BOLD, 12));
		Password.setBounds(52, 248, 82, 25);
		panel.add(Password);
		
		JLabel RipPassword = new JLabel("Ripeti Password : ");
		RipPassword.setForeground(Color.WHITE);
		RipPassword.setFont(new Font("SansSerif", Font.BOLD, 12));
		RipPassword.setBounds(22, 320, 112, 25);
		panel.add(RipPassword);
		
		UserField = new JTextField();
		UserField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(UserField.getText().isEmpty())
				{
					UserField.setText("Inserire UserName");
				}
			}
		});
		UserField.setText("Inserire Username");
		UserField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserField.setText("");

			}
		});
	
			
		
		UserField.setForeground(new Color(255, 255, 255));
		UserField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		UserField.setBounds(160, 119, 180, 25);
		panel.add(UserField);
		UserField.setColumns(10);
		
		UserField.setBorder(null);
		UserField.setOpaque(false);
		
		e_mailField = new JTextField();
	
		e_mailField.setText("Inserire e-mail");
		e_mailField.setOpaque(false);
		e_mailField.setForeground(Color.WHITE);
		e_mailField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		e_mailField.setColumns(10);
		e_mailField.setBorder(null);
		e_mailField.setBounds(160, 182, 180, 25);
		panel.add(e_mailField);
		//LISTENER
		e_mailField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(e_mailField.getText().isEmpty())
				{
					e_mailField.setText("Inserire e-mail");
				}
			}
		});
		e_mailField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				e_mailField.setText("");
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 251, 180, 21);
		panel.add(passwordField);
		
		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setBounds(160, 323, 180, 21);
		panel.add(repeatPasswordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(160, 143, 180, 16);
		panel.add(separator);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(160, 205, 180, 16);
		panel.add(separator_3);
		
		JLabel GoHome = new JLabel("");
	
		GoHome.setIcon(new ImageIcon(PanelRegister.class.getResource("/Media/home_50px.png")));
		GoHome.setBounds(10, 443, 45, 48);
		panel.add(GoHome);
		
		JButton ButtonCambio = new JButton("CAMBIA PASS\r\n");
		ButtonCambio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ButtonCambio.setBounds(176, 443, 223, 48);
		panel.add(ButtonCambio);
		
		// ACTION 
		ButtonCambio.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				String pass = passwordField.getText();
				String repeatpass = repeatPasswordField.getText();
				String user = UserField.getText();
				String e_mail = e_mailField.getText();
				
				if(user.isEmpty())
				{alertNomeUtenteNonInserito();}
				
				else if(pass.isEmpty() || repeatpass.isEmpty())
				{alertPasswordNonInserita();}
				else if (e_mail.isEmpty())
					{alertemailNonInserita();}
				
				else if (pass.compareTo(repeatpass)!=0)
					{alertPasswordDiverse();}
				else
				{
				//FAre cambio pass
				}
				
			}
		});
		
		GoHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.GoToHome(PanelRecuperoPass.this);
			}
		});

}
		//ALERT
		public void alertNomeUtenteNonInserito() {
			JOptionPane.showMessageDialog(this, "Nome Utente non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}

		public void alertPasswordNonInserita() {
			JOptionPane.showMessageDialog(this, "Password non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}
		public void alertemailNonInserita() {
			JOptionPane.showMessageDialog(this, "E-mail non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}
		public void alertPasswordDiverse() {
			JOptionPane.showMessageDialog(this, "Le due password inserite non coincidono! ","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}
		

		
		
}
