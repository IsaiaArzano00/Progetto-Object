//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GUI;

import Components.PanelCustomBlue;
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
import javax.swing.JSeparator;

public class ModificaDonazione extends JDialog {
    private JPanel contentPanel = new JPanel();
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
    private JLabel tasto_Modifica;

    public ModificaDonazione(Controllore contr) {
    	 setResizable(false);
         controller = contr;
         
         setDefaultCloseOperation(2);
         setBounds(100, 100, 470, 589);
         getContentPane().setLayout(null);
         contentPanel.setBounds(0, 0, 462, 558);
         contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
         getContentPane().add(this.contentPanel);
         contentPanel.setLayout(null);
         
         JPanel panel = new JPanel();
         panel.setBounds(0, 0, 462, 558);
         contentPanel.add(panel);
        
        panel.setLayout(null);
        PanelCustomBlue sfondo = new PanelCustomBlue();
        sfondo.setLayout((LayoutManager)null);
        
        sfondo.setBounds(0, 0, 479, 558);
        panel.add(sfondo);
        sfondo.setLayout(null);
        sfondo.setLayout(null);
        sfondo.setLayout(null);
        sfondo.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0,0,0,90));
        panel_1.setBounds(0, 0, 751, 104);
        sfondo.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(ModificaDonazione.class.getResource("/Media/Money Circulation_100px.png")));
        lblNewLabel.setBounds(10, 0, 117, 94);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("Selezionare la donazione da modificare.\r\n");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_2.setBounds(137, 47, 252, 25);
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_1 = new JLabel("MODIFICA DONAZIONE");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(137, 10, 252, 40);
        panel_1.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("SansSerif", 1, 20));
        
        JLabel lblNewLabel_3 = new JLabel("DONAZIONE:");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setHorizontalAlignment(4);
        lblNewLabel_3.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3.setBounds(49, 128, 139, 19);
        sfondo.add(lblNewLabel_3);
        
        importoDonazione_in = new JTextField();
        importoDonazione_in.setForeground(new Color(255, 255, 255));
        importoDonazione_in.setOpaque(false);
        importoDonazione_in.setBorder(null);
        importoDonazione_in.setEditable(false);
        importoDonazione_in.setFont(new Font("SansSerif", Font.BOLD, 12));
        importoDonazione_in.setBounds(198, 180, 200, 27);
        sfondo.add(importoDonazione_in);
        importoDonazione_in.setColumns(10);
        
        comboBoxDonazioni = new JComboBox();
        comboBoxDonazioni.setFont(new Font("SansSerif", 0, 14));

        for(int i = 0; i <controller.getIdDonazioni().size(); ++i) {
            this.comboBoxDonazioni.addItem((controller.getIdDonazioni().get(i)).toString());
        }

       comboBoxDonazioni.setSelectedItem((Object)null);
        comboBoxDonazioni.setBounds(198, 128, 200, 23);
        sfondo.add(comboBoxDonazioni);
        
        tasto_Modifica = new JLabel("");
        
        tasto_Modifica.setBounds(379, 475, 56, 61);
        sfondo.add(tasto_Modifica);
        tasto_Modifica.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/save_50px.png")));
        
        JLabel GoBack = new JLabel("");
     
        GoBack.setBounds(10, 475, 56, 61);
        sfondo.add(GoBack);
        GoBack.setIcon(new ImageIcon(ModificaDonazione.class.getResource("/Media/undo_50px.png")));
        
        JLabel lblNewLabel_3_1_1_1 = new JLabel("EMAIL DONATORE:");
        lblNewLabel_3_1_1_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_1_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_1_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_1_1.setBounds(49, 225, 139, 19);
        sfondo.add(lblNewLabel_3_1_1_1);
        
        emailDonatore_in = new JTextField();
        emailDonatore_in.setForeground(new Color(255, 255, 255));
        emailDonatore_in.setOpaque(false);
        emailDonatore_in.setBorder(null);
        emailDonatore_in.setEditable(false);
        emailDonatore_in.setFont(new Font("SansSerif", Font.BOLD, 12));
        emailDonatore_in.setColumns(10);
        emailDonatore_in.setBounds(198, 220, 200, 27);
        sfondo.add(emailDonatore_in);
        
        JLabel lblNewLabel_3_1_2 = new JLabel("IMPORTO DONAZIONE:");
        lblNewLabel_3_1_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_2.setHorizontalAlignment(4);
        lblNewLabel_3_1_2.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2.setBounds(49, 185, 139, 19);
        sfondo.add(lblNewLabel_3_1_2);
        
        comboBoxPagamento = new JComboBox();
        comboBoxPagamento.setFont(new Font("SansSerif", 0, 14));
        comboBoxPagamento.setModel(new DefaultComboBoxModel(new String[] {"PayPal", "Mastercard", "Visa", "Bonifico_bancario"}));
        comboBoxPagamento.setBounds(198, 311, 203, 23);
        sfondo.add(comboBoxPagamento);
        
        JLabel lblNewLabel_3_1_1_1_1 = new JLabel("METODO PAGAMENTO:");
        lblNewLabel_3_1_1_1_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_1_1_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_1_1_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_1_1_1.setBounds(49, 310, 139, 24);
        sfondo.add(lblNewLabel_3_1_1_1_1);
        
        JLabel lblNewLabel_3_1_2_1 = new JLabel("DATA DONAZIONE:");
        lblNewLabel_3_1_2_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_2_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_2_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2_1.setBounds(49, 270, 139, 19);
        sfondo.add(lblNewLabel_3_1_2_1);
        
        dataDonazione_in = new JDateChooser();
        dataDonazione_in.setEnabled(false);
        dataDonazione_in.getCalendarButton().setEnabled(false);
        dataDonazione_in.setBounds(198, 265, 200, 27);
        dataDonazione_in.setDate((Date)null);
        sfondo.add(dataDonazione_in);
        
        JLabel lblNewLabel_3_1_2_2 = new JLabel("ID CENTRO:");
        lblNewLabel_3_1_2_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_2_2.setHorizontalAlignment(4);
        lblNewLabel_3_1_2_2.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2_2.setBounds(49, 365, 139, 24);
        sfondo.add(lblNewLabel_3_1_2_2);
        
        idCentro_in = new JTextField();
        idCentro_in.setForeground(new Color(255, 255, 255));
        idCentro_in.setOpaque(false);
        idCentro_in.setBorder(null);
        idCentro_in.setFont(new Font("SansSerif", Font.BOLD, 12));
        idCentro_in.setBackground(new Color(224, 224, 224));
        idCentro_in.setEditable(false);
       idCentro_in.setColumns(10);
        idCentro_in.setBounds(198, 360, 200, 27);
        sfondo.add(idCentro_in);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(198, 205, 203, 5);
        sfondo.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(198, 245, 208, 5);
        sfondo.add(separator_1);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(198, 385, 200, 5);
        sfondo.add(separator_2);
        //LISTENER
       comboBoxDonazioni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new String();

                try {
                    String id_Donazione = (String)ModificaDonazione.this.comboBoxDonazioni.getSelectedItem();
                    if (id_Donazione != null) {             
                        importoDonazione_in.setEditable(true);
                        emailDonatore_in.setEditable(true);
                        comboBoxPagamento.setEnabled(true);
                        dataDonazione_in.setFocusable(true);
                        idCentro_in.setEditable(true);
                        tasto_Modifica.setEnabled(true);
                        dataDonazione_in.setEnabled(true);
                        importoDonazione_in.setText(String.valueOf(controller.recuperaDonazione(id_Donazione).getimportoDonazione()));
                        emailDonatore_in.setText(controller.recuperaDonazione(id_Donazione).getEmailDonatore());
                        comboBoxPagamento.setSelectedItem(controller.recuperaDonazione(id_Donazione).getMetodoPagamento());
                        dataDonazione_in.setDate(controller.recuperaDonazione(id_Donazione).getDataDonazione());
                        idCentro_in.setText(controller.recuperaDonazione(id_Donazione).getIdCentro());
                    } else {
                        ModificaDonazione.this.reset();
                    }
                } catch (Exception var4) {
                    ModificaDonazione.this.alertSelezionareDonazione();
                }
            }
        });
       GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sfondo.getTopLevelAncestor().setVisible(false);
			}
		});
       tasto_Modifica.addMouseListener(new MouseAdapter() {
       	@Override
       	public void mouseClicked(MouseEvent e) {
       		String email = emailDonatore_in.getText();
            SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
            String data = date_format.format(dataDonazione_in.getDate());
            String metodoPagamento = (String)comboBoxPagamento.getSelectedItem();
            String idDonazione = (String)comboBoxDonazioni.getSelectedItem();
           
                int importo = Integer.parseInt(importoDonazione_in.getText());
                LocalDate dataScelta = dataDonazione_in.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate currentDate = LocalDate.now();
                
                if(importoDonazione_in.getText().isEmpty())
                	alertInserireImporto();
                else if (importo <= 0) 
                    alertInserireImportoValido();
                else if (email.isEmpty()) 
                    alertInserireEmail();
                else if (dataScelta.isAfter(currentDate)) 
                    alertDataNonValida();
                else if (metodoPagamento.isEmpty()) 
                    alertSelezionareMetodoPagamento();
                else if (controller.modificaDonazione(idDonazione, importo, email, data, metodoPagamento).equals("modifica riuscita")) {
                    ModificaOK();
                    reset();
                } 
                else {
                    ModificaKO(controller.modificaDonazione(idDonazione, importo, email, data, metodoPagamento));
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
        importoDonazione_in.setText((String)null);
        emailDonatore_in.setText((String)null);
        dataDonazione_in.setDate((Date)null);
        idCentro_in.setText((String)null);
        comboBoxPagamento.setSelectedItem((Object)null);
        comboBoxDonazioni.setSelectedItem((Object)null);
        importoDonazione_in.setEditable(false);
        emailDonatore_in.setEditable(false);
        dataDonazione_in.setFocusable(false);
       comboBoxPagamento.setEnabled(false);
        dataDonazione_in.setEnabled(false);
        tasto_Modifica.setEnabled(false);
    }

    public void alertDataNonValida() {
        JOptionPane.showMessageDialog(this, "data donazione maggiore della data attuale", "<ATTENZIONE>", 2);
    }
}
