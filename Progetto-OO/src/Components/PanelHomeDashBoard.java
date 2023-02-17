package Components;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;

public class PanelHomeDashBoard extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHomeDashBoard() {
		setLayout(null);
		
		PanelCustomWhite panel = new PanelCustomWhite();
		panel.setBounds(0, 0, 1001, 674);
		add(panel);
		panel.setLayout(null);
		
		JTextArea Welcome = new JTextArea();
		Welcome.setText("Benvenuto/a nel software per la gestione dei\r\n Centri di recupero per Tartarughe Marine.\r\nQui potrai :\r\n-Aggiungere , rimuovere o visualizzare il personale\r\n  per ogni Centro presente nel sistema.\r\n-Aggiungere , rimuovere o modificare i Centri \r\n  e le rispettive sedi.\r\n-etc.");
		Welcome.setFont(new Font("SansSerif", Font.BOLD, 13));
		Welcome.setBounds(10, 10, 332, 187);
		panel.add(Welcome);
		Welcome.setOpaque(false);
		
		JPanel panel_turtle = new JPanel();
		panel_turtle.setBounds(101, 336, 790, 305);
		panel.add(panel_turtle);
		panel_turtle.setLayout(null);
		
		TableTartarugheDashBoard tableTurtle = new TableTartarugheDashBoard();
		tableTurtle.setBounds(0, 0, 800, 305);
		
		panel_turtle.add(tableTurtle);
		

	}
}
