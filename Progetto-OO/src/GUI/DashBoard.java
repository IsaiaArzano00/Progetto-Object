package GUI;

import Components.*;
import Controller.Controllore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.ModuleLayer.Controller;
import java.awt.BorderLayout;

public class DashBoard extends JFrame {
	private PanelRegister Register;
	private Controllore controller ;
	private JPanel contentPane;
	private PanelCustomBlue panelUp;
	private PanelCustomDashboard Menu;
	private JTextField txtInserireUsernameDellutente;
	private PanelCustomSfondoDashboard sfondo;

	

	public DashBoard(Controllore contr,String utente) {
		setResizable(false);
		
		controller = contr;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 50, 1266, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelCustomBlue panelSuperiore = new PanelCustomBlue();
		panelSuperiore.setBounds(0, 0, 1299, 60);
		contentPane.add(panelSuperiore);
		panelSuperiore.setLayout(null);
		
		HomeDashBoard sfondo_1 = new HomeDashBoard(controller);
		sfondo_1.setBounds(275, 59, 1001, 674);
		contentPane.add(sfondo_1);
		sfondo_1.setOpaque(false);
		sfondo_1.setLayout(new BorderLayout(0, 0));
		
		JLabel UserLab = new JLabel("New label");
		UserLab.setIcon(new ImageIcon(DashBoard.class.getResource("/media/male_user_50px.png")));
		UserLab.setBounds(1188, 0, 53, 68);
		panelSuperiore.add(UserLab);
		
		txtInserireUsernameDellutente = new JTextField();
		txtInserireUsernameDellutente.setForeground(new Color(255, 255, 255));
		txtInserireUsernameDellutente.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtInserireUsernameDellutente.setEditable(false);
		txtInserireUsernameDellutente.setText("Bentornato/a, "+utente);
		txtInserireUsernameDellutente.setBounds(610, 24, 305, 19);
		panelSuperiore.add(txtInserireUsernameDellutente);
		txtInserireUsernameDellutente.setColumns(10);
		txtInserireUsernameDellutente.setOpaque(false);
		txtInserireUsernameDellutente.setBorder(null);
		
		PanelCustomDashboard pannelloMenu = new PanelCustomDashboard();
		pannelloMenu.setLocation(0, 60);
		pannelloMenu.setSize(275, 674);
		
		pannelloMenu.setLayout(null);
		contentPane.add(pannelloMenu);
		
		JPanel panel_home = new JPanel();
		panel_home.setBounds(0, 0, 275, 41);
		pannelloMenu.add(panel_home);
		panel_home.setLayout(null);
		
		JLabel Home = new JLabel("HOME");
	
		Home.setFont(new Font("SansSerif", Font.BOLD, 14));
		Home.setBounds(10, 0, 255, 41);
		panel_home.add(Home);
		Home.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/home_c_28px.png")));
		
		JPanel panel_personale = new JPanel();
		panel_personale.setBounds(0, 123, 277, 41);
		pannelloMenu.add(panel_personale);
		panel_personale.setLayout(null);
		
		JLabel Personale = new JLabel("Personale");
	
		Personale.setFont(new Font("SansSerif", Font.BOLD, 12));
		Personale.setBounds(10, 0, 277, 41);
		panel_personale.add(Personale);
		Personale.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/Add Male User Group_28px.png")));
		
		JPanel panel_turtle = new JPanel();
		panel_turtle.setBounds(0, 202, 275, 41);
		pannelloMenu.add(panel_turtle);
		panel_turtle.setLayout(null);
		
		JLabel Turtle = new JLabel("Tartarughe");
		
		
		Turtle.setFont(new Font("SansSerif", Font.BOLD, 12));
		Turtle.setBounds(10, 0, 255, 41);
		panel_turtle.add(Turtle);
		Turtle.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/turtled_28px.png")));
		
		JPanel panel_stats = new JPanel();
		panel_stats.setBounds(0, 281, 275, 41);
		pannelloMenu.add(panel_stats);
		panel_stats.setLayout(null);
		
		JLabel Stats = new JLabel("Visualizza Statistiche");
		Stats.setFont(new Font("SansSerif", Font.BOLD, 12));
		Stats.setBounds(10, 0, 255, 41);
		panel_stats.add(Stats);
		Stats.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/statistics_28px.png")));
		
		JPanel panel_logout = new JPanel();
		panel_logout.setBounds(0, 585, 277, 41);
		pannelloMenu.add(panel_logout);
		panel_logout.setLayout(null);
		
		JLabel logout = new JLabel("LOGOUT");
	
		logout.setFont(new Font("SansSerif", Font.BOLD, 12));
		logout.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/logout_28px.png")));
		logout.setBounds(10, 0, 255, 41);
		panel_logout.add(logout);
		
		JPanel panel_CartellaMedica = new JPanel();
		panel_CartellaMedica.setLayout(null);
		panel_CartellaMedica.setBounds(0, 364, 275, 41);
		pannelloMenu.add(panel_CartellaMedica);
		
		JLabel Cartella_Medica = new JLabel("Cartella Medica");
		Cartella_Medica.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/health_book_red_28px.png")));
		Cartella_Medica.setFont(new Font("SansSerif", Font.BOLD, 12));
		Cartella_Medica.setBounds(10, 0, 265, 41);
		panel_CartellaMedica.add(Cartella_Medica);
		
		JPanel panel_laboratorio_e_vasche = new JPanel();
		panel_laboratorio_e_vasche.setBounds(0, 163, 277, 41);
		pannelloMenu.add(panel_laboratorio_e_vasche);
		panel_laboratorio_e_vasche.setLayout(null);
		panel_laboratorio_e_vasche.setOpaque(false);
		
		JLabel Laboratorio = new JLabel("Laboratorio & Vasche");
	
		Laboratorio.setBounds(10, 0, 255, 41);
		panel_laboratorio_e_vasche.add(Laboratorio);
		Laboratorio.setFont(new Font("SansSerif", Font.BOLD, 12));
		Laboratorio.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/Laboratorio_28px.png")));
		
		JPanel panel_degenza = new JPanel();
		panel_degenza.setBounds(0, 243, 277, 41);
		pannelloMenu.add(panel_degenza);
		panel_degenza.setLayout(null);
		panel_degenza.setOpaque(false);
		
		JLabel Vasche = new JLabel("Degenza");
		Vasche.setBounds(10, 0, 257, 41);
		panel_degenza.add(Vasche);
		Vasche.setFont(new Font("SansSerif", Font.BOLD, 12));
		Vasche.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/Medical Mobile App_28px.png")));
		
		JPanel panel_donazioni = new JPanel();
		panel_donazioni.setBounds(0, 405, 277, 41);
		pannelloMenu.add(panel_donazioni);
		panel_donazioni.setLayout(null);
		panel_donazioni.setOpaque(false);
		
		JLabel Donazioni = new JLabel("Donazioni\r\n");
		Donazioni.setBounds(10, 0, 265, 34);
		panel_donazioni.add(Donazioni);
		Donazioni.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/Banknotes_28px.png")));
		Donazioni.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		JPanel panel_accogli = new JPanel();
		panel_accogli.setOpaque(false);
		panel_accogli.setBounds(0, 322, 275, 41);
		pannelloMenu.add(panel_accogli);
		panel_accogli.setLayout(null);
		
		JLabel Accogli = new JLabel("Accogli");
		Accogli.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/stethoscoped_28px.png")));
		Accogli.setFont(new Font("SansSerif", Font.BOLD, 12));
		Accogli.setBounds(10, 0, 255, 41);
		panel_accogli.add(Accogli);
		
		JPanel panel_Centri = new JPanel();
		panel_Centri.setLayout(null);
		panel_Centri.setBounds(0, 445, 275, 41);
		pannelloMenu.add(panel_Centri);
		
		JLabel Centri = new JLabel("Centri");
		Centri.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/downtown_28px.png")));
		Centri.setFont(new Font("SansSerif", Font.BOLD, 12));
		Centri.setBounds(10, 0, 265, 41);
		panel_Centri.add(Centri);
		
		JLabel lblNewLabel_7 = new JLabel("Accogli ");
		
		
		
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/stethoscope_28px.png")));
		
	
		//LISTENER 
		
		Personale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelPersonaleDashBoard panelPersonale = new PanelPersonaleDashBoard(controller);
				controller.SetPanelDashBoard(sfondo_1, panelPersonale);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_personale.setBackground(new Color(187, 187, 187));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_personale.setBackground(new Color(240,240,240));
			}
				
		});
		
		Laboratorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_laboratorio_e_vasche.setBackground(new Color(187,187,187));
				panel_laboratorio_e_vasche.setOpaque(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_laboratorio_e_vasche.setBackground(new Color(255,255,255));
				panel_laboratorio_e_vasche.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelLabEVascheDashboard panelLab = new PanelLabEVascheDashboard(controller);
				controller.SetPanelDashBoard(sfondo_1, panelLab);
			}
		});
		
		Turtle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_turtle.setBackground(new Color(187, 187, 187));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_turtle.setBackground(new Color(240,240,240));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelTurtleDash panelTurtle = new PanelTurtleDash(controller);
				controller.SetPanelDashBoard(sfondo_1, panelTurtle);
			}
		
		});
		
		
		Vasche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_degenza.setBackground(new Color(187,187,187));
				panel_degenza.setOpaque(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_degenza.setBackground(new Color(255,255,255));
				panel_degenza.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelDegenza paneldegenza = new PanelDegenza(controller);
				controller.SetPanelDashBoard(sfondo_1, paneldegenza);
			}
		});
			
		Stats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_stats.setBackground(new Color(187, 187, 187));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_stats.setBackground(new Color(240,240,240));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelStatistiche panelStatistiche = new PanelStatistiche(controller);
				controller.SetPanelDashBoard(sfondo_1, panelStatistiche);
			}
		});
		
		Cartella_Medica.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				panel_CartellaMedica.setBackground(new Color(187, 187, 187));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_CartellaMedica.setBackground(new Color(240,240,240));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelCartellaMedica pannelloCartellaMedica = new PanelCartellaMedica(controller,sfondo_1);
				controller.SetPanelDashBoard(sfondo_1, pannelloCartellaMedica);
			}
		});
		
		Donazioni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_donazioni.setBackground(new Color(187,187,187));
				panel_donazioni.setOpaque(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_donazioni.setBackground(new Color(255,255,255));
				panel_donazioni.setOpaque(false);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				PannelloDonazioni panelDonazioni = new PannelloDonazioni(controller);
				controller.SetPanelDashBoard(sfondo_1, panelDonazioni);
				
				
				
			}
		});
		
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_logout.setBackground(new Color(187, 187, 187));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_logout.setBackground(new Color(240,240,240));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.GoToHome(sfondo_1);
			}
		});
		
		Home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomeDashBoard panel_home=new HomeDashBoard(controller);
				controller.SetPanelDashBoard(sfondo_1, panel_home);
			}
			
			public void mouseEntered(MouseEvent e) {
				panel_home.setBackground(new Color(187, 187, 187));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_home.setBackground(new Color(240,240,240));
			}
		});
		
		Accogli.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_accogli.setBackground(new Color(187,187,187));
				panel_accogli.setOpaque(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_accogli.setBackground(new Color(255,255,255));
				panel_accogli.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelAccoglienza panel_acco = new PanelAccoglienza(controller);
				controller.SetPanelDashBoard(sfondo_1, panel_acco);
			}
		});
		Centri.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				panel_Centri.setBackground(new Color(187, 187, 187));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_Centri.setBackground(new Color(240,240,240));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelCentri pannelloCentri = new PanelCentri(controller);
				controller.SetPanelDashBoard(sfondo_1, pannelloCentri);
			}
		});
	}
}
