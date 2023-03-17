package Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.EliminazioneLaboratorio;
import GUI.EliminazioneVasca;
import GUI.InserimentoLaboratorio;
import GUI.InserimentoVasca;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

import Controller.Controllore;

public class PanelLabEVascheDashboard extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelLabEVascheDashboard(Controllore contr) {
		Controllore controller = contr;
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
		panel_assegna.setBounds(84, 549, 350, 93);
		sfondo.add(panel_assegna);
		
		JLabel elimina_lab = new JLabel("");
	
		elimina_lab.setIcon(new ImageIcon(PanelLabEVascheDashboard.class.getResource("/Media/remove__c_100px.png")));
		elimina_lab.setBounds(252, 0, 98, 100);
		panel_assegna.add(elimina_lab);
		
		JLabel lblNewLabel_7 = new JLabel("ELIMINA LABORATORIO");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7.setBounds(10, 21, 226, 51);
		panel_assegna.add(lblNewLabel_7);
		
		PanelCustomBlue panel_aggiungi = new PanelCustomBlue();
		panel_aggiungi.setLayout(null);
		panel_aggiungi.setBounds(84, 439, 350, 93);
		sfondo.add(panel_aggiungi);
		
		JLabel lblNewLabel_3 = new JLabel("AGGIUNGI LABORATORIO");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 10, 235, 51);
		panel_aggiungi.add(lblNewLabel_3);
		
		JLabel InserisciLaboratorio = new JLabel("");
		
		InserisciLaboratorio.setIcon(new ImageIcon(PanelLabEVascheDashboard.class.getResource("/Media/Lab Items_100px.png")));
		InserisciLaboratorio.setBounds(252, 0, 98, 100);
		panel_aggiungi.add(InserisciLaboratorio);
		
		PanelCustomBlue panel_1_3 = new PanelCustomBlue();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(538, 549, 350, 93);
		sfondo.add(panel_1_3);
		
		JLabel elimina_vasca = new JLabel("");
		
		elimina_vasca.setIcon(new ImageIcon(PanelLabEVascheDashboard.class.getResource("/Media/remove__c_100px.png")));
		elimina_vasca.setBounds(250, 0, 100, 97);
		panel_1_3.add(elimina_vasca);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("RIMUOVI VASCA\r\n");
		lblNewLabel_7_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7_1_1.setBounds(10, 20, 163, 51);
		panel_1_3.add(lblNewLabel_7_1_1);
		
		PanelCustomBlue panel_1_3_1 = new PanelCustomBlue();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBounds(538, 439, 350, 93);
		sfondo.add(panel_1_3_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("AGGIUNGI VASCA");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7_1.setBounds(10, 10, 171, 51);
		panel_1_3_1.add(lblNewLabel_7_1);
		
		JLabel inserisci_vasca = new JLabel("");
		
		inserisci_vasca.setBounds(242, 0, 108, 83);
		panel_1_3_1.add(inserisci_vasca);
		
		JLabel elimina_lab_2 = new JLabel("");
		elimina_lab_2.setIcon(new ImageIcon(PanelLabEVascheDashboard.class.getResource("/Media/aquarium_100px.png")));
		elimina_lab_2.setBounds(242, 0, 108, 83);
		panel_1_3_1.add(elimina_lab_2);
		
		TableLaboratorioEVasche panel_stats = new TableLaboratorioEVasche(controller);
		panel_stats.setBounds(10, 10, 968, 417);
		sfondo.add(panel_stats);
		panel_stats.setLayout(null);
	
		
		//ACTION
		InserisciLaboratorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.InserimentoLaboratorioPage();
			}
		});
		
		inserisci_vasca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.InserimentovascaPage();
			}
		});
		
		elimina_vasca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EliminazioneVasca deletevasca = new EliminazioneVasca(controller);
				deletevasca.setVisible(true);
			}
		});
		
		elimina_lab.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EliminazioneLaboratorio deleteLab = new EliminazioneLaboratorio(controller);
				deleteLab.setVisible(true);
			}
		});
	
		

	}
}
