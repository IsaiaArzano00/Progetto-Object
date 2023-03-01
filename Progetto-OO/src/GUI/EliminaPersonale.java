package GUI;

import java.awt.Color;
import java.awt.Font;

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

import com.toedter.calendar.JDateChooser;

import Components.PanelCustomBlue;
import Controller.Controllore;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class EliminaPersonale extends JDialog {
	private JPanel contentPane;
	private Controllore controller;
	private JTextField Nome;
	private JTextField Cognome;
	private JTextField Sede;
	private JTextField data_inizio_lavoro;
	/**
	 * Create the panel.
	 */
	public EliminaPersonale(Controllore contr) {
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
		lblNewLabel.setIcon(new ImageIcon(EliminaPersonale.class.getResource("/Media/remove_user_group_man_man_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RIMUOVI PERSONALE");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 224, 40);
		panel.add(lblNewLabel_1);
		
		JTextArea txtrInserireIDati = new JTextArea();
		txtrInserireIDati.setEditable(false);
		txtrInserireIDati.setOpaque(false);
		txtrInserireIDati.setBorder(null);
		txtrInserireIDati.setForeground(new Color(255, 255, 255));
		txtrInserireIDati.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtrInserireIDati.setText("Inserire i dati per aggiornare la fine del rapporto \r\ndi volontariato con un membro del personale");
		txtrInserireIDati.setBounds(126, 46, 295, 60);
		panel.add(txtrInserireIDati);
		
		JLabel lblNewLabel_3 = new JLabel("Tipologia Personale : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 139, 125, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Nome : ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 264, 147, 13);
		sfondo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cognome : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 307, 102, 13);
		sfondo.add(lblNewLabel_6);
		
		JComboBox comboBoxScelta = new JComboBox();
		
		comboBoxScelta.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxScelta.setModel(new DefaultComboBoxModel(new String[] {"Operatore", "Ricercatore", "Tecnico di laboratorio", "Medico Veterinario"}));
		comboBoxScelta.setBounds(182, 136, 154, 21);
		sfondo.add(comboBoxScelta);
		
		JLabel lblNewLabel_5_1 = new JLabel("Sede : ");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(10, 351, 147, 13);
		sfondo.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Data inizio lavoro : ");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5_2.setBounds(10, 399, 147, 13);
		sfondo.add(lblNewLabel_5_2);
		
		Nome = new JTextField();
		Nome.setForeground(new Color(255, 255, 255));
		Nome.setBorder(null);
		Nome.setOpaque(false);
		Nome.setFont(new Font("SansSerif", Font.BOLD, 12));
		Nome.setEditable(false);
		Nome.setBounds(182, 262, 154, 19);
		sfondo.add(Nome);
		Nome.setColumns(10);
		
		Cognome = new JTextField();
		Cognome.setForeground(new Color(255, 255, 255));
		Cognome.setBorder(null);
		Cognome.setOpaque(false);
		Cognome.setFont(new Font("SansSerif", Font.BOLD, 12));
		Cognome.setEditable(false);
		Cognome.setBounds(182, 305, 154, 19);
		sfondo.add(Cognome);
		Cognome.setColumns(10);
		
		Sede = new JTextField();
		Sede.setForeground(new Color(255, 255, 255));
		Sede.setBorder(null);
		Sede.setOpaque(false);
		Sede.setFont(new Font("SansSerif", Font.BOLD, 12));
		Sede.setEditable(false);
		Sede.setColumns(10);
		Sede.setBounds(182, 349, 154, 19);
		sfondo.add(Sede);
		
		data_inizio_lavoro = new JTextField();
		data_inizio_lavoro.setForeground(new Color(255, 255, 255));
		data_inizio_lavoro.setBorder(null);
		data_inizio_lavoro.setOpaque(false);
		data_inizio_lavoro.setFont(new Font("SansSerif", Font.BOLD, 12));
		data_inizio_lavoro.setEditable(false);
		data_inizio_lavoro.setColumns(10);
		data_inizio_lavoro.setBounds(182, 397, 154, 19);
		sfondo.add(data_inizio_lavoro);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(RilascioTartaruga.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(27, 454, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Elimina = new JLabel("");
		Elimina.setIcon(new ImageIcon(EliminaPersonale.class.getResource("/Media/cross_mark_button_50px.png")));
		Elimina.setBounds(336, 454, 62, 50);
		sfondo.add(Elimina);
		
		JLabel lblNewLabel_9 = new JLabel("Indietro");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(37, 502, 63, 13);
		sfondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Elimina");
		lblNewLabel_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(341, 502, 62, 13);
		sfondo.add(lblNewLabel_10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(182, 282, 162, 13);
		sfondo.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(182, 326, 162, 13);
		sfondo.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(182, 368, 162, 13);
		sfondo.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(182, 415, 162, 13);
		sfondo.add(separator_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Matricola personale : ");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 185, 125, 13);
		sfondo.add(lblNewLabel_3_1);
		
		JComboBox comboBoxMatricola = new JComboBox();
		
		comboBoxMatricola.setBounds(182, 182, 154, 21);
		sfondo.add(comboBoxMatricola);
		
		
		comboBoxScelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String qualifica = (String) comboBoxScelta.getSelectedItem();
				comboBoxMatricola.removeAllItems();
				for(int i =0; i<controller.ListaMatricolaPersonale(qualifica).size();i++)
				{
					comboBoxMatricola.addItem(controller.ListaMatricolaPersonale(qualifica).get(i).toString());
				}
			}
		});
		
		comboBoxMatricola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String qualifica = (String) comboBoxScelta.getSelectedItem();
				String matricola = (String) comboBoxMatricola.getSelectedItem();
				if(qualifica.equals("Operatore"))
				{
					Nome.setText(controller.RecuperaOperatore(matricola).getNome());
	                Cognome.setText(controller.RecuperaOperatore(matricola).getCognome());
	                Sede.setText(controller.RecuperaOperatore(matricola).getSede());
	                data_inizio_lavoro.setText(String.valueOf(controller.RecuperaOperatore(matricola).getData_Inizio_Lavoro()));
				}
				else if (qualifica.equals("Ricercatore"))
				{
					Nome.setText(controller.RecuperaRicercatore(matricola).getNome());
	                Cognome.setText(controller.RecuperaRicercatore(matricola).getCognome());
	                Sede.setText(controller.RecuperaRicercatore(matricola).getSede());
	                data_inizio_lavoro.setText(String.valueOf(controller.RecuperaRicercatore(matricola).getData_Inizio_Lavoro()));
				}
				else if (qualifica.equals("Medico Veterinario"))
				{
					Nome.setText(controller.RecuperaMedico(matricola).getNome());
	                Cognome.setText(controller.RecuperaMedico(matricola).getCognome());
	                Sede.setText(controller.RecuperaMedico(matricola).getSede());
	                data_inizio_lavoro.setText(String.valueOf(controller.RecuperaMedico(matricola).getData_Inizio_Lavoro()));
					
				}
				else
				{
					Nome.setText(controller.RecuperaTecnico(matricola).getNome());
	                Cognome.setText(controller.RecuperaTecnico(matricola).getCognome());
	                Sede.setText(controller.RecuperaTecnico(matricola).getSede());
	                data_inizio_lavoro.setText(String.valueOf(controller.RecuperaTecnico(matricola).getData_Inizio_Lavoro()));
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
		
		Elimina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String qualifica = (String) comboBoxScelta.getSelectedItem();
				String matricola = (String) comboBoxMatricola.getSelectedItem();
                boolean flag=controller.EliminaPersonale(qualifica, matricola);
                if(flag)
                {
                	alertDeleteRiuscito(matricola);
                	sfondo.getTopLevelAncestor().setVisible(false);
                	
                }else
                	alertDeleteNonRiuscito(matricola);
			}
		});
	}
	//ALERT
		public void alertDeleteNonRiuscito(String id) {
			JOptionPane.showMessageDialog(this, "Eliminazione del personale con matricola : "+id+"  non riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
		}
		public void alertDeleteRiuscito(String id) {
			JOptionPane.showMessageDialog(this, "Eliminazione del personale con matricola : "+id+"  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
		}
}
