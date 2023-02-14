package Components;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Controller.Controllore;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class PanelRegister extends JPanel {
	private JTextField UserField;
	private JTextField e_mailField;
	private JPasswordField passwordField;
	private JPasswordField repeatPasswordField;

	/**
	 * Create the panel.
	 */
	public PanelRegister() {
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
		
		JLabel lblNewLabel = new JLabel("REGISTRATI");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(158, 10, 152, 45);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Registrati per accedere alla tua area riservata.");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_1.setBounds(97, 50, 289, 45);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username : ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 115, 140, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("e-mail : ");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(10, 182, 140, 25);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Password : ");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2_5.setBounds(10, 248, 140, 25);
		panel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Ripeti Password : ");
		lblNewLabel_2_6.setForeground(Color.WHITE);
		lblNewLabel_2_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2_6.setBounds(10, 320, 140, 25);
		panel.add(lblNewLabel_2_6);
		
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
		
		JButton btnNewButton = new JButton("REGISTRATI");
	
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 22));
		btnNewButton.setBounds(93, 400, 245, 45);
		panel.add(btnNewButton);
		
		JLabel GoHome = new JLabel("");
	
		GoHome.setIcon(new ImageIcon(PanelRegister.class.getResource("/Media/home_50px.png")));
		GoHome.setBounds(10, 443, 45, 48);
		panel.add(GoHome);
		// ACTION 
				btnNewButton.addMouseListener(new MouseAdapter() {
					@SuppressWarnings("deprecation")
					@Override
					public void mouseClicked(MouseEvent e) {
						String pass = passwordField.getText();
						String repeatpass = repeatPasswordField.getText();
						String user = UserField.getText();
						String e_mail = e_mailField.getText();
						
						if(user.isEmpty())
						{alertNomeUtenteNonInserito();}
						else if(controller.CheckUtenteRegistrato(user, e_mail))
						{alertUtenteRegistrato();}
						else if(pass.isEmpty() || repeatpass.isEmpty())
						{alertPasswordNonInserita();}
						else if (e_mail.isEmpty())
							{alertemailNonInserita();}
						
						else if (pass.compareTo(repeatpass)!=0)
							{alertPasswordDiverse();}
						else
						{
						controller.RegistraUtente(user, pass, e_mail);
						controller.GoToHome(PanelRegister.this);
						}
						
					}
				});
				
				GoHome.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						controller.GoToHome(PanelRegister.this);
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
		public void alertUtenteRegistrato() {
			JOptionPane.showMessageDialog(this, "UserName o e-mail già esistenti! ","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}

	
		
	}

