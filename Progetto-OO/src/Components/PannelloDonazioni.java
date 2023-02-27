package Components;

import Controller.Controllore;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannelloDonazioni extends JPanel {
    private Controllore controller;

    public PannelloDonazioni(Controllore contr) {
       controller = contr;
       
       setLayout(null);
       
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1346, 728);
        add(panel);
        panel.setLayout(null);
        
        PanelCustomWhite sfondo = new PanelCustomWhite();
        sfondo.setBounds(0, 0, 1001, 674);
        panel.add(sfondo);
        sfondo.setLayout(null);
        
        PanelCustomBlue panel_aggiungi = new PanelCustomBlue();
        panel_aggiungi.setBounds(10, 25, 350, 250);
        sfondo.add(panel_aggiungi);
        panel_aggiungi.setLayout(null);
        
        JLabel label_AggiungiDonazione = new JLabel("AGGIUNGI DONAZIONE\r\n");
        label_AggiungiDonazione.setFont(new Font("SansSerif", 1, 18));
        label_AggiungiDonazione.setForeground(new Color(255, 255, 255));
        label_AggiungiDonazione.setBounds(52, 10, 222, 50);
        panel_aggiungi.add(label_AggiungiDonazione);
        
        JLabel tasto_AggiungiDonazione = new JLabel("");
        tasto_AggiungiDonazione.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/add_100px.png")));
        tasto_AggiungiDonazione.setBounds(114, 70, 117, 126);
        panel_aggiungi.add(tasto_AggiungiDonazione);
        
        PanelCustomBlue panel_lista = new PanelCustomBlue();
        panel_lista.setLayout(null);
        panel_lista.setBounds(10, 339, 350, 250);
        sfondo.add(panel_lista);
        
        JLabel lblListaDonazioni = new JLabel("LISTA DONAZIONI");
        lblListaDonazioni.setForeground(Color.WHITE);
        lblListaDonazioni.setFont(new Font("SansSerif", 1, 18));
        lblListaDonazioni.setBounds(56, 10, 222, 50);
        panel_lista.add(lblListaDonazioni);
        
        JLabel tasto_ListaDonazioni = new JLabel("");
        tasto_ListaDonazioni.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/search_100px.png")));
        tasto_ListaDonazioni.setBounds(105, 69, 117, 126);
        panel_lista.add(tasto_ListaDonazioni);
        
        PanelCustomBlue panel_rimuovi = new PanelCustomBlue();
        panel_rimuovi.setLayout(null);
        panel_rimuovi.setBounds(538, 25, 350, 250);
        sfondo.add(panel_rimuovi);
        JLabel lblRimuoviDonazione = new JLabel("RIMUOVI DONAZIONE\r\n");
        lblRimuoviDonazione.setForeground(Color.WHITE);
        lblRimuoviDonazione.setFont(new Font("SansSerif", 1, 18));
        lblRimuoviDonazione.setBounds(78, 10, 222, 50);
        panel_rimuovi.add(lblRimuoviDonazione);
        
        JLabel tasto_RimuoviDonazione = new JLabel("");
        tasto_RimuoviDonazione.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/remove_100px.png")));
        tasto_RimuoviDonazione.setBounds(128, 70, 117, 126);
        panel_rimuovi.add(tasto_RimuoviDonazione);
        
        PanelCustomBlue panel_modifica = new PanelCustomBlue();
        panel_modifica.setLayout(null);
        panel_modifica.setBounds(538, 339, 350, 250);
        sfondo.add(panel_modifica);
        
        JLabel label_ModificaDonazioni = new JLabel("MODIFICA DONAZIONI\r\n");
        label_ModificaDonazioni.setForeground(Color.WHITE);
        label_ModificaDonazioni.setFont(new Font("SansSerif", 1, 18));
        label_ModificaDonazioni.setBounds(86, 10, 222, 50);
        panel_modifica.add(label_ModificaDonazioni);
        
        JLabel tasto_ModificaDonazione = new JLabel("");
        tasto_ModificaDonazione.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/change_100px.png")));
        tasto_ModificaDonazione.setBounds(133, 70, 117, 126);
        panel_modifica.add(tasto_ModificaDonazione);
        
        //LISTENER
        tasto_AggiungiDonazione.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                controller.InserimentoDonazionePage();
            }
        });
        tasto_RimuoviDonazione.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                controller.RimozioneDonazionePage();
            }
        });
        tasto_ListaDonazioni.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                controller.ListaDonazioniPage();
            }
        });
        tasto_ModificaDonazione.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                controller.ModificaDonazioniPage();
            }
        });
    }
}
