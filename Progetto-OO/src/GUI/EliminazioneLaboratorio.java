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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Components.PanelCustomBlue;
import Controller.Controllore;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class EliminazioneLaboratorio extends JDialog {
	private JPanel contentPane;
	private Controllore controller;
	private JTextField NumeroLab;
	private JTextField FinalitaLab;
	private JTextField Sede;
	/**
	 * Create the panel.
	 */
	public EliminazioneLaboratorio(Controllore contr) {
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
		lblNewLabel.setIcon(new ImageIcon(EliminazioneLaboratorio.class.getResource("/Media/Lab Items_100px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RIMUOVI LABORATORIO");
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
		txtrInserireIDati.setText("Inserire i dati per eliminare un laboratorio presente\r\nnel Centro.");
		txtrInserireIDati.setBounds(126, 46, 295, 60);
		panel.add(txtrInserireIDati);
		
		JLabel lblNewLabel_3 = new JLabel("Codice Laboratorio : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 139, 125, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Numero Laboratorio : ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 199, 147, 13);
		sfondo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Finalità del laboratorio : ");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 258, 162, 13);
		sfondo.add(lblNewLabel_6);
		
		JComboBox comboBoxLab = new JComboBox();
		
		
		comboBoxLab.setFont(new Font("SansSerif", Font.BOLD, 12));
		comboBoxLab.setBounds(182, 136, 154, 21);
		sfondo.add(comboBoxLab);
		
		JLabel lblNewLabel_5_1 = new JLabel("Sede : ");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(10, 314, 147, 13);
		sfondo.add(lblNewLabel_5_1);
		
		NumeroLab = new JTextField();
		NumeroLab.setForeground(new Color(255, 255, 255));
		NumeroLab.setBorder(null);
		NumeroLab.setOpaque(false);
		NumeroLab.setFont(new Font("SansSerif", Font.BOLD, 12));
		NumeroLab.setEditable(false);
		NumeroLab.setBounds(182, 196, 154, 19);
		sfondo.add(NumeroLab);
		NumeroLab.setColumns(10);
		
		FinalitaLab = new JTextField();
		FinalitaLab.setForeground(new Color(255, 255, 255));
		FinalitaLab.setBorder(null);
		FinalitaLab.setOpaque(false);
		FinalitaLab.setFont(new Font("SansSerif", Font.BOLD, 12));
		FinalitaLab.setEditable(false);
		FinalitaLab.setBounds(182, 255, 154, 19);
		sfondo.add(FinalitaLab);
		FinalitaLab.setColumns(10);
		
		Sede = new JTextField();
		Sede.setForeground(new Color(255, 255, 255));
		Sede.setBorder(null);
		Sede.setOpaque(false);
		Sede.setFont(new Font("SansSerif", Font.BOLD, 12));
		Sede.setEditable(false);
		Sede.setColumns(10);
		Sede.setBounds(182, 311, 162, 19);
		sfondo.add(Sede);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(EliminazioneVasca.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(27, 454, 53, 50);
		sfondo.add(GoBack);
		
		JLabel Elimina = new JLabel("");
		Elimina.setIcon(new ImageIcon(EliminazioneVasca.class.getResource("/Media/cross_mark_button_50px.png")));
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
		separator.setBounds(182, 213, 162, 13);
		sfondo.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(182, 275, 162, 13);
		sfondo.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(182, 330, 162, 13);
		sfondo.add(separator_2);
		
		for(int i=0; i<controller.ListaIdLab().size();i++)
		{
			comboBoxLab.addItem(controller.ListaIdLab().get(i).toString());
		}
		
		comboBoxLab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idLAB = (String) comboBoxLab.getSelectedItem();
				
				NumeroLab.setText(String.valueOf(controller.RecuperoLaboratorio(idLAB).getNumero_lab()));
				Sede.setText(controller.RecuperoLaboratorio(idLAB).getId_sede());
				FinalitaLab.setText(controller.RecuperoLaboratorio(idLAB).getFinalita_laboratorio());
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
				String id_laboratorio = (String) comboBoxLab.getSelectedItem();
				
                boolean flag=controller.EliminaLab(id_laboratorio);
                if(flag)
                {
                	alertDeleteRiuscito(id_laboratorio);
                	sfondo.getTopLevelAncestor().setVisible(false);
                	
                }else
                	alertDeleteNonRiuscito(id_laboratorio);
			}
		});

	}
	//ALERT
		public void alertDeleteNonRiuscito(String id) {
			JOptionPane.showMessageDialog(this, "Eliminazione del laboratorio  : "+id+"  non riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
		}
		public void alertDeleteRiuscito(String id) {
			JOptionPane.showMessageDialog(this, "Eliminazione del laboratorio  : "+id+"  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
		}


}
