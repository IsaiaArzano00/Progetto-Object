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
	private Controllore controller;

	/**
	 * Create the panel.
	 */
	public PanelRegister(Controllore contr) {
		 controller = contr;
		
		setLayout(null);
		
		PanelCustomBlue panel_sfondo = new PanelCustomBlue();
		panel_sfondo.setBounds(0, 0, 450, 550);
		add(panel_sfondo);
		panel_sfondo.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 450, 105);
		panel_sfondo.add(panel_1);
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
		panel_sfondo.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("e-mail : ");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(10, 182, 140, 25);
		panel_sfondo.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Password : ");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2_5.setBounds(10, 248, 140, 25);
		panel_sfondo.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Ripeti Password : ");
		lblNewLabel_2_6.setForeground(Color.WHITE);
		lblNewLabel_2_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2_6.setBounds(10, 320, 140, 25);
		panel_sfondo.add(lblNewLabel_2_6);
		
		UserField = new JTextField();
		UserField.setForeground(new Color(255, 255, 255));
		UserField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		UserField.setBounds(160, 119, 180, 25);
		panel_sfondo.add(UserField);
		UserField.setColumns(10);
		UserField.setText("Inserire Username");
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
		panel_sfondo.add(e_mailField);
		
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setOpaque(false);
		passwordField.setBounds(160, 251, 180, 21);
		panel_sfondo.add(passwordField);
		
		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setBorder(null);
		repeatPasswordField.setOpaque(false);
		repeatPasswordField.setBounds(160, 323, 180, 21);
		panel_sfondo.add(repeatPasswordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(160, 143, 180, 16);
		panel_sfondo.add(separator);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(160, 205, 180, 16);
		panel_sfondo.add(separator_3);
		
		JButton btnNewButton = new JButton("REGISTRATI");
	
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 22));
		btnNewButton.setBounds(93, 400, 245, 45);
		panel_sfondo.add(btnNewButton);
		
		JLabel GoHome = new JLabel("");
	
		GoHome.setIcon(new ImageIcon(PanelRegister.class.getResource("/Media/home_50px.png")));
		GoHome.setBounds(10, 443, 45, 48);
		panel_sfondo.add(GoHome);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(160, 271, 180, 16);
		panel_sfondo.add(separator_3_1);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setBounds(160, 344, 180, 16);
		panel_sfondo.add(separator_3_2);
		
		JLabel ShowPassword = new JLabel("");
		ShowPassword.setIcon(new ImageIcon(PanelRegister.class.getResource("/Media/eye_20px.png")));
		ShowPassword.setBounds(350, 255, 45, 13);
		panel_sfondo.add(ShowPassword);
		
		JLabel ShowRepeatPassword = new JLabel("");
		ShowRepeatPassword.setIcon(new ImageIcon(PanelRegister.class.getResource("/Media/eye_20px.png")));
		ShowRepeatPassword.setBounds(350, 327, 45, 13);
		panel_sfondo.add(ShowRepeatPassword);
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
						e_mailField.setFont(new Font ("SanSerif",Font.BOLD,12));
						e_mailField.setText("");
					}
				});
				
				UserField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if(UserField.getText().isEmpty())
						{
							UserField.setText("Inserire UserName");
						}
					}
				});
				
				
				
			
				UserField.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						UserField.setFont(new Font ("SanSerif",Font.BOLD,12));
						UserField.setText("");

					}
				});
				
				ShowPassword.addMouseListener(new MouseAdapter() {
		        	@Override
		        	public void mousePressed(MouseEvent e) {
		        		passwordField.setFont((new Font("SansSerif", 1, 12)));
		        		passwordField.setForeground(new Color(255,255,255));
		        		passwordField.setEchoChar((char) 0);
		        	}
		        	public void mouseReleased(MouseEvent e) {
		        		passwordField.setFont((new Font("Tahoma",0, 10)));
		        		passwordField.setForeground(new Color(0,0,0));
		        		passwordField.setEchoChar('●');
		        	}
		        });
				
				ShowRepeatPassword.addMouseListener(new MouseAdapter() {
		        	@Override
		        	public void mousePressed(MouseEvent e) {
		        		repeatPasswordField.setFont((new Font("SansSerif", 1, 12)));
		        		repeatPasswordField.setForeground(new Color(255,255,255));
		        		repeatPasswordField.setEchoChar((char) 0);
		        	}
		        	public void mouseReleased(MouseEvent e) {
		        		repeatPasswordField.setFont((new Font("Tahoma",0, 10)));
		        		repeatPasswordField.setForeground(new Color(0,0,0));
		        		repeatPasswordField.setEchoChar('●');
		        	}
		        });
			
				
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
						else if(!controller.ControlloNomeUtente(user))
							alertNomeUtenteNonCorretto(user);
						else if(controller.CheckUtenteRegistrato(user, e_mail))
						{alertUtenteRegistrato();}
						else if(pass.isEmpty() || repeatpass.isEmpty())
						{alertPasswordNonInserita();}
						else if(!controller.ControlloPasswordRegister(pass))
							alertPasswordNonCorretto();
						else if (e_mail.isEmpty())
							{alertemailNonInserita();}
						else if(!controller.ControlloEMailRegister(e_mail))
							alertEmailNonCorretta(e_mail);
						else if (pass.compareTo(repeatpass)!=0)
							{alertPasswordDiverse();}
						else
						{
						
						boolean flag=controller.RegistraUtente(user, pass, e_mail);
						if(flag)
						{
							alertRegistrazioneFatta();
							controller.GoToHome(PanelRegister.this);
						}else
							alertRegistrazioneFallita();
						
						}
						
					}
				});
				
				GoHome.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						PanelSceltaHome goback = new PanelSceltaHome(controller);
						goback.setBounds(0,0,450,550);
						controller.GoBackHome(panel_sfondo, goback);
					}
				});
		
	}
	//ALERT
		public void alertNomeUtenteNonInserito() {
			JOptionPane.showMessageDialog(this, "Nome Utente non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}
		public void alertNomeUtenteNonCorretto(String user) {
			JOptionPane.showMessageDialog(this, "Nome Utente : "+user+"  non valido !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}
		public void alertPasswordNonCorretto() {
			JOptionPane.showMessageDialog(this, "Password inserita non è valita  !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}
		public void alertPasswordNonInserita() {
			JOptionPane.showMessageDialog(this, "Password non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
		}
		public void alertEmailNonCorretta(String email) {
			JOptionPane.showMessageDialog(this, "L'email : "+email+"   non è un'email valida !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
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
		public void alertRegistrazioneFatta() {
			JOptionPane.showMessageDialog(this, "Utente correttamente registrato ! ","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
		}
		public void alertRegistrazioneFallita() {
			JOptionPane.showMessageDialog(this, "Registrazione non avvenuta con successo ! ","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
		}
	}

