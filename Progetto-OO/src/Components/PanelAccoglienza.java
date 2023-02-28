package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Controller.Controllore;
import GUI.InserimentoTarghetta;
import GUI.InserimentoTartarugaPrima;
import GUI.InserimentoTartarugaRiammissione;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelAccoglienza extends JPanel {
	private Controllore controller;
	/**
	 * Create the panel.
	 */
	public PanelAccoglienza(Controllore contr) {
		controller=contr;
		
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
        
        PanelCustomBlue panel_riammissione = new PanelCustomBlue();
        panel_riammissione.setLayout(null);
        panel_riammissione.setBounds(10, 339, 350, 250);
        sfondo.add(panel_riammissione);
        
        JLabel lblNewLabel_5 = new JLabel("RIAMMISSIONE TARTARUGA");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_5.setBounds(55, 10, 330, 50);
        panel_riammissione.add(lblNewLabel_5);
        
        JLabel Riammissione = new JLabel("");
       
        Riammissione.setIcon(new ImageIcon(PanelAccoglienza.class.getResource("/Media/add_100px.png")));
        Riammissione.setBounds(104, 63, 246, 144);
        panel_riammissione.add(Riammissione);
        
        PanelCustomBlue panel_primo_ingresso = new PanelCustomBlue();
        panel_primo_ingresso.setLayout((LayoutManager)null);
        panel_primo_ingresso.setBounds(538, 25, 350, 250);
        sfondo.add(panel_primo_ingresso);
        panel_primo_ingresso.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("PRIMO INGRESSO\r\n");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_3.setBounds(101, 10, 330, 51);
        panel_primo_ingresso.add(lblNewLabel_3);
        
        JLabel PrimoIngresso = new JLabel("");
        PrimoIngresso.setIcon(new ImageIcon(PanelAccoglienza.class.getResource("/Media/add_100px.png")));
        PrimoIngresso.setBounds(137, 71, 169, 132);
        panel_primo_ingresso.add(PrimoIngresso);
        
        PanelCustomBlue panel_targhetta = new PanelCustomBlue();
        panel_targhetta.setLayout(null);
        panel_targhetta.setBounds(538, 339, 350, 250);
        sfondo.add(panel_targhetta);
        
        JLabel lblNewLabel_7 = new JLabel("AGGIUNGI TARGHETTA ");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_7.setBounds(55, 10, 330, 51);
        panel_targhetta.add(lblNewLabel_7);
        
        JLabel AggiungiTarghetta = new JLabel("");
        AggiungiTarghetta.setIcon(new ImageIcon(PanelAccoglienza.class.getResource("/Media/add_100px.png")));
        AggiungiTarghetta.setBounds(119, 86, 154, 107);
        panel_targhetta.add(AggiungiTarghetta);
        
        JLabel lblNewLabel = new JLabel("GESTIONE DELL'AMMISSIONE DELLE TARTARUGHE");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel.setBounds(10, 25, 457, 50);
        sfondo.add(lblNewLabel);
        
        JTextArea txtInfo = new JTextArea();
        txtInfo.setFont(new Font("SansSerif", Font.BOLD, 13));
        txtInfo.setText("In questa schermata è possibile : \r\n\r\n     -Effettuare la prima ammissione per le tartarughe\r\n       mai accolte precedentemente\r\n     -Riammettere le tartarughe già dotate di targhetta\r\n        metallica \r\n     -Aggiungere la targhetta metallica alle tartarughe ");
        txtInfo.setBounds(10, 65, 414, 134);
        txtInfo.setOpaque(false);
        txtInfo.setBorder(null);
        txtInfo.setEditable(false);
        sfondo.add(txtInfo);
        
        //LISTENER
        Riammissione.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		InserimentoTartarugaRiammissione insertturtle=new InserimentoTartarugaRiammissione(controller);
        		insertturtle.setVisible(true);
        	}
        });
        
        PrimoIngresso.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		InserimentoTartarugaPrima insertturtle=new InserimentoTartarugaPrima(controller);
        		insertturtle.setVisible(true);
        	}
        });
        
        AggiungiTarghetta.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		InserimentoTarghetta insert_targhetta=new InserimentoTarghetta(controller);
        		insert_targhetta.setVisible(true);
        	}
        });
	}

}
