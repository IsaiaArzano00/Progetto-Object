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

public class TableLaboratorioEVasche extends JPanel {
    private Controllore controller;

    public TableLaboratorioEVasche( Controllore contr) {
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
        
        
        JLabel lblNewLabel = new JLabel("GESTIONE LABORATORI E VASCHE\r\n");
        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(10, 10, 574, 60);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Selezionare se visualizzare l'elenco dei laboratori o delle vasche ");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblNewLabel_1.setBounds(10, 61, 526, 27);
        panel.add(lblNewLabel_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color (0,0,0,70));
        panel_1.setBounds(296, 98, 184, 37);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel ViewLab = new JLabel("LABORATORIO\r\n");
       
        ViewLab.setFont(new Font("SansSerif", Font.BOLD, 18));
        ViewLab.setBounds(24, 0, 150, 37);
        panel_1.add(ViewLab);
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBackground(new Color(0, 0, 0, 70));
        panel_1_1.setBounds(490, 98, 184, 37);
        panel.add(panel_1_1);
        
        JLabel ViewVasche = new JLabel("VASCHE");
       
        ViewVasche.setFont(new Font("SansSerif", Font.BOLD, 18));
        ViewVasche.setBounds(44, 0, 130, 37);
        panel_1_1.add(ViewVasche);
        
        JTable tbl_lab = controller.SetTableLaboratorio();
        scrollPane.setViewportView(tbl_lab);
        
        //LISTENER
        ViewLab.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {        		
        		JTable tbl_lab = controller.SetTableLaboratorio();
                scrollPane.setViewportView(tbl_lab);
        	}
        });
        ViewVasche.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		JTable tbl_vasche = controller.SetTableVasche();
        		scrollPane.setViewportView(tbl_vasche);
        	}
        });
    }
}
