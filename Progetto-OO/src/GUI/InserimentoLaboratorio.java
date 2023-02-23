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

public class InserimentoLaboratorio extends JDialog {
	private JTextField numero_lab;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InserimentoLaboratorio dialog = new InserimentoLaboratorio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InserimentoLaboratorio() {
		Controllore controller = new Controllore();
		
		getContentPane().setLayout(null);
		setBounds(100,100,454,472);
		setResizable(false);
		setModal(true);
		
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
		lblNewLabel.setIcon(new ImageIcon(InserimentoLaboratorio.class.getResource("/Media/Lab Items_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LABORATORIO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 10, 160, 40);
		panel1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati del nuovo laboaratorio");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(126, 60, 293, 24);
		panel1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Numero di telefono :");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 136, 127, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Finalità del laboratorio : ");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 199, 127, 13);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Centro : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 272, 62, 13);
		sfondo.add(lblNewLabel_6);
		
		numero_lab = new JTextField();
		numero_lab.setForeground(new Color(255, 255, 255));
		numero_lab.setBounds(147, 134, 169, 19);
		sfondo.add(numero_lab);
		numero_lab.setColumns(10);
		numero_lab.setOpaque(false);
		numero_lab.setBorder(null);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(147, 152, 179, 38);
		sfondo.add(separator);
		
		
		JLabel GoBack = new JLabel("");
		
		GoBack.setIcon(new ImageIcon(InserimentoTartaruga.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(19, 349, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Inserisci = new JLabel("");
		Inserisci.setIcon(new ImageIcon(InserimentoTartaruga.class.getResource("/Media/save_50px.png")));
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
		
		
		
		JComboBox comboBoxFinalita = new JComboBox();
		comboBoxFinalita.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxFinalita.setModel(new DefaultComboBoxModel(new String[] {"monitoraggio qualita ambiente marino", "raccolta materiale e attivita subacquea", "rilievo idrografici e campionamento", "monitoraggio specie protette", "monitoraggio specie a rischio estinzione"}));
		comboBoxFinalita.setBounds(157, 195, 242, 21);
		sfondo.add(comboBoxFinalita);
		
		JComboBox<String> comboBoxSede = new JComboBox<>();
		comboBoxSede.setBounds(116, 269, 69, 21);
		sfondo.add(comboBoxSede);
		for(int i=0 ; i<controller.getIDSede().size();i++) {
			comboBoxSede.addItem(controller.getIDSede().get(i).toString());
		}
		
		//ACTION 
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
					
						String finalita = (String) comboBoxFinalita.getSelectedItem();
						String centro = (String) comboBoxSede.getSelectedItem();
						
						if(numero_lab.getText().isEmpty())
							alertNumeroNonInserito();
						
						else
						{
							int numero=Integer.parseInt(numero_lab.getText());
							boolean flag = controller.InserisciLaboratorio(finalita, numero, centro);
							if(flag=true)
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
					JOptionPane.showMessageDialog(this, "Inserimento del laboratorio non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
				}

				public void alertNumeroNonInserito() {
					JOptionPane.showMessageDialog(this, "Numero  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
				}
				
				
				public void alertInserimentoRiuscito() {
					JOptionPane.showMessageDialog(this, "Inserimento del laboratorio  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
				}
				
	

}
