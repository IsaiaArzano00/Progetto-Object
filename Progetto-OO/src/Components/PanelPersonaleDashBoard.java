

package Components;

import Controller.Controllore;
import GUI.EliminaPersonale;
import GUI.InserimentoPersonale;
import GUI.ViewPersonale;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class PanelPersonaleDashBoard extends JPanel {
    private Controllore controller;

    public PanelPersonaleDashBoard(Controllore contr) {
        controller = contr;
        
        setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1346, 728);
        add(panel);
        panel.setLayout(null);
        
        PanelCustomWhite sfondo = new PanelCustomWhite();
        sfondo.setForeground(new Color(0, 0, 0));
        sfondo.setBounds(0, 0, 1001, 674);
        panel.add(sfondo);
        
        sfondo.setLayout(null);
        
        PanelCustomBlue panel_inserisci = new PanelCustomBlue();
        panel_inserisci.setLayout((LayoutManager)null);
        panel_inserisci.setBounds(84, 496, 350, 107);
        sfondo.add(panel_inserisci);
        panel_inserisci.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("INSERISCI PERSONALE");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_3.setBounds(10, 22, 253, 51);
        panel_inserisci.add(lblNewLabel_3);
        
        JLabel InserisciPersonale = new JLabel("");
        InserisciPersonale.setBounds(228, -13, 169, 132);
        panel_inserisci.add(InserisciPersonale);
        InserisciPersonale.setIcon(new ImageIcon(PanelPersonaleDashBoard.class.getResource("/Media/add_user_male_80px.png")));
        
       
        
        PanelCustomBlue panel_rimuovi = new PanelCustomBlue();
        panel_rimuovi.setLayout(null);
        panel_rimuovi.setBounds(522, 496, 350, 107);
        sfondo.add(panel_rimuovi);
        
        JLabel lblNewLabel_7 = new JLabel("ELIMINA PERSONALE");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_7.setBounds(10, 22, 229, 51);
        panel_rimuovi.add(lblNewLabel_7);
        
        JLabel EliminaPersonale = new JLabel("");
        EliminaPersonale.setBounds(216, 0, 154, 107);
        panel_rimuovi.add(EliminaPersonale);
        
         EliminaPersonale.setIcon(new ImageIcon(PanelPersonaleDashBoard.class.getResource("/Media/remove__c_100px.png")));
      
        
        PanelCustomGrey panel_1 = new PanelCustomGrey();
        panel_1.setBounds(10, 10, 991, 107);
        sfondo.add(panel_1);
        panel_1.setLayout(null);
        
        JTextArea Spiegazione = new JTextArea();
        Spiegazione.setText("Si prega di inserire la qualifica ed il centro.\r\nVerrà visualizzata la lista del personale scelto.");
        Spiegazione.setOpaque(false);
        Spiegazione.setForeground(Color.WHITE);
        Spiegazione.setFont(new Font("SansSerif", Font.BOLD, 12));
        Spiegazione.setEditable(false);
        Spiegazione.setBounds(10, 52, 326, 45);
        panel_1.add(Spiegazione);
        
        JComboBox comboBoxQualifica = new JComboBox();
        comboBoxQualifica.setModel(new DefaultComboBoxModel(new String[] {"Operatore", "Medico Veterinario", "Ricercatore", "Tecnico di Laboratorio"}));
        comboBoxQualifica.setFont(new Font("SansSerif", Font.BOLD, 12));
        comboBoxQualifica.setBounds(310, 65, 128, 21);
        panel_1.add(comboBoxQualifica);
        
        JLabel lblNewLabel = new JLabel("GESTIONE DEL PERSONALE DEL CENTRO ");
        lblNewLabel.setBounds(10, 0, 414, 55);
        panel_1.add(lblNewLabel);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 1, 18));
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(473, 65, 367, 21);
        panel_1.add(scrollPane);
        
        JComboBox comboBoxCentro = new JComboBox();
        scrollPane.setRowHeaderView(comboBoxCentro);
        
        JLabel Search = new JLabel("");
        Search.setIcon(new ImageIcon(PanelPersonaleDashBoard.class.getResource("/Media/search_28px.png")));
        Search.setBounds(858, 57, 46, 34);
        panel_1.add(Search);
        
        JPanel sfondo_lista = new JPanel();
        sfondo_lista.setBounds(10, 116, 991, 355);
        sfondo.add(sfondo_lista);
        sfondo_lista.setLayout(null);
        
        //
        for(int i = 0; i < controller.getNomeCentri().size(); ++i) {
            comboBoxCentro.addItem((controller.getNomeCentri().get(i)).toString());
        }
        
        //LISTENER 
        Search.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String qualifica = (String)comboBoxQualifica.getSelectedItem();
                String centro = (String)comboBoxCentro.getSelectedItem();
                controller.VisualizzaPersonale(qualifica, centro, sfondo_lista);
            }
        });
        //LISTENER
        InserisciPersonale.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	controller.InserimentoPersonalePage();
                
            }
        });
        EliminaPersonale.addMouseListener(new MouseAdapter() {
         	@Override
         	public void mouseClicked(MouseEvent e) {
         		EliminaPersonale deletepersonale = new EliminaPersonale(controller);
         		deletepersonale.setVisible(true);
         	}
         });

    }
}
