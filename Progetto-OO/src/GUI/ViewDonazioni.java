package GUI;

import Components.PanelCustomGrey;
import Controller.Controllore;
import DTO.Donazione;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
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

public class ViewDonazioni extends JDialog {
    private JPanel contentPane;
    private Controllore controller;
    private JTable table;

    public ViewDonazioni(Controllore contr) {
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
        scrollPane.setBounds(23, 22, 752, 356);
        sfondo.add(scrollPane);
        JTable tbl=controller.SetTableDonazioni();
        scrollPane.setViewportView(tbl);
        
        panel.setLayout(null);
        JTextArea Spiegazione = new JTextArea();
        Spiegazione.setForeground(new Color(255, 255, 255));
        Spiegazione.setFont(new Font("SansSerif", 1, 12));
        Spiegazione.setText("Lista delle donazioni");
        Spiegazione.setEditable(false);
        Spiegazione.setBounds(33, 38, 456, 45);
        panel.add(Spiegazione);
        Spiegazione.setOpaque(false);
        this.setModal(true);
        this.setVisible(true);
    }
}
