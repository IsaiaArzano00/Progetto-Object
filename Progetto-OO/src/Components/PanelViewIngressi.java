package Components;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controller.Controllore;

public class PanelViewIngressi extends JPanel {
	private Controllore controller;
	/**
	 * Create the panel.
	 */
	public PanelViewIngressi(Controllore contr,String turtle) {
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
