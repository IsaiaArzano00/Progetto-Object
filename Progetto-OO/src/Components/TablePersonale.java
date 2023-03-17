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

public class TablePersonale extends JPanel {
    private Controllore controller;

    public TablePersonale(String qualifica, String centro, Controllore contr) {
        controller = contr;
        setLayout(null);
        PanelCustomGrey panel = new PanelCustomGrey();
        panel.setBounds(0, 0, 1068, 350);
        add(panel);
        panel.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 958, 340);
        panel.add(scrollPane);
        
        JLabel Search = new JLabel("");
        Search.setIcon(new ImageIcon(ViewPersonale.class.getResource("/Media/search_28px.png")));
        Search.setBounds(0, 0, 15, 15);
        JTable tbl = controller.setTable(qualifica, centro);
        
        scrollPane.setViewportView(tbl);
    }
}
