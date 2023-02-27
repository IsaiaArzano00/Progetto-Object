package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Components.PanelCustomBlue;
import javax.swing.JComboBox;

public class RimuoviTurtle extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RimuoviTurtle dialog = new RimuoviTurtle();
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
	public RimuoviTurtle() {
		setBounds(100, 100, 500, 550);
		getContentPane().setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(0, 0, 486, 513);
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
		comboBoxTurtle.setBounds(205, 148, 142, 18);
		sfondo.add(comboBoxTurtle);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nome : ");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 226, 86, 18);
		sfondo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Età : ");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(10, 278, 86, 18);
		sfondo.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Data accoglienza Centro : ");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(10, 325, 148, 18);
		sfondo.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Cartella Medica : ");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(10, 376, 134, 18);
		sfondo.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Tartaruga : ");
		lblNewLabel_3_5.setForeground(Color.WHITE);
		lblNewLabel_3_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(10, 426, 86, 18);
		sfondo.add(lblNewLabel_3_5);

	}
}
