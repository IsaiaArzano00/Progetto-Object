package Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Controller.Controllore;
import GUI.InserimentoCibo;
import GUI.InserimentoVisita;
import GUI.ViewVisite;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelDegenza extends JPanel {
	private Controllore controller;
	/**
	 * Create the panel.
	 */
	public PanelDegenza(Controllore contr) {
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
		
		PanelCustomBlue panel_1_1 = new PanelCustomBlue();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 339, 350, 250);
		sfondo.add(panel_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("VISUALIZZA VISITE");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_5.setBounds(76, 10, 330, 50);
		panel_1_1.add(lblNewLabel_5);
		
		JLabel VisualizzaVisite = new JLabel("");
		
	
		VisualizzaVisite.setIcon(new ImageIcon(PanelDegenza.class.getResource("/Media/ecg__c100px.png")));
		VisualizzaVisite.setBounds(104, 63, 246, 144);
		panel_1_1.add(VisualizzaVisite);
		
		PanelCustomBlue panel_1_2 = new PanelCustomBlue();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(538, 25, 350, 250);
		sfondo.add(panel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUOVA VISITA\r\n");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setBounds(121, 10, 330, 51);
		panel_1_2.add(lblNewLabel_3);
		
		JLabel NuovaVisita = new JLabel("");
	
		
		NuovaVisita.setIcon(new ImageIcon(PanelDegenza.class.getResource("/Media/medical_bag_c_100px.png")));
		NuovaVisita.setBounds(137, 71, 169, 132);
		panel_1_2.add(NuovaVisita);
		
		PanelCustomBlue panel_1_3 = new PanelCustomBlue();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(538, 339, 350, 250);
		sfondo.add(panel_1_3);
		
		JLabel lblNewLabel_7 = new JLabel("GESTIONE VASCA");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7.setBounds(82, 10, 330, 51);
		panel_1_3.add(lblNewLabel_7);
		
		JLabel CiboVasca = new JLabel("");
		
		CiboVasca.setIcon(new ImageIcon(PanelDegenza.class.getResource("/Media/shrimp_and_lobster_100px.png")));
		CiboVasca.setBounds(119, 86, 154, 107);
		panel_1_3.add(CiboVasca);
		
		JTextArea txtInfo = new JTextArea();
		txtInfo.setFont(new Font("SansSerif", Font.BOLD, 14));
		txtInfo.setText("In questa pagina è possibile :\r\n    -Aggiungere un nuovo controllo medico fatto alla tartaruga\r\n    -Visualizzare tutti i controlli medici ricevuti da una tartaruga\r\n    -Gestire il cibo che viene versato quotidianamente in vasca\r\n");
		txtInfo.setBounds(10, 85, 458, 99);
		txtInfo.setOpaque(false);
		sfondo.add(txtInfo);
		
		JLabel lblNewLabel = new JLabel("DEGENZA TARTARUGHE");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 20, 458, 55);
		sfondo.add(lblNewLabel);
		
		
		//ACTION 
		NuovaVisita.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.InserimentoVisitaPage();
			}
		});
		
		VisualizzaVisite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewVisite visite = new ViewVisite(controller);
				visite.setVisible(true);
				
			}
		});
		CiboVasca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.InserimentoCiboPage();
			}
		});
	}

}
