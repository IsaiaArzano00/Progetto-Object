package GUI;

import Components.PanelCustomBlue;
import Components.PanelHome;
import Components.PanelRegister;
import Components.PanelSceltaHome;
import Controller.Controllore;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
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

    public Home(Controllore contr) {
    	controller = contr;
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.contentPane);
       contentPane.setLayout(null);
        
        JPanel panel_foto = new JPanel();
        panel_foto.setBounds(450, 0, 450, 550);
        contentPane.add(panel_foto);
        panel_foto.setLayout(null);
        
        PanelHome Home = new PanelHome();
        Home.setBounds(0, 0, 450, 550);
        panel_foto.add(Home);
        
        JPanel panel_home_reset = new JPanel();
        panel_home_reset.setBounds(0, 0, 450, 513);
        contentPane.add(panel_home_reset);
        panel_home_reset.setLayout(null);
        
        PanelSceltaHome panel = new PanelSceltaHome(controller);
        panel.setBounds(0, 0, 450, 513);
        panel_home_reset.add(panel);
        panel.setLayout(null);
        
        
        setVisible(true);
       
    }
}
