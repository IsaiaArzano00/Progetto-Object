package GUI;

import Components.PanelCustomBlue;
import Components.PanelWhite;
import Controller.Controllore;

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

public class RimozioneDonazione extends JDialog {
    private JPanel contentPanel = new JPanel();
    private Controllore controller;
    private JComboBox<String> comboBoxDonazioni;
    private JButton tasto_Rimuovi;
    private JButton tasto_Esci;
    private Object tasto_Rimuovi_1;
    private Object tasto_Esci_1;
    private JTextField importoDonazione_in;
    private JTextField emailDonatore_in;
    private JTextField idCentro_in;
    private JLabel tasto_Elimina;
    private JTextField data_1;
    private JTextField metodo_pagamento;

    public RimozioneDonazione(Controllore contr) {
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
        sfondo.setLayout(null);
        sfondo.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0,0,0,90));
        panel_1.setBounds(0, 0, 751, 104);
        sfondo.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(RimozioneDonazione.class.getResource("/Media/Money Circulation_100px.png")));
        lblNewLabel.setBounds(10, 0, 117, 94);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("Selezionare la donazione da eliminare.\r\n");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_2.setBounds(137, 47, 252, 25);
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_1 = new JLabel("RIMUOVI DONAZIONE");
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
        importoDonazione_in.setBounds(198, 184, 200, 21);
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
        
        tasto_Elimina = new JLabel("");
        
        tasto_Elimina.setBounds(379, 475, 56, 61);
        sfondo.add(tasto_Elimina);
        tasto_Elimina.setIcon(new ImageIcon(RimozioneDonazione.class.getResource("/Media/cross_mark_button_50px.png")));
        
        JLabel GoBack = new JLabel("");
     
        GoBack.setBounds(10, 475, 56, 61);
        sfondo.add(GoBack);
        GoBack.setIcon(new ImageIcon(RimozioneDonazione.class.getResource("/Media/undo_50px.png")));
        
        JLabel lblNewLabel_3_1_1_1 = new JLabel("EMAIL DONATORE:");
        lblNewLabel_3_1_1_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_1_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_1_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_1_1.setBounds(49, 250, 139, 19);
        sfondo.add(lblNewLabel_3_1_1_1);
        
        emailDonatore_in = new JTextField();
        emailDonatore_in.setForeground(new Color(255, 255, 255));
        emailDonatore_in.setOpaque(false);
        emailDonatore_in.setBorder(null);
        emailDonatore_in.setEditable(false);
        emailDonatore_in.setFont(new Font("SansSerif", Font.BOLD, 12));
        emailDonatore_in.setColumns(10);
        emailDonatore_in.setBounds(198, 249, 200, 21);
        sfondo.add(emailDonatore_in);
        
        JLabel lblNewLabel_3_1_2 = new JLabel("IMPORTO DONAZIONE:");
        lblNewLabel_3_1_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_2.setHorizontalAlignment(4);
        lblNewLabel_3_1_2.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2.setBounds(49, 190, 139, 19);
        sfondo.add(lblNewLabel_3_1_2);
        
        JLabel lblNewLabel_3_1_1_1_1 = new JLabel("METODO PAGAMENTO:");
        lblNewLabel_3_1_1_1_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_1_1_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_1_1_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_1_1_1.setBounds(49, 338, 139, 24);
        sfondo.add(lblNewLabel_3_1_1_1_1);
        
        JLabel lblNewLabel_3_1_2_1 = new JLabel("DATA DONAZIONE:");
        lblNewLabel_3_1_2_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_2_1.setHorizontalAlignment(4);
        lblNewLabel_3_1_2_1.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2_1.setBounds(49, 295, 139, 19);
        sfondo.add(lblNewLabel_3_1_2_1);
        
        JLabel lblNewLabel_3_1_2_2 = new JLabel("ID CENTRO:");
        lblNewLabel_3_1_2_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_2_2.setHorizontalAlignment(4);
        lblNewLabel_3_1_2_2.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_3_1_2_2.setBounds(49, 385, 139, 24);
        sfondo.add(lblNewLabel_3_1_2_2);
        
        idCentro_in = new JTextField();
        idCentro_in.setForeground(new Color(255, 255, 255));
        idCentro_in.setOpaque(false);
        idCentro_in.setBorder(null);
        idCentro_in.setFont(new Font("SansSerif", Font.BOLD, 12));
        idCentro_in.setBackground(new Color(224, 224, 224));
        idCentro_in.setEditable(false);
       idCentro_in.setColumns(10);
        idCentro_in.setBounds(198, 383, 200, 21);
        sfondo.add(idCentro_in);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(198, 205, 203, 5);
        sfondo.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(198, 270, 208, 5);
        sfondo.add(separator_1);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(198, 405, 200, 5);
        sfondo.add(separator_2);
        
        data_1 = new JTextField();
        data_1.setOpaque(false);
        data_1.setForeground(Color.WHITE);
        data_1.setFont(new Font("SansSerif", Font.BOLD, 12));
        data_1.setEditable(false);
        data_1.setColumns(10);
        data_1.setBorder(null);
        data_1.setBounds(198, 294, 200, 21);
        sfondo.add(data_1);
        
        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBounds(198, 316, 208, 5);
        sfondo.add(separator_1_1);
        
        metodo_pagamento = new JTextField();
        metodo_pagamento.setOpaque(false);
        metodo_pagamento.setForeground(Color.WHITE);
        metodo_pagamento.setFont(new Font("SansSerif", Font.BOLD, 12));
        metodo_pagamento.setEditable(false);
        metodo_pagamento.setColumns(10);
        metodo_pagamento.setBorder(null);
        metodo_pagamento.setBounds(198, 343, 200, 21);
        sfondo.add(metodo_pagamento);
        
        JSeparator separator_1_1_1 = new JSeparator();
        separator_1_1_1.setBounds(198, 365, 208, 5);
        sfondo.add(separator_1_1_1);
        //LISTENER
       comboBoxDonazioni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    String id_Donazione = (String)comboBoxDonazioni.getSelectedItem();
                   
                        importoDonazione_in.setText(String.valueOf(controller.recuperaDonazione(id_Donazione).getimportoDonazione()));
                        emailDonatore_in.setText(controller.recuperaDonazione(id_Donazione).getEmailDonatore());
                        metodo_pagamento.setText(controller.recuperaDonazione(id_Donazione).getMetodoPagamento());
                        data_1.setText(String.valueOf(controller.recuperaDonazione(id_Donazione).getDataDonazione()));
                        idCentro_in.setText(controller.recuperaDonazione(id_Donazione).getIdCentro());
            }
        });
       GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sfondo.getTopLevelAncestor().setVisible(false);
			}
		});
       tasto_Elimina.addMouseListener(new MouseAdapter() {
       	@Override
       	public void mouseClicked(MouseEvent e) {
       		String id_donazione = (String)comboBoxDonazioni.getSelectedItem();
       		boolean flag=controller.RimuoviDonazione(id_donazione);
       		if(flag)
       		{
       			EliminazioneOK(id_donazione);
       			sfondo.getTopLevelAncestor().setVisible(false);
       		}
       		else
       			EliminazioneKO(id_donazione);
       	
       	}
       });
       
        this.setModal(true);
        this.setVisible(true);
    }

    public void EliminazioneOK(String id) {
        JOptionPane.showMessageDialog(this, "Donazione : "+id+" eliminata con successo!");
    }

    public void EliminazioneKO(String id) {
        JOptionPane.showMessageDialog(this, "Donazione : "+id+" non eliminata correttamente ! ");
    }

}
