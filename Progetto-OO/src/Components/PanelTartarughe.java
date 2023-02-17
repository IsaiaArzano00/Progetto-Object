package Components;

import javax.swing.JPanel;
import Components.*;
import GUI.InserimentoTartaruga;
import GUI.ViewTartarughe;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelTartarughe extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTartarughe() {
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
		
		JLabel lblNewLabel = new JLabel("AGGIUNGI TARTARUGA\r\n");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(52, 10, 222, 50);
		panel_aggiungi.add(lblNewLabel);
		
		JLabel AggiungiTurtle = new JLabel("");
	
		AggiungiTurtle.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/add_100px.png")));
		AggiungiTurtle.setBounds(114, 70, 117, 126);
		panel_aggiungi.add(AggiungiTurtle);
		
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
		
		PanelCustomBlue panel_rimuovi = new PanelCustomBlue();
		panel_rimuovi.setLayout(null);
		panel_rimuovi.setBounds(538, 25, 350, 250);
		sfondo.add(panel_rimuovi);
		
		JLabel lblRimuoviTartaruga = new JLabel("RIMUOVI TARTARUGA\r\n");
		lblRimuoviTartaruga.setForeground(Color.WHITE);
		lblRimuoviTartaruga.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblRimuoviTartaruga.setBounds(78, 10, 222, 50);
		panel_rimuovi.add(lblRimuoviTartaruga);
		
		JLabel RimuoviTurtle = new JLabel("");
		RimuoviTurtle.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/remove_100px.png")));
		RimuoviTurtle.setBounds(128, 70, 117, 126);
		panel_rimuovi.add(RimuoviTurtle);
		
		PanelCustomBlue panel_modifica = new PanelCustomBlue();
		panel_modifica.setLayout(null);
		panel_modifica.setBounds(538, 339, 350, 250);
		sfondo.add(panel_modifica);
		
		JLabel lblModificaTartaruga = new JLabel("MODIFICA TARTARUGA\r\n");
		lblModificaTartaruga.setForeground(Color.WHITE);
		lblModificaTartaruga.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblModificaTartaruga.setBounds(86, 10, 222, 50);
		panel_modifica.add(lblModificaTartaruga);
		
		JLabel ModificaTurtle = new JLabel("");
		ModificaTurtle.setIcon(new ImageIcon(PanelTartarughe.class.getResource("/Media/change_100px.png")));
		ModificaTurtle.setBounds(133, 70, 117, 126);
		panel_modifica.add(ModificaTurtle);
		
		AggiungiTurtle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InserimentoTartaruga inserimentotartaruga = new InserimentoTartaruga();
				inserimentotartaruga.setVisible(true);
			}
		});
		ListaTurtle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewTartarughe listatartaruga = new ViewTartarughe();
				listatartaruga.setVisible(true);
			}
		});	
		
	}
}
