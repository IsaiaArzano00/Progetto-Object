package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import Components.PanelWhite;
import Controller.Controllore;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class InserimentoCartellaMedica extends JDialog{

	private JPanel contentPane;
	private PanelWhite sfondo;
	private JTextField Peso;
	private JTextField Lunghezza;
	private JTextField Larghezza;
	private JTextField LuogoRitrovamento;
	private Controllore controller;

	public InserimentoCartellaMedica(Controllore contr) {
		controller=contr;
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 849, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelWhite sfondo = new PanelWhite();
		sfondo.setBounds(10, 0, 841, 621);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 977, 91);
		sfondo.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(10, 10, 84, 80);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(InserimentoCartellaMedica.class.getResource("/Media/health_book_80px.png")));
		
		JLabel lblNewLabel_1 = new JLabel("CARTELLA MEDICA");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_1.setBounds(104, 20, 346, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati della cartella medica.");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2.setBounds(114, 57, 233, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Peso : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 167, 45, 16);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Lunghezza : ");
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 209, 85, 21);
		sfondo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Larghezza : ");
		lblNewLabel_3_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(10, 254, 85, 21);
		sfondo.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Specie : ");
		lblNewLabel_3_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(10, 307, 56, 21);
		sfondo.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Luogo di ritrovamento : ");
		lblNewLabel_3_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(10, 358, 147, 21);
		sfondo.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Data apertura cartella : ");
		lblNewLabel_3_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(11, 413, 157, 21);
		sfondo.add(lblNewLabel_3_5);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(178, 415, 171, 19);
		sfondo.add(dateChooser);
		
		Peso = new JTextField();
		Peso.setFont(new Font("SansSerif", Font.BOLD, 12));
		Peso.setBounds(178, 167, 147, 19);
		sfondo.add(Peso);
		Peso.setColumns(10);
		Peso.setBorder(null);
		Peso.setOpaque(false);
		
		Lunghezza = new JTextField();
		Lunghezza.setFont(new Font("SansSerif", Font.BOLD, 12));
		Lunghezza.setOpaque(false);
		Lunghezza.setColumns(10);
		Lunghezza.setBorder(null);
		Lunghezza.setBounds(178, 211, 147, 19);
		sfondo.add(Lunghezza);
		
		Larghezza = new JTextField();
		Larghezza.setFont(new Font("SansSerif", Font.BOLD, 12));
		Larghezza.setOpaque(false);
		Larghezza.setColumns(10);
		Larghezza.setBorder(null);
		Larghezza.setBounds(178, 256, 147, 19);
		sfondo.add(Larghezza);
		
		LuogoRitrovamento = new JTextField();
		LuogoRitrovamento.setFont(new Font("SansSerif", Font.BOLD, 12));
		LuogoRitrovamento.setOpaque(false);
		LuogoRitrovamento.setColumns(10);
		LuogoRitrovamento.setBorder(null);
		LuogoRitrovamento.setBounds(178, 360, 171, 19);
		sfondo.add(LuogoRitrovamento);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(167, 187, 171, 21);
		sfondo.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(167, 230, 171, 21);
		sfondo.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(167, 273, 168, 19);
		sfondo.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(178, 377, 171, 21);
		sfondo.add(separator_3);
		
		JComboBox comboBoxSpecie = new JComboBox();
		comboBoxSpecie.setFont(new Font("SansSerif", Font.BOLD, 11));
		comboBoxSpecie.setModel(new DefaultComboBoxModel(new String[] {"Tartaruga comune (Caretta caretta)", "Tartaruga verde (Chelonia mydas)", "Tartaruga liuto (Dermochelys coriacea)", "Tartaruga embricata (Eretmochelys imbricata)", "Tartaruga bastarda (Lepidochelys kempii)", "Tartaruga olivacea (Lepidochelys olivacea)", "Tartaruga piatta (Natator depressus)"}));
		comboBoxSpecie.setBounds(167, 307, 205, 21);
		sfondo.add(comboBoxSpecie);
		
		JLabel lblNewLabel_3_6 = new JLabel("Condizioni Generali : ");
		lblNewLabel_3_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_6.setBounds(436, 462, 136, 16);
		sfondo.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Condizioni Testa :");
		lblNewLabel_3_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7.setBounds(436, 167, 136, 16);
		sfondo.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Condizioni Occhi : ");
		lblNewLabel_3_8.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_8.setBounds(436, 212, 136, 16);
		sfondo.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Condizioni Pinne : ");
		lblNewLabel_3_9.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_9.setBounds(436, 264, 136, 16);
		sfondo.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("Condizioni Naso : ");
		lblNewLabel_3_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_10.setBounds(436, 318, 136, 16);
		sfondo.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_11 = new JLabel("Condizioni Becco : ");
		lblNewLabel_3_11.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_11.setBounds(436, 371, 136, 16);
		sfondo.add(lblNewLabel_3_11);
		
		JLabel lblNewLabel_3_12 = new JLabel("ID Tartaruga : ");
		lblNewLabel_3_12.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_12.setBounds(10, 119, 147, 16);
		sfondo.add(lblNewLabel_3_12);
		
		JComboBox comboBoxTurtle = new JComboBox();
		comboBoxTurtle.setBounds(167, 115, 182, 21);
		sfondo.add(comboBoxTurtle);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("Condizioni Collo  :");
		lblNewLabel_3_7_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7_1.setBounds(436, 122, 136, 16);
		sfondo.add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_3_7_2 = new JLabel("Condizioni Coda  :");
		lblNewLabel_3_7_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7_2.setBounds(436, 418, 136, 16);
		sfondo.add(lblNewLabel_3_7_2);
		
		JComboBox comboBoxCondizioniCollo = new JComboBox();
		comboBoxCondizioniCollo.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioniCollo.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniCollo.setBounds(582, 118, 171, 21);
		sfondo.add(comboBoxCondizioniCollo);
		
		JComboBox comboBoxCondizioniTesta = new JComboBox();
		comboBoxCondizioniTesta.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniTesta.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioniTesta.setBounds(582, 166, 171, 21);
		sfondo.add(comboBoxCondizioniTesta);
		
		JComboBox comboBoxCondizioniOcchi = new JComboBox();
		comboBoxCondizioniOcchi.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniOcchi.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioniOcchi.setBounds(582, 210, 171, 21);
		sfondo.add(comboBoxCondizioniOcchi);
		
		JComboBox comboBoxCondizioniPinne = new JComboBox();
		comboBoxCondizioniPinne.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniPinne.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioniPinne.setBounds(582, 264, 171, 21);
		sfondo.add(comboBoxCondizioniPinne);
		
		JComboBox comboBoxCondizioniNaso = new JComboBox();
		comboBoxCondizioniNaso.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniNaso.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioniNaso.setBounds(582, 317, 171, 21);
		sfondo.add(comboBoxCondizioniNaso);
		
		JComboBox comboBoxCondizioniBecco = new JComboBox();
		comboBoxCondizioniBecco.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniBecco.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioniBecco.setBounds(582, 371, 171, 21);
		sfondo.add(comboBoxCondizioniBecco);
		
		JComboBox comboBoxCondizioniCoda = new JComboBox();
		comboBoxCondizioniCoda.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniCoda.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioniCoda.setBounds(582, 414, 171, 21);
		sfondo.add(comboBoxCondizioniCoda);
		
		JComboBox comboBoxCondizioniGenerali = new JComboBox();
		comboBoxCondizioniGenerali.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniGenerali.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioniGenerali.setBounds(582, 460, 171, 21);
		sfondo.add(comboBoxCondizioniGenerali);
		
		JLabel Inserisci = new JLabel("");
		Inserisci.setIcon(new ImageIcon(InserimentoCartellaMedica.class.getResource("/Media/save_50px.png")));
		Inserisci.setBounds(637, 533, 56, 61);
		sfondo.add(Inserisci);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(InserimentoCartellaMedica.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(10, 544, 56, 50);
		sfondo.add(GoBack);
		
		JLabel lblNewLabel_7 = new JLabel("Salva");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(647, 590, 46, 21);
		sfondo.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Matricola Medico : ");
		lblNewLabel_3_5_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5_1.setBounds(10, 465, 157, 21);
		sfondo.add(lblNewLabel_3_5_1);
		
		JComboBox comboBoxMedico = new JComboBox();
		comboBoxMedico.setBounds(178, 466, 182, 21);
		sfondo.add(comboBoxMedico);
		
		for(int i=0; i<controller.Id_TartarugheSenzaCartellaMedica().size();i++)
		{
			comboBoxTurtle.addItem(controller.Id_TartarugheSenzaCartellaMedica().get(i).toString());
		}
		//SI RIEMPIE LA COMBO BOX MEDICO SOLO CON LE MATRICOLE DEI MEDICI CHE SONO NELLO STESSO CENTRO DELLA TARTARUGA PRECEDENTEMENTE SELEZIONATA
		comboBoxTurtle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String turtle = (String) comboBoxTurtle.getSelectedItem();
				comboBoxMedico.removeAllItems();
				for(int i =0 ; i<controller.MatricolaMedicoPerCartellaMedica(turtle).size();i++)
				{
					comboBoxMedico.addItem(controller.MatricolaMedicoPerCartellaMedica(turtle).get(i).toString());
				}
			}
		});
		
		//LISTENER
		GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sfondo.getTopLevelAncestor().setVisible(false);
			}
		});
		Inserisci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Peso.getText().isEmpty())
					alertPesoNonInserito();
				else if(Lunghezza.getText().isEmpty())
					alertLunghezzaNonInserita();
				else if(Larghezza.getText().isEmpty())
					alertLarghezzaNonInserita();
				else if(LuogoRitrovamento.getText().isEmpty())
					alertLuogoNonInserito();
				else
				{
					 SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
		             String date = date_format.format(dateChooser.getDate());
		             
		             double peso=Double.parseDouble(Peso.getText().toString());
		             double lunghezza=Double.parseDouble(Lunghezza.getText().toString());
		             double larghezza=Double.parseDouble(Larghezza.getText().toString());
		             
		             String condizioni_generali= comboBoxCondizioniGenerali.getSelectedItem().toString();
		             String condizioni_testa= comboBoxCondizioniTesta.getSelectedItem().toString();
		             String condizioni_occhi= comboBoxCondizioniOcchi.getSelectedItem().toString();
		             String condizioni_pinne= comboBoxCondizioniPinne.getSelectedItem().toString();
		             String condizioni_becco= comboBoxCondizioniBecco.getSelectedItem().toString();
		             String condizioni_naso= comboBoxCondizioniNaso.getSelectedItem().toString();
		             String condizioni_coda= comboBoxCondizioniCoda.getSelectedItem().toString();
		             String condizioni_collo= comboBoxCondizioniCollo.getSelectedItem().toString();
		             
		             String medico = comboBoxMedico.getSelectedItem().toString();
		             String turtle = comboBoxTurtle.getSelectedItem().toString();
		             String specie = comboBoxSpecie.getSelectedItem().toString();
		             String luogo= LuogoRitrovamento.getText();
		             
		             boolean flag = controller.InsertCartellaMedica(turtle, medico, peso, lunghezza, larghezza, specie, luogo, date, condizioni_generali, condizioni_collo, condizioni_testa, condizioni_occhi, condizioni_pinne, condizioni_naso, condizioni_becco, condizioni_coda);
		             if(flag) {
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
		JOptionPane.showMessageDialog(this, "Inserimento della cartella medica  non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertInserimentoRiuscito() {
		JOptionPane.showMessageDialog(this, "Inserimento della cartella medica riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
	public void alertLunghezzaNonInserita() {
		JOptionPane.showMessageDialog(this, "Lunghezza della tartaruga non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertLarghezzaNonInserita() {
		JOptionPane.showMessageDialog(this, "Larghezza della tartaruga non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertPesoNonInserito() {
		JOptionPane.showMessageDialog(this, "Peso  della tartaruga  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertLuogoNonInserito() {
		JOptionPane.showMessageDialog(this, "Luogo di ritrovamento della tartaruga  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	
}
