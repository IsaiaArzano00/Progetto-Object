package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Controller.Controllore;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class PanelCartellaMedica extends JPanel {
	private Controllore controller;
	/**
	 * Create the panel.
	 */
	public PanelCartellaMedica(Controllore contr) {
controller = contr;
        
        setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1346, 728);
        add(panel);
        panel.setLayout(null);
        
        PanelCustomWhite sfondo = new PanelCustomWhite();
        sfondo.setForeground(new Color(0, 0, 0));
        sfondo.setBounds(0, 0, 1001, 674);
        panel.add(sfondo);
        
        sfondo.setLayout(null);
        
        PanelCustomBlue panel_visualizza = new PanelCustomBlue();
        panel_visualizza.setLayout(null);
        panel_visualizza.setBounds(10, 339, 350, 250);
        sfondo.add(panel_visualizza);
        
        JLabel lblNewLabel_5 = new JLabel("MODIFICA CARTELLA MEDICA");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_5.setBounds(32, 10, 330, 50);
        panel_visualizza.add(lblNewLabel_5);
        
        JLabel VisualizzaPersonale = new JLabel("");
       
        VisualizzaPersonale.setIcon(new ImageIcon(PanelCartellaMedica.class.getResource("/Media/Medical History_100px.png")));
        VisualizzaPersonale.setBounds(104, 63, 246, 144);
        panel_visualizza.add(VisualizzaPersonale);
        
        PanelCustomBlue panel_inserisci = new PanelCustomBlue();
        panel_inserisci.setLayout((LayoutManager)null);
        panel_inserisci.setBounds(538, 25, 350, 250);
        sfondo.add(panel_inserisci);
        panel_inserisci.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("INSERISCI CARTELLA MEDICA");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_3.setBounds(35, 10, 330, 51);
        panel_inserisci.add(lblNewLabel_3);
        
        JLabel InserisciCartellaMedica = new JLabel("");
        
        InserisciCartellaMedica.setIcon(new ImageIcon(PanelCartellaMedica.class.getResource("/Media/Medical History_100px.png")));
        InserisciCartellaMedica.setBounds(137, 71, 169, 132);
        panel_inserisci.add(InserisciCartellaMedica);
        
        PanelCustomBlue panel_rimuovi = new PanelCustomBlue();
        panel_rimuovi.setLayout(null);
        panel_rimuovi.setBounds(538, 339, 350, 250);
        sfondo.add(panel_rimuovi);
        
        JLabel lblNewLabel_7 = new JLabel("ELIMINA CARTELLA MEDICA");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_7.setBounds(55, 10, 330, 51);
        panel_rimuovi.add(lblNewLabel_7);
        
        JLabel Elimina_CartellaMedica = new JLabel("");
       
        Elimina_CartellaMedica.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/delete_80px.png")));
        Elimina_CartellaMedica.setBounds(119, 86, 154, 107);
        panel_rimuovi.add(Elimina_CartellaMedica);
        
        JLabel lblNewLabel = new JLabel("GESTIONE DELLE CARTELLE MEDICHE");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel.setBounds(10, 25, 414, 50);
        sfondo.add(lblNewLabel);
        
        JTextArea txtInfo = new JTextArea();
        txtInfo.setFont(new Font("SansSerif", Font.BOLD, 13));
        txtInfo.setText("In questa schermata è possibile : \r\n     -Aggiungere una nuova cartella medica\r\n     -Modificare i dati di una cartella medica precedentemente\r\n       inserita.\r\n     -Rimuovere una cartella medica");
        txtInfo.setBounds(10, 65, 414, 107);
        txtInfo.setOpaque(false);
        txtInfo.setBorder(null);
        txtInfo.setEditable(false);
        sfondo.add(txtInfo);
        
        //LISTENER
        InserisciCartellaMedica.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		InserimentoCartellaMedica insertcartella = new InserimentoCartellaMedica(controller);
        		insertcartella.setVisible(true);
        	}
        });
        VisualizzaPersonale.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ModificaCartellaMedica modifyCartella = new ModificaCartellaMedica(controller);
        		modifyCartella.setVisible(true);
        	}
        });
        Elimina_CartellaMedica.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		EliminaCartellaMedica deletecartella = new EliminaCartellaMedica(controller);
        		deletecartella.setVisible(true);
        	}
        });

	}

}
