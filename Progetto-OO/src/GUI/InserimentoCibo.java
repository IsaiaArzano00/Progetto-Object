package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import Components.PanelCustomBlue;
import Controller.Controllore;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class InserimentoCibo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField CiboInserito;
	private JTextField codiceVascaField;
	private JTextField matricola_operatoreField;
	private JTextField CiboRimosso;
	private Controllore controller;

	public InserimentoCibo(Controllore contr) {
		controller = contr;
		
		getContentPane().setLayout(null);
		setBounds(100,100,454,541);
		setResizable(false);
		setModal(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 658, 508);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(0, 0, 450, 533);
		panel.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 450, 116);
		sfondo.add(panel1);
		panel1.setLayout(null);
		panel1.setBackground(new Color(0,0,0,70));
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(InserimentoCibo.class.getResource("/Media/shrimp_and_lobster_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GESTIONE VASCA\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(128, 10, 216, 40);
		panel1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati per il controllo della vasca.");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 293, 24);
		panel1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data versamento cibo  : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 324, 159, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantità cibo rimosso : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 373, 137, 13);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Tipologia cibo inserito : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 229, 173, 13);
		sfondo.add(lblNewLabel_6);
		
		
		JLabel GoBack = new JLabel("");
		
		GoBack.setIcon(new ImageIcon(InserimentoTartaruga.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(29, 427, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Inserisci = new JLabel("");
	
		
		
		Inserisci.setIcon(new ImageIcon(InserimentoTartaruga.class.getResource("/Media/save_50px.png")));
		Inserisci.setBounds(348, 427, 62, 50);
		sfondo.add(Inserisci);
		
		JLabel lblNewLabel_9 = new JLabel("Indietro");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(39, 477, 63, 13);
		sfondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Salva");
		lblNewLabel_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(359, 477, 62, 13);
		sfondo.add(lblNewLabel_10);
		
		JComboBox<String> comboBoxCibo = new JComboBox<>();
		comboBoxCibo.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCibo.setModel(new DefaultComboBoxModel(new String[] {"Pesci", "Gamberetti", "Alici", "Integratori_alimentari"}));
		comboBoxCibo.setBounds(193, 225, 179, 21);
		sfondo.add(comboBoxCibo);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(193, 316, 179, 21);
		sfondo.add(dateChooser);
		
		JLabel lblNewLabel_6_1 = new JLabel("Quantità cibo inserito : ");
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(10, 272, 159, 13);
		sfondo.add(lblNewLabel_6_1);
		
		CiboInserito = new JTextField();
		CiboInserito.setForeground(new Color(255, 255, 255));
		CiboInserito.setBounds(193, 270, 179, 19);
		CiboInserito.setOpaque(false);
		CiboInserito.setBorder(null);
		sfondo.add(CiboInserito);
		CiboInserito.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(193, 287, 179, 21);
		sfondo.add(separator);
		
		JLabel lblNewLabel_6_2 = new JLabel("Codice Vasca : ");
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(10, 185, 173, 13);
		sfondo.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Matricola operatore  : ");
		lblNewLabel_6_3.setForeground(Color.WHITE);
		lblNewLabel_6_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6_3.setBounds(10, 148, 173, 13);
		sfondo.add(lblNewLabel_6_3);
		
		codiceVascaField = new JTextField();
		codiceVascaField.setBounds(193, 183, 179, 19);
		codiceVascaField.setForeground(new Color(255,255,255));
		sfondo.add(codiceVascaField);
		codiceVascaField.setColumns(10);
		
		matricola_operatoreField = new JTextField();
		matricola_operatoreField.setBounds(193, 146, 179, 19);
		matricola_operatoreField.setForeground(new Color(255,255,255));
		sfondo.add(matricola_operatoreField);
		matricola_operatoreField.setColumns(10);
		
		codiceVascaField.setOpaque(false);
		codiceVascaField.setBorder(null);
		matricola_operatoreField.setOpaque(false);
		matricola_operatoreField.setBorder(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(193, 200, 179, 42);
		sfondo.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(193, 163, 184, 35);
		sfondo.add(separator_2);
		
		CiboRimosso = new JTextField();
		CiboRimosso.setOpaque(false);
		CiboRimosso.setForeground(Color.WHITE);
		CiboRimosso.setColumns(10);
		CiboRimosso.setBorder(null);
		CiboRimosso.setBounds(193, 371, 179, 19);
		sfondo.add(CiboRimosso);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(193, 388, 179, 21);
		sfondo.add(separator_3);
		
		//ACTION
		GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sfondo.getTopLevelAncestor().setVisible(false);
			}
		});
		Inserisci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String matricola_operatore=matricola_operatoreField.getText();
				String codice_vasca =codiceVascaField.getText();
				
				if(matricola_operatoreField.getText().isEmpty())
					alertMatricolaNonInserita();
				else if(!controller.CheckMatricolaOperatore(matricola_operatore))
					alertMatricolaNonPresente();
				else if(codiceVascaField.getText().isEmpty())
					alertCodiceVascaNonInserito();
				else if(!controller.CheckCodiceVasca(codice_vasca))
					alertVascaNonPresente();
				else if(CiboInserito.getText().isEmpty())
					alertCiboNonInserito();
				else if(CiboRimosso.getText().isEmpty())
					alertCiboRimossoNonInserito();
				else 
				{
					
					String tipologia_cibo = (String) comboBoxCibo.getSelectedItem();
					SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
					String date = date_format.format(dateChooser.getDate());
					double quantita_cibo_inserita =Double.parseDouble(CiboInserito.getText());
					double quantita_cibo_rimosso=Double.parseDouble(CiboRimosso.getText());
					
					boolean flag = controller.InserisciCibo(matricola_operatore, date, codice_vasca, quantita_cibo_inserita, quantita_cibo_rimosso, tipologia_cibo);
					if(flag)
					{
						alertInserimentoRiuscito();
						sfondo.getTopLevelAncestor().setVisible(false);
					}else
						alertInserimentoFallito();
				}
					
					
			}
		});
	}
	//ALERT
	public void alertInserimentoFallito() {
		JOptionPane.showMessageDialog(this, "Inserimento del controllo vasca  non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}

	public void alertMatricolaNonInserita() {
		JOptionPane.showMessageDialog(this, "Matricola dell'operatore  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertCodiceVascaNonInserito() {
		JOptionPane.showMessageDialog(this, "Codice della vasca  non inserito !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertCiboNonInserito() {
		JOptionPane.showMessageDialog(this, "Quantità cibo inserito  non inserita !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertCiboRimossoNonInserito() {
		JOptionPane.showMessageDialog(this, "Quantità cibo rimosso   non inserita !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertMatricolaNonPresente() {
		JOptionPane.showMessageDialog(this, "Matricola  dell'operatore  non  presente nel  sistema!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertVascaNonPresente() {
		JOptionPane.showMessageDialog(this, "Codice della vasca  non  presente nel  sistema!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertInserimentoRiuscito() {
		JOptionPane.showMessageDialog(this, "Inserimento del controllo vasca  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}

}
