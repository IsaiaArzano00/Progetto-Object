//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GUI;

import Components.PanelCustomDashboard;
import Controller.Controllore;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InserimentoPersonale extends JFrame {
    private JPanel contentPane;
    private PanelCustomDashboard sfondo;
    private JTextField Nome;
    private JTextField Cognome;
    private JTextField Indirizzo;
    private JTextField Codice_Fiscale;
    private Controllore controller;

    public InserimentoPersonale(Controllore contr) {
        this.controller = contr;
        this.setVisible(true);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 450, 650);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        PanelCustomDashboard sfondo = new PanelCustomDashboard();
        sfondo.setBounds(0, 0, 450, 643);
        this.contentPane.add(sfondo);
        sfondo.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("\r\n");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 0, 23));
        lblNewLabel.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/management_80px.png")));
        lblNewLabel.setBounds(74, 10, 94, 111);
        sfondo.add(lblNewLabel);
        JSeparator separator = new JSeparator();
        separator.setBounds(62, 109, 346, 25);
        sfondo.add(separator);
        JLabel lblNewLabel_1 = new JLabel("Personale");
        lblNewLabel_1.setFont(new Font("SansSerif", 1, 23));
        lblNewLabel_1.setBounds(178, 29, 142, 37);
        sfondo.add(lblNewLabel_1);
        JLabel lblNewLabel_2 = new JLabel("Inserire nuovo membro del personale");
        lblNewLabel_2.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_2.setBounds(173, 86, 235, 13);
        sfondo.add(lblNewLabel_2);
        JLabel lblNewLabel_3 = new JLabel("Qualifica : ");
        lblNewLabel_3.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_3.setBounds(10, 144, 75, 13);
        sfondo.add(lblNewLabel_3);
        JLabel lblNewLabel_3_1 = new JLabel("Nome : ");
        lblNewLabel_3_1.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_3_1.setBounds(10, 190, 45, 13);
        sfondo.add(lblNewLabel_3_1);
        JLabel lblNewLabel_3_2 = new JLabel("Cognome");
        lblNewLabel_3_2.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_3_2.setBounds(10, 236, 75, 13);
        sfondo.add(lblNewLabel_3_2);
        JLabel lblNewLabel_3_5 = new JLabel("Centro : ");
        lblNewLabel_3_5.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_3_5.setBounds(10, 420, 75, 13);
        sfondo.add(lblNewLabel_3_5);
        JLabel lblNewLabel_3_6 = new JLabel("Data inizio lavoro : ");
        lblNewLabel_3_6.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_3_6.setBounds(10, 374, 98, 13);
        sfondo.add(lblNewLabel_3_6);
        final JComboBox comboBoxQualifica = new JComboBox();
        comboBoxQualifica.setModel(new DefaultComboBoxModel(new String[]{"Ricercatore", "Operatore", "Tecnico di laboratorio", "Ricercatore"}));
        comboBoxQualifica.setBounds(120, 141, 142, 21);
        sfondo.add(comboBoxQualifica);
        comboBoxQualifica.setOpaque(false);
        final JComboBox<String> comboBoxCentro = new JComboBox();

        for(int i = 0; i < this.controller.getNomeCentri().size(); ++i) {
            comboBoxCentro.addItem(((String)this.controller.getNomeCentri().get(i)).toString());
        }

        comboBoxCentro.setBounds(120, 415, 200, 18);
        sfondo.add(comboBoxCentro);
        this.Nome = new JTextField();
        this.Nome.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                InserimentoPersonale.this.Nome.setText("");
            }
        });
        this.Nome.setForeground(new Color(192, 192, 192));
        this.Nome.setFont(new Font("Tahoma", 2, 10));
        this.Nome.setText("Inserire nome");
        this.Nome.setBounds(120, 188, 142, 19);
        sfondo.add(this.Nome);
        this.Nome.setColumns(10);
        this.Cognome = new JTextField();
        this.Cognome.setText("Inserire cognome");
        this.Cognome.setForeground(Color.LIGHT_GRAY);
        this.Cognome.setFont(new Font("Tahoma", 2, 10));
        this.Cognome.setColumns(10);
        this.Cognome.setBounds(120, 234, 142, 19);
        sfondo.add(this.Cognome);
        JLabel lblNewLabel_4 = new JLabel("Indirizzo : ");
        lblNewLabel_4.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_4.setBounds(10, 282, 75, 13);
        sfondo.add(lblNewLabel_4);
        this.Indirizzo = new JTextField();
        this.Indirizzo.setText("Inserire nome");
        this.Indirizzo.setForeground(Color.LIGHT_GRAY);
        this.Indirizzo.setFont(new Font("Tahoma", 2, 10));
        this.Indirizzo.setColumns(10);
        this.Indirizzo.setBounds(120, 280, 142, 19);
        sfondo.add(this.Indirizzo);
        final JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(133, 374, 150, 19);
        sfondo.add(dateChooser);
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/cross_mark_button_50px.png")));
        lblNewLabel_5.setBounds(254, 515, 66, 53);
        sfondo.add(lblNewLabel_5);
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/save_50px.png")));
        lblNewLabel_6.setBounds(330, 515, 66, 53);
        sfondo.add(lblNewLabel_6);
        JLabel lblNewLabel_7 = new JLabel("Cancella");
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_7.setBounds(254, 568, 66, 13);
        sfondo.add(lblNewLabel_7);
        JLabel lblNewLabel_8 = new JLabel("Salva");
        lblNewLabel_8.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_8.setBounds(352, 568, 66, 13);
        sfondo.add(lblNewLabel_8);
        JLabel lblNewLabel_3_1_1 = new JLabel("Codice Fiscale : ");
        lblNewLabel_3_1_1.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_3_1_1.setBounds(10, 328, 98, 13);
        sfondo.add(lblNewLabel_3_1_1);
        this.Codice_Fiscale = new JTextField();
        this.Codice_Fiscale.setText("Inserire nome");
        this.Codice_Fiscale.setForeground(Color.LIGHT_GRAY);
        this.Codice_Fiscale.setFont(new Font("Tahoma", 2, 10));
        this.Codice_Fiscale.setColumns(10);
        this.Codice_Fiscale.setBounds(120, 326, 142, 19);
        sfondo.add(this.Codice_Fiscale);
        lblNewLabel_6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String qualifica = (String)comboBoxQualifica.getSelectedItem();
                String nome = InserimentoPersonale.this.Nome.getText();
                String cognome = InserimentoPersonale.this.Cognome.getText();
                String residenza = InserimentoPersonale.this.Indirizzo.getText();
                String codice_fiscale = InserimentoPersonale.this.Codice_Fiscale.getText();
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String date = date_format.format(dateChooser.getDate());
                String centro = (String)comboBoxCentro.getSelectedItem();
                if (nome.isEmpty()) {
                    InserimentoPersonale.this.alertNomeNonInserito();
                } else if (cognome.isEmpty()) {
                    InserimentoPersonale.this.alertCognomeNonInserito();
                } else if (residenza.isEmpty()) {
                    InserimentoPersonale.this.alertResidenzaNonInserita();
                } else if (!InserimentoPersonale.this.controller.check_CodiceFiscale(codice_fiscale)) {
                    InserimentoPersonale.this.alertCodFiscaleNonCorretto();
                } else if (codice_fiscale.isEmpty()) {
                    InserimentoPersonale.this.alertCodiceFiscaleNonInserito();
                } else {
                    boolean flag = InserimentoPersonale.this.controller.InsertPersonale(qualifica, nome, cognome, residenza, codice_fiscale, date, centro);
                    if (flag) {
                        InserimentoPersonale.this.alertInserimentoRiuscito();
                    } else {
                        InserimentoPersonale.this.alertInserimentoFallito();
                    }
                }

            }
        });
    }

    public void alertInserimentoFallito() {
        JOptionPane.showMessageDialog(this, "Inserimento del personale non riuscito!", "<ATTENZIONE>", 2);
    }

    public void alertNomeNonInserito() {
        JOptionPane.showMessageDialog(this, "Nome  non inserito!", "<ATTENZIONE>", 2);
    }

    public void alertResidenzaNonInserita() {
        JOptionPane.showMessageDialog(this, "Residenza non inserita!", "<ATTENZIONE>", 2);
    }

    public void alertCodFiscaleNonCorretto() {
        JOptionPane.showMessageDialog(this, "Il codice fiscale inserito non è corretto!", "<ATTENZIONE>", 2);
    }

    public void alertCognomeNonInserito() {
        JOptionPane.showMessageDialog(this, "Cognome non inserito!", "<ATTENZIONE>", 2);
    }

    public void alertCodiceFiscaleNonInserito() {
        JOptionPane.showMessageDialog(this, "Codice fiscale non inserito!", "<ATTENZIONE>", 2);
    }

    public void alertInserimentoRiuscito() {
        JOptionPane.showMessageDialog(this, "Inserimento del personale riuscito!", "<ATTENZIONE>", 1);
    }
}
