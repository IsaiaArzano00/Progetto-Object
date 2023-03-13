package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Controller.Controllore;

public class PanelSceltaHome extends JPanel {
	private Controllore controller;
	private JPanel contentPane;
	/**
	 * Create the panel.
	 */
	public PanelSceltaHome(Controllore contr) {
		controller=contr;
		setVisible(true);
        setLayout(null);
       
        PanelCustomBlue panel_scelta = new PanelCustomBlue();
        panel_scelta.setBounds(0, 0, 450, 550);
        add(panel_scelta);
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
        
        
        JButton LOGIN = new JButton("LOGIN");
        
        LOGIN.setFont(new Font("SansSerif", 1, 24));
        LOGIN.setBounds(74, 233, 291, 64);
        panel_scelta.add(LOGIN);
        JButton REGISTRATI = new JButton("REGISTRATI");
      
        REGISTRATI.setFont(new Font("SansSerif", 1, 24));
        REGISTRATI.setBounds(74, 334, 291, 64);
        panel_scelta.add(REGISTRATI);
        
        LOGIN.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	PanelLoginPage panellogin = new PanelLoginPage(controller,panel_scelta);
            	panellogin.setBounds(0,0,450,550);
            	controller.SetHomePage(panel_scelta, panellogin);
            }
        });
        
        REGISTRATI.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	PanelRegister panelregister = new PanelRegister(controller);
            	panelregister.setBounds(0,0,450,550);
                controller.SetHomePage(panel_scelta, panelregister);
            }
        });
		
        
	}

}
