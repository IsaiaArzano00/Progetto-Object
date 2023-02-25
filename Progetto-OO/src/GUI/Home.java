//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GUI;

import Components.PanelCustomBlue;
import Components.PanelHome;
import Components.PanelRegister;
import Controller.Controllore;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {
    private Controllore controller;
    private PanelCustomBlue BluePanel;
    private PanelRegister Register;
    private JPanel contentPane;
    private JPanel PanelAccess;

    public Home(Controllore contr) {
        this.controller = contr;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 900, 550);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        final PanelCustomBlue panel = new PanelCustomBlue();
        panel.setBounds(0, 0, 450, 550);
        this.contentPane.add(panel);
        panel.setLayout((LayoutManager)null);
        JTextArea txtrBenvenutoNelSoftware = new JTextArea();
        txtrBenvenutoNelSoftware.setEditable(false);
        txtrBenvenutoNelSoftware.setForeground(new Color(255, 255, 255));
        txtrBenvenutoNelSoftware.setFont(new Font("SansSerif", 1, 12));
        txtrBenvenutoNelSoftware.setText("Benvenuto nel Software per la gestione dei Centri di Recupero per\r\n Tartarughe Marine.\r\n\r\nSi prega di effettuare l'accesso oppure di registrarsi per \r\naccedere all'area personale.");
        txtrBenvenutoNelSoftware.setBounds(10, 82, 430, 122);
        panel.add(txtrBenvenutoNelSoftware);
        txtrBenvenutoNelSoftware.setOpaque(false);
        JLabel lblNewLabel = new JLabel("Centro di Recupero Tartarughe Marine");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 1, 20));
        lblNewLabel.setBounds(36, 10, 378, 94);
        panel.add(lblNewLabel);
        final JPanel panel_1 = new JPanel();
        panel_1.setBounds(450, 0, 450, 550);
        this.contentPane.add(panel_1);
        panel_1.setLayout((LayoutManager)null);
        PanelHome Home = new PanelHome();
        Home.setBounds(0, 0, 450, 550);
        panel_1.add(Home);
        this.setVisible(true);
        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Home.this.controller.SetLoginPage(panel, panel_1);
            }
        });
        btnNewButton.setFont(new Font("SansSerif", 1, 24));
        btnNewButton.setBounds(74, 233, 291, 64);
        panel.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("REGISTRATI");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Home.this.controller.SetRegistrerPage(panel, panel_1);
            }
        });
        btnNewButton_1.setFont(new Font("SansSerif", 1, 24));
        btnNewButton_1.setBounds(74, 334, 291, 64);
        panel.add(btnNewButton_1);
    }
}
