package GUI;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Components.PanelCustomDashboard;
import Components.PanelCustomGrey;
import Controller.Controllore;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewVisite extends JFrame {
	private Controllore controller;


	public ViewVisite(Controllore contr) {
		 controller = contr;
		
		//setModal(true);
		setBounds(100, 100, 810, 685);
		getContentPane().setLayout(null);
		
		PanelCustomGrey panel_search = new PanelCustomGrey();
		panel_search.setBounds(0, 0, 865, 200);
		getContentPane().add(panel_search);
		panel_search.setLayout(null);
		
		JTextArea txtInfo = new JTextArea();
		txtInfo.setEditable(false);
		txtInfo.setForeground(new Color(255, 255, 255));
		txtInfo.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtInfo.setText("Si prega di slezionare una tartaruga.\r\nVerrà visualizzata la lista delle visite effettuate alla tartaruga scelta.");
		txtInfo.setBounds(132, 49, 450, 51);
		panel_search.add(txtInfo);
		txtInfo.setOpaque(false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewVisite.class.getResource("/Media/ecg_100px.png")));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 23));
		lblNewLabel.setBounds(10, -3, 134, 114);
		panel_search.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LISTA VISITE");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 23));
		lblNewLabel_1.setBounds(132, 10, 175, 42);
		panel_search.add(lblNewLabel_1);
		
		JComboBox comboBoxTurtle = new JComboBox();
		comboBoxTurtle.setBounds(334, 160, 221, 30);
		panel_search.add(comboBoxTurtle);
		
		JLabel Search = new JLabel("");
		
		Search.setIcon(new ImageIcon(ViewVisite.class.getResource("/Media/search_28px.png")));
		Search.setBounds(641, 160, 45, 36);
		panel_search.add(Search);
		
		JComboBox comboBoxCentro = new JComboBox();
		
	
	
		
		comboBoxCentro.setBounds(10, 160, 237, 30);
		panel_search.add(comboBoxCentro);
		
		JLabel lblNewLabel_2 = new JLabel("Centro : ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(57, 137, 87, 13);
		panel_search.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID Tartaruga : ");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(389, 137, 114, 13);
		panel_search.add(lblNewLabel_3);
		
		PanelCustomDashboard sfondo = new PanelCustomDashboard();
		sfondo.setBounds(0, 200, 865, 460);
		getContentPane().add(sfondo);
		sfondo.setLayout(null);
		
	
		
		//FILL COMBOBOX CENTRO
		for(int i =0 ; i<controller.getIDSede().size();i++)
		{
			comboBoxCentro.addItem(controller.getIDSede().get(i).toString());
		}
		
		//ACTION
		comboBoxCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sede = (String) comboBoxCentro.getSelectedItem();
				comboBoxTurtle.removeAllItems();
				for(int i =0 ; i<controller.IDTurtleSede(sede).size();i++)
				{
					comboBoxTurtle.addItem(controller.IDTurtleSede(sede).get(i).toString());
				}
			}
		});
		//LISTENER 
		
		Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String turtle = (String) comboBoxTurtle.getSelectedItem();
				controller.VisualizzaVisite(turtle, sfondo);
				
			}
		});
		
	}
}
