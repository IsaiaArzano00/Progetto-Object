package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

import Components.PanelWhite;
import Controller.Controllore;
import DTO.Cartella_Medica;

public class RimozioneCartellaMedica extends JDialog {

	private JPanel contentPane;
	private PanelWhite sfondo;
	private JTextField peso_in;
	private JTextField lunghezza_in;
	private JTextField larghezza_in;
	private JTextField luogo_in;
	private Controllore controller;
	private JComboBox comboBoxCondizioniGenerali;
	private JComboBox comboBoxCondizioniCollo;
	private JComboBox comboBoxCondizioniTesta;
	private JComboBox comboBoxCondizioniOcchi;
	private JComboBox comboBoxCondizioniPinne;
	private JComboBox comboBoxCondizioniNaso;
	private JComboBox comboBoxCondizioniBecco;
	private JComboBox comboBoxCondizioniCoda;
	private JComboBox comboBoxSpecie;
	private Cartella_Medica cm;
	
	
	public RimozioneCartellaMedica(Controllore contr, String idTartaruga) {
		controller = contr;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 981, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelWhite sfondo = new PanelWhite();
		sfondo.setBounds(0, -16, 977, 579);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 977, 91);
		sfondo.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(10, 10, 84, 80);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(InserimentoCartellaMedicapt1.class.getResource("/Media/health_book_80px.png")));
		
		JLabel lblNewLabel_1 = new JLabel("RIMOZIONE CARTELLA MEDICA");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(104, 29, 289, 37);
		panel.add(lblNewLabel_1);
		
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
		
		JDateChooser data_in = new JDateChooser();
		data_in.setBounds(178, 415, 171, 19);
		sfondo.add(data_in);
		
		peso_in = new JTextField();
		peso_in.setEditable(false);
		peso_in.setBounds(178, 160, 147, 19);
		sfondo.add(peso_in);
		peso_in.setColumns(10);
		peso_in.setBorder(null);
		peso_in.setOpaque(false);
		
		lunghezza_in = new JTextField();
		lunghezza_in.setOpaque(false);
		lunghezza_in.setColumns(10);
		lunghezza_in.setBorder(null);
		lunghezza_in.setBounds(178, 211, 147, 19);
		lunghezza_in.setEditable(false);
		sfondo.add(lunghezza_in);
		
		larghezza_in = new JTextField();
		larghezza_in.setOpaque(false);
		larghezza_in.setColumns(10);
		larghezza_in.setBorder(null);
		larghezza_in.setBounds(178, 256, 147, 19);
		larghezza_in.setEditable(false);
		sfondo.add(larghezza_in);
		
		luogo_in = new JTextField();
		luogo_in.setOpaque(false);
		luogo_in.setColumns(10);
		luogo_in.setBorder(null);
		luogo_in.setBounds(178, 360, 147, 19);
		luogo_in.setEditable(false);
		sfondo.add(luogo_in);
		
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
		
		comboBoxSpecie = new JComboBox();
		comboBoxSpecie.setEnabled(false);
		comboBoxSpecie.setFont(new Font("SansSerif", Font.PLAIN, 11));
		comboBoxSpecie.setModel(new DefaultComboBoxModel(new String[] {"Tartaruga comune (Caretta caretta)", "Tartaruga verde (Chelonia mydas)", "Tartaruga liuto (Dermochelys coriacea)", "Tartaruga embricata (Eretmochelys imbricata)", "Tartaruga bastarda (Lepidochelys kempii)", "Tartaruga olivacea (Lepidochelys olivacea)", "Tartaruga piatta (Natator depressus)"}));
		comboBoxSpecie.setBounds(167, 307, 205, 21);
		sfondo.add(comboBoxSpecie);
		
		JLabel lblNewLabel_3_6 = new JLabel("Condizioni Generali : ");
		lblNewLabel_3_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_6.setBounds(10, 489, 136, 16);
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
		
		JTextField idTartaurga_in = new JTextField();
		idTartaurga_in.setEditable(false);
		idTartaurga_in.setBounds(167, 115, 182, 21);
		idTartaurga_in.setText(idTartaruga);
		sfondo.add(idTartaurga_in);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("Condizioni Collo  :");
		lblNewLabel_3_7_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7_1.setBounds(436, 122, 136, 16);
		sfondo.add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_3_7_2 = new JLabel("Condizioni Coda  :");
		lblNewLabel_3_7_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_7_2.setBounds(436, 418, 136, 16);
		sfondo.add(lblNewLabel_3_7_2);
		
		comboBoxCondizioniCollo = new JComboBox();
		comboBoxCondizioniCollo.setEnabled(false);
		comboBoxCondizioniCollo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBoxCondizioniCollo.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniCollo.setBounds(582, 118, 171, 21);
		sfondo.add(comboBoxCondizioniCollo);
		
		comboBoxCondizioniTesta = new JComboBox();
		comboBoxCondizioniTesta.setEnabled(false);
		comboBoxCondizioniTesta.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniTesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBoxCondizioniTesta.setBounds(582, 166, 171, 21);
		sfondo.add(comboBoxCondizioniTesta);
		
		comboBoxCondizioniOcchi = new JComboBox();
		comboBoxCondizioniOcchi.setEnabled(false);
		comboBoxCondizioniOcchi.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniOcchi.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBoxCondizioniOcchi.setBounds(582, 210, 171, 21);
		sfondo.add(comboBoxCondizioniOcchi);
		
		comboBoxCondizioniPinne = new JComboBox();
		comboBoxCondizioniPinne.setEnabled(false);
		comboBoxCondizioniPinne.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniPinne.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBoxCondizioniPinne.setBounds(582, 264, 171, 21);
		sfondo.add(comboBoxCondizioniPinne);
		
		comboBoxCondizioniNaso = new JComboBox();
		comboBoxCondizioniNaso.setEnabled(false);
		comboBoxCondizioniNaso.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniNaso.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBoxCondizioniNaso.setBounds(582, 317, 171, 21);
		sfondo.add(comboBoxCondizioniNaso);
		
		comboBoxCondizioniBecco = new JComboBox();
		comboBoxCondizioniBecco.setEnabled(false);
		comboBoxCondizioniBecco.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniBecco.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBoxCondizioniBecco.setBounds(582, 371, 171, 21);
		sfondo.add(comboBoxCondizioniBecco);
		
		comboBoxCondizioniCoda = new JComboBox();
		comboBoxCondizioniCoda.setEnabled(false);
		comboBoxCondizioniCoda.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniCoda.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBoxCondizioniCoda.setBounds(582, 414, 171, 21);
		sfondo.add(comboBoxCondizioniCoda);
		
		comboBoxCondizioniGenerali = new JComboBox();
		comboBoxCondizioniGenerali.setEnabled(false);
		comboBoxCondizioniGenerali.setModel(new DefaultComboBoxModel(new String[] {"Compromesso", "Con ferite profonde", "Con ferite superficiali", "Buona", "Perfetta"}));
		comboBoxCondizioniGenerali.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBoxCondizioniGenerali.setBounds(167, 488, 171, 21);
		sfondo.add(comboBoxCondizioniGenerali);
		
		JLabel tastoElimina = new JLabel("");
		tastoElimina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.rimuoviCartellaMedica(idTartaruga);
			}
		});
		tastoElimina.setIcon(new ImageIcon(InserimentoCartellaMedicapt1.class.getResource("/Media/save_50px.png")));
		tastoElimina.setBounds(826, 481, 56, 61);
		sfondo.add(tastoElimina);
		
		JLabel tastoAnnulla = new JLabel("");
		tastoAnnulla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		tastoAnnulla.setIcon(new ImageIcon(InserimentoCartellaMedicapt1.class.getResource("/Media/cross_mark_button_50px.png")));
		tastoAnnulla.setBounds(708, 481, 56, 61);
		sfondo.add(tastoAnnulla);
		
		
		cm = controller.recuperaCartellaMedica(idTartaruga);
		
		peso_in.setText(String.valueOf(cm.getPeso()));
		lunghezza_in.setText(String.valueOf(cm.getLunghezza()));
		larghezza_in.setText(String.valueOf(cm.getLarghezza()));
		comboBoxSpecie.setSelectedItem(cm.getSpecie());
		luogo_in.setText(cm.getLuogo_ritrovamento());
		data_in.setDate(cm.getData_Apertura_Cartella());
		comboBoxCondizioniGenerali.setSelectedItem(cm.getCondizioni_generali());
		comboBoxCondizioniCollo.setSelectedItem(cm.getCondizioni_collo());
		comboBoxCondizioniTesta.setSelectedItem(cm.getCondizioni_testa());
		comboBoxCondizioniOcchi.setSelectedItem(cm.getCondizioni_occhi());
		comboBoxCondizioniPinne.setSelectedItem(cm.getCondizioni_pinna());
		comboBoxCondizioniNaso.setSelectedItem(cm.getCondizioni_naso());
		comboBoxCondizioniBecco.setSelectedItem(cm.getCondizioni_becco());
		comboBoxCondizioniCoda.setSelectedItem(cm.getCondizioni_coda());
		
		
		
		
		
		
		
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Annulla");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setBounds(708, 524, 58, 32);
		sfondo.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Conferma Eliminazione");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(801, 534, 141, 13);
		sfondo.add(lblNewLabel_7);
		
		setModal(true);
		setVisible(true);
	}

}
