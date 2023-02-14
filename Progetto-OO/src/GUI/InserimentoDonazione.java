package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import com.toedter.calendar.JDateChooser;

import Components.PanelWhite;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InserimentoDonazione extends JFrame {

	private JPanel contentPane;
	private PanelWhite sfondo;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserimentoDonazione frame = new InserimentoDonazione();
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
	public InserimentoDonazione() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelWhite sfondo = new PanelWhite();
		sfondo.setBounds(0, 0, 450, 577);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 89);
		sfondo.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/euro_money_80px.png")));
		lblNewLabel.setBounds(10, 10, 83, 79);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DONAZIONE");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(103, 10, 177, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire la donazione ricevuta.");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(103, 54, 177, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Importo : ");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 112, 69, 22);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Data donazione : ");
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 162, 98, 22);
		sfondo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("email donatore : ");
		lblNewLabel_3_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(10, 216, 98, 22);
		sfondo.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Metodo di pagamento : ");
		lblNewLabel_3_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(10, 271, 132, 22);
		sfondo.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Centro : ");
		lblNewLabel_3_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(10, 324, 69, 22);
		sfondo.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/save_50px.png")));
		lblNewLabel_4.setBounds(371, 415, 56, 61);
		sfondo.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(InserimentoDonazione.class.getResource("/Media/cross_mark_button_50px.png")));
		lblNewLabel_4_1.setBounds(305, 415, 56, 61);
		sfondo.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6 = new JLabel("Cancella");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setBounds(303, 465, 58, 32);
		sfondo.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Salva");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(373, 471, 54, 21);
		sfondo.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(166, 115, 163, 19);
		sfondo.add(textField);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setOpaque(false);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(166, 219, 177, 19);
		sfondo.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(156, 139, 187, 21);
		sfondo.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(156, 241, 187, 21);
		sfondo.add(separator_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(166, 162, 177, 19);
		sfondo.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("SansSerif", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PayPal", "MasterCard", "Visa", "Bonifico Bancario"}));
		comboBox.setBounds(166, 273, 163, 21);
		sfondo.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(166, 326, 163, 21);
		sfondo.add(comboBox_1);
	}
}
