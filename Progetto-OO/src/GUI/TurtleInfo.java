package GUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import Components.PanelCustomDashboard;
import Components.PanelViewVisite;
import Controller.Controllore;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class TurtleInfo extends JDialog {

	private JPanel contentPane;
	private Controllore controller;
	private JTextField txtTurtle;
	
	public TurtleInfo(Controllore contr , String turtle) {
		setUndecorated(true);
		setResizable(false);
		controller = contr ;
		
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 758, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomDashboard panel = new PanelCustomDashboard();
		panel.setBounds(0, 0, 778, 129);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELEZIONARE L'ELENCO DELLE VISITE RICEVUTE O DEGLI INGRESSI DELLA TARTARUGA : ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 10, 735, 43);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 87, 778, 42);
		panel.add(panel_1);
		panel_1.setBackground(new Color(0,0,0,70));
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(164, 0, 158, 42);
		panel_2.setOpaque(false);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel ElencoVisite = new JLabel("ELENCO VISITE");
		ElencoVisite.setForeground(new Color(255, 255, 255));
		
		ElencoVisite.setFont(new Font("SansSerif", Font.BOLD, 18));
		ElencoVisite.setBounds(10, 0, 158, 42);
		panel_2.add(ElencoVisite);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(363, 0, 150, 42);
		panel_3.setOpaque(false);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblIngressi = new JLabel("INGRESSI");
		lblIngressi.setForeground(new Color(255, 255, 255));
		lblIngressi.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblIngressi.setBounds(33, 0, 158, 42);
		panel_3.add(lblIngressi);
		
		txtTurtle = new JTextField();
		txtTurtle.setEditable(false);
		txtTurtle.setForeground(new Color(0, 0, 0));
		txtTurtle.setBorder(null);
		txtTurtle.setOpaque(false);
		txtTurtle.setFont(new Font("SansSerif", Font.BOLD, 26));
		txtTurtle.setBounds(288, 43, 236, 43);
		txtTurtle.setText(turtle);
		panel.add(txtTurtle);
		txtTurtle.setColumns(10);
		
		
		PanelCustomDashboard sfondo = new PanelCustomDashboard();
		sfondo.setBounds(0, 128, 758, 373);
		contentPane.add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 1, 758, 394);
		panel_4.setBackground(new Color(0,0,0,90));
		sfondo.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 738, 291);
		panel_4.add(scrollPane);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		
		
		JLabel GoBack = new JLabel("");
		GoBack.setBounds(27, 324, 69, 36);
		panel_4.add(GoBack);
		GoBack.setIcon(new ImageIcon(TurtleInfo.class.getResource("/Media/undo_50px.png")));
		
		//LISTENER
		GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sfondo.getTopLevelAncestor().setVisible(false);
			}
		});
		ElencoVisite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JTable tbl = controller.SetTableVisiteInfoTartaruga(turtle);
				tbl.setOpaque(false);
				((JComponent) tbl.getDefaultRenderer(Object.class)).setOpaque(false);
				tbl.setFont(new Font("Arial", Font.BOLD, 12));
				tbl.setForeground(new Color(255,255,255));
				scrollPane.setViewportView(tbl);
			}
		});
	}
}
