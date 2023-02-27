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

public class PanelViewVisite extends JPanel {

	private Controllore controller;
	
	public PanelViewVisite(Controllore contr) {
	
		controller = contr;
		
		setLayout(null);
		
		PanelCustomGrey panel = new PanelCustomGrey();
		panel.setBounds(0, 0, 865, 460);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 865, 460);
		panel.add(scrollPane);
		
		
		
		JTable tbl = controller.SetTableVisite(turtle);
		scrollPane.setViewportView(tbl);
		
		
		
	}


}
