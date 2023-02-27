package GUI;

import java.awt.Color;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Components.PanelCustomGrey;
import Controller.Controllore;

public class ViewTartarughe extends JDialog {
	private Controllore controller;
	private JPanel contentPane;

	public ViewTartarughe(Controllore contr) {
		 controller = contr;
		 
		setModal(true); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 810, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomGrey panel = new PanelCustomGrey();
		panel.setBounds(0, 0, 796, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel sfondo = new JPanel();
		sfondo.setBounds(0, 119, 796, 399);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JTextArea Spiegazione = new JTextArea();
		Spiegazione.setForeground(new Color(255, 255, 255));
		Spiegazione.setFont(new Font("SansSerif", Font.BOLD, 12));
		Spiegazione.setText("Si prega di inserire  il centro.\r\nVerrà visualizzata la lista delle tartarughe nel centro scelto.");
		Spiegazione.setEditable(false);
		Spiegazione.setBounds(10, 10, 456, 45);
		panel.add(Spiegazione);
		
		Spiegazione.setOpaque(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 65, 367, 21);
		panel.add(scrollPane);
		
		JComboBox<String> comboBoxCentro = new JComboBox<>();
		scrollPane.setRowHeaderView(comboBoxCentro);
		
		
		
		JLabel Search = new JLabel("");
		Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String centro = (String)comboBoxCentro.getSelectedItem();
				controller.VisualizzaTurtle(centro, sfondo);
				}
		});
		Search.setIcon(new ImageIcon(ViewPersonale.class.getResource("/Media/search_28px.png")));
		Search.setBounds(420, 52, 46, 34);
		panel.add(Search);
		
		
		//AGGIUNGI CENTRI A COMBO BOX
		for(int i=0 ; i<controller.getNomeCentri().size();i++) {
			comboBoxCentro.addItem(controller.getNomeCentri().get(i).toString());
		}
		comboBoxCentro.addItem(new String ("Tutti i Centri"));
		
		

		
	
	
	}

}
