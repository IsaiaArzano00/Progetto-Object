

package GUI;

import Components.PanelCustomBlue;
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
import java.sql.Date;
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

public class InserimentoPersonale extends JFrame {
    private JPanel contentPane;
    private PanelCustomDashboard sfondo;
    private JTextField Nome;
    private JTextField Cognome;
    private JTextField Indirizzo;
    private JTextField Codice_Fiscale;
    private Controllore controller;
    private JDateChooser dateChooser;
    private JComboBox comboBoxQualifica;
    private JComboBox<String> comboBoxCentro;

    public InserimentoPersonale(Controllore contr) {
    	setResizable(false);
        controller = contr;
        
        setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
        
        PanelCustomBlue sfondo = new PanelCustomBlue();
        sfondo.setBounds(0, 0, 450, 643);
        contentPane.add(sfondo);
        sfondo.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("Qualifica : ");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_3.setBounds(10, 144, 75, 13);
        sfondo.add(lblNewLabel_3);
        
        JLabel lblNewLabel_3_1 = new JLabel("Nome : ");
        lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_3_1.setBounds(10, 190, 45, 13);
        sfondo.add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_3_2 = new JLabel("Cognome :");
        lblNewLabel_3_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_2.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_3_2.setBounds(10, 236, 75, 13);
        sfondo.add(lblNewLabel_3_2);
        
        JLabel lblNewLabel_3_5 = new JLabel("Centro : ");
        lblNewLabel_3_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_5.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_3_5.setBounds(10, 420, 75, 13);
        sfondo.add(lblNewLabel_3_5);
        
        JLabel lblNewLabel_3_6 = new JLabel("Data inizio lavoro : ");
        lblNewLabel_3_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_6.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_3_6.setBounds(10, 374, 134, 13);
        sfondo.add(lblNewLabel_3_6);
        
        comboBoxQualifica = new JComboBox();
        comboBoxQualifica.setFont(new Font("SansSerif", Font.BOLD, 12));
        comboBoxQualifica.setModel(new DefaultComboBoxModel(new String[]{"Ricercatore", "Operatore", "Tecnico di laboratorio", "Ricercatore"}));
        comboBoxQualifica.setBounds(120, 141, 142, 21);
        sfondo.add(comboBoxQualifica);
        comboBoxQualifica.setOpaque(false);
          comboBoxCentro = new JComboBox();
         comboBoxCentro.setFont(new Font("SansSerif", Font.BOLD, 12));

        for(int i = 0; i < controller.getNomeCentri().size(); ++i) {
            comboBoxCentro.addItem(((String)controller.getNomeCentri().get(i)).toString());
        }

        comboBoxCentro.setBounds(120, 415, 200, 18);
        sfondo.add(comboBoxCentro);
        
        Nome = new JTextField();
        Nome.setBorder(null);
        Nome.setOpaque(false);
        Nome.setForeground(Color.LIGHT_GRAY);
		Nome.setFont(new Font("Tahoma", 2, 10));
		Nome.setText("Inserire nome ");
        Nome.setBounds(120, 188, 150, 19);
        sfondo.add(Nome);
        Nome.setColumns(10);
        
        Cognome = new JTextField();
        Cognome.setOpaque(false);
        Cognome.setBorder(null);
        Cognome.setForeground(Color.LIGHT_GRAY);
		Cognome.setFont(new Font("Tahoma", 2, 10));
		Cognome.setText("Inserire Cognome");
        Cognome.setColumns(10);
        Cognome.setBounds(120, 234, 142, 19);
        sfondo.add(Cognome);
        
        JLabel lblNewLabel_4 = new JLabel("Indirizzo : ");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_4.setBounds(10, 282, 75, 13);
        sfondo.add(lblNewLabel_4);
        Indirizzo = new JTextField();
        Indirizzo.setOpaque(false);
        Indirizzo.setBorder(null);
        Indirizzo.setForeground(Color.LIGHT_GRAY);
		Indirizzo.setFont(new Font("Tahoma", 2, 10));
		Indirizzo.setText("Inserire indirizzo ");
        Indirizzo.setColumns(10);
        Indirizzo.setBounds(120, 280, 142, 19);
        sfondo.add(Indirizzo);
        
          dateChooser = new JDateChooser();
         dateChooser.setOpaque(false);
        dateChooser.setBounds(154, 374, 150, 19);
        sfondo.add(dateChooser);
        
        JLabel GoBack = new JLabel("");
        GoBack.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/undo_50px.png")));
        GoBack.setBounds(10, 469, 66, 53);
        sfondo.add(GoBack);
        
        JLabel InserisciPersonale = new JLabel("");
        InserisciPersonale.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/save_50px.png")));
        InserisciPersonale.setBounds(356, 469, 66, 53);
        sfondo.add(InserisciPersonale);
        
        JLabel lblNewLabel_3_1_1 = new JLabel("Codice Fiscale : ");
        lblNewLabel_3_1_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblNewLabel_3_1_1.setBounds(10, 328, 98, 13);
        sfondo.add(lblNewLabel_3_1_1);
        
        Codice_Fiscale = new JTextField();
        Codice_Fiscale.setOpaque(false);
        Codice_Fiscale.setBorder(null);
        Codice_Fiscale.setForeground(Color.LIGHT_GRAY);
		  Codice_Fiscale.setFont(new Font("Tahoma", 2, 10));
		  Codice_Fiscale.setText("Inserire codice fiscale ");
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
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 450, 111);
        panel.setBackground(new Color(0,0,0,70));
        sfondo.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("\r\n");
        lblNewLabel.setBounds(10, 0, 94, 111);
        panel.add(lblNewLabel);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("SansSerif", 0, 23));
        lblNewLabel.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/management_80px.png")));
        
        JLabel lblNewLabel_1 = new JLabel("INSERISCI PERSONALE");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(110, 10, 268, 37);
        panel.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("SansSerif", 1, 23));
        
        JLabel lblNewLabel_2 = new JLabel("Inserire nuovo membro del personale");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBounds(110, 55, 235, 13);
        panel.add(lblNewLabel_2);
        lblNewLabel_2.setFont(new Font("SansSerif", 0, 12));
        
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
				Nome.setForeground(new Color(255,255,255));
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
				Cognome.setForeground(new Color(255,255,255));
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
				Indirizzo.setForeground(new Color(255,255,255));
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
				Codice_Fiscale.setForeground(new Color(255,255,255));
			    Codice_Fiscale.setFont(new Font("SansSerif", Font.BOLD, 12));

			}
		});
		
		GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InserimentoPersonale.this.setVisible(false);
			}
		});
		
		
        InserisciPersonale.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Nome.getText().isEmpty()) {
                    alertNomeNonInserito();
                } else if (Cognome.getText().isEmpty()) {
                    alertCognomeNonInserito();
                } else if (Indirizzo.getText().isEmpty()) {
                    alertResidenzaNonInserita();
                } else if (!InserimentoPersonale.this.controller.check_CodiceFiscale(Codice_Fiscale.getText())) {
                    alertCodFiscaleNonCorretto();
                } else if (Codice_Fiscale.getText().isEmpty()) {
                    alertCodiceFiscaleNonInserito();
                } else {
                    boolean flag = controller.InsertPersonale();
                    if (flag) {
                        alertInserimentoRiuscito();
                        InserimentoPersonale.this.setVisible(false);
                    } else {
                        alertInserimentoFallito();
                    }
                }

            }
        });
    }

    //FUNCTIONS
    public String GetQualifica()
    {
    	String qualifica = (String)comboBoxQualifica.getSelectedItem();
    	return qualifica;
    }
    public String GetNome()
    {
    	String nome = Nome.getText();
    	return nome;
    }
    public String GetCognome()
    {
    	String cognome = Cognome.getText();
    	return cognome;
    }
    public String GetIndirizzo()
    {
    	 String residenza = Indirizzo.getText();
    	 return residenza;
    }
    public String GetCodiceFiscale()
    {
    	String codice_fiscale = Codice_Fiscale.getText();
    	return codice_fiscale;
    }
    public String GetCentro()
    {
    	String centro = (String)comboBoxCentro.getSelectedItem();
    	return centro;
    }
    public Date GetData()
    {
    	Date data = (Date) dateChooser.getDate();
    	return data;
    }
    //ALERT
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
