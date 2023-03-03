package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Components.PanelCustomBlue;
import Controller.Controllore;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class RimuoviTurtle extends JDialog {
	private JTextField Nome;
	private JTextField Eta;
	private JTextField Data_accoglienza;
	private JTextField Cartella_medica;
	private JTextField Numero_Targhetta;
	private Controllore controller;


	public RimuoviTurtle(Controllore contr) {
		controller=contr;
		setBounds(100, 100, 500, 571);
		getContentPane().setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(0, 0, 486, 535);
		getContentPane().add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 486, 127);
		sfondo.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(0,0,0,70));
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(RimuoviTurtle.class.getResource("/Media/turtle_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RIMUOVI TARTARUGA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 278, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Selezionare la tartaruga da rimuovere dal Centro.");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 338, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tartaruga : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 148, 86, 18);
		sfondo.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		
		JComboBox comboBoxTurtle = new JComboBox();
		comboBoxTurtle.setBounds(205, 148, 169, 18);
		sfondo.add(comboBoxTurtle);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nome : ");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 202, 86, 18);
		sfondo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Età : ");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(10, 252, 86, 18);
		sfondo.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Data accoglienza Centro : ");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(10, 304, 148, 18);
		sfondo.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Cartella Medica : ");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(10, 354, 134, 18);
		sfondo.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Numero Targhetta : ");
		lblNewLabel_3_5.setForeground(Color.WHITE);
		lblNewLabel_3_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(10, 404, 134, 18);
		sfondo.add(lblNewLabel_3_5);
		
		Nome = new JTextField();
		Nome.setForeground(new Color(255, 255, 255));
		Nome.setFont(new Font("SansSerif", Font.BOLD, 12));
		Nome.setEditable(false);
		Nome.setBorder(null);
		Nome.setOpaque(false);
		Nome.setBounds(205, 203, 169, 19);
		sfondo.add(Nome);
		Nome.setColumns(10);
		
		Eta = new JTextField();
		Eta.setForeground(new Color(255, 255, 255));
		Eta.setFont(new Font("SansSerif", Font.BOLD, 12));
		Eta.setEditable(false);
		Eta.setBorder(null);
		Eta.setOpaque(false);
		Eta.setColumns(10);
		Eta.setBounds(205, 253, 169, 19);
		sfondo.add(Eta);
		
		Data_accoglienza = new JTextField();
		Data_accoglienza.setForeground(new Color(255, 255, 255));
		Data_accoglienza.setFont(new Font("SansSerif", Font.BOLD, 12));
		Data_accoglienza.setEditable(false);
		Data_accoglienza.setBorder(null);
		Data_accoglienza.setOpaque(false);
		Data_accoglienza.setColumns(10);
		Data_accoglienza.setBounds(205, 305, 169, 19);
		sfondo.add(Data_accoglienza);
		
		Cartella_medica = new JTextField();
		Cartella_medica.setFont(new Font("SansSerif", Font.BOLD, 12));
		Cartella_medica.setForeground(new Color(255, 255, 255));
		Cartella_medica.setEditable(false);
		Cartella_medica.setBorder(null);
		Cartella_medica.setOpaque(false);
		Cartella_medica.setColumns(10);
		Cartella_medica.setBounds(205, 355, 169, 19);
		sfondo.add(Cartella_medica);
		
		Numero_Targhetta = new JTextField();
		Numero_Targhetta.setForeground(new Color(255, 255, 255));
		Numero_Targhetta.setFont(new Font("SansSerif", Font.BOLD, 12));
		Numero_Targhetta.setEditable(false);
		Numero_Targhetta.setBorder(null);
		Numero_Targhetta.setOpaque(false);
		Numero_Targhetta.setColumns(10);
		Numero_Targhetta.setBounds(205, 405, 169, 19);
		sfondo.add(Numero_Targhetta);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(205, 221, 169, 9);
		sfondo.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(205, 271, 169, 9);
		sfondo.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(205, 321, 169, 9);
		sfondo.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(205, 373, 169, 9);
		sfondo.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(205, 424, 169, 9);
		sfondo.add(separator_4);

		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(RimuoviTurtle.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(27, 454, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Elimina = new JLabel("");
		Elimina.setIcon(new ImageIcon(RimuoviTurtle.class.getResource("/Media/cross_mark_button_50px.png")));
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
		
		for(int i=0;i<controller.IDTurtle().size();i++)
		{
			comboBoxTurtle.addItem(controller.IDTurtle().get(i).toString());
		}
		
		comboBoxTurtle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id_turtle = (String) comboBoxTurtle.getSelectedItem();
				Nome.setText(controller.RecuperaTurtle(id_turtle).getNome());
				Eta.setText(String.valueOf(controller.RecuperaTurtle(id_turtle).getEta()));
				Data_accoglienza.setText(String.valueOf(controller.RecuperaTurtle(id_turtle).getData_accoglienza_centro()));
				Numero_Targhetta.setText(controller.RecuperaTurtle(id_turtle).getNumero_targhetta());
				Cartella_medica.setText(controller.RecuperaTurtle(id_turtle).getID_CartellaMedica());
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
				String id_turtle = (String) comboBoxTurtle.getSelectedItem();
				
                boolean flag=controller.EliminaTurtle(id_turtle);
                if(flag)
                {
                	alertDeleteRiuscito(id_turtle);
                	sfondo.getTopLevelAncestor().setVisible(false);
                	
                }else
                	alertDeleteNonRiuscito(id_turtle);
			}
		});

	}
	//ALERT
			public void alertDeleteNonRiuscito(String id) {
				JOptionPane.showMessageDialog(this, "Eliminazione della tartaruga   : "+id+"  non riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
			}
			public void alertDeleteRiuscito(String id) {
				JOptionPane.showMessageDialog(this, "Eliminazione della tartaruga   : "+id+"  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
			}
}
