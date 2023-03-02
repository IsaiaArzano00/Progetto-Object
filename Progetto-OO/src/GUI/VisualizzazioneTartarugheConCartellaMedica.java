package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Components.PanelCustomGrey;
import Controller.Controllore;
import DTO.Donazione;
import DTO.Tartaruga;

public class VisualizzazioneTartarugheConCartellaMedica extends JDialog {

	private Controllore controller;
	private JPanel contentPane;
	private JTable table;
	private String idTartaruga;
	
	public VisualizzazioneTartarugheConCartellaMedica(Controllore contr, String operazione) {
		 	this.controller = contr;
	        this.setDefaultCloseOperation(2);
	        this.setBounds(100, 100, 1266, 752);
	        this.contentPane = new JPanel();
	        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        this.setContentPane(this.contentPane);
	        this.contentPane.setLayout((LayoutManager)null);
	        contentPane.setLayout(null);
	        PanelCustomGrey panel = new PanelCustomGrey();
	        panel.setBounds(0, 0, 1302, 120);
	        this.contentPane.add(panel);
	        panel.setLayout((LayoutManager)null);
	        JPanel sfondo = new JPanel();
	        sfondo.setBounds(10, 149, 1232, 552);
	        this.contentPane.add(sfondo);
	        sfondo.setLayout((LayoutManager)null);
	        sfondo.setLayout(new BoxLayout(sfondo, BoxLayout.X_AXIS));
	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(23, 22, 752, 356);
	        sfondo.add(scrollPane);
	        JPanel panel_1 = new JPanel();
	        scrollPane.setViewportView(panel_1);
	        panel_1.setLayout(new BoxLayout(panel_1, 0));
	        JScrollPane scrollPane_1 = new JScrollPane();
	        panel_1.add(scrollPane_1);
	        ArrayList<Tartaruga> Tartarughe = this.controller.getTartarugheConCartellaMedica();
	        if (Tartarughe.isEmpty()) {
	        	alertNessunaTartarugaConCartella();
	        }
	        else
	        {
	        
	        
	        Object[] columnNames = new Object[]{"id_tartaruga", "nome", "eta", "old_number_targhetta", "data_accoglienza_centro", "eventuale_rilascio", "eventuale_morte", "eventuale_data_rilascio", "eventuale_data_morte", "id_sede", "id_cartellamedica", "codice_vasca", "numero_targhetta"};
	        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
	        Iterator var11 = Tartarughe.iterator();

	        while(var11.hasNext()) {
	            Tartaruga t = (Tartaruga)var11.next();
	            Object[] tar = new Object[]{t.getId_tartaruga(), t.getNome(), t.getEta(), t.getOld_number_targhetta(), t.getData_accoglienza_centro(), t.isEventuale_rilascio(), t.isEventuale_morte(), t.getEventuale_data_rilascio(), t.getEventuale_data_morte(), t.getID_Sede(), t.getID_CartellaMedica(), t.getCodice_vasca(), t.getNumero_targhetta()};
	            tableModel.addRow(tar);
	        }

	        this.table = new JTable();
	        scrollPane_1.setViewportView(this.table);
	        this.table.setModel(tableModel);
	        table.setDefaultEditor(Object.class, null);
	        
	        table.addMouseListener(new java.awt.event.MouseAdapter() {
	            @Override
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                int row = table.rowAtPoint(evt.getPoint());
	                if (row >= 0) {
	                	idTartaruga = (String) table.getModel().getValueAt(row, 0);
	                	isVisible(false);
	                	if(operazione.equals("rimuovi")) {
	                	new RimozioneCartellaMedica(controller, idTartaruga);
	                	}
	                	else if (operazione.equals("modifica")) {
	                	new VisualizzaCartellaMedica(controller, idTartaruga);
	                	}
	                }
	             }
	        });
	        
	        
	        JTextArea Spiegazione = new JTextArea();
	        Spiegazione.setForeground(new Color(255, 255, 255));
	        Spiegazione.setFont(new Font("SansSerif", 1, 12));
	        Spiegazione.setText("Selezionare la tartaruga");
	        Spiegazione.setEditable(false);
	        Spiegazione.setBounds(33, 38, 456, 45);
	        panel.add(Spiegazione);
	        Spiegazione.setOpaque(false);
	        this.setModal(true);
	        this.setVisible(true);
	        }
	    }
	
	private void alertNessunaTartarugaConCartella() {
		JOptionPane.showMessageDialog(this, "Non sono presenti tartarughe con cartella medica!");
		
	}

	public void isVisible(boolean b) {
		setVisible(b);
	}


}