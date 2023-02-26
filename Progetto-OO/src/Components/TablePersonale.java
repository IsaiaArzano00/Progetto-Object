//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Components;

import Controller.Controllore;
import GUI.ViewPersonale;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablePersonale extends JPanel {
    private Controllore controller;

    public TablePersonale(String qualifica, String centro, Controllore contr) {
        this.controller = contr;
        this.setLayout((LayoutManager)null);
        PanelCustomGrey panel = new PanelCustomGrey();
        panel.setBounds(0, 0, 800, 350);
        this.add(panel);
        panel.setLayout((LayoutManager)null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 780, 340);
        panel.add(scrollPane);
        JLabel Search = new JLabel("");
        Search.setIcon(new ImageIcon(ViewPersonale.class.getResource("/Media/search_28px.png")));
        Search.setBounds(0, 0, 15, 15);
        JTable tbl = this.controller.setTable(qualifica, centro);
        scrollPane.setViewportView(tbl);
    }
}
