package GUI;

import Components.PanelWhite;
import Controller.Controllore;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class InserimentoDonazione extends JDialog {
    private JPanel contentPane;
    private PanelWhite sfondo;
    private JTextField importo_in;
    private JTextField emailDonatore_in;
    private Controllore controller;
   
    private JDateChooser dateChooser;
    private JComboBox<String> comboBoxCentro;
    private JComboBox comboBoxMetodiPagamento;

    public InserimentoDonazione(Controllore contr) {
        controller = contr;
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 481, 539);
       
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.contentPane);
       contentPane.setLayout(null);
       
        PanelWhite sfondo = new PanelWhite();
        sfondo.setBounds(0, 0, 467, 502);
        contentPane.add(sfondo);
        sfondo.setLayout(null);
        
        importo_in = new JTextField();
        importo_in.setFont(new Font("Tahoma", Font.BOLD, 12));
        importo_in.setBounds(166, 115, 163, 19);
        sfondo.add(importo_in);
        importo_in.setColumns(10);
        importo_in.setBorder((Border)null);
        importo_in.setOpaque(false);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 467, 89);
        sfondo.add(panel);
        panel.setLayout(null);
        
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
        tasto_Esci.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/undo_50px.png")));
        tasto_Esci.setBounds(10, 431, 56, 61);
        sfondo.add(tasto_Esci);
        
        JLabel lblNewLabel_7 = new JLabel("Salva");
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_7.setBounds(381, 471, 54, 21);
        sfondo.add(lblNewLabel_7);
        
        emailDonatore_in = new JTextField();
        emailDonatore_in.setFont(new Font("SansSerif", Font.BOLD, 12));
        emailDonatore_in.setBackground(new Color(255, 255, 255));
        emailDonatore_in.setOpaque(false);
        emailDonatore_in.setColumns(10);
        emailDonatore_in.setBorder((Border)null);
        emailDonatore_in.setBounds(166, 219, 177, 19);
        sfondo.add(emailDonatore_in);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(156, 139, 271, 21);
        sfondo.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(156, 241, 271, 21);
        sfondo.add(separator_1);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(166, 162, 261, 19);
        Date date = new Date();
        dateChooser.setDate(date);
        sfondo.add(dateChooser);
        
        comboBoxMetodiPagamento = new JComboBox();
        comboBoxMetodiPagamento.setFont(new Font("SansSerif", Font.BOLD, 12));
        comboBoxMetodiPagamento.setModel(new DefaultComboBoxModel(new String[] {"PayPal", "Mastercard", "Visa", "Bonifico_bancario"}));
        comboBoxMetodiPagamento.setBounds(166, 273, 261, 21);
        sfondo.add(comboBoxMetodiPagamento);

        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(166, 331, 261, 32);
        sfondo.add(scrollPane);
        comboBoxCentro = new JComboBox();
        scrollPane.setRowHeaderView(comboBoxCentro);

        for(int i = 0; i < controller.getNomeCentri().size(); ++i) {
            this.comboBoxCentro.addItem((controller.getNomeCentri().get(i)).toString());
        }
        
        //LISTENER
        tasto_Salva.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int importo = Integer.parseInt(importo_in.getText());
                   

                String emailDonatore = emailDonatore_in.getText();
                String metodoPagamento = (String)comboBoxMetodiPagamento.getSelectedItem();
                
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String date = date_format.format(dateChooser.getDate());
                
                String centro = (String)comboBoxCentro.getSelectedItem();
                
                LocalDate dataScelta = dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate currentDate = LocalDate.now();
                if (importo <= 0) {
                	alertImportoNonValido();
                }
                else if(importo_in.getText().isEmpty())
                	alertImportoNonInserito();
                else if (dataScelta.isAfter(currentDate)) {
                    alertDataNonValida();
                } else if (emailDonatore.isEmpty()) {
                    alertEmailNonInserito();
                } else if (controller.InsertDonazione(importo, emailDonatore, date, metodoPagamento, centro)) {
                    alertInserimentoRiuscito();
                    importo_in.setText((String)null);
                    emailDonatore_in.setText((String)null);
                } else {
                    alertInserimentoFallito();
                }

            }
        });
        tasto_Esci.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                InserimentoDonazione.this.dispose();
            }
        });
        
        setModal(true);
        setVisible(true);
    }

    //ALERT
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
