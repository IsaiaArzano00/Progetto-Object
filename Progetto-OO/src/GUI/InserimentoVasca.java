package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
import javax.swing.JScrollPane;

public class InserimentoVasca extends JDialog {
	private JTextField capacita_vasca;
	private Controllore controller;
	private final JPanel contentPanel = new JPanel();
	private JTextField temperatura_vasca;

	public InserimentoVasca(Controllore contr) {
		controller=contr;
		
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 455, 469);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 658, 508);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(0, 0, 450, 435);
		panel.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 450, 116);
		sfondo.add(panel1);
		panel1.setLayout(null);
		panel1.setBackground(new Color(0,0,0,70));
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(InserimentoVasca.class.getResource("/Media/aquarium_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VASCA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 160, 40);
		panel1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati della nuova vasca");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 293, 24);
		panel1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Capacità in litri : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 136, 127, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Temperatura consigliata : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 199, 157, 13);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Centro : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 272, 62, 13);
		sfondo.add(lblNewLabel_6);
		
		capacita_vasca = new JTextField();
		capacita_vasca.setForeground(new Color(255, 255, 255));
		capacita_vasca.setBounds(177, 134, 169, 19);
		sfondo.add(capacita_vasca);
		capacita_vasca.setColumns(10);
		capacita_vasca.setOpaque(false);
		capacita_vasca.setBorder(null);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(177, 153, 179, 38);
		sfondo.add(separator);
		
		
		JLabel GoBack = new JLabel("");
		
		GoBack.setIcon(new ImageIcon(InserimentoTartarugaRiammissione.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(19, 349, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Inserisci = new JLabel("");
		Inserisci.setIcon(new ImageIcon(InserimentoTartarugaRiammissione.class.getResource("/Media/save_50px.png")));
		Inserisci.setBounds(378, 349, 62, 50);
		sfondo.add(Inserisci);
		
		JLabel lblNewLabel_9 = new JLabel("Indietro");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(29, 409, 63, 13);
		sfondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Salva");
		lblNewLabel_10.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(388, 409, 62, 13);
		sfondo.add(lblNewLabel_10);
		
		temperatura_vasca = new JTextField();
		temperatura_vasca.setOpaque(false);
		temperatura_vasca.setForeground(Color.WHITE);
		temperatura_vasca.setColumns(10);
		temperatura_vasca.setBorder(null);
		temperatura_vasca.setBounds(177, 197, 169, 19);
		sfondo.add(temperatura_vasca);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(177, 215, 179, 38);
		sfondo.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 268, 244, 23);
		sfondo.add(scrollPane);
		
		JComboBox<String> comboBoxCentro = new JComboBox<>();
		scrollPane.setColumnHeaderView(comboBoxCentro);
		
		//FILL COMBOBOXCENTRO CON NOMI DEI CENTRI	
		for(int i=0 ; i<controller.getNomeCentri().size();i++) {
			comboBoxCentro.addItem(controller.getNomeCentri().get(i).toString());
		}
		
		
		//ACTION 
				GoBack.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						sfondo.getTopLevelAncestor().setVisible(false);
					}
				});
				
				Inserisci.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if(capacita_vasca.getText().isEmpty())
							alertCapacitaNonInserita();
						else if(temperatura_vasca.getText().isEmpty())
							alertTemperaturaNonInserita();
						else
						{
							double capacita=Double.parseDouble(capacita_vasca.getText());
							double temperatura=Double.parseDouble(temperatura_vasca.getText());
							String centro=(String) comboBoxCentro.getSelectedItem();
							boolean flag = controller.InserisciVasca(capacita, temperatura, centro);
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
	}
				
				//ALERT
				public void alertInserimentoFallito() {
					JOptionPane.showMessageDialog(this, "Inserimento della vasca non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
				}

				public void alertCapacitaNonInserita() {
					JOptionPane.showMessageDialog(this, "Capacità della vasca  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
				}
				public void alertTemperaturaNonInserita() {
					JOptionPane.showMessageDialog(this, "Temperatura della vasca  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
				}
				
				public void alertInserimentoRiuscito() {
					JOptionPane.showMessageDialog(this, "Inserimento della vasca  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
				}
}
