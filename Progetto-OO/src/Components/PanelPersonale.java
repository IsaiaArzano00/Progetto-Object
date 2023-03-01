

package Components;

import Controller.Controllore;
import GUI.EliminaPersonale;
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

public class PanelPersonale extends JPanel {
    private Controllore controller;

    public PanelPersonale(Controllore contr) {
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
        
        PanelCustomBlue panel_visualizza = new PanelCustomBlue();
        panel_visualizza.setLayout(null);
        panel_visualizza.setBounds(10, 339, 350, 250);
        sfondo.add(panel_visualizza);
        
        JLabel lblNewLabel_5 = new JLabel("VISUALIZZA PERSONALE");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_5.setBounds(55, 10, 330, 50);
        panel_visualizza.add(lblNewLabel_5);
        
        JLabel VisualizzaPersonale = new JLabel("");
        VisualizzaPersonale.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/find_user_male_80px.png")));
        VisualizzaPersonale.setBounds(104, 63, 246, 144);
        panel_visualizza.add(VisualizzaPersonale);
        
        PanelCustomBlue panel_inserisci = new PanelCustomBlue();
        panel_inserisci.setLayout((LayoutManager)null);
        panel_inserisci.setBounds(538, 25, 350, 250);
        sfondo.add(panel_inserisci);
        
        JLabel lblNewLabel_3 = new JLabel("INSERISCI PERSONALE");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_3.setBounds(55, 10, 330, 51);
        panel_inserisci.add(lblNewLabel_3);
        
        JLabel InserisciPersonale = new JLabel("");
        InserisciPersonale.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/add_user_male_80px.png")));
        InserisciPersonale.setBounds(137, 71, 169, 132);
        panel_inserisci.add(InserisciPersonale);
        
        PanelCustomBlue panel_rimuovi = new PanelCustomBlue();
        panel_rimuovi.setLayout(null);
        panel_rimuovi.setBounds(538, 339, 350, 250);
        sfondo.add(panel_rimuovi);
        
        JLabel lblNewLabel_7 = new JLabel("ELIMINA PERSONALE");
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel_7.setBounds(55, 10, 330, 51);
        panel_rimuovi.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		EliminaPersonale deletepersonale = new EliminaPersonale(controller);
        		deletepersonale.setVisible(true);
        	}
        });
        lblNewLabel_8.setIcon(new ImageIcon(PanelPersonale.class.getResource("/Media/delete_80px.png")));
        lblNewLabel_8.setBounds(119, 86, 154, 107);
        panel_rimuovi.add(lblNewLabel_8);
        
        JLabel lblNewLabel = new JLabel("GESTIONE DEL PERSONALE DEL CENTRO ");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 1, 18));
        lblNewLabel.setBounds(10, 25, 414, 50);
        sfondo.add(lblNewLabel);
        
        JTextArea txtInfo = new JTextArea();
        txtInfo.setFont(new Font("SansSerif", Font.BOLD, 13));
        txtInfo.setText("In questa schermata è possibile : \r\n     -Aggiungere un nuovo membro al personale\r\n     -Visualizzare l'elenco del personale presente nel Centro\r\n     -Rimuovere membro del personale");
        txtInfo.setBounds(10, 65, 414, 107);
        txtInfo.setOpaque(false);
        txtInfo.setBorder(null);
        txtInfo.setEditable(false);
        sfondo.add(txtInfo);
        
        //LISTENER
        InserisciPersonale.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                controller.InserimentoPersonale();
            }
        });
        VisualizzaPersonale.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ViewPersonale viewpersonale = new ViewPersonale(controller);
                viewpersonale.setVisible(true);
            }
        });
    }
}
