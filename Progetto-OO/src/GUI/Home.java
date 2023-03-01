package GUI;

import Components.PanelCustomBlue;
import Components.PanelHome;
import Components.PanelRegister;
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
       
        PanelCustomBlue panel_scelta = new PanelCustomBlue();
        panel_scelta.setBounds(0, 0, 450, 550);
        contentPane.add(panel_scelta);
        panel_scelta.setLayout(null);
        
        JTextArea txtrBenvenutoNelSoftware = new JTextArea();
        txtrBenvenutoNelSoftware.setEditable(false);
        txtrBenvenutoNelSoftware.setForeground(new Color(255, 255, 255));
        txtrBenvenutoNelSoftware.setFont(new Font("SansSerif", 1, 12));
        txtrBenvenutoNelSoftware.setText("Benvenuto nel Software per la gestione dei Centri di Recupero per\r\n Tartarughe Marine.\r\n\r\nSi prega di effettuare l'accesso oppure di registrarsi per \r\naccedere all'area personale.");
        txtrBenvenutoNelSoftware.setBounds(10, 82, 430, 122);
        panel_scelta.add(txtrBenvenutoNelSoftware);
        txtrBenvenutoNelSoftware.setOpaque(false);
        
        JLabel lblNewLabel = new JLabel("Centro di Recupero Tartarughe Marine");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 1, 20));
        lblNewLabel.setBounds(36, 10, 378, 94);
        panel_scelta.add(lblNewLabel);
        
        JPanel panel_foto = new JPanel();
        panel_foto.setBounds(450, 0, 450, 550);
        contentPane.add(panel_foto);
        panel_foto.setLayout(null);
        
        PanelHome Home = new PanelHome();
        Home.setBounds(0, 0, 450, 550);
        panel_foto.add(Home);
        setVisible(true);
        
        JButton LOGIN = new JButton("LOGIN");
        
        LOGIN.setFont(new Font("SansSerif", 1, 24));
        LOGIN.setBounds(74, 233, 291, 64);
        panel_scelta.add(LOGIN);
        JButton REGISTRATI = new JButton("REGISTRATI");
      
        REGISTRATI.setFont(new Font("SansSerif", 1, 24));
        REGISTRATI.setBounds(74, 334, 291, 64);
        panel_scelta.add(REGISTRATI);
        
        //LISTENER
        LOGIN.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                controller.SetLoginPage( panel_foto,panel_scelta);
            }
        });
        
        REGISTRATI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                controller.SetRegistrerPage(panel_foto,panel_scelta);
            }
        });
    }
}
