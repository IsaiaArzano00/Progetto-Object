package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;

import com.toedter.calendar.JDateChooser;

import Components.PanelCustomBlue;
import Controller.Controllore;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class InserimentoTartarugaRiammissione extends JFrame {

	private JPanel contentPane;
	private PanelCustomBlue sfondo;
	private JTextField Nome;
	private JTextField Eta_Turtle;
	private JTextField Num_Targhetta;
	private Controllore controller;
	private JComboBox<String> comboBoxCentro;
	private JDateChooser dateChooser;
	

	public InserimentoTartarugaRiammissione(Controllore contr) {
		
		 controller = contr;
		 
		setVisible(true);
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
		lblNewLabel.setIcon(new ImageIcon(InserimentoTartarugaRiammissione.class.getResource("/Media/turtle_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TARTARUGA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 160, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati della tartaruga");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 241, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 136, 45, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Età : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 180, 45, 13);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Data accoglienza Centro : ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 286, 147, 13);
		sfondo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Centro : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 350, 62, 13);
		sfondo.add(lblNewLabel_6);
		
		Nome = new JTextField();
		Nome.setForeground(new Color(255, 255, 255));
		Nome.setBounds(147, 134, 169, 19);
		sfondo.add(Nome);
		Nome.setColumns(10);
		Nome.setOpaque(false);
		Nome.setBorder(null);
		
		Eta_Turtle = new JTextField();
		Eta_Turtle.setForeground(new Color(255, 255, 255));
		Eta_Turtle.setBounds(147, 178, 187, 19);
		sfondo.add(Eta_Turtle);
		Eta_Turtle.setColumns(10);
		Eta_Turtle.setBorder(null);
		Eta_Turtle.setOpaque(false);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(167, 286, 167, 19);
		sfondo.add(dateChooser);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(147, 152, 179, 38);
		sfondo.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(147, 200, 187, 38);
		sfondo.add(separator_1);
		
		
		JLabel GoBack = new JLabel("");
		
		GoBack.setIcon(new ImageIcon(InserimentoTartarugaRiammissione.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(32, 451, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Inserisci = new JLabel("");
		Inserisci.setIcon(new ImageIcon(InserimentoTartarugaRiammissione.class.getResource("/Media/save_50px.png")));
		Inserisci.setBounds(364, 451, 62, 50);
		sfondo.add(Inserisci);
		
		JLabel lblNewLabel_9 = new JLabel("Indietro");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(42, 500, 63, 13);
		sfondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Salva");
		lblNewLabel_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(370, 500, 62, 13);
		sfondo.add(lblNewLabel_10);
		
		JLabel Numero_Targhetta = new JLabel("Numero targhetta :");
		Numero_Targhetta.setForeground(Color.WHITE);
		Numero_Targhetta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		Numero_Targhetta.setBounds(10, 229, 127, 13);
		sfondo.add(Numero_Targhetta);
		
		Num_Targhetta = new JTextField();
		Num_Targhetta.setForeground(new Color(255, 255, 255));
		Num_Targhetta.setOpaque(false);
		Num_Targhetta.setColumns(10);
		Num_Targhetta.setBorder(null);
		Num_Targhetta.setBounds(147, 227, 187, 19);
		sfondo.add(Num_Targhetta);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(147, 248, 187, 38);
		sfondo.add(separator_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(129, 342, 221, 21);
		sfondo.add(scrollPane);
		
		comboBoxCentro = new JComboBox<>();
		for(int i=0 ; i<controller.getNomeCentri().size();i++) {
			comboBoxCentro.addItem(controller.getNomeCentri().get(i).toString());
		}
		scrollPane.setRowHeaderView(comboBoxCentro);
		
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
				if(Nome.getText().isEmpty())
					alertNomeNonInserito();
				else if(Eta_Turtle.getText().isEmpty())
					alertEtaNonInserita();
				else if(Num_Targhetta.getText().isEmpty())
					alertNumeroTarghettaNonInserito();
				else if(comboBoxCentro.getSelectedItem().toString().isEmpty())
					alertCentroNonInserito() ;
				else
				{
					boolean flag = controller.InsertTartarugaRiammissione();
					if(flag=true) {
						alertInserimentoRiuscito();
						InserimentoTartarugaRiammissione.this.setVisible(true);
					}
					else
						alertInserimentoFallito();
				}
				
			}
		});
		
	}
	//FUNCTIONS
	public String GetNome()
	{
		String nome=Nome.getText();
		return nome;
	}
	public int GetEta()
	{
		int eta=Integer.parseInt(Eta_Turtle.getText());
		return eta;
	}
	public String GetCentro()
	{
		String centro = (String) comboBoxCentro.getSelectedItem();
		return centro;
	}
	public Date GetDate()
	{
		java.util.Date data = dateChooser.getDate();
		return (Date) data;
	}
	public String GetNumTarghetta()
	{
		String numero_targhetta = Num_Targhetta.getText();
		return numero_targhetta;
	}
	//ALERT
	public void alertInserimentoFallito() {
		JOptionPane.showMessageDialog(this, "Inserimento della tartaruga non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}

	public void alertNomeNonInserito() {
		JOptionPane.showMessageDialog(this, "Nome  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	
	public void alertNumeroTarghettaNonInserito() {
		JOptionPane.showMessageDialog(this, "Numero targhetta  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertCentroNonInserito() {
		JOptionPane.showMessageDialog(this, "Centro non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	
	public void alertInserimentoRiuscito() {
		JOptionPane.showMessageDialog(this, "Inserimento della tartaruga riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
	public void alertEtaNonInserita() {
		JOptionPane.showMessageDialog(this, "Eta non inserita !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	
		
		
		
	
	
}
