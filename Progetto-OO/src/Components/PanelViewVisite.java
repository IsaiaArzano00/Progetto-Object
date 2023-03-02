package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controller.Controllore;
import GUI.ViewPersonale;

public class PanelViewVisite extends JPanel {

	private Controllore controller;
	
	public PanelViewVisite(Controllore contr,String turtle) {
	
		controller = contr;
		
		setLayout(null);
		
		PanelCustomGrey panel = new PanelCustomGrey();
		panel.setBounds(0, 0, 865, 460);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 865, 460);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		panel.add(scrollPane);

		JTable tbl = controller.SetTableVisite(turtle);
		tbl.setOpaque(false);
		((JComponent) tbl.getDefaultRenderer(Object.class)).setOpaque(false);
		tbl.setFont(new Font("Arial", Font.BOLD, 12));
		tbl.setForeground(new Color(255,255,255));
		scrollPane.setViewportView(tbl);

		
		
	}


}
