package Components;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.Controllore;
import GUI.ViewPersonale;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;

public class TablePersonale extends JPanel {
	
	
	/**
	 * Create the panel.
	 */
	public TablePersonale(String qualifica ,String centro) {
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
			
	
		
		JTable tbl=controller.setTable(qualifica,centro);
	
	
		scrollPane.setViewportView(tbl);
		
		
		
	
		
		
		
		

	}
}
