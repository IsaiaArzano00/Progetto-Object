package Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.EliminazioneLaboratorio;
import GUI.EliminazioneVasca;
import GUI.InserimentoCentro;
import GUI.InserimentoLaboratorio;
import GUI.InserimentoVasca;
import GUI.RimuoviCentro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

import Controller.Controllore;

public class PanelCentri extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelCentri(Controllore contr) {
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
		
		PanelCustomBlue panel_aggiungi = new PanelCustomBlue();
		panel_aggiungi.setLayout(null);
		panel_aggiungi.setBounds(85, 522, 350, 93);
		sfondo.add(panel_aggiungi);
		
		JLabel lblNewLabel_3 = new JLabel("AGGIUNGI CENTRO");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 20, 235, 51);
		panel_aggiungi.add(lblNewLabel_3);
		
		JLabel AddCentro = new JLabel("");
		
		AddCentro.setIcon(new ImageIcon(PanelCentri.class.getResource("/Media/downtown_80px.png")));
		AddCentro.setBounds(252, 0, 98, 100);
		panel_aggiungi.add(AddCentro);
		
		PanelCustomBlue panel_1_3 = new PanelCustomBlue();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(537, 522, 350, 93);
		sfondo.add(panel_1_3);
		
		JLabel elimina_centro = new JLabel("");
		
		elimina_centro.setIcon(new ImageIcon(PanelCentri.class.getResource("/Media/remove__c_100px.png")));
		elimina_centro.setBounds(249, 0, 101, 97);
		panel_1_3.add(elimina_centro);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("RIMUOVI CENTRO\r\n\r\n");
		lblNewLabel_7_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_7_1_1.setBounds(10, 21, 163, 51);
		panel_1_3.add(lblNewLabel_7_1_1);
		
		TableCentri panel_stats = new TableCentri(controller);
		panel_stats.setBounds(10, 10, 968, 417);
		sfondo.add(panel_stats);
		panel_stats.setLayout(null);
	
		
		//ACTION
		AddCentro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.InserimentoCentroPage();
			}
		});
		
		elimina_centro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RimuoviCentro deletecentro = new RimuoviCentro(controller);
				deletecentro.setVisible(true);
			}
		});
	
		

	}
}
