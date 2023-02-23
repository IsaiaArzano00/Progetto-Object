package Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.InserimentoLaboratorio;
import GUI.InserimentoVasca;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class PanelLaboratorioVasca extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelLaboratorioVasca() {
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
		panel_assegna.setBounds(57, 385, 350, 250);
		sfondo.add(panel_assegna);
		
		JLabel elimina_lab = new JLabel("");
	
		elimina_lab.setIcon(new ImageIcon(PanelLaboratorioVasca.class.getResource("/Media/remove_100px.png")));
		elimina_lab.setBounds(117, 71, 164, 144);
		panel_assegna.add(elimina_lab);
		
		JLabel lblNewLabel_7 = new JLabel("ELIMINA LABORATORIO");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7.setBounds(55, 10, 269, 51);
		panel_assegna.add(lblNewLabel_7);
		
		PanelCustomBlue panel_aggiungi = new PanelCustomBlue();
		panel_aggiungi.setLayout(null);
		panel_aggiungi.setBounds(57, 84, 350, 250);
		sfondo.add(panel_aggiungi);
		
		JLabel lblNewLabel_3 = new JLabel("AGGIUNGI LABORATORIO");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setBounds(55, 10, 330, 51);
		panel_aggiungi.add(lblNewLabel_3);
		
		JLabel InserisciLaboratorio = new JLabel("");
		
		InserisciLaboratorio.setIcon(new ImageIcon(PanelLaboratorioVasca.class.getResource("/Media/lab_items_80px.png")));
		InserisciLaboratorio.setBounds(118, 72, 169, 132);
		panel_aggiungi.add(InserisciLaboratorio);
		
		PanelCustomBlue panel_1_3 = new PanelCustomBlue();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(538, 385, 350, 250);
		sfondo.add(panel_1_3);
		
		JLabel elimina_vasca = new JLabel("");
		elimina_vasca.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/delete_80px.png")));
		elimina_vasca.setBounds(119, 86, 154, 107);
		panel_1_3.add(elimina_vasca);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("RIMUOVI VASCA\r\n");
		lblNewLabel_7_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7_1_1.setBounds(83, 10, 330, 51);
		panel_1_3.add(lblNewLabel_7_1_1);
		
		PanelCustomBlue panel_1_3_1 = new PanelCustomBlue();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBounds(538, 84, 350, 250);
		sfondo.add(panel_1_3_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("AGGIUNGI VASCA");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7_1.setBounds(83, 10, 330, 51);
		panel_1_3_1.add(lblNewLabel_7_1);
		
		JLabel inserisci_vasca = new JLabel("");
		
		inserisci_vasca.setBounds(119, 86, 154, 107);
		panel_1_3_1.add(inserisci_vasca);
		
		JLabel elimina_lab_2 = new JLabel("");
		elimina_lab_2.setIcon(new ImageIcon(PanelLaboratorioVasca.class.getResource("/Media/rectangular_aquarium_100px.png")));
		elimina_lab_2.setBounds(119, 86, 154, 107);
		panel_1_3_1.add(elimina_lab_2);
		
		JLabel lblNewLabel = new JLabel("Aggiungi o rimuovi un laboratorio o una vasca all'interno del Centro.");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel.setBounds(255, 33, 468, 41);
		sfondo.add(lblNewLabel);
	
		
		//ACTION
		InserisciLaboratorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InserimentoLaboratorio insertlab = new InserimentoLaboratorio();
				insertlab.setVisible(true);
			}
		});
		
		inserisci_vasca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InserimentoVasca insertvasca = new InserimentoVasca();
				insertvasca.setVisible(true);
			}
		});
		

	}
}
