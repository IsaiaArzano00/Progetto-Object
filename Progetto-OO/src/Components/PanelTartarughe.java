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

public class PanelTartarughe extends JPanel {
	private Controllore controller;
	/**
	 * Create the panel.
	 */
	public PanelTartarughe(Controllore contr) {
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
		panel_rimuovi.setBounds(10, 25, 350, 250);
		sfondo.add(panel_rimuovi);
		panel_rimuovi.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RIMUOVI TARTARUGA");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(52, 10, 222, 50);
		panel_rimuovi.add(lblNewLabel);
		
		JLabel Delete_Turtle = new JLabel("");
	
		Delete_Turtle.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/delete_80px.png")));
		Delete_Turtle.setBounds(114, 70, 117, 126);
		panel_rimuovi.add(Delete_Turtle);
		
		PanelCustomBlue panel_lista = new PanelCustomBlue();
		panel_lista.setLayout(null);
		panel_lista.setBounds(10, 339, 350, 250);
		sfondo.add(panel_lista);
		
		JLabel lblListaTartarughe = new JLabel("LISTA TARTARUGHE");
		lblListaTartarughe.setForeground(Color.WHITE);
		lblListaTartarughe.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblListaTartarughe.setBounds(56, 10, 222, 50);
		panel_lista.add(lblListaTartarughe);
		
		JLabel ListaTurtle = new JLabel("");
		ListaTurtle.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/search_100px.png")));
		ListaTurtle.setBounds(105, 69, 117, 126);
		panel_lista.add(ListaTurtle);
		
		PanelCustomBlue panel_rilascio = new PanelCustomBlue();
		panel_rilascio.setLayout(null);
		panel_rilascio.setBounds(538, 25, 350, 250);
		sfondo.add(panel_rilascio);
		
		JLabel lblRimuoviTartaruga = new JLabel("RILASCIO TARTARUGA\r\n");
		lblRimuoviTartaruga.setForeground(Color.WHITE);
		lblRimuoviTartaruga.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblRimuoviTartaruga.setBounds(78, 10, 222, 50);
		panel_rilascio.add(lblRimuoviTartaruga);
		
		JLabel RilasciaTurtle = new JLabel("");
		
		RilasciaTurtle.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/wave_lines_100px.png")));
		RilasciaTurtle.setBounds(128, 70, 117, 126);
		panel_rilascio.add(RilasciaTurtle);
		
		PanelCustomBlue panel_morte = new PanelCustomBlue();
		panel_morte.setLayout(null);
		panel_morte.setBounds(538, 339, 350, 250);
		sfondo.add(panel_morte);
		
		JLabel lblModificaTartaruga = new JLabel("MORTE TARTARUGA ");
		lblModificaTartaruga.setForeground(Color.WHITE);
		lblModificaTartaruga.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblModificaTartaruga.setBounds(86, 10, 222, 50);
		panel_morte.add(lblModificaTartaruga);
		
		JLabel Morte_Turtle = new JLabel("");
		
		Morte_Turtle.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/cemetery_100px.png")));
		Morte_Turtle.setBounds(133, 70, 117, 126);
		panel_morte.add(Morte_Turtle);
		
		Delete_Turtle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RimuoviTurtle deletetartaruga = new RimuoviTurtle(controller);
				deletetartaruga.setVisible(true);
			}
		});
		ListaTurtle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewTartarughe listatartaruga = new ViewTartarughe(controller);
				listatartaruga.setVisible(true);
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
