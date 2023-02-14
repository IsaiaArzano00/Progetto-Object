package Components;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import Controller.Controllore;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class PanelHome extends JPanel {
	private Controllore controller;

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 550);
		add(panel);
		panel.setBackground(new Color(0,0,0,70));
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(PanelHome.class.getResource("/Media/TurtleSfondo1.jpg")));
		lblNewLabel.setBounds(0, 0, 450, 550);
		add(lblNewLabel);
		
		

	}
}
