//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GUI;

import Components.PanelCustomGrey;
import Controller.Controllore;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ViewPersonale extends JFrame {
    private JPanel contentPane;
    private Controllore controller;

    public ViewPersonale(Controllore contr) {
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
        final JPanel sfondo = new JPanel();
        sfondo.setBounds(0, 119, 796, 399);
        this.contentPane.add(sfondo);
        sfondo.setLayout((LayoutManager)null);
        JTextArea Spiegazione = new JTextArea();
        Spiegazione.setForeground(new Color(255, 255, 255));
        Spiegazione.setFont(new Font("SansSerif", 1, 12));
        Spiegazione.setText("Si prega di inserire la qualifica ed il centro.\r\nVerrà visualizzata la lista del personale scelto.");
        Spiegazione.setEditable(false);
        Spiegazione.setBounds(10, 10, 456, 45);
        panel.add(Spiegazione);
        Spiegazione.setOpaque(false);
        final JComboBox comboBoxQualifica = new JComboBox();
        comboBoxQualifica.setModel(new DefaultComboBoxModel(new String[]{"Operatore", "Medico Veterinario", "Ricercatore", "Tecnico di Laboratorio"}));
        comboBoxQualifica.setBounds(20, 65, 128, 21);
        panel.add(comboBoxQualifica);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(221, 65, 367, 21);
        panel.add(scrollPane);
        final JComboBox<String> comboBoxCentro = new JComboBox();
        scrollPane.setRowHeaderView(comboBoxCentro);
        JLabel Search = new JLabel("");
        Search.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String qualifica = (String)comboBoxQualifica.getSelectedItem();
                String centro = (String)comboBoxCentro.getSelectedItem();
                ViewPersonale.this.controller.VisualizzaPersonale(qualifica, centro, sfondo);
            }
        });
        Search.setIcon(new ImageIcon(ViewPersonale.class.getResource("/Media/search_28px.png")));
        Search.setBounds(704, 65, 46, 34);
        panel.add(Search);

        for(int i = 0; i < this.controller.getNomeCentri().size(); ++i) {
            comboBoxCentro.addItem(((String)this.controller.getNomeCentri().get(i)).toString());
        }

        comboBoxCentro.addItem(new String("Tutti i Centri"));
    }
}
