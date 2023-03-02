package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import Components.PanelCustomBlue;
import Components.PanelWhite;
import Controller.Controllore;

public class EliminaCartellaMedica extends JDialog {
	private JPanel contentPane;
	private PanelWhite sfondo;
	private JTextField Peso;
	private JTextField Lunghezza;
	private JTextField Larghezza;
	private JTextField LuogoRitrovamento;
	private Controllore controller;
	private JTextField Medico;
	private JTextField CondizioniCollo;
	
	private JTextField CondizioniTesta;
	private JTextField CondizioniOcchi;
	private JTextField CondizioniPinne;
	private JTextField CondizioniNaso;
	private JTextField CondizioniBecco;
	private JTextField CondizioniBecco_1;
	private JTextField CondizioniGenerali;
	private JTextField Tartaruga;
	/**
	 * Create the panel.
	 */
	public EliminaCartellaMedica(Controllore contr) {
		controller=contr;
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 849, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(10, 0, 841, 621);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 977, 91);
		panel.setBackground(new Color(0,0,0,70));
		sfondo.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(10, 10, 84, 80);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(InserimentoCartellaMedica.class.getResource("/Media/health_book_80px.png")));
		
		JLabel lblNewLabel_1 = new JLabel("MODIFICA CARTELLA MEDICA ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_1.setBounds(104, 10, 519, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Selezionare la cartella medica da modificare : ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2.setBounds(114, 57, 276, 24);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBoxCartellaMedica = new JComboBox();
		comboBoxCartellaMedica.setBounds(394, 60, 183, 21);
		panel.add(comboBoxCartellaMedica);
		
		JLabel lblNewLabel_3 = new JLabel("Peso : ");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 167, 45, 16);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Lunghezza : ");
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 209, 85, 21);
		sfondo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Larghezza : ");
		lblNewLabel_3_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(10, 254, 85, 21);
		sfondo.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Specie : ");
		lblNewLabel_3_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(10, 307, 56, 21);
		sfondo.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Luogo di ritrovamento : ");
		lblNewLabel_3_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(10, 358, 147, 21);
		sfondo.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Data apertura cartella : ");
		lblNewLabel_3_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(11, 413, 157, 21);
		sfondo.add(lblNewLabel_3_5);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(178, 415, 171, 19);
		sfondo.add(dateChooser);
		
		Peso = new JTextField();
		Peso.setEditable(false);
		Peso.setFont(new Font("SansSerif", Font.BOLD, 12));
		Peso.setBounds(178, 167, 147, 19);
		sfondo.add(Peso);
		Peso.setColumns(10);
		Peso.setBorder(null);
		Peso.setOpaque(false);
		
		Lunghezza = new JTextField();
		Lunghezza.setEditable(false);
		Lunghezza.setFont(new Font("SansSerif", Font.BOLD, 12));
		Lunghezza.setOpaque(false);
		Lunghezza.setColumns(10);
		Lunghezza.setBorder(null);
		Lunghezza.setBounds(178, 211, 147, 19);
		sfondo.add(Lunghezza);
		
		Larghezza = new JTextField();
		Larghezza.setEditable(false);
		Larghezza.setFont(new Font("SansSerif", Font.BOLD, 12));
		Larghezza.setOpaque(false);
		Larghezza.setColumns(10);
		Larghezza.setBorder(null);
		Larghezza.setBounds(178, 256, 147, 19);
		sfondo.add(Larghezza);
		
		LuogoRitrovamento = new JTextField();
		LuogoRitrovamento.setEditable(false);
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
		lblNewLabel_3_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_6.setBounds(436, 462, 136, 16);
		sfondo.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Condizioni Testa :");
		lblNewLabel_3_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7.setBounds(436, 167, 136, 16);
		sfondo.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Condizioni Occhi : ");
		lblNewLabel_3_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_8.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_8.setBounds(436, 212, 136, 16);
		sfondo.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Condizioni Pinne : ");
		lblNewLabel_3_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_9.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_9.setBounds(436, 264, 136, 16);
		sfondo.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("Condizioni Naso : ");
		lblNewLabel_3_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_10.setBounds(436, 318, 136, 16);
		sfondo.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_11 = new JLabel("Condizioni Becco : ");
		lblNewLabel_3_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_11.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_11.setBounds(436, 371, 136, 16);
		sfondo.add(lblNewLabel_3_11);
		
		JLabel lblNewLabel_3_12 = new JLabel("ID Tartaruga : ");
		lblNewLabel_3_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_12.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_12.setBounds(10, 119, 147, 16);
		sfondo.add(lblNewLabel_3_12);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("Condizioni Collo  :");
		lblNewLabel_3_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_7_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7_1.setBounds(436, 122, 136, 16);
		sfondo.add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_3_7_2 = new JLabel("Condizioni Coda  :");
		lblNewLabel_3_7_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_7_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7_2.setBounds(436, 418, 136, 16);
		sfondo.add(lblNewLabel_3_7_2);
		
		JLabel Inserisci = new JLabel("");
		Inserisci.setIcon(new ImageIcon(InserimentoCartellaMedica.class.getResource("/Media/save_50px.png")));
		Inserisci.setBounds(637, 533, 56, 61);
		sfondo.add(Inserisci);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(InserimentoCartellaMedica.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(10, 544, 56, 50);
		sfondo.add(GoBack);
		
		JLabel lblNewLabel_7 = new JLabel("Modifica");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(637, 590, 56, 21);
		sfondo.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Matricola Medico : ");
		lblNewLabel_3_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_5_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5_1.setBounds(10, 465, 157, 21);
		sfondo.add(lblNewLabel_3_5_1);
		
		Medico = new JTextField();
		Medico.setOpaque(false);
		Medico.setFont(new Font("SansSerif", Font.BOLD, 12));
		Medico.setEditable(false);
		Medico.setColumns(10);
		Medico.setBorder(null);
		Medico.setBounds(191, 462, 147, 19);
		sfondo.add(Medico);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(178, 480, 171, 21);
		sfondo.add(separator_4);
		
		CondizioniCollo = new JTextField();
		CondizioniCollo.setOpaque(false);
		CondizioniCollo.setFont(new Font("SansSerif", Font.BOLD, 12));
		CondizioniCollo.setEditable(false);
		CondizioniCollo.setColumns(10);
		CondizioniCollo.setBorder(null);
		CondizioniCollo.setBounds(573, 119, 147, 19);
		sfondo.add(CondizioniCollo);
		
		CondizioniTesta = new JTextField();
		CondizioniTesta.setOpaque(false);
		CondizioniTesta.setFont(new Font("SansSerif", Font.BOLD, 12));
		CondizioniTesta.setEditable(false);
		CondizioniTesta.setColumns(10);
		CondizioniTesta.setBorder(null);
		CondizioniTesta.setBounds(573, 167, 147, 19);
		sfondo.add(CondizioniTesta);
		
		CondizioniOcchi = new JTextField();
		CondizioniOcchi.setOpaque(false);
		CondizioniOcchi.setFont(new Font("SansSerif", Font.BOLD, 12));
		CondizioniOcchi.setEditable(false);
		CondizioniOcchi.setColumns(10);
		CondizioniOcchi.setBorder(null);
		CondizioniOcchi.setBounds(573, 211, 147, 19);
		sfondo.add(CondizioniOcchi);
		
		CondizioniPinne = new JTextField();
		CondizioniPinne.setOpaque(false);
		CondizioniPinne.setFont(new Font("SansSerif", Font.BOLD, 12));
		CondizioniPinne.setEditable(false);
		CondizioniPinne.setColumns(10);
		CondizioniPinne.setBorder(null);
		CondizioniPinne.setBounds(573, 264, 147, 19);
		sfondo.add(CondizioniPinne);
		
		CondizioniNaso = new JTextField();
		CondizioniNaso.setOpaque(false);
		CondizioniNaso.setFont(new Font("SansSerif", Font.BOLD, 12));
		CondizioniNaso.setEditable(false);
		CondizioniNaso.setColumns(10);
		CondizioniNaso.setBorder(null);
		CondizioniNaso.setBounds(573, 318, 147, 19);
		sfondo.add(CondizioniNaso);
		
		CondizioniBecco = new JTextField();
		CondizioniBecco.setOpaque(false);
		CondizioniBecco.setFont(new Font("SansSerif", Font.BOLD, 12));
		CondizioniBecco.setEditable(false);
		CondizioniBecco.setColumns(10);
		CondizioniBecco.setBorder(null);
		CondizioniBecco.setBounds(573, 371, 147, 19);
		sfondo.add(CondizioniBecco);
		
		CondizioniBecco_1 = new JTextField();
		CondizioniBecco_1.setOpaque(false);
		CondizioniBecco_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		CondizioniBecco_1.setEditable(false);
		CondizioniBecco_1.setColumns(10);
		CondizioniBecco_1.setBorder(null);
		CondizioniBecco_1.setBounds(573, 415, 147, 19);
		sfondo.add(CondizioniBecco_1);
		
		CondizioniGenerali = new JTextField();
		CondizioniGenerali.setOpaque(false);
		CondizioniGenerali.setFont(new Font("SansSerif", Font.BOLD, 12));
		CondizioniGenerali.setEditable(false);
		CondizioniGenerali.setColumns(10);
		CondizioniGenerali.setBorder(null);
		CondizioniGenerali.setBounds(573, 462, 147, 19);
		sfondo.add(CondizioniGenerali);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(571, 137, 149, 10);
		sfondo.add(separator_5);
		
		JSeparator separator_5_1 = new JSeparator();
		separator_5_1.setBounds(571, 187, 149, 10);
		sfondo.add(separator_5_1);
		
		JSeparator separator_5_2 = new JSeparator();
		separator_5_2.setBounds(571, 230, 149, 10);
		sfondo.add(separator_5_2);
		
		JSeparator separator_5_3 = new JSeparator();
		separator_5_3.setBounds(571, 282, 149, 10);
		sfondo.add(separator_5_3);
		
		JSeparator separator_5_4 = new JSeparator();
		separator_5_4.setBounds(571, 336, 149, 10);
		sfondo.add(separator_5_4);
		
		JSeparator separator_5_5 = new JSeparator();
		separator_5_5.setBounds(571, 388, 149, 10);
		sfondo.add(separator_5_5);
		
		JSeparator separator_5_6 = new JSeparator();
		separator_5_6.setBounds(571, 433, 149, 10);
		sfondo.add(separator_5_6);
		
		JSeparator separator_5_7 = new JSeparator();
		separator_5_7.setBounds(571, 480, 149, 10);
		sfondo.add(separator_5_7);
		
		Tartaruga = new JTextField();
		Tartaruga.setBorder(null);
		Tartaruga.setOpaque(false);
		Tartaruga.setBounds(178, 119, 147, 19);
		sfondo.add(Tartaruga);
		Tartaruga.setColumns(10);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(167, 136, 171, 21);
		sfondo.add(separator_6);
		
		
	}
}
	
