package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Components.PanelCustomGrey;
import Components.TablePersonale;
import Controller.Controllore;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class ViewPersonale extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPersonale frame = new ViewPersonale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewPersonale() {
		Controllore controller = new Controllore ();
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
		Spiegazione.setText("Si prega di inserire la qualifica ed il centro.\r\nVerrà visualizzata la lista del personale scelto.");
		Spiegazione.setEditable(false);
		Spiegazione.setBounds(10, 10, 456, 45);
		panel.add(Spiegazione);
		
		Spiegazione.setOpaque(false);
		
		JComboBox comboBoxQualifica = new JComboBox();
		comboBoxQualifica.setModel(new DefaultComboBoxModel(new String[] {"Operatore", "Medico Veterinario", "Ricercatore", "Tecnico di Laboratorio"}));
		comboBoxQualifica.setBounds(20, 65, 128, 21);
		panel.add(comboBoxQualifica);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 65, 367, 21);
		panel.add(scrollPane);
		
		JComboBox<String> comboBoxCentro = new JComboBox<>();
		scrollPane.setRowHeaderView(comboBoxCentro);
		
		
		
		JLabel Search = new JLabel("");
		Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String qualifica = (String)comboBoxQualifica.getSelectedItem();
				String centro = (String)comboBoxCentro.getSelectedItem();
				controller.VisualizzaPersonale(qualifica,centro,sfondo);
				}
		});
		Search.setIcon(new ImageIcon(ViewPersonale.class.getResource("/Media/search_28px.png")));
		Search.setBounds(704, 65, 46, 34);
		panel.add(Search);
		
		
		//AGGIUNGI CENTRI A COMBO BOX
		for(int i=0 ; i<controller.getNomeCentri().size();i++) {
			comboBoxCentro.addItem(controller.getNomeCentri().get(i).toString());
		}
		comboBoxCentro.addItem(new String ("Tutti i Centri"));
		
		

		
	
	
	}
}
