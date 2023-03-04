package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import Components.PanelCustomBlue;
import Components.PanelWhite;
import Controller.Controllore;

public class ModificaCartellaMedica extends JDialog {
	private JPanel contentPane;
	private PanelWhite sfondo;
	private JTextField Peso;
	private JTextField Lunghezza;
	private JTextField Larghezza;
	private JTextField LuogoRitrovamento;
	private Controllore controller;
	private JTextField Medico;
	
	private JTextField Tartaruga;
	private JTextField Specie;
	
	public ModificaCartellaMedica(Controllore contr,String Id_Turtle) {
		controller=contr;
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 849, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(0, 0, 841, 643);
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
		Peso.setForeground(new Color(255, 255, 255));
		Peso.setFont(new Font("SansSerif", Font.BOLD, 12));
		Peso.setBounds(178, 167, 147, 19);
		sfondo.add(Peso);
		Peso.setColumns(10);
		Peso.setBorder(null);
		Peso.setOpaque(false);
		
		Lunghezza = new JTextField();
		Lunghezza.setForeground(new Color(255, 255, 255));
		Lunghezza.setFont(new Font("SansSerif", Font.BOLD, 12));
		Lunghezza.setOpaque(false);
		Lunghezza.setColumns(10);
		Lunghezza.setBorder(null);
		Lunghezza.setBounds(178, 211, 147, 19);
		sfondo.add(Lunghezza);
		
		Larghezza = new JTextField();
		Larghezza.setForeground(new Color(255, 255, 255));
		Larghezza.setFont(new Font("SansSerif", Font.BOLD, 12));
		Larghezza.setOpaque(false);
		Larghezza.setColumns(10);
		Larghezza.setBorder(null);
		Larghezza.setBounds(178, 256, 147, 19);
		sfondo.add(Larghezza);
		
		LuogoRitrovamento = new JTextField();
		LuogoRitrovamento.setForeground(new Color(255, 255, 255));
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
		Inserisci.setBounds(727, 542, 56, 61);
		sfondo.add(Inserisci);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(InserimentoCartellaMedica.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(10, 571, 56, 50);
		sfondo.add(GoBack);
		
		JLabel lblNewLabel_7 = new JLabel("Modifica");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(729, 600, 63, 21);
		sfondo.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Matricola Medico : ");
		lblNewLabel_3_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_5_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5_1.setBounds(10, 465, 157, 21);
		sfondo.add(lblNewLabel_3_5_1);
		
		Medico = new JTextField();
		Medico.setForeground(new Color(255, 255, 255));
		Medico.setEditable(false);
		Medico.setOpaque(false);
		Medico.setFont(new Font("SansSerif", Font.BOLD, 12));
		Medico.setColumns(10);
		Medico.setBorder(null);
		Medico.setBounds(191, 462, 147, 19);
		sfondo.add(Medico);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(178, 480, 171, 21);
		sfondo.add(separator_4);
		
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
		
		
		
		Tartaruga = new JTextField();
		Tartaruga.setForeground(new Color(255, 255, 255));
		Tartaruga.setFont(new Font("SansSerif", Font.BOLD, 12));
		Tartaruga.setEditable(false);
		Tartaruga.setBorder(null);
		Tartaruga.setOpaque(false);
		Tartaruga.setBounds(178, 119, 147, 19);
		Tartaruga.setText(Id_Turtle);
		sfondo.add(Tartaruga);
		Tartaruga.setColumns(10);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(167, 136, 171, 21);
		sfondo.add(separator_6);
		
		Specie = new JTextField();
		Specie.setFont(new Font("SansSerif", Font.BOLD, 12));
		Specie.setForeground(new Color(255, 255, 255));
		Specie.setOpaque(false);
		Specie.setBorder(null);
		Specie.setEditable(false);
		Specie.setBounds(177, 309, 148, 19);
		sfondo.add(Specie);
		Specie.setColumns(10);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(167, 328, 182, 18);
		sfondo.add(separator_5);
		
		for(int i=0;i<controller.ListaIDCartella().size();i++)
		{
			comboBoxCartellaMedica.addItem(controller.ListaIDCartella().get(i).toString());
		}
		
		Peso.setText(String.valueOf((controller.RecuperaCartellaMedica(Id_Turtle).getPeso())));
		Larghezza.setText(String.valueOf((controller.RecuperaCartellaMedica(Id_Turtle).getLarghezza())));
		Lunghezza.setText(String.valueOf(controller.RecuperaCartellaMedica(Id_Turtle).getLunghezza()));
		LuogoRitrovamento.setText(controller.RecuperaCartellaMedica(Id_Turtle).getLuogo_ritrovamento());
		Medico.setText(controller.RecuperaCartellaMedica(Id_Turtle).getMatricola_medico());
		Specie.setText(controller.RecuperaCartellaMedica(Id_Turtle).getSpecie());
		dateChooser.setDate(controller.RecuperaCartellaMedica(Id_Turtle).getData_Apertura_Cartella());
		comboBoxCondizioniGenerali.setSelectedItem(controller.RecuperaCartellaMedica(Id_Turtle).getCondizioni_generali());
		comboBoxCondizioniCollo.setSelectedItem(controller.RecuperaCartellaMedica(Id_Turtle).getCondizioni_collo().toString());
		comboBoxCondizioniTesta.setSelectedItem(controller.RecuperaCartellaMedica(Id_Turtle).getCondizioni_testa());
		comboBoxCondizioniOcchi.setSelectedItem(controller.RecuperaCartellaMedica(Id_Turtle).getCondizioni_occhi());
		comboBoxCondizioniPinne.setSelectedItem(controller.RecuperaCartellaMedica(Id_Turtle).getCondizioni_pinna());
		comboBoxCondizioniNaso.setSelectedItem(controller.RecuperaCartellaMedica(Id_Turtle).getCondizioni_naso());
		comboBoxCondizioniBecco.setSelectedItem(controller.RecuperaCartellaMedica(Id_Turtle).getCondizioni_becco());
		comboBoxCondizioniCoda.setSelectedItem(controller.RecuperaCartellaMedica(Id_Turtle).getCondizioni_coda());
		
		comboBoxCartellaMedica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = comboBoxCartellaMedica.getSelectedItem().toString();
				
				//Tartaruga.setText(controller.RecuperaCartellaMedica(id).getId_tartaruga());
				
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
		   
		             String luogo= LuogoRitrovamento.getText();
		             String id_cartella = comboBoxCartellaMedica.getSelectedItem().toString();
		             boolean flag = controller.UpdateCartellaMedica(id_cartella, peso, lunghezza, larghezza, date, condizioni_generali, condizioni_collo, condizioni_testa, condizioni_occhi, condizioni_pinne, condizioni_naso, condizioni_becco, condizioni_coda);
		             if(flag) {
		            	 	alertUpdateRiuscito();
							sfondo.getTopLevelAncestor().setVisible(false);
						}
						else
							alertUpdateFallito();
					}
			}
		
	});
}
	//ALERT
	public void alertUpdateFallito() {
		JOptionPane.showMessageDialog(this, "Modifica della cartella medica  non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertUpdateRiuscito() {
		JOptionPane.showMessageDialog(this, "Modifica  della cartella medica riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
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
}
