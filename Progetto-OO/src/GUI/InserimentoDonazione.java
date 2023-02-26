//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GUI;

import Components.PanelWhite;
import Controller.Controllore;
import DAO.CentroDAO;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class InserimentoDonazione extends JDialog {
    private JPanel contentPane;
    private PanelWhite sfondo;
    private JTextField importo_in;
    private JTextField emailDonatore_in;
    private Controllore controller;
    private CentroDAO centro;
    private JDateChooser dateChooser;
    private JComboBox<String> comboBoxCentro;
    private JComboBox comboBoxMetodiPagamento;

    public InserimentoDonazione(Controllore contr) {
        this.controller = contr;
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 481, 539);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        PanelWhite sfondo = new PanelWhite();
        sfondo.setBounds(0, 0, 467, 502);
        this.contentPane.add(sfondo);
        sfondo.setLayout((LayoutManager)null);
        this.importo_in = new JTextField();
        this.importo_in.setBounds(166, 115, 163, 19);
        sfondo.add(this.importo_in);
        this.importo_in.setColumns(10);
        this.importo_in.setBorder((Border)null);
        this.importo_in.setOpaque(false);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 467, 89);
        sfondo.add(panel);
        panel.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/euro_money_80px.png")));
        lblNewLabel.setBounds(10, 10, 83, 79);
        panel.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("DONAZIONE");
        lblNewLabel_1.setFont(new Font("SansSerif", 1, 20));
        lblNewLabel_1.setBounds(103, 10, 177, 40);
        panel.add(lblNewLabel_1);
        JLabel lblNewLabel_2 = new JLabel("Inserire la donazione ricevuta.");
        lblNewLabel_2.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_2.setBounds(103, 54, 177, 13);
        panel.add(lblNewLabel_2);
        JLabel lblNewLabel_3 = new JLabel("Importo : ");
        lblNewLabel_3.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3.setBounds(10, 112, 69, 22);
        sfondo.add(lblNewLabel_3);
        JLabel lblNewLabel_3_1 = new JLabel("Data donazione : ");
        lblNewLabel_3_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1.setBounds(10, 162, 98, 22);
        sfondo.add(lblNewLabel_3_1);
        JLabel lblNewLabel_3_2 = new JLabel("email donatore : ");
        lblNewLabel_3_2.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_2.setBounds(10, 216, 98, 22);
        sfondo.add(lblNewLabel_3_2);
        JLabel lblNewLabel_3_3 = new JLabel("Metodo di pagamento : ");
        lblNewLabel_3_3.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_3.setBounds(10, 271, 132, 22);
        sfondo.add(lblNewLabel_3_3);
        JLabel lblNewLabel_3_4 = new JLabel("Centro : ");
        lblNewLabel_3_4.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_4.setBounds(10, 324, 69, 22);
        sfondo.add(lblNewLabel_3_4);
        JLabel tasto_Salva = new JLabel("");
        tasto_Salva.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/save_50px.png")));
        tasto_Salva.setBounds(371, 415, 56, 61);
        sfondo.add(tasto_Salva);
        JLabel tasto_Esci = new JLabel("");
        tasto_Esci.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/cross_mark_button_50px.png")));
        tasto_Esci.setBounds(305, 415, 56, 61);
        sfondo.add(tasto_Esci);
        JLabel lblNewLabel_6 = new JLabel("Esci");
        lblNewLabel_6.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_6.setBounds(315, 465, 58, 32);
        sfondo.add(lblNewLabel_6);
        JLabel lblNewLabel_7 = new JLabel("Salva");
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_7.setBounds(373, 471, 54, 21);
        sfondo.add(lblNewLabel_7);
        this.emailDonatore_in = new JTextField();
        this.emailDonatore_in.setBackground(new Color(255, 255, 255));
        this.emailDonatore_in.setOpaque(false);
        this.emailDonatore_in.setColumns(10);
        this.emailDonatore_in.setBorder((Border)null);
        this.emailDonatore_in.setBounds(166, 219, 177, 19);
        sfondo.add(this.emailDonatore_in);
        JSeparator separator = new JSeparator();
        separator.setBounds(156, 139, 271, 21);
        sfondo.add(separator);
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(156, 241, 271, 21);
        sfondo.add(separator_1);
        final JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(166, 162, 261, 19);
        Date date = new Date();
        dateChooser.setDate(date);
        sfondo.add(dateChooser);
        this.comboBoxMetodiPagamento = new JComboBox();
        this.comboBoxMetodiPagamento.setFont(new Font("SansSerif", 0, 12));
        this.comboBoxMetodiPagamento.setModel(new DefaultComboBoxModel(new String[]{"PayPal", "MasterCard", "Visa", "Bonifico Bancario"}));
        this.comboBoxMetodiPagamento.setBounds(166, 273, 261, 21);
        sfondo.add(this.comboBoxMetodiPagamento);
        this.comboBoxCentro = new JComboBox();

        for(int i = 0; i < this.controller.getNomeCentri().size(); ++i) {
            this.comboBoxCentro.addItem(((String)this.controller.getNomeCentri().get(i)).toString());
        }

        this.comboBoxCentro.setBounds(166, 327, 261, 18);
        sfondo.add(this.comboBoxCentro);
        tasto_Salva.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int importo = 0;

                try {
                    importo = Integer.parseInt(InserimentoDonazione.this.importo_in.getText());
                    if (importo <= 0) {
                        InserimentoDonazione.this.alertImportoNonInserito();
                    }
                } catch (Exception var10) {
                    InserimentoDonazione.this.alertImportoNonValido();
                }

                String emailDonatore = InserimentoDonazione.this.emailDonatore_in.getText();
                String metodoPagamento = (String)InserimentoDonazione.this.comboBoxMetodiPagamento.getSelectedItem();
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String date = date_format.format(dateChooser.getDate());
                String centro = (String)InserimentoDonazione.this.comboBoxCentro.getSelectedItem();
                LocalDate dataScelta = dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate currentDate = LocalDate.now();
                if (dataScelta.isBefore(currentDate)) {
                    InserimentoDonazione.this.alertDataNonValida();
                } else if (emailDonatore.isEmpty()) {
                    InserimentoDonazione.this.alertEmailNonInserito();
                } else if (InserimentoDonazione.this.controller.InsertDonazione(importo, emailDonatore, date, metodoPagamento, centro)) {
                    InserimentoDonazione.this.alertInserimentoRiuscito();
                    InserimentoDonazione.this.importo_in.setText((String)null);
                    InserimentoDonazione.this.emailDonatore_in.setText((String)null);
                } else {
                    InserimentoDonazione.this.alertInserimentoFallito();
                }

            }
        });
        tasto_Esci.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                InserimentoDonazione.this.dispose();
            }
        });
        this.setModal(true);
        this.setVisible(true);
    }

    public void alertImportoNonInserito() {
        JOptionPane.showMessageDialog(this, "Importo della donazione non valido!", "<ATTENZIONE>", 2);
    }

    public void alertImportoNonValido() {
        JOptionPane.showMessageDialog(this, "Importo della donazione non valido, inserire un intero!", "<ATTENZIONE>", 2);
    }

    public void alertDataNonValida() {
        JOptionPane.showMessageDialog(this, "data donazione minore della data attuale", "<ATTENZIONE>", 2);
    }

    public void alertEmailNonInserito() {
        JOptionPane.showMessageDialog(this, "Il campo 'e-mail donatore' non può essere lasciato vuoto!", "<ATTENZIONE>", 2);
    }

    public void alertInserimentoFallito() {
        JOptionPane.showMessageDialog(this, "Inserimento donazione non riuscito!", "<ATTENZIONE>", 2);
    }

    public void alertInserimentoRiuscito() {
        JOptionPane.showMessageDialog(this, "Donazione aggiunta con successo!", "<ATTENZIONE>", 1);
    }
}
