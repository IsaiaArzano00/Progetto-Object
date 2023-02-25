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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVisite dialog = new ViewVisite();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ViewVisite() {
		Controllore controller = new Controllore();
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
		comboBoxTurtle.setBounds(336, 137, 221, 30);
		panel_search.add(comboBoxTurtle);
		
		JLabel Search = new JLabel("");
		
		Search.setIcon(new ImageIcon(ViewVisite.class.getResource("/Media/search_28px.png")));
		Search.setBounds(604, 137, 45, 36);
		panel_search.add(Search);
		
		JComboBox comboBoxCentro = new JComboBox();
	
	
		
		comboBoxCentro.setBounds(10, 137, 237, 30);
		panel_search.add(comboBoxCentro);
		
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
		
		
				//FILL COMBOBOX TURTLE
				for(int i =0 ; i<controller.IDTurtle().size();i++)
				{
					comboBoxTurtle.addItem(controller.IDTurtle().get(i).toString());
				}
				
			
		
		
		Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String turtle = (String) comboBoxTurtle.getSelectedItem();
				controller.VisualizzaTurtle(turtle, sfondo);
				System.out.println(turtle);
			}
		});
		
	}
}
