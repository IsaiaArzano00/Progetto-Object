package Components;

import javax.swing.JPanel;
import Components.*;

public class PanelTartarughe extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTartarughe() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1346, 728);
		add(panel);
		panel.setLayout(null);
		
		PanelCustomWhite sfondo = new PanelCustomWhite();
		sfondo.setBounds(0, 0, 1001, 674);
		panel.add(sfondo);
		sfondo.setLayout(null);
		
		PanelCustomBlue panel_1 = new PanelCustomBlue();
		panel_1.setBounds(10, 25, 350, 250);
		sfondo.add(panel_1);
		panel_1.setLayout(null);
		
		PanelCustomBlue panel_1_1 = new PanelCustomBlue();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 339, 350, 250);
		sfondo.add(panel_1_1);
		
		PanelCustomBlue panel_1_2 = new PanelCustomBlue();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(538, 25, 350, 250);
		sfondo.add(panel_1_2);
		
		PanelCustomBlue panel_1_3 = new PanelCustomBlue();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(538, 339, 350, 250);
		sfondo.add(panel_1_3);
	}
}
