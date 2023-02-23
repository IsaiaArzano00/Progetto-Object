package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JFormattedTextField.AbstractFormatter;
import com.toedter.calendar.JDateChooser;

import Components.*;
import Controller.Controllore;

public class InserimentoPersonale extends JFrame {

	private JPanel contentPane;
	private PanelCustomDashboard sfondo;
	private JTextField Nome;
	private JTextField Cognome;
	private JTextField Indirizzo;
	private JTextField Codice_Fiscale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserimentoPersonale frame = new InserimentoPersonale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InserimentoPersonale() {
		Controllore controller = new Controllore();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomDashboard sfondo = new PanelCustomDashboard();
		sfondo.setBounds(0, 0, 450, 643);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblNewLabel.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/management_80px.png")));
		lblNewLabel.setBounds(74, 10, 94, 111);
		sfondo.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(62, 109, 346, 25);
		sfondo.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Personale");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 23));
		lblNewLabel_1.setBounds(178, 29, 142, 37);
		sfondo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire nuovo membro del personale");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(173, 86, 235, 13);
		sfondo.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Qualifica : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 144, 75, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nome : ");
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(10, 190, 45, 13);
		sfondo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Cognome");
		lblNewLabel_3_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(10, 236, 75, 13);
		sfondo.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_5 = new JLabel("Centro : ");
		lblNewLabel_3_5.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3_5.setBounds(10, 420, 75, 13);
		sfondo.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Data inizio lavoro : ");
		lblNewLabel_3_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3_6.setBounds(10, 374, 98, 13);
		sfondo.add(lblNewLabel_3_6);
		
		JComboBox comboBoxQualifica = new JComboBox();
		comboBoxQualifica.setModel(new DefaultComboBoxModel(new String[] {"Ricercatore", "Operatore", "Tecnico di laboratorio", "Ricercatore"}));
		comboBoxQualifica.setBounds(120, 141, 142, 21);
		sfondo.add(comboBoxQualifica);
		comboBoxQualifica.setOpaque(false);
		
		JComboBox<String> comboBoxCentro = new JComboBox<>();
		for(int i=0 ; i<controller.getNomeCentri().size();i++) {
			comboBoxCentro.addItem(controller.getNomeCentri().get(i).toString());
		}
		comboBoxCentro.setBounds(120, 415, 200, 18);
		sfondo.add(comboBoxCentro);
		
		
		Nome = new JTextField();
		Nome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Nome.setText("");
			}
		});
		Nome.setForeground(new Color(192, 192, 192));
		Nome.setFont(new Font("Tahoma", Font.ITALIC, 10));
		Nome.setText("Inserire nome");
		Nome.setBounds(120, 188, 142, 19);
		sfondo.add(Nome);
		Nome.setColumns(10);
		
		Cognome = new JTextField();
		Cognome.setText("Inserire cognome");
		Cognome.setForeground(Color.LIGHT_GRAY);
		Cognome.setFont(new Font("Tahoma", Font.ITALIC, 10));
		Cognome.setColumns(10);
		Cognome.setBounds(120, 234, 142, 19);
		sfondo.add(Cognome);
		
		JLabel lblNewLabel_4 = new JLabel("Indirizzo : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 282, 75, 13);
		sfondo.add(lblNewLabel_4);
		
		Indirizzo = new JTextField();
		Indirizzo.setText("Inserire nome");
		Indirizzo.setForeground(Color.LIGHT_GRAY);
		Indirizzo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		Indirizzo.setColumns(10);
		Indirizzo.setBounds(120, 280, 142, 19);
		sfondo.add(Indirizzo);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(133, 374, 150, 19);
		sfondo.add(dateChooser);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/cross_mark_button_50px.png")));
		lblNewLabel_5.setBounds(254, 515, 66, 53);
		sfondo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		
		lblNewLabel_6.setIcon(new ImageIcon(InserimentoPersonale.class.getResource("/Media/save_50px.png")));
		lblNewLabel_6.setBounds(342, 515, 66, 53);
		sfondo.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Cancella");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(254, 568, 66, 13);
		sfondo.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Salva");
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_8.setBounds(352, 568, 66, 13);
		sfondo.add(lblNewLabel_8);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Codice Fiscale : ");
		lblNewLabel_3_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(10, 328, 98, 13);
		sfondo.add(lblNewLabel_3_1_1);
		
		Codice_Fiscale = new JTextField();
		Codice_Fiscale.setText("Inserire nome");
		Codice_Fiscale.setForeground(Color.LIGHT_GRAY);
		Codice_Fiscale.setFont(new Font("Tahoma", Font.ITALIC, 10));
		Codice_Fiscale.setColumns(10);
		Codice_Fiscale.setBounds(120, 326, 142, 19);
		sfondo.add(Codice_Fiscale);
		
		//ACTION 
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String qualifica = (String) comboBoxQualifica.getSelectedItem();
				String nome=Nome.getText();
				String cognome=Cognome.getText();
				String residenza = Indirizzo.getText();
				String codice_fiscale=Codice_Fiscale.getText();
				
				SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
				String date = date_format.format(dateChooser.getDate());
				
				String centro=(String)comboBoxCentro.getSelectedItem();
				if(nome.isEmpty())
					alertNomeNonInserito();
				else if(cognome.isEmpty())
					alertCognomeNonInserito();
				else if(residenza.isEmpty())
					alertResidenzaNonInserita();
				else if(!controller.check_CodiceFiscale(codice_fiscale))
					alertCodFiscaleNonCorretto();
				else if(codice_fiscale.isEmpty())
					alertCodiceFiscaleNonInserito();
				else
				{
					boolean flag = controller.InsertPersonale(qualifica, nome, cognome, residenza, codice_fiscale, date, centro);
					if(flag)
					{
						alertInserimentoRiuscito();
						sfondo.getTopLevelAncestor().setVisible(false);
					}	
					else
						alertInserimentoFallito();
				}
				
			}
		});
		
	}
	//ALERT
	public void alertInserimentoFallito() {
		JOptionPane.showMessageDialog(this, "Inserimento del personale non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}

	public void alertNomeNonInserito() {
		JOptionPane.showMessageDialog(this, "Nome  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}

	public void alertResidenzaNonInserita() {
		JOptionPane.showMessageDialog(this, "Residenza non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertCodFiscaleNonCorretto() {
		JOptionPane.showMessageDialog(this, "Il codice fiscale inserito non è corretto!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertCognomeNonInserito() {
		JOptionPane.showMessageDialog(this, "Cognome non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertCodiceFiscaleNonInserito() {
		JOptionPane.showMessageDialog(this, "Codice fiscale non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	
	public void alertInserimentoRiuscito() {
		JOptionPane.showMessageDialog(this, "Inserimento del personale riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
