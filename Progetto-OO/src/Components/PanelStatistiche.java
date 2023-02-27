package Components;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Controller.Controllore;
import GUI.InserimentoCibo;
import GUI.InserimentoVisita;
import GUI.ViewVisite;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PanelStatistiche extends JPanel{
	
	private Controllore controller;
	
	public PanelStatistiche(Controllore contr) {
		controller = contr;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1346, 728);
		add(panel);
		panel.setLayout(null);
		
		PanelCustomWhite sfondo = new PanelCustomWhite();
		sfondo.setForeground(new Color(0, 0, 0));
		sfondo.setBounds(-20, 0, 1021, 674);
		panel.add(sfondo);
		sfondo.setLayout(null);
		
		PanelCustomBlue panel_1_2 = new PanelCustomBlue();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(20, 142, 328, 94);
		sfondo.add(panel_1_2);
		
		PanelCustomBlue panel_1_2_1 = new PanelCustomBlue();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(20, 235, 328, 94);
		sfondo.add(panel_1_2_1);
		
		PanelCustomBlue panel_1_2_2 = new PanelCustomBlue();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBounds(20, 329, 328, 94);
		sfondo.add(panel_1_2_2);
		
		PanelCustomBlue panel_1_2_1_1 = new PanelCustomBlue();
		panel_1_2_1_1.setLayout(null);
		panel_1_2_1_1.setBounds(20, 422, 328, 94);
		sfondo.add(panel_1_2_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(373, 65, 609, 543);
		sfondo.add(panel_1);
	
		
		
	}
}
