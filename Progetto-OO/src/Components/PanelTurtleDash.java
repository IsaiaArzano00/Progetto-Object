package Components;

import javax.swing.JPanel;
import Components.*;
import Controller.Controllore;
import GUI.InserimentoTartarugaRiammissione;
import GUI.MorteTurtle;
import GUI.RilascioTartaruga;
import GUI.RimuoviTurtle;
import GUI.ViewTartarughe;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class PanelTurtleDash extends JPanel {
	private Controllore controller;
	/**
	 * Create the panel.
	 */
	public PanelTurtleDash(Controllore contr) {
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
		
		PanelCustomBlue panel_rimuovi = new PanelCustomBlue();
		panel_rimuovi.setBounds(10, 468, 222, 157);
		sfondo.add(panel_rimuovi);
		panel_rimuovi.setLayout(null);
		
		JLabel Delete_Turtle = new JLabel("");
	
		Delete_Turtle.setIcon(new ImageIcon(PanelTurtleDash.class.getResource("/Media/remove__c_100px.png")));
		Delete_Turtle.setBounds(56, 43, 156, 126);
		panel_rimuovi.add(Delete_Turtle);
		
		JLabel lblNewLabel = new JLabel("RIMUOVI TARTARUGA");
		lblNewLabel.setBounds(10, 10, 222, 50);
		panel_rimuovi.add(lblNewLabel);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		PanelCustomBlue panel_rilascio = new PanelCustomBlue();
		panel_rilascio.setLayout(null);
		panel_rilascio.setBounds(714, 468, 235, 157);
		sfondo.add(panel_rilascio);
		
		JLabel lblRimuoviTartaruga = new JLabel("RILASCIO TARTARUGA\r\n");
		lblRimuoviTartaruga.setForeground(Color.WHITE);
		lblRimuoviTartaruga.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblRimuoviTartaruga.setBounds(10, 10, 222, 50);
		panel_rilascio.add(lblRimuoviTartaruga);
		
		JLabel RilasciaTurtle = new JLabel("");
		
		RilasciaTurtle.setIcon(new ImageIcon(PanelTurtleDash.class.getResource("/Media/wave_lines_100px.png")));
		RilasciaTurtle.setBounds(58, 46, 117, 126);
		panel_rilascio.add(RilasciaTurtle);
		
		PanelCustomBlue panel_morte = new PanelCustomBlue();
		panel_morte.setLayout(null);
		panel_morte.setBounds(357, 468, 222, 157);
		sfondo.add(panel_morte);
		
		JLabel lblModificaTartaruga = new JLabel("MORTE TARTARUGA ");
		lblModificaTartaruga.setForeground(Color.WHITE);
		lblModificaTartaruga.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblModificaTartaruga.setBounds(10, 10, 222, 50);
		panel_morte.add(lblModificaTartaruga);
		
		JLabel Morte_Turtle = new JLabel("");
		
		Morte_Turtle.setIcon(new ImageIcon(PanelTurtleDash.class.getResource("/Media/cemetery_100px.png")));
		Morte_Turtle.setBounds(63, 31, 117, 126);
		panel_morte.add(Morte_Turtle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(10, 10, 991, 432);
		sfondo.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel sfondo_1 = new JPanel();
		sfondo_1.setLayout(null);
		sfondo_1.setBounds(0, 96, 991, 336);
		panel_1.add(sfondo_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(401, 65, 367, 21);
		panel_1.add(scrollPane_1);
		
		JComboBox<String> comboBoxCentro = new JComboBox<String>();
		scrollPane_1.setRowHeaderView(comboBoxCentro);
		
		JTextArea Spiegazione_1 = new JTextArea();
		Spiegazione_1.setBounds(10, 48, 456, 45);
		panel_1.add(Spiegazione_1);
		Spiegazione_1.setText("Si prega di inserire  il centro.\r\nVerrà visualizzata la lista delle tartarughe nel centro scelto.");
		Spiegazione_1.setOpaque(false);
		Spiegazione_1.setForeground(Color.WHITE);
		Spiegazione_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		Spiegazione_1.setEditable(false);
		
		JLabel Search_1 = new JLabel("");
		Search_1.setIcon(new ImageIcon(PanelTurtleDash.class.getResource("/Media/search_28px.png")));
		Search_1.setBounds(792, 52, 46, 34);
		panel_1.add(Search_1);
		
		JLabel lblNewLabel_1 = new JLabel("GESTIONE TARTARUGHE \r\n");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 10, 456, 45);
		panel_1.add(lblNewLabel_1);
		
		PanelCustomGrey panel_2 = new PanelCustomGrey();
		panel_2.setBounds(10, 10, 991, 97);
		sfondo.add(panel_2);
		panel_2.setLayout(null);
		
		//AGGIUNGI CENTRI A COMBO BOX
		for(int i=0 ; i<controller.getNomeCentri().size();i++) {
			comboBoxCentro.addItem(controller.getNomeCentri().get(i).toString());
		}
		comboBoxCentro.addItem(new String ("Tutti i Centri"));
		
		
		Search_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String centro = (String)comboBoxCentro.getSelectedItem();
				controller.VisualizzaTurtle(centro, sfondo_1);
				}
		});
		Delete_Turtle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RimuoviTurtle deletetartaruga = new RimuoviTurtle(controller);
				deletetartaruga.setVisible(true);
			}
		});
		
		RilasciaTurtle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RilascioTartaruga releaseturtle = new RilascioTartaruga(controller);
				releaseturtle.setVisible(true);
			}
		});
		
		Morte_Turtle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MorteTurtle mortetartaruga = new MorteTurtle(controller);
				mortetartaruga.setVisible(true);
				
			}
		});
	}
}
