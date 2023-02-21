package Components;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.Controllore;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableTartarugheDashBoard extends JPanel {
private JTable table;
	
	/**
	 * Create the panel.
	 */
	public TableTartarugheDashBoard() {
		Controllore controller = new Controllore();
		setLayout(null);
		
		PanelCustomGrey panel = new PanelCustomGrey();
		panel.setBounds(0, 0, 800, 305);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 785, 305);
		panel.add(scrollPane);
		
		JTable tbl=controller.TableTurtleDashBoard();
		tbl.setColumnSelectionAllowed(false);
		tbl.setRowHeight(45);
		tbl.setShowVerticalLines(false);
		scrollPane.setViewportView(tbl);
		
		
		
		
		
		
		
	}
}
