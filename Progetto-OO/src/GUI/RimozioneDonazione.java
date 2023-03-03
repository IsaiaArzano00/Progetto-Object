package GUI;

import Components.PanelWhite;
import Controller.Controllore;
import DAO.DonazioneDAO;
import DTO.Donazione;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RimozioneDonazione extends JDialog {
    private JPanel contentPanel = new JPanel();
    private Controllore controller;
    private String idDonazione;
    private JComboBox<String> comboBoxDonazioni;
    private JButton tasto_Rimuovi;
    private JButton tasto_Esci;
    private Object tasto_Rimuovi_1;
    private Object tasto_Esci_1;
    private JTextField importoDonazione_in;
    private JTextField emailDonatore_in;
    private JTextField comboBoxPagamento;
    private JTextField dataDonazione_in;
    private JTextField idCentro_in;
    private DonazioneDAO donazioneDAO;

    public RimozioneDonazione(Controllore contr) {
        setResizable(false);
        controller = contr;
        this.donazioneDAO = this.controller.getDonazioneDAO();
        setDefaultCloseOperation(2);
        setBounds(100, 100, 486, 605);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(this.contentPanel, "Center");
        contentPanel.setLayout(new BorderLayout(0, 0));
        JPanel panel = new JPanel();
        contentPanel.add(panel, "Center");
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
       importoDonazione_in = new JTextField();
        importoDonazione_in.setEditable(false);
        importoDonazione_in.setFont(new Font("SansSerif", 0, 14));
       importoDonazione_in.setBounds(198, 163, 200, 27);
        sfondo.add(importoDonazione_in);
        importoDonazione_in.setColumns(10);
        comboBoxDonazioni = new JComboBox();
        comboBoxDonazioni.setFont(new Font("SansSerif", 0, 14));

        for(int i = 0; i < this.controller.getIdDonazioni().size(); ++i) {
            comboBoxDonazioni.addItem(((String)controller.getIdDonazioni().get(i)).toString());
        }

        comboBoxDonazioni.setBounds(198, 121, 200, 32);
        sfondo.add(this.comboBoxDonazioni);
        JButton tasto_Rimuovi_1 = new JButton("");
        tasto_Rimuovi_1.setBounds(368, 470, 56, 61);
        sfondo.add(tasto_Rimuovi_1);
        tasto_Rimuovi_1.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/save_50px.png")));
        JButton tasto_Esci_1 = new JButton("");
        tasto_Esci_1.setBounds(294, 470, 56, 61);
        sfondo.add(tasto_Esci_1);
        tasto_Esci_1.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/cross_mark_button_50px.png")));
        emailDonatore_in = new JTextField();
        emailDonatore_in.setEditable(false);
        emailDonatore_in.setFont(new Font("SansSerif", 0, 14));
        emailDonatore_in.setColumns(10);
        emailDonatore_in.setBounds(198, 200, 200, 27);
        sfondo.add(emailDonatore_in);
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
        this.comboBoxPagamento = new JTextField();
        this.comboBoxPagamento.setEditable(false);
        this.comboBoxPagamento.setEnabled(false);
        this.comboBoxPagamento.setFont(new Font("SansSerif", 0, 14));
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
        this.dataDonazione_in = new JTextField();
        this.dataDonazione_in.setEditable(false);
        this.dataDonazione_in.setFont(new Font("SansSerif", 0, 14));
        this.dataDonazione_in.setColumns(10);
        this.dataDonazione_in.setBounds(198, 237, 200, 27);
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
        this.comboBoxDonazioni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new String();
                String id_Donazione = (String)RimozioneDonazione.this.comboBoxDonazioni.getSelectedItem();
                Donazione don = RimozioneDonazione.this.donazioneDAO.recuperaDonazione(id_Donazione);
                RimozioneDonazione.this.importoDonazione_in.setText(String.valueOf(don.getimportoDonazione()));
                RimozioneDonazione.this.emailDonatore_in.setText(don.getEmailDonatore());
                RimozioneDonazione.this.comboBoxPagamento.setText(don.getMetodoPagamento());
                RimozioneDonazione.this.dataDonazione_in.setText(don.getDataDonazione().toString());
                RimozioneDonazione.this.idCentro_in.setText(don.getIdCentro());
            }
        });
        tasto_Rimuovi_1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                RimozioneDonazione.this.idDonazione = (String)RimozioneDonazione.this.comboBoxDonazioni.getSelectedItem();
                if (RimozioneDonazione.this.donazioneDAO.rimuoviDonazione(RimozioneDonazione.this.idDonazione)) {
                    RimozioneDonazione.this.AggiornaComboBoxDonazioni();
                    RimozioneDonazione.this.dispose();
                    RimozioneDonazione.this.alertDonazione();
                } else {
                    RimozioneDonazione.this.alertDonazioneSbagliata();
                }

            }
        });
        tasto_Esci_1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                RimozioneDonazione.this.dispose();
            }
        });
        this.setModal(true);
        this.setVisible(true);
    }

    public void AggiornaComboBoxDonazioni() {
        this.comboBoxDonazioni.removeItem(this.comboBoxDonazioni.getSelectedItem());
    }

   

    public String getIdDonazione() {
        return this.idDonazione;
    }

    public void notModal() {
        this.setModal(false);
    }

    public void alertDonazione() {
        JOptionPane.showMessageDialog(this, "Donazione rimossa con successo!");
    }

    public void alertDonazioneSbagliata() {
        JOptionPane.showMessageDialog(this, "Errore in fase di rimozione della donazione!");
    }
}
