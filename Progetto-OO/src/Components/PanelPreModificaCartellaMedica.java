package Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.table.TableModel;

import Controller.Controllore;
import GUI.EliminaPersonale;
import GUI.ModificaCartellaMedica;
import GUI.TurtleInfo;
import GUI.ViewPersonale;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelPreModificaCartellaMedica extends JPanel {
	private Controllore controller;

	/**
	 * Create the panel.
	 */
	public PanelPreModificaCartellaMedica(Controllore contr,JPanel sfondo_dash) {
controller = contr;
        
        setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1346, 728);
        add(panel);
        panel.setLayout(null);
        
        PanelCustomWhite sfondo = new PanelCustomWhite();
        sfondo.setForeground(new Color(0, 0, 0));
        sfondo.setBounds(0, 0, 1063, 718);
        panel.add(sfondo);
        
        sfondo.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("MODIFICA CARTELLA MEDICA ");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 27));
        lblNewLabel.setBounds(10, 10, 758, 50);
        sfondo.add(lblNewLabel);
        
        JTextArea txtInfo = new JTextArea();
        txtInfo.setFont(new Font("SansSerif", Font.BOLD, 13));
        txtInfo.setText("Selezionare dalla tabella sottostante la tartaruga a cui bisogna modificare la cartella medica.");
        txtInfo.setBounds(10, 53, 758, 31);
        txtInfo.setOpaque(false);
        txtInfo.setBorder(null);
        txtInfo.setEditable(false);
        sfondo.add(txtInfo);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(null);
        scrollPane.setBounds(10, 109, 966, 495);
        scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		
        sfondo.add(scrollPane);
        
        JTable tbl = controller.SetTableTurtleWithCartellaMedica();
        tbl.setOpaque(false);
		((JComponent) tbl.getDefaultRenderer(Object.class)).setOpaque(false);
		tbl.setForeground(new Color(0,0,0));
		tbl.setFont(new Font("SansSerif", Font.BOLD, 13));
		tbl.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
		tbl.setEnabled(true);
		
		
        scrollPane.setViewportView(tbl);
        
        JLabel GoBack = new JLabel("");
        GoBack.setIcon(new ImageIcon(PanelPreModificaCartellaMedica.class.getResource("/Media/undo_50px.png")));
        GoBack.setBounds(10, 614, 59, 55);
        sfondo.add(GoBack);
        
        //LISTENER
        tbl.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            	int index = tbl.getSelectedRow();
            	TableModel model =tbl.getModel();
            	String turtle_id = model.getValueAt(index,0).toString();
            	controller.ModificaCartellaMedicaPage(turtle_id);
            	}
		});
        GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelCartellaMedica panel_carte= new PanelCartellaMedica(controller,sfondo_dash);
				controller.SetPanelDashBoard(sfondo_dash, panel_carte);
			}
		});
    }
}


	


