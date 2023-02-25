//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
        this.controller = contr;
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 810, 555);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        PanelCustomGrey panel = new PanelCustomGrey();
        panel.setBounds(0, 0, 796, 120);
        this.contentPane.add(panel);
        panel.setLayout((LayoutManager)null);
        JPanel sfondo = new JPanel();
        sfondo.setBounds(0, 119, 796, 399);
        this.contentPane.add(sfondo);
        sfondo.setLayout((LayoutManager)null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(23, 22, 752, 356);
        sfondo.add(scrollPane);
        JPanel panel_1 = new JPanel();
        scrollPane.setViewportView(panel_1);
        panel_1.setLayout(new BoxLayout(panel_1, 0));
        JScrollPane scrollPane_1 = new JScrollPane();
        panel_1.add(scrollPane_1);
        ArrayList<Donazione> Donazioni = this.controller.getAllDonazioni();
        Object[] columnNames = new Object[]{"id_donazione", "importo_donazione", "email_donatore", "data_donazione", "metodo_pagamento", "id_centro"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        Iterator var11 = Donazioni.iterator();

        while(var11.hasNext()) {
            Donazione d = (Donazione)var11.next();
            Object[] don = new Object[]{d.getIdDonazione(), d.getimportoDonazione(), d.getEmailDonatore(), d.getDataDonazione(), d.getMetodoPagamento(), d.getIdCentro()};
            tableModel.addRow(don);
        }

        this.table = new JTable();
        scrollPane_1.setViewportView(this.table);
        this.table.setModel(tableModel);
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
