

package Components;

import Controller.Controllore;
import GUI.Home;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PanelLoginPage extends JPanel {
    private JTextField txtUsername;
    private JPasswordField passwordField;
    private Controllore controller;

    public PanelLoginPage(Controllore contr,JPanel panelscelta) {
        controller = contr;
        setLayout((LayoutManager)null);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 450, 550);
        add(panel);
        panel.setLayout((LayoutManager)null);
        PanelCustomBlue panel_1 = new PanelCustomBlue();
        panel_1.setBackground(new Color(132, 225, 254));
        panel_1.setBounds(0, 0, 450, 550);
        panel.add(panel_1);
        panel_1.setLayout((LayoutManager)null);
        txtUsername = new JTextField();
        txtUsername.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                txtUsername.setText("");
            }
        });
        panel_1.setLayout(null);
        panel_1.setLayout(null);
        txtUsername.setForeground(Color.WHITE);
        txtUsername.setBorder((Border)null);
        txtUsername.setBackground(SystemColor.controlShadow);
        txtUsername.setFont(new Font("SansSerif", 1, 12));
        txtUsername.setText("    Username");
        txtUsername.setBounds(156, 171, 178, 28);
        panel_1.add(txtUsername);
        txtUsername.setColumns(10);
        txtUsername.setOpaque(false);
        
        passwordField = new JPasswordField();
        passwordField.setForeground(Color.BLACK);
        passwordField.setText("Password");
        passwordField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                PanelLoginPage.this.passwordField.setText("");
            }
        });
        passwordField.setToolTipText("\r\n");
        passwordField.setBorder((Border)null);
        passwordField.setBackground(SystemColor.controlShadow);
        passwordField.setBounds(156, 248, 178, 28);
        passwordField.setOpaque(false);
        
        panel_1.add(passwordField);
        
        JSeparator separator = new JSeparator();
        separator.setForeground(new Color(135, 152, 157));
        separator.setBounds(156, 197, 178, 29);
        panel_1.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(new Color(135, 152, 157));
        separator_1.setBounds(156, 271, 178, 28);
        panel_1.add(separator_1);
        
        JLabel lblNewLabel = new JLabel("\r\n");
        lblNewLabel.setIcon(new ImageIcon(PanelLoginPage.class.getResource("/Media/user_male_28px.png")));
        lblNewLabel.setBounds(101, 168, 45, 37);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("\r\n");
        lblNewLabel_1.setIcon(new ImageIcon(PanelLoginPage.class.getResource("/Media/Password_28px.png")));
        lblNewLabel_1.setBounds(101, 240, 45, 43);
        panel_1.add(lblNewLabel_1);
        
        JLabel RecoveryPassword = new JLabel("Password dimenticata ?");
      
     
        RecoveryPassword.setFont(new Font("SansSerif", 1, 12));
        RecoveryPassword.setBounds(156, 300, 151, 28);
        panel_1.add(RecoveryPassword);
        
        JPanel panel_login = new JPanel();
        
        panel_login.setBackground(new Color(0,0,0,70));
        panel_login.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_login.setBounds(123, 366, 211, 28);
        panel_1.add(panel_login);
        panel_login.setLayout((LayoutManager)null);
        
        JLabel LoginLabel = new JLabel("                  LOGIN");
        LoginLabel.setBounds(10, 6, 191, 19);
        LoginLabel.setForeground(Color.WHITE);
        LoginLabel.setFont(new Font("SansSerif", 1, 14));
        panel_login.add(LoginLabel);
        
        JPanel panel_info = new JPanel();
        panel_info.setBackground(new Color(0, 0, 0, 70));
        panel_info.setBounds(0, 0, 450, 105);
        panel_1.add(panel_info);
        panel_info.setLayout((LayoutManager)null);
        JLabel lblNewLabel_7 = new JLabel("ACCESSO");
        lblNewLabel_7.setForeground(Color.WHITE);
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 20));
        lblNewLabel_7.setBounds(179, 10, 115, 48);
        panel_info.add(lblNewLabel_7);
        JLabel lblNewLabel_8 = new JLabel("Accedi alla tua area riservata per la gestione del Centro ");
        lblNewLabel_8.setForeground(Color.WHITE);
        lblNewLabel_8.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_8.setBounds(77, 52, 325, 23);
        panel_info.add(lblNewLabel_8);
        JLabel GoHome = new JLabel("");
        GoHome.setIcon(new ImageIcon(PanelLoginPage.class.getResource("/Media/home_c_50px.png")));
        GoHome.setBounds(10, 443, 55, 48);
        panel_1.add(GoHome);
        
        JLabel ShowPassword = new JLabel("");
        ShowPassword.setIcon(new ImageIcon(PanelLoginPage.class.getResource("/Media/eye_20px.png")));
        
        ShowPassword.setBounds(333, 255, 61, 13);
        panel_1.add(ShowPassword);
        
        //LISTENER 
        LoginLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String nome = PanelLoginPage.this.txtUsername.getText();
                String password = PanelLoginPage.this.passwordField.getText();
                if (nome.isEmpty()) {
                    alertNomeUtenteNonInserito();
                } else if (password.isEmpty()) {
                   alertPasswordNonInserita();
                } else if (PanelLoginPage.this.controller.CheckLogin(nome, password)) {
                    controller.gotodashboard(PanelLoginPage.this, nome);
                } else {
                   alertLogInFallito();
                }

            }
        });
        GoHome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	PanelSceltaHome goback = new PanelSceltaHome(controller);
				goback.setBounds(0,0,450,550);
				controller.GoBackHome(panel, goback);
            }
        });
        
        RecoveryPassword.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		PanelRecuperoPass panelrecovery = new PanelRecuperoPass(controller,panelscelta);
        		panelrecovery.setBounds(0,0,450,550);
        		controller.SetHomePage(panelscelta, panelrecovery);
        	}
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		RecoveryPassword.setForeground(new Color (255,255,255));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		RecoveryPassword.setForeground(new Color (0,0,0));
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
        
    }

    public void alertLogInFallito() {
        JOptionPane.showMessageDialog(this, "Nome utente o password non trovati, riprova.", "<ATTENZIONE>", 2);
    }

    public void alertNomeUtenteNonInserito() {
        JOptionPane.showMessageDialog(this, "Nome Utente non inserito!", "<ATTENZIONE>", 2);
    }

    public void alertPasswordNonInserita() {
        JOptionPane.showMessageDialog(this, "Password non inserita!", "<ATTENZIONE>", 2);
    }
}
