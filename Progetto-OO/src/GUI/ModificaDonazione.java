//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GUI;

import Components.PanelWhite;
import Controller.Controllore;
import DAO.DonazioneDAO;
import DTO.Donazione;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ModificaDonazione extends JDialog {
    private final JPanel contentPanel = new JPanel();
    private Controllore controller;
    private JComboBox<String> comboBoxDonazioni;
    private JButton tasto_Rimuovi;
    private JButton tasto_Esci;
    private Object tasto_Rimuovi_1;
    private Object tasto_Esci_1;
    private JTextField importoDonazione_in;
    private JTextField emailDonatore_in;
    private JComboBox comboBoxPagamento;
    private JDateChooser dataDonazione_in;
    private JTextField idCentro_in;
    private DonazioneDAO donazioneDAO;
    private JButton tasto_Modifica;

    public ModificaDonazione(Controllore contr) {
        this.setResizable(false);
        this.controller = contr;
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 486, 605);
        this.getContentPane().setLayout(new BorderLayout());
        this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.getContentPane().add(this.contentPanel, "Center");
        this.contentPanel.setLayout(new BorderLayout(0, 0));
        JPanel panel = new JPanel();
        this.contentPanel.add(panel, "Center");
        panel.setLayout((LayoutManager)null);
        PanelWhite sfondo = new PanelWhite();
        sfondo.setLayout((LayoutManager)null);
        sfondo.setBounds(0, 0, 462, 558);
        panel.add(sfondo);
        JPanel panel_1 = new JPanel();
        panel_1.setLayout((LayoutManager)null);
        panel_1.setBounds(0, 0, 751, 89);
        sfondo.add(panel_1);
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(10, 10, 83, 79);
        panel_1.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("DONAZIONE");
        lblNewLabel_1.setFont(new Font("SansSerif", 1, 20));
        lblNewLabel_1.setBounds(103, 10, 177, 40);
        panel_1.add(lblNewLabel_1);
        JLabel lblNewLabel_2 = new JLabel("Selezionare la donazione da modificare.\r\n");
        lblNewLabel_2.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_2.setBounds(103, 54, 252, 25);
        panel_1.add(lblNewLabel_2);
        JLabel lblNewLabel_3 = new JLabel("DONAZIONE:");
        lblNewLabel_3.setHorizontalAlignment(4);
        lblNewLabel_3.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3.setBounds(49, 128, 139, 19);
        sfondo.add(lblNewLabel_3);
        this.importoDonazione_in = new JTextField();
        this.importoDonazione_in.setEditable(false);
        this.importoDonazione_in.setFont(new Font("SansSerif", 0, 14));
        this.importoDonazione_in.setBounds(198, 163, 200, 27);
        sfondo.add(this.importoDonazione_in);
        this.importoDonazione_in.setColumns(10);
        this.comboBoxDonazioni = new JComboBox();
        this.comboBoxDonazioni.setFont(new Font("SansSerif", 0, 14));

        for(int i = 0; i < this.controller.getIdDonazioni().size(); ++i) {
            this.comboBoxDonazioni.addItem(((String)this.controller.getIdDonazioni().get(i)).toString());
        }

        this.comboBoxDonazioni.setSelectedItem((Object)null);
        this.comboBoxDonazioni.setBounds(198, 121, 200, 32);
        sfondo.add(this.comboBoxDonazioni);
        this.tasto_Modifica = new JButton("");
        this.tasto_Modifica.setEnabled(false);
        this.tasto_Modifica.setBounds(369, 442, 56, 61);
        sfondo.add(this.tasto_Modifica);
        this.tasto_Modifica.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/save_50px.png")));
        JButton tasto_Esci_1 = new JButton("");
        tasto_Esci_1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ModificaDonazione.this.dispose();
            }
        });
        tasto_Esci_1.setBounds(295, 442, 56, 61);
        sfondo.add(tasto_Esci_1);
        tasto_Esci_1.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/cross_mark_button_50px.png")));
        this.emailDonatore_in = new JTextField();
        this.emailDonatore_in.setEditable(false);
        this.emailDonatore_in.setFont(new Font("SansSerif", 0, 14));
        this.emailDonatore_in.setColumns(10);
        this.emailDonatore_in.setBounds(198, 200, 200, 27);
        sfondo.add(this.emailDonatore_in);
        JLabel lblNewLabel_3_1_1_1 = new JLabel("EMAIL DONATORE:");
        lblNewLabel_3_1_1_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_1_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_1_1.setBounds(49, 200, 139, 19);
        sfondo.add(lblNewLabel_3_1_1_1);
        JLabel lblNewLabel_3_1_2 = new JLabel("IMPORTO DONAZIONE:");
        lblNewLabel_3_1_2.setHorizontalAlignment(4);
        lblNewLabel_3_1_2.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2.setBounds(49, 163, 139, 19);
        sfondo.add(lblNewLabel_3_1_2);
        this.comboBoxPagamento = new JComboBox();
        this.comboBoxPagamento.setEnabled(false);
        this.comboBoxPagamento.setFont(new Font("SansSerif", 0, 14));
        this.comboBoxPagamento.setModel(new DefaultComboBoxModel(new String[]{"PayPal", "MasterCard", "Visa", "Bonifico Bancario"}));
        this.comboBoxPagamento.setBounds(198, 273, 203, 28);
        sfondo.add(this.comboBoxPagamento);
        JLabel lblNewLabel_3_1_1_1_1 = new JLabel("METODO PAGAMENTO:");
        lblNewLabel_3_1_1_1_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_1_1_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_1_1_1.setBounds(49, 274, 139, 24);
        sfondo.add(lblNewLabel_3_1_1_1_1);
        JLabel lblNewLabel_3_1_2_1 = new JLabel("DATA DONAZIONE:");
        lblNewLabel_3_1_2_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_2_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2_1.setBounds(49, 237, 139, 19);
        sfondo.add(lblNewLabel_3_1_2_1);
        this.dataDonazione_in = new JDateChooser();
        this.dataDonazione_in.setEnabled(false);
        this.dataDonazione_in.getCalendarButton().setEnabled(false);
        this.dataDonazione_in.setBounds(198, 237, 200, 27);
        this.dataDonazione_in.setDate((Date)null);
        sfondo.add(this.dataDonazione_in);
        JLabel lblNewLabel_3_1_2_2 = new JLabel("ID CENTRO:");
        lblNewLabel_3_1_2_2.setHorizontalAlignment(4);
        lblNewLabel_3_1_2_2.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2_2.setBounds(49, 311, 139, 24);
        sfondo.add(lblNewLabel_3_1_2_2);
        this.idCentro_in = new JTextField();
        this.idCentro_in.setFont(new Font("SansSerif", 0, 14));
        this.idCentro_in.setBackground(new Color(224, 224, 224));
        this.idCentro_in.setEditable(false);
        this.idCentro_in.setColumns(10);
        this.idCentro_in.setBounds(198, 311, 101, 27);
        sfondo.add(this.idCentro_in);
        JLabel lblNewLabel_3_1_2_2_1 = new JLabel("ANNULLA");
        lblNewLabel_3_1_2_2_1.setHorizontalAlignment(0);
        lblNewLabel_3_1_2_2_1.setFont(new Font("SansSerif", 1, 11));
        lblNewLabel_3_1_2_2_1.setBounds(295, 501, 56, 24);
        sfondo.add(lblNewLabel_3_1_2_2_1);
        JLabel lblNewLabel_3_1_2_2_1_1 = new JLabel("MODIFICA");
        lblNewLabel_3_1_2_2_1_1.setHorizontalAlignment(0);
        lblNewLabel_3_1_2_2_1_1.setFont(new Font("SansSerif", 1, 11));
        lblNewLabel_3_1_2_2_1_1.setBounds(369, 501, 56, 24);
        sfondo.add(lblNewLabel_3_1_2_2_1_1);
        this.comboBoxDonazioni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new String();

                try {
                    String id_Donazione = (String)ModificaDonazione.this.comboBoxDonazioni.getSelectedItem();
                    if (id_Donazione != null) {
                        Donazione don = ModificaDonazione.this.controller.recuperaDonazione(id_Donazione);
                        ModificaDonazione.this.importoDonazione_in.setEditable(true);
                        ModificaDonazione.this.emailDonatore_in.setEditable(true);
                        ModificaDonazione.this.comboBoxPagamento.setEnabled(true);
                        ModificaDonazione.this.dataDonazione_in.setFocusable(true);
                        ModificaDonazione.this.idCentro_in.setEditable(true);
                        ModificaDonazione.this.tasto_Modifica.setEnabled(true);
                        ModificaDonazione.this.dataDonazione_in.setEnabled(true);
                        ModificaDonazione.this.importoDonazione_in.setText(String.valueOf(don.getimportoDonazione()));
                        ModificaDonazione.this.emailDonatore_in.setText(don.getEmailDonatore());
                        ModificaDonazione.this.comboBoxPagamento.setSelectedItem(don.getMetodoPagamento());
                        ModificaDonazione.this.dataDonazione_in.setDate(don.getDataDonazione());
                        ModificaDonazione.this.idCentro_in.setText(don.getIdCentro());
                    } else {
                        ModificaDonazione.this.reset();
                    }
                } catch (Exception var4) {
                    ModificaDonazione.this.alertSelezionareDonazione();
                }

            }
        });
        this.tasto_Modifica.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String email = ModificaDonazione.this.emailDonatore_in.getText();
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String data = date_format.format(ModificaDonazione.this.dataDonazione_in.getDate());
                String metodoPagamento = (String)ModificaDonazione.this.comboBoxPagamento.getSelectedItem();
                String idDonazione = (String)ModificaDonazione.this.comboBoxDonazioni.getSelectedItem();
                boolean importox = false;

                try {
                    int importo = Integer.parseInt(ModificaDonazione.this.importoDonazione_in.getText());
                    if (importo <= 0) {
                        ModificaDonazione.this.alertInserireImporto();
                    }

                    if (email.isEmpty()) {
                        ModificaDonazione.this.alertInserireEmail();
                    }

                    LocalDate dataScelta = ModificaDonazione.this.dataDonazione_in.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    LocalDate currentDate = LocalDate.now();
                    if (dataScelta.isAfter(currentDate)) {
                        ModificaDonazione.this.alertDataNonValida();
                    }

                    if (metodoPagamento.isEmpty()) {
                        ModificaDonazione.this.alertSelezionareMetodoPagamento();
                    }

                    if (ModificaDonazione.this.controller.modificaDonazione(idDonazione, importo, email, data, metodoPagamento).equals("modifica riuscita")) {
                        ModificaDonazione.this.ModificaOK();
                        ModificaDonazione.this.reset();
                    } else {
                        ModificaDonazione.this.ModificaKO(ModificaDonazione.this.controller.modificaDonazione(idDonazione, importo, email, data, metodoPagamento));
                    }
                } catch (Exception var10) {
                    ModificaDonazione.this.alertInserireImportoValido();
                }

            }
        });
        this.setModal(true);
        this.setVisible(true);
    }

    public void ModificaOK() {
        JOptionPane.showMessageDialog(this, "Donazione modificata con successo!");
    }

    public void ModificaKO(String exMess) {
        JOptionPane.showMessageDialog(this, exMess);
    }

    public void alertInserireImporto() {
        JOptionPane.showMessageDialog(this, "l'importo deve essere maggiore di 0!");
    }

    public void alertInserireEmail() {
        JOptionPane.showMessageDialog(this, "Il campo 'Email' non può essere lasciato vuoto!");
    }

    public void alertInserireData() {
        JOptionPane.showMessageDialog(this, "Il campo 'Data' non può essere lasciato vuoto!");
    }

    public void alertSelezionareMetodoPagamento() {
        JOptionPane.showMessageDialog(this, "Selezionare un metodo di pagamento per effettuare la modifica!");
    }

    public void alertSelezionareDonazione() {
        JOptionPane.showMessageDialog(this, "Selezionare una donazione per effettuare la modifica!");
    }

    public void alertInserireImportoValido() {
        JOptionPane.showMessageDialog(this, "Inserire un importo valido!");
    }

    public void reset() {
        this.importoDonazione_in.setText((String)null);
        this.emailDonatore_in.setText((String)null);
        this.dataDonazione_in.setDate((Date)null);
        this.idCentro_in.setText((String)null);
        this.comboBoxPagamento.setSelectedItem((Object)null);
        this.comboBoxDonazioni.setSelectedItem((Object)null);
        this.importoDonazione_in.setEditable(false);
        this.emailDonatore_in.setEditable(false);
        this.dataDonazione_in.setFocusable(false);
        this.comboBoxPagamento.setEnabled(false);
        this.dataDonazione_in.setEnabled(false);
        this.tasto_Modifica.setEnabled(false);
    }

    public void alertDataNonValida() {
        JOptionPane.showMessageDialog(this, "data donazione maggiore della data attuale", "<ATTENZIONE>", 2);
    }
}
