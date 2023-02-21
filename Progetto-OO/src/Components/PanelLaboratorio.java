package Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.InserimentoLaboratorio;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelLaboratorio extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelLaboratorio() {
setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1346, 728);
		add(panel);
		panel.setLayout(null);
		
		PanelCustomWhite sfondo = new PanelCustomWhite();
		sfondo.setForeground(new Color(0, 0, 0));
		sfondo.setBounds(0, 0, 1001, 674);
		panel.add(sfondo);
		sfondo.setLayout(null);
		
		PanelCustomBlue panel_assegna = new PanelCustomBlue();
		panel_assegna.setLayout(null);
		panel_assegna.setBounds(10, 339, 350, 250);
		sfondo.add(panel_assegna);
		
		JLabel lblNewLabel_5 = new JLabel("ASSEGNA A LABORATORIO");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_5.setBounds(55, 10, 330, 50);
		panel_assegna.add(lblNewLabel_5);
		
		JLabel AssegnaLab = new JLabel("");
	
		AssegnaLab.setIcon(new ImageIcon(PanelLaboratorio.class.getResource("/Media/Lab Coat_80px.png")));
		AssegnaLab.setBounds(88, 70, 164, 144);
		panel_assegna.add(AssegnaLab);
		
		PanelCustomBlue panel_aggiungi = new PanelCustomBlue();
		panel_aggiungi.setLayout(null);
		panel_aggiungi.setBounds(10, 28, 350, 250);
		sfondo.add(panel_aggiungi);
		
		JLabel lblNewLabel_3 = new JLabel("AGGIUNGI LABORATORIO");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setBounds(55, 10, 330, 51);
		panel_aggiungi.add(lblNewLabel_3);
		
		JLabel InserisciLaboratorio = new JLabel("");
		
		InserisciLaboratorio.setIcon(new ImageIcon(PanelLaboratorio.class.getResource("/Media/lab_items_80px.png")));
		InserisciLaboratorio.setBounds(118, 72, 169, 132);
		panel_aggiungi.add(InserisciLaboratorio);
		
		PanelCustomBlue panel_1_3 = new PanelCustomBlue();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(538, 339, 350, 250);
		sfondo.add(panel_1_3);
		
		JLabel lblNewLabel_7 = new JLabel("ELIMINA LABORATORIO");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7.setBounds(55, 10, 330, 51);
		panel_1_3.add(lblNewLabel_7);
		
		JLabel elimina_lab = new JLabel("");
		elimina_lab.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/delete_80px.png")));
		elimina_lab.setBounds(119, 86, 154, 107);
		panel_1_3.add(elimina_lab);
		
		//ACTION
		InserisciLaboratorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InserimentoLaboratorio insertlab = new InserimentoLaboratorio();
				insertlab.setVisible(true);
			}
		});
		

	}
}
