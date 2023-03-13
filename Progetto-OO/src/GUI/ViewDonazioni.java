package GUI;

import Components.PanelCartellaMedica;
import Components.PanelCustomGrey;
import Components.PanelPreModificaCartellaMedica;
import Controller.Controllore;
import DTO.Donazione;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class ViewDonazioni extends JDialog {
    private JPanel contentPane;
    private Controllore controller;
    private JTable table;

    public ViewDonazioni(Controllore contr) {
    	setResizable(false);
        controller = contr;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 810, 555);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.contentPane);
        
        contentPane.setLayout(null);
        
        PanelCustomGrey panel = new PanelCustomGrey();
        panel.setBounds(0, 0, 796, 120);
        contentPane.add(panel);
        
        panel.setLayout(null);
        JPanel sfondo = new JPanel();
        sfondo.setBounds(0, 119, 796, 399);
        contentPane.add(sfondo);
        sfondo.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(23, 22, 752, 345);
        scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
        sfondo.add(scrollPane);
        
        JTable tbl=controller.SetTableDonazioni();
        tbl.setOpaque(false);
		((JComponent) tbl.getDefaultRenderer(Object.class)).setOpaque(false);
		tbl.setForeground(new Color(0,0,0));
		tbl.setFont(new Font("SansSerif", Font.BOLD, 13));
		tbl.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        scrollPane.setViewportView(tbl);
        
        panel.setLayout(null);
        JTextArea Spiegazione = new JTextArea();
        Spiegazione.setForeground(new Color(255, 255, 255));
        Spiegazione.setFont(new Font("SansSerif", Font.BOLD, 29));
        Spiegazione.setText("Lista delle donazioni");
        Spiegazione.setEditable(false);
        Spiegazione.setBounds(146, 10, 335, 45);
        panel.add(Spiegazione);
        Spiegazione.setOpaque(false);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(ViewDonazioni.class.getResource("/Media/Money Transfer_100px.png")));
        lblNewLabel.setBounds(10, -12, 126, 110);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Visualizza l'elenco delle donazioni ricevute da tutti i Centri.");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 13));
        lblNewLabel_1.setBounds(146, 58, 380, 24);
        panel.add(lblNewLabel_1);
        
       
        
        this.setModal(true);
        this.setVisible(true);
        
       
    }
}
