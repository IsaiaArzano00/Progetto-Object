//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

    public PanelLoginPage(Controllore contr) {
        this.controller = contr;
        this.setLayout((LayoutManager)null);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 450, 550);
        this.add(panel);
        panel.setLayout((LayoutManager)null);
        PanelCustomBlue panel_1 = new PanelCustomBlue();
        panel_1.setBackground(new Color(132, 225, 254));
        panel_1.setBounds(0, 0, 450, 550);
        panel.add(panel_1);
        panel_1.setLayout((LayoutManager)null);
        this.txtUsername = new JTextField();
        this.txtUsername.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PanelLoginPage.this.txtUsername.setText("");
            }
        });
        this.txtUsername.setForeground(Color.WHITE);
        this.txtUsername.setBorder((Border)null);
        this.txtUsername.setBackground(SystemColor.controlShadow);
        this.txtUsername.setFont(new Font("SansSerif", 1, 12));
        this.txtUsername.setText("    Username");
        this.txtUsername.setBounds(156, 171, 178, 28);
        panel_1.add(this.txtUsername);
        this.txtUsername.setColumns(10);
        this.txtUsername.setOpaque(false);
        this.passwordField = new JPasswordField();
        this.passwordField.setForeground(Color.BLACK);
        this.passwordField.setText("Password");
        this.passwordField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                PanelLoginPage.this.passwordField.setText("");
            }
        });
        this.passwordField.setToolTipText("\r\n");
        this.passwordField.setBorder((Border)null);
        this.passwordField.setBackground(SystemColor.controlShadow);
        this.passwordField.setBounds(156, 248, 178, 28);
        this.passwordField.setOpaque(false);
        panel_1.add(this.passwordField);
        JSeparator separator = new JSeparator();
        separator.setForeground(new Color(135, 152, 157));
        separator.setBounds(156, 197, 178, 29);
        panel_1.add(separator);
        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(new Color(135, 152, 157));
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
        lblNewLabel_2.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_2.setBounds(156, 300, 151, 28);
        panel_1.add(lblNewLabel_2);
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(SystemColor.controlShadow);
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.setBounds(123, 366, 211, 28);
        panel_1.add(panel_2);
        panel_2.setLayout((LayoutManager)null);
        JLabel LoginLabel = new JLabel("                  LOGIN");
        LoginLabel.setBounds(10, 6, 191, 19);
        LoginLabel.setForeground(Color.WHITE);
        LoginLabel.setFont(new Font("SansSerif", 1, 14));
        panel_2.add(LoginLabel);
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(0, 0, 0, 70));
        panel_4.setBounds(0, 0, 450, 105);
        panel_1.add(panel_4);
        panel_4.setLayout((LayoutManager)null);
        JLabel lblNewLabel_7 = new JLabel("ACCESSO");
        lblNewLabel_7.setForeground(Color.WHITE);
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 20));
        lblNewLabel_7.setBounds(179, 10, 115, 48);
        panel_4.add(lblNewLabel_7);
        JLabel lblNewLabel_8 = new JLabel("Accedi alla tua area riservata per la gestione del Centro ");
        lblNewLabel_8.setForeground(Color.WHITE);
        lblNewLabel_8.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_8.setBounds(77, 52, 325, 23);
        panel_4.add(lblNewLabel_8);
        JLabel GoHome = new JLabel("");
        GoHome.setIcon(new ImageIcon(PanelLoginPage.class.getResource("/Media/home_50px.png")));
        GoHome.setBounds(10, 443, 45, 48);
        panel_1.add(GoHome);
        LoginLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String nome = PanelLoginPage.this.txtUsername.getText();
                String password = PanelLoginPage.this.passwordField.getText();
                if (nome.isEmpty()) {
                    PanelLoginPage.this.alertNomeUtenteNonInserito();
                } else if (password.isEmpty()) {
                    PanelLoginPage.this.alertPasswordNonInserita();
                } else if (PanelLoginPage.this.controller.CheckLogin(nome, password)) {
                    PanelLoginPage.this.controller.gotodashboard(PanelLoginPage.this, nome);
                } else {
                    PanelLoginPage.this.alertLogInFallito();
                }

            }
        });
        GoHome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PanelLoginPage.this.controller.GoToHome(PanelLoginPage.this);
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
