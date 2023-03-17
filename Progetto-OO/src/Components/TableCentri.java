package Components;

import Controller.Controllore;
import GUI.ViewPersonale;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.jfree.ui.about.AboutDialog;
import org.jfree.ui.about.ProjectInfo;

public class TableCentri extends JPanel {
    private Controllore controller;

    public TableCentri( Controllore contr) {
        controller = contr;
        setLayout(null);
        PanelCustomGrey panel = new PanelCustomGrey();
        panel.setBounds(0, 0, 1068, 417);
        add(panel);
        panel.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 138, 958, 269);
        panel.add(scrollPane);
        
        JLabel Search = new JLabel("");
        Search.setIcon(new ImageIcon(ViewPersonale.class.getResource("/Media/search_28px.png")));
        Search.setBounds(0, 0, 15, 15);
        
        
        JLabel lblNewLabel = new JLabel("GESTIONE DEI CENTRI");
        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(10, 10, 574, 60);
        panel.add(lblNewLabel);
        
        JTable tbl_lab = controller.SetTableCentri();
        scrollPane.setViewportView(tbl_lab);
        
        JTextArea txtrNellaTabellaSottostante = new JTextArea();
        txtrNellaTabellaSottostante.setText("Nella tabella sottostante sono mostrati tutti i Centri di recupero per tartarughe marine.\r\nE' possibile aggiungere un nuovo Centro oppure eliminarne uno presente nel sistema.");
        txtrNellaTabellaSottostante.setBorder(null);
        txtrNellaTabellaSottostante.setOpaque(false);
        txtrNellaTabellaSottostante.setForeground(new Color(255, 255, 255));
        txtrNellaTabellaSottostante.setEditable(false);
        txtrNellaTabellaSottostante.setFont(new Font("SansSerif", Font.BOLD, 13));
        txtrNellaTabellaSottostante.setBounds(10, 64, 747, 64);
        panel.add(txtrNellaTabellaSottostante);
      
    }
}
