package Components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

import Controller.Controllore;
import GUI.Home;
import GUI.TurtleInfo;
import GUI.ViewPersonale;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class TableTartaruga extends JPanel {
	private Controllore controller;

	/**
	 * Create the panel.
	 */
	public TableTartaruga(Controllore contr,String centro) {
		controller=contr;
		
		
		setLayout(null);
		
		PanelCustomGrey panel = new PanelCustomGrey();
		panel.setBounds(0, 0, 1019, 350);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 696, 316);
		panel.add(scrollPane);
	
		JLabel Search = new JLabel("");
		Search.setIcon(new ImageIcon(ViewPersonale.class.getResource("/Media/search_28px.png")));
		Search.setBounds(0, 0, 15, 15);
			
		
		JTable tbl=controller.SetTableTurtle(centro);
		scrollPane.setViewportView(tbl);
		
		JTextArea txtrQuestoLelenco = new JTextArea();
		txtrQuestoLelenco.setText("Questo è l'elenco delle tartarughe\r\ndel Centro selezionato.\r\nFacendo click su una tartaruga\r\nè possibile visualizzare :\r\n   -Gli eventuali ingressi e/o \r\n     riammissioni\r\n   -Le visite ricevute durante\r\n     la sua degenza");
		txtrQuestoLelenco.setOpaque(false);
		txtrQuestoLelenco.setForeground(Color.BLACK);
		txtrQuestoLelenco.setFont(new Font("SansSerif", Font.BOLD, 14));
		txtrQuestoLelenco.setBorder(null);
		txtrQuestoLelenco.setBounds(716, 10, 251, 340);
		panel.add(txtrQuestoLelenco);
		tbl.setEnabled(true);
		tbl.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            	int index = tbl.getSelectedRow();
            	TableModel model =tbl.getModel();
            	
            	String turtle_id = model.getValueAt(index, 0).toString();
            	TurtleInfo info = new TurtleInfo(controller,turtle_id);
            	info.setVisible(true);
	}
		});
}
}