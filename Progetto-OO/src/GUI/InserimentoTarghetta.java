package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Components.PanelCustomBlue;
import Controller.Controllore;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class InserimentoTarghetta extends JDialog {
	private JPanel contentPane;
	private Controllore controller;
	private JTextField Matricola_Ope;
	/**
	 * Create the panel.
	 */
	public InserimentoTarghetta(Controllore contr) {
		controller=contr;
		
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(0, 0, 450, 650);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 116);
		sfondo.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(0,0,0,70));
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(InserimentoTarghetta.class.getResource("/Media/tag_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INSERISCI TARGHETTA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 224, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati per aggiungere una targhetta.");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 281, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID Tartaruga : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 139, 125, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Matricola Operatore : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 200, 125, 13);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Data emissione : ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 264, 147, 13);
		sfondo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Presenza GPS : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 324, 102, 13);
		sfondo.add(lblNewLabel_6);
		
		JComboBox comboBoxTurtle = new JComboBox();
		comboBoxTurtle.setBounds(182, 136, 154, 21);
		sfondo.add(comboBoxTurtle);
		
		Matricola_Ope = new JTextField();
		Matricola_Ope.setFont(new Font("SansSerif", Font.BOLD, 12));
		Matricola_Ope.setBounds(182, 198, 154, 21);
		Matricola_Ope.setOpaque(false);
		Matricola_Ope.setBorder(null);
		sfondo.add(Matricola_Ope);
		Matricola_Ope.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(182, 264, 154, 21);
		sfondo.add(dateChooser);
		
		JComboBox comboBoxGPS = new JComboBox();
		comboBoxGPS.setFont(new Font("SansSerif", Font.BOLD, 13));
		comboBoxGPS.setModel(new DefaultComboBoxModel(new String[] {"SI", "NO"}));
		comboBoxGPS.setBounds(182, 321, 154, 21);
		sfondo.add(comboBoxGPS);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(182, 217, 154, 21);
		sfondo.add(separator);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(InserimentoTarghetta.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(29, 427, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Inserisci = new JLabel("");
	
		Inserisci.setIcon(new ImageIcon(InserimentoTarghetta.class.getResource("/Media/save_50px.png")));
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
		
		for(int i =0; i<controller.ListaTartarugheSenzaTarghetta().size();i++)
		{
			comboBoxTurtle.addItem(controller.ListaTartarugheSenzaTarghetta().get(i).toString());
		}
		
		//LISTENER 
		Inserisci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String turtle =comboBoxTurtle.getSelectedItem().toString();
				String matricola_ope =Matricola_Ope.getText();
				String presenza_gps="";
				if(matricola_ope.isEmpty())
					alertMatricolaNonInserita();
				else if (!controller.CheckMatricolaOperatore(matricola_ope))
					alertMatricolaNonPresente();
				else 
				{
					 SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
		             String date = date_format.format(dateChooser.getDate());
		                
					if(comboBoxGPS.getSelectedItem().toString().equals("SI"))
						presenza_gps="TRUE";
					else
						presenza_gps="FALSE";
					
					boolean flag = controller.InserisciTarghetta(turtle, matricola_ope, date, presenza_gps);
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
		JOptionPane.showMessageDialog(this, "Inserimento della targhetta non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}

	public void alertMatricolaNonInserita() {
		JOptionPane.showMessageDialog(this, "Matricola  dell' operatore  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	
	public void alertInserimentoRiuscito() {
		JOptionPane.showMessageDialog(this, "Inserimento della targhetta riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
	public void alertMatricolaNonPresente() {
		JOptionPane.showMessageDialog(this, "Matricola  dell' operatore  non  presente nel  sistema!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
}
