package Components;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import Controller.Controllore;

import java.awt.Font;

public class HomeDashBoard extends JPanel {

	
	private Controllore controller;
	
	public HomeDashBoard(Controllore contr) {
		controller = contr;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1167, 728);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_infocentro = new JPanel();
		panel_infocentro.setBackground(new Color(0,0,0,120));
		panel_infocentro.setBounds(10, 467, 254, 188);
		panel.add(panel_infocentro);
		panel_infocentro.setLayout(null);
		
		JTextArea TxtNumCentri = new JTextArea();
		TxtNumCentri.setEditable(false);
		TxtNumCentri.setFont(new Font("SansSerif", Font.BOLD, 27));
		TxtNumCentri.setForeground(new Color(255, 255, 255));
		TxtNumCentri.setText("NUMERO CENTRI \r\nIN ITALIA : ");
		TxtNumCentri.setBounds(10, 10, 234, 96);
		TxtNumCentri.setOpaque(false);
		TxtNumCentri.setBorder(null);
		panel_infocentro.add(TxtNumCentri);
		
		JTextArea TxtNumCentriNumber = new JTextArea();
		TxtNumCentriNumber.setEditable(false);
		TxtNumCentriNumber.setOpaque(false);
		TxtNumCentriNumber.setForeground(Color.WHITE);
		TxtNumCentriNumber.setFont(new Font("SansSerif", Font.BOLD, 62));
		TxtNumCentriNumber.setBorder(null);
		TxtNumCentriNumber.setBounds(103, 91, 55, 67);
		TxtNumCentriNumber.setText(controller.NumeroCentri());
		panel_infocentro.add(TxtNumCentriNumber);
		
		JPanel panel_infoturtle = new JPanel();
		panel_infoturtle.setBounds(349, 467, 254, 188);
		panel_infoturtle.setBackground(new Color(0,0,0,120));
		panel.add(panel_infoturtle);
		panel_infoturtle.setLayout(null);
		
		JTextArea txtTurtle = new JTextArea();
		txtTurtle.setText("TARTARUGHE\r\nACCOLTE :\r\n");
		txtTurtle.setOpaque(false);
		txtTurtle.setForeground(Color.WHITE);
		txtTurtle.setFont(new Font("SansSerif", Font.BOLD, 27));
		txtTurtle.setEditable(false);
		txtTurtle.setBorder(null);
		txtTurtle.setBounds(10, 10, 234, 96);
		panel_infoturtle.add(txtTurtle);
		
		JTextArea TxtTurtleNumber = new JTextArea();
		TxtTurtleNumber.setText("8");
		TxtTurtleNumber.setOpaque(false);
		TxtTurtleNumber.setForeground(Color.WHITE);
		TxtTurtleNumber.setFont(new Font("SansSerif", Font.BOLD, 62));
		TxtTurtleNumber.setEditable(false);
		TxtTurtleNumber.setBorder(null);
		TxtTurtleNumber.setBounds(103, 91, 97, 67);
		TxtTurtleNumber.setText(controller.NumeroTartarugheAccolte());
		panel_infoturtle.add(TxtTurtleNumber);
		
		JPanel panel_infoVolontari = new JPanel();
		panel_infoVolontari.setBackground(new Color(0,0,0,120));
		panel_infoVolontari.setBounds(698, 467, 254, 188);
		panel.add(panel_infoVolontari);
		panel_infoVolontari.setLayout(null);
		
		JTextArea txtrINostriVolontari = new JTextArea();
		txtrINostriVolontari.setText("I NOSTRI\r\nVOLONTARI : ");
		txtrINostriVolontari.setOpaque(false);
		txtrINostriVolontari.setForeground(Color.WHITE);
		txtrINostriVolontari.setFont(new Font("SansSerif", Font.BOLD, 27));
		txtrINostriVolontari.setEditable(false);
		txtrINostriVolontari.setBorder(null);
		txtrINostriVolontari.setBounds(10, 10, 234, 96);
		panel_infoVolontari.add(txtrINostriVolontari);
		
		JTextArea TxtVolontariNumber = new JTextArea();
		TxtVolontariNumber.setOpaque(false);
		TxtVolontariNumber.setForeground(Color.WHITE);
		TxtVolontariNumber.setFont(new Font("SansSerif", Font.BOLD, 62));
		TxtVolontariNumber.setEditable(false);
		TxtVolontariNumber.setBorder(null);
		TxtVolontariNumber.setBounds(80, 91, 128, 67);
		TxtVolontariNumber.setText(controller.NumeroVolontari());
		panel_infoVolontari.add(TxtVolontariNumber);
		
		JPanel panel_titolo = new JPanel();
		panel_titolo.setLayout(null);
		panel_titolo.setBackground(new Color(0, 0, 0, 120));
		panel_titolo.setBounds(10, 10, 1070, 89);
		panel.add(panel_titolo);
		
		JLabel lblNewLabel_1 = new JLabel("GESTIONE CENTRI DI RECUPERO PER TARTARUGHE MARINE");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 10, 922, 69);
		panel_titolo.add(lblNewLabel_1);
		
		JPanel panel_descrizione = new JPanel();
		panel_descrizione.setLayout(null);
		panel_descrizione.setBackground(new Color(0, 0, 0, 120));
		panel_descrizione.setBounds(10, 98, 254, 215);
		panel.add(panel_descrizione);
		
		JTextArea txtDescrizione = new JTextArea();
		txtDescrizione.setForeground(new Color(255, 255, 255));
		txtDescrizione.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtDescrizione.setText("Benvenuto/a nel software per la gestione\r\ndei Centri di recupero per tartarughe \r\nmarine.\r\nUtilizza il pannello a sinistra per gestire\r\nle funzionalità del centro.\r\n\r\nQuesto software nasce per poter\r\naiutare l'utente nella piena gestione\r\ndi un Centro.\r\nE' possibile aggiungere , modificare \r\ned eliminare qualsiasi aspetto di \r\nun Centro.\r\n");
		txtDescrizione.setBounds(10, 10, 234, 251);
		txtDescrizione.setOpaque(false);
		txtDescrizione.setBorder(null);
		panel_descrizione.add(txtDescrizione);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(HomeDashBoard.class.getResource("/Media/Original_WW1119338-scaled (1).png")));
		lblNewLabel.setBounds(0, 0, 1168, 728);
		panel.add(lblNewLabel);
		

	}
}
