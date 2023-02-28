package Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Controllore;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class PanelCartellaMedica extends JPanel {

	 private Controllore controller;

	    public PanelCartellaMedica(Controllore contr) {
	       controller = contr;
	       
	       setLayout(null);
	       
	        JPanel panel = new JPanel();
	        panel.setBounds(0, 0, 1346, 728);
	        add(panel);
	        panel.setLayout(null);
	        
	        PanelCustomWhite sfondo = new PanelCustomWhite();
	        sfondo.setBounds(0, 0, 1001, 675);
	        panel.add(sfondo);
	        sfondo.setLayout(null);
	        
	        PanelCustomBlue panel_aggiungi = new PanelCustomBlue();
	        panel_aggiungi.setBounds(538, 44, 350, 250);
	        sfondo.add(panel_aggiungi);
	        panel_aggiungi.setLayout(null);
	        
	        JLabel lblAggiungiCartella = new JLabel("<html> AGGIUNGI CARTELLA <br>MEDICA</html>\r\n");
	        lblAggiungiCartella.setFont(new Font("SansSerif", 1, 18));
	        lblAggiungiCartella.setForeground(new Color(255, 255, 255));
	        lblAggiungiCartella.setBounds(52, 10, 222, 50);
	        panel_aggiungi.add(lblAggiungiCartella);
	        
	        JLabel tasto_AggiungiCartella = new JLabel("");
	        tasto_AggiungiCartella.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		controller.VisualizzazioneTartarughePage(1);
	        	}
	        });
	        tasto_AggiungiCartella.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/add_100px.png")));
	        tasto_AggiungiCartella.setBounds(114, 70, 117, 126);
	        panel_aggiungi.add(tasto_AggiungiCartella);
	        
	        PanelCustomBlue panel_rimuovi = new PanelCustomBlue();
	        panel_rimuovi.setLayout(null);
	        panel_rimuovi.setBounds(76, 339, 350, 250);
	        sfondo.add(panel_rimuovi);
	        JLabel lblRimuoviCartella = new JLabel("<html> RIMUOVI CARTELLA <br>MEDICA</html>\r\n");
	        lblRimuoviCartella.setHorizontalAlignment(SwingConstants.CENTER);
	        lblRimuoviCartella.setForeground(Color.WHITE);
	        lblRimuoviCartella.setFont(new Font("SansSerif", 1, 18));
	        lblRimuoviCartella.setBounds(78, 10, 222, 50);
	        panel_rimuovi.add(lblRimuoviCartella);
	        
	        JLabel tasto_RimuoviCartella = new JLabel("");
	        tasto_RimuoviCartella.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		controller.VisualizzazioneTartarughePage(3);
	        	}
	        });
	        tasto_RimuoviCartella.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/remove_100px.png")));
	        tasto_RimuoviCartella.setBounds(128, 70, 117, 126);
	        panel_rimuovi.add(tasto_RimuoviCartella);
	        
	        PanelCustomBlue panel_modifica = new PanelCustomBlue();
	        panel_modifica.setLayout(null);
	        panel_modifica.setBounds(538, 339, 350, 250);
	        sfondo.add(panel_modifica);
	        
	        JLabel lblModificaCartellaMedica = new JLabel("<html>VISUALIZZA E MODIFICA <br>CARTELLA  MEDICA</html>\r\n");
	        lblModificaCartellaMedica.setForeground(Color.WHITE);
	        lblModificaCartellaMedica.setFont(new Font("SansSerif", 1, 18));
	        lblModificaCartellaMedica.setBounds(86, 10, 222, 50);
	        panel_modifica.add(lblModificaCartellaMedica);
	        
	        JLabel tasto_ModificaCartella = new JLabel("");
	        tasto_ModificaCartella.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		controller.VisualizzazioneTartarughePage(2);
	        	}
	        });
	        tasto_ModificaCartella.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/change_100px.png")));
	        tasto_ModificaCartella.setBounds(133, 70, 117, 126);
	        panel_modifica.add(tasto_ModificaCartella);
	    }
}
