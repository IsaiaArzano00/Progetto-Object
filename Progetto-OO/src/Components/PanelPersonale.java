//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Components;

import Controller.Controllore;
import GUI.ViewPersonale;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPersonale extends JPanel {
    private Controllore controller;

    public PanelPersonale(Controllore contr) {
        this.controller = contr;
        this.setLayout((LayoutManager)null);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1346, 728);
        this.add(panel);
        panel.setLayout((LayoutManager)null);
        PanelCustomWhite sfondo = new PanelCustomWhite();
        sfondo.setForeground(new Color(0, 0, 0));
        sfondo.setBounds(0, 0, 1001, 674);
        panel.add(sfondo);
        sfondo.setLayout((LayoutManager)null);
        PanelCustomBlue panel_1_1 = new PanelCustomBlue();
        panel_1_1.setLayout((LayoutManager)null);
        panel_1_1.setBounds(10, 339, 350, 250);
        sfondo.add(panel_1_1);
        JLabel lblNewLabel_5 = new JLabel("VISUALIZZA PERSONALE");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_5.setBounds(55, 10, 330, 50);
        panel_1_1.add(lblNewLabel_5);
        JLabel VisualizzaPersonale = new JLabel("");
        VisualizzaPersonale.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/find_user_male_80px.png")));
        VisualizzaPersonale.setBounds(104, 63, 246, 144);
        panel_1_1.add(VisualizzaPersonale);
        PanelCustomBlue panel_1_2 = new PanelCustomBlue();
        panel_1_2.setLayout((LayoutManager)null);
        panel_1_2.setBounds(538, 25, 350, 250);
        sfondo.add(panel_1_2);
        JLabel lblNewLabel_3 = new JLabel("INSERISCI PERSONALE");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_3.setBounds(55, 10, 330, 51);
        panel_1_2.add(lblNewLabel_3);
        JLabel InserisciPersonale = new JLabel("");
        InserisciPersonale.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/add_user_male_80px.png")));
        InserisciPersonale.setBounds(137, 71, 169, 132);
        panel_1_2.add(InserisciPersonale);
        PanelCustomBlue panel_1_3 = new PanelCustomBlue();
        panel_1_3.setLayout((LayoutManager)null);
        panel_1_3.setBounds(538, 339, 350, 250);
        sfondo.add(panel_1_3);
        JLabel lblNewLabel_7 = new JLabel("ELIMINA PERSONALE");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_7.setBounds(55, 10, 330, 51);
        panel_1_3.add(lblNewLabel_7);
        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/delete_80px.png")));
        lblNewLabel_8.setBounds(119, 86, 154, 107);
        panel_1_3.add(lblNewLabel_8);
        JLabel lblNewLabel = new JLabel("GESTIONE DEL PERSONALE DEL CENTRO ");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel.setBounds(10, 25, 414, 50);
        sfondo.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("In questa schermata è possibile : ");
        lblNewLabel_1.setFont(new Font("SansSerif", 1, 13));
        lblNewLabel_1.setBounds(10, 67, 414, 42);
        sfondo.add(lblNewLabel_1);
        JLabel lblNewLabel_2 = new JLabel("-Aggiungere un nuovo membro al personale");
        lblNewLabel_2.setFont(new Font("SansSerif", 1, 13));
        lblNewLabel_2.setBounds(82, 97, 303, 18);
        sfondo.add(lblNewLabel_2);
        JLabel lblNewLabel_2_1 = new JLabel("-Visualizzare l'elenco del personale presente nel Centro");
        lblNewLabel_2_1.setFont(new Font("SansSerif", 1, 13));
        lblNewLabel_2_1.setBounds(82, 119, 367, 18);
        sfondo.add(lblNewLabel_2_1);
        JLabel lblNewLabel_2_2 = new JLabel("-Rimuovere membro del personale");
        lblNewLabel_2_2.setFont(new Font("SansSerif", 1, 13));
        lblNewLabel_2_2.setBounds(82, 143, 303, 18);
        sfondo.add(lblNewLabel_2_2);
        InserisciPersonale.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PanelPersonale.this.controller.InserimentoPersonale();
            }
        });
        VisualizzaPersonale.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ViewPersonale viewpersonale = new ViewPersonale(PanelPersonale.this.controller);
                viewpersonale.setVisible(true);
            }
        });
    }
}
