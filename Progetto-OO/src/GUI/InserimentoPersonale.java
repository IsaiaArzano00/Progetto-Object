

package GUI;

import Components.PanelCustomDashboard;
import Controller.Controllore;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
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
import javax.swing.border.EmptyBorder;

public class InserimentoPersonale extends JDialog {
    private JPanel contentPane;
    private PanelCustomDashboard sfondo;
    private JTextField Nome;
    private JTextField Cognome;
    private JTextField Indirizzo;
    private JTextField Codice_Fiscale;
    private Controllore controller;

    public InserimentoPersonale(Controllore contr) {
        controller = contr;
        
        
        setVisible(true);
        setDefaultCloseOperation(2);
        setBounds(100, 100, 450, 650);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.contentPane);
        contentPane.setLayout(null);
        
        PanelCustomDashboard sfondo = new PanelCustomDashboard();
        sfondo.setBounds(0, 0, 450, 643);
        contentPane.add(sfondo);
        sfondo.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("\r\n");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 0, 23));
        lblNewLabel.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/management_80px.png")));
        lblNewLabel.setBounds(74, 10, 94, 111);
        sfondo.add(lblNewLabel);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(25, 109, 393, 25);
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
        
        JComboBox comboBoxQualifica = new JComboBox();
        comboBoxQualifica.setModel(new DefaultComboBoxModel(new String[]{"Ricercatore", "Operatore", "Tecnico di laboratorio", "Ricercatore"}));
        comboBoxQualifica.setBounds(120, 141, 142, 21);
        sfondo.add(comboBoxQualifica);
        comboBoxQualifica.setOpaque(false);
         JComboBox<String> comboBoxCentro = new JComboBox();

        for(int i = 0; i < controller.getNomeCentri().size(); ++i) {
            comboBoxCentro.addItem(((String)controller.getNomeCentri().get(i)).toString());
        }

        comboBoxCentro.setBounds(120, 415, 200, 18);
        sfondo.add(comboBoxCentro);
        
        Nome = new JTextField();
        Nome.setBorder(null);
        Nome.setOpaque(false);
        Nome.setForeground(Color.LIGHT_GRAY);
        Nome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        Nome.setText("Inserire nome");
        Nome.setBounds(120, 188, 150, 19);
        sfondo.add(Nome);
        Nome.setColumns(10);
        
        Cognome = new JTextField();
        Cognome.setOpaque(false);
        Cognome.setBorder(null);
        Cognome.setText("Inserire cognome");
        Cognome.setForeground(Color.LIGHT_GRAY);
        Cognome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        Cognome.setColumns(10);
        Cognome.setBounds(120, 234, 142, 19);
        sfondo.add(Cognome);
        
        JLabel lblNewLabel_4 = new JLabel("Indirizzo : ");
        lblNewLabel_4.setFont(new Font("SansSerif", 0, 12));
        lblNewLabel_4.setBounds(10, 282, 75, 13);
        sfondo.add(lblNewLabel_4);
        Indirizzo = new JTextField();
        Indirizzo.setOpaque(false);
        Indirizzo.setBorder(null);
        Indirizzo.setText("Inserire Indirizzo");
        Indirizzo.setForeground(Color.LIGHT_GRAY);
        Indirizzo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        Indirizzo.setColumns(10);
        Indirizzo.setBounds(120, 280, 142, 19);
        sfondo.add(Indirizzo);
        
         JDateChooser dateChooser = new JDateChooser();
         dateChooser.setOpaque(false);
        dateChooser.setBounds(133, 374, 150, 19);
        sfondo.add(dateChooser);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/cross_mark_button_50px.png")));
        lblNewLabel_5.setBounds(254, 515, 66, 53);
        sfondo.add(lblNewLabel_5);
        
        JLabel InserisciPersonale = new JLabel("");
        InserisciPersonale.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/save_50px.png")));
        InserisciPersonale.setBounds(330, 515, 66, 53);
        sfondo.add(InserisciPersonale);
        
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
        
        Codice_Fiscale = new JTextField();
        Codice_Fiscale.setOpaque(false);
        Codice_Fiscale.setBorder(null);
        Codice_Fiscale.setText("Inserire codice fiscale ");
        Codice_Fiscale.setForeground(Color.LIGHT_GRAY);
        Codice_Fiscale.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        Codice_Fiscale.setColumns(10);
        Codice_Fiscale.setBounds(120, 326, 142, 19);
        sfondo.add(this.Codice_Fiscale);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(120, 205, 142, 19);
        sfondo.add(separator_1);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(120, 251, 150, 19);
        sfondo.add(separator_2);
        
        JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(120, 298, 150, 13);
        sfondo.add(separator_3);
        
        JSeparator separator_4 = new JSeparator();
        separator_4.setBounds(120, 343, 150, 21);
        sfondo.add(separator_4);
        
        //LISTENER 
        Nome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(Nome.getText().isEmpty())
				{
					Nome.setForeground(Color.LIGHT_GRAY);
					Nome.setFont(new Font("Tahoma", 2, 10));
					Nome.setText("Inserire nome ");
				}
			}
		});
        Nome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Nome.setText("");
				Nome.setForeground(new Color(0, 0, 0));
				Nome.setFont(new Font("SansSerif", Font.BOLD, 12));
			}
		});
		
		Cognome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(Cognome.getText().isEmpty())
				{
					Cognome.setForeground(Color.LIGHT_GRAY);
					Cognome.setFont(new Font("Tahoma", 2, 10));
					Cognome.setText("Inserire Cognome");
				}
			}
		});
		
		
		Cognome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cognome.setText("");
				Cognome.setForeground(new Color(0, 0, 0));
				Cognome.setFont(new Font("SansSerif", Font.BOLD, 12));

			}
		});
		
		Indirizzo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(Indirizzo.getText().isEmpty())
				{
					Indirizzo.setForeground(Color.LIGHT_GRAY);
					Indirizzo.setFont(new Font("Tahoma", 2, 10));
					Indirizzo.setText("Inserire indirizzo ");
				}
			}
		});
		Indirizzo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Indirizzo.setText("");
				Indirizzo.setForeground(new Color(0, 0, 0));
				Indirizzo.setFont(new Font("SansSerif", Font.BOLD, 12));

			}
		});
		Codice_Fiscale.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(Codice_Fiscale.getText().isEmpty())
				{	
				 
				  Codice_Fiscale.setForeground(Color.LIGHT_GRAY);
				  Codice_Fiscale.setFont(new Font("Tahoma", 2, 10));
				  Codice_Fiscale.setText("Inserire codice fiscale ");
				}
			}
		});
		
		
		Codice_Fiscale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Codice_Fiscale.setText("");
				Codice_Fiscale.setForeground(new Color(0, 0, 0));
			    Codice_Fiscale.setFont(new Font("SansSerif", Font.BOLD, 12));

			}
		});
		
	
		
		
        InserisciPersonale.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String qualifica = (String)comboBoxQualifica.getSelectedItem();
                String nome = Nome.getText();
                String cognome = Cognome.getText();
                String residenza = Indirizzo.getText();
                String codice_fiscale = Codice_Fiscale.getText();
                
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String date = date_format.format(dateChooser.getDate());
                
                String centro = (String)comboBoxCentro.getSelectedItem();
                
                if (nome.isEmpty()) {
                    alertNomeNonInserito();
                } else if (cognome.isEmpty()) {
                    alertCognomeNonInserito();
                } else if (residenza.isEmpty()) {
                    alertResidenzaNonInserita();
                } else if (!InserimentoPersonale.this.controller.check_CodiceFiscale(codice_fiscale)) {
                    alertCodFiscaleNonCorretto();
                } else if (codice_fiscale.isEmpty()) {
                    alertCodiceFiscaleNonInserito();
                } else {
                    boolean flag = controller.InsertPersonale(qualifica, nome, cognome, residenza, codice_fiscale, date, centro);
                    if (flag) {
                        alertInserimentoRiuscito();
                        sfondo.getTopLevelAncestor().setVisible(false);
                    } else {
                        alertInserimentoFallito();
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
        JOptionPane.showMessageDialog(this, "Il codice fiscale inserito non ?? corretto!", "<ATTENZIONE>", 2);
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
