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

import Components.PanelCustomBlue;
import Controller.Controllore;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.text.SimpleDateFormat;

public class InserimentoVisita extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JTextField PesoTurtle;
	private JTextField Id_turtleField;
	private JTextField matricola_medicoField;
	private Controllore controller;

	
	public InserimentoVisita(Controllore contr) {
		controller =contr;
		
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
		lblNewLabel.setIcon(new ImageIcon(InserimentoVisita.class.getResource("/Media/Medical History_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VISITA\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 160, 40);
		panel1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Compilare la cartella di degenza per la nuova visita");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 293, 24);
		panel1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data controllo : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 136, 127, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Farmaco somministrato : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 183, 137, 13);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Valutazione condizioni generali ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 266, 173, 13);
		sfondo.add(lblNewLabel_6);
		
		
		JLabel GoBack = new JLabel("");
		
		GoBack.setIcon(new ImageIcon(InserimentoVisita.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(29, 427, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Inserisci = new JLabel("");
		
		
		Inserisci.setIcon(new ImageIcon(InserimentoVisita.class.getResource("/Media/save_50px.png")));
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
		
		
		
		JComboBox comboBoxFarmaco = new JComboBox();
		comboBoxFarmaco.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxFarmaco.setModel(new DefaultComboBoxModel(new String[] {"antibiotico", "antidolorifico", "multivitaminico", "altro"}));
		comboBoxFarmaco.setBounds(193, 179, 179, 21);
		sfondo.add(comboBoxFarmaco);
		
		JComboBox<String> comboBoxCondizioni = new JComboBox<>();
		comboBoxCondizioni.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxCondizioni.setModel(new DefaultComboBoxModel(new String[] {"Perfetta", "Buona", "Con ferite superficiali", "Con ferite profonde", "Compromessa"}));
		comboBoxCondizioni.setBounds(193, 262, 179, 21);
		sfondo.add(comboBoxCondizioni);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(193, 136, 179, 21);
		sfondo.add(dateChooser);
		
		JLabel lblNewLabel_6_1 = new JLabel("Peso tartaruga al controllo : ");
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(10, 225, 159, 13);
		sfondo.add(lblNewLabel_6_1);
		
		PesoTurtle = new JTextField();
		PesoTurtle.setForeground(new Color(255, 255, 255));
		PesoTurtle.setBounds(193, 223, 179, 19);
		PesoTurtle.setOpaque(false);
		PesoTurtle.setBorder(null);
		sfondo.add(PesoTurtle);
		PesoTurtle.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(193, 241, 179, 21);
		sfondo.add(separator);
		
		JLabel lblNewLabel_6_2 = new JLabel("ID-Tartaruga : ");
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(10, 310, 173, 13);
		sfondo.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Matricola medico : ");
		lblNewLabel_6_3.setForeground(Color.WHITE);
		lblNewLabel_6_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6_3.setBounds(10, 351, 173, 13);
		sfondo.add(lblNewLabel_6_3);
		
		Id_turtleField = new JTextField();
		Id_turtleField.setBounds(193, 308, 179, 19);
		Id_turtleField.setForeground(new Color(255,255,255));
		sfondo.add(Id_turtleField);
		Id_turtleField.setColumns(10);
		
		matricola_medicoField = new JTextField();
		matricola_medicoField.setBounds(193, 349, 179, 19);
		matricola_medicoField.setForeground(new Color(255,255,255));
		sfondo.add(matricola_medicoField);
		matricola_medicoField.setColumns(10);
		
		Id_turtleField.setOpaque(false);
		Id_turtleField.setBorder(null);
		matricola_medicoField.setOpaque(false);
		matricola_medicoField.setBorder(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(193, 327, 179, 42);
		sfondo.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(193, 368, 184, 35);
		sfondo.add(separator_2);
		
		//ACTION 
		Inserisci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id_turtle = Id_turtleField.getText();
				String matricola = matricola_medicoField.getText();
				
				if(PesoTurtle.getText().isEmpty())
					alertPesoNonInserito();
				else if (id_turtle.isEmpty())
					alertTartarugaNonInserito();
				else if(matricola.isEmpty())
					alertMatricolaNonInserita();
				else if(!controller.checkID_Turtle(id_turtle))
					alertIDNonPresente();
				else if(!controller.checkMatricoloMedico(matricola))
					alertMatricolaNonPresente();
				else
				{
					String farmaco = (String) comboBoxFarmaco.getSelectedItem();
					String condizioni = (String) comboBoxCondizioni.getSelectedItem();
					int peso = Integer.parseInt(PesoTurtle.getText());
					SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
					String date = date_format.format(dateChooser.getDate());
					
					boolean flag =controller.InserisciVisita(date, farmaco, peso, condizioni, id_turtle, matricola);
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
		
		GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sfondo.getTopLevelAncestor().setVisible(false);
			}
		});
		
		}
	
	//ALERT 
	
	public void alertInserimentoFallito() {
		JOptionPane.showMessageDialog(this, "Inserimento della visita non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}

	public void alertPesoNonInserito() {
		JOptionPane.showMessageDialog(this, "Peso della tartaruga  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertTartarugaNonInserito() {
		JOptionPane.showMessageDialog(this, "ID  della tartaruga  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertMatricolaNonInserita() {
		JOptionPane.showMessageDialog(this, "Matricola  del  medico  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	
	public void alertInserimentoRiuscito() {
		JOptionPane.showMessageDialog(this, "Inserimento della visita  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
	public void alertIDNonPresente() {
		JOptionPane.showMessageDialog(this, "ID della tartaruga  non  presente nel  sistema !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertMatricolaNonPresente() {
		JOptionPane.showMessageDialog(this, "Matricola  del  medico non  presente nel  sistema!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	

}


