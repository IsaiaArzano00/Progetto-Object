package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

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

public class MorteTurtle extends JDialog {
	private JPanel contentPane;
	private Controllore controller;
	private JTextField Nome;
	private JTextField Eta;
	private JTextField Sede;
	private JTextField Numero_targhetta;

	/**
	 * Create the panel.
	 */
	public MorteTurtle(Controllore contr) {
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
		lblNewLabel.setIcon(new ImageIcon(MorteTurtle.class.getResource("/Media/cemetery_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MORTE TARTARUGA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 224, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati per la morte della tartaruga");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 281, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID Tartaruga : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 139, 125, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data Morte  : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 200, 125, 13);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nome : ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 264, 147, 13);
		sfondo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Età : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 307, 102, 13);
		sfondo.add(lblNewLabel_6);
		
		JComboBox comboBoxTurtle = new JComboBox();
		comboBoxTurtle.setBounds(182, 136, 154, 21);
		sfondo.add(comboBoxTurtle);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(182, 194, 154, 19);
		sfondo.add(dateChooser);
		
		JLabel lblNewLabel_5_1 = new JLabel("Sede : ");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(10, 351, 147, 13);
		sfondo.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Numero Targhetta : ");
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
		
		Eta = new JTextField();
		Eta.setForeground(new Color(255, 255, 255));
		Eta.setBorder(null);
		Eta.setOpaque(false);
		Eta.setFont(new Font("SansSerif", Font.BOLD, 12));
		Eta.setEditable(false);
		Eta.setBounds(182, 305, 154, 19);
		sfondo.add(Eta);
		Eta.setColumns(10);
		
		Sede = new JTextField();
		Sede.setForeground(new Color(255, 255, 255));
		Sede.setBorder(null);
		Sede.setOpaque(false);
		Sede.setFont(new Font("SansSerif", Font.BOLD, 12));
		Sede.setEditable(false);
		Sede.setColumns(10);
		Sede.setBounds(182, 349, 154, 19);
		sfondo.add(Sede);
		
		Numero_targhetta = new JTextField();
		Numero_targhetta.setForeground(new Color(255, 255, 255));
		Numero_targhetta.setBorder(null);
		Numero_targhetta.setOpaque(false);
		Numero_targhetta.setFont(new Font("SansSerif", Font.BOLD, 12));
		Numero_targhetta.setEditable(false);
		Numero_targhetta.setColumns(10);
		Numero_targhetta.setBounds(182, 397, 154, 19);
		sfondo.add(Numero_targhetta);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(MorteTurtle.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(27, 454, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Inserisci = new JLabel("");
		Inserisci.setIcon(new ImageIcon(MorteTurtle.class.getResource("/Media/save_50px.png")));
		Inserisci.setBounds(336, 454, 62, 50);
		sfondo.add(Inserisci);
		
		JLabel lblNewLabel_9 = new JLabel("Indietro");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(37, 502, 63, 13);
		sfondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Salva");
		lblNewLabel_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(348, 502, 62, 13);
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
		
		for(int i=0;i<controller.ListaTartarugheDaRilasciare().size();i++)
		{
			comboBoxTurtle.addItem(controller.ListaTartarugheDaRilasciare().get(i).toString());
		}
		
		//ACTION 
		comboBoxTurtle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id_turtle = (String) comboBoxTurtle.getSelectedItem();
                
                Nome.setText(controller.RecuperaTurtle(id_turtle).getNome().toString());
                Eta.setText(String.valueOf(controller.RecuperaTurtle(id_turtle).getEta()));
                Sede.setText(controller.RecuperaTurtle(id_turtle).getID_Sede());
                Numero_targhetta.setText(controller.RecuperaTurtle(id_turtle).getNumero_targhetta());
            }
        });
		
		//LISTENER
		Inserisci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id_turtle = (String) comboBoxTurtle.getSelectedItem();
				
				SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String date = date_format.format(dateChooser.getDate());
                
                boolean flag=controller.MorteTurtle(id_turtle, date);
                if(flag)
                {
                	alertUpdateRiuscito(id_turtle);
                	sfondo.getTopLevelAncestor().setVisible(false);
                	
                }else
                	alertUpdateNonRiuscito(id_turtle);
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
	public void alertUpdateNonRiuscito(String id) {
		JOptionPane.showMessageDialog(this, "Aggiornamento morte della tartaruga : "+id+"  non riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
	public void alertUpdateRiuscito(String id) {
		JOptionPane.showMessageDialog(this, "Aggiornamento morte della tartaruga : "+id+"  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
}
