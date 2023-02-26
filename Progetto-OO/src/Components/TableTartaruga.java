package Components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controller.Controllore;
import GUI.ViewPersonale;

public class TableTartaruga extends JPanel {

	/**
	 * Create the panel.
	 */
	public TableTartaruga(String centro) {
		Controllore controller = new Controllore();
		
		
		setLayout(null);
		
		PanelCustomGrey panel = new PanelCustomGrey();
		panel.setBounds(0, 0, 800, 350);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 780, 340);
		panel.add(scrollPane);
	
		JLabel Search = new JLabel("");
		Search.setIcon(new ImageIcon(ViewPersonale.class.getResource("/Media/search_28px.png")));
		Search.setBounds(0, 0, 15, 15);
			
		
		JTable tbl=controller.SetTableTurtle(centro);
		scrollPane.setViewportView(tbl);
		
		
		
	}

}