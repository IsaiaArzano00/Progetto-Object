//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GUI;

import Components.PanelCustomBlue;
import Components.PanelCustomDashboard;
import Components.PanelCustomSfondoDashboard;
import Components.PanelHomeDashBoard;
import Components.PanelPersonale;
import Components.PanelRegister;
import Components.PanelTartarughe;
import Components.PannelloDonazioni;
import Controller.Controllore;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class DashBoard extends JFrame {
    private PanelRegister Register;
    private Controllore controller;
    private JPanel contentPane;
    private PanelCustomBlue panelUp;
    private PanelCustomDashboard Menu;
    private JTextField txtInserireUsernameDellutente;
    private PanelCustomSfondoDashboard sfondo;
    private PanelPersonale personale;
    private PanelTartarughe tartarughe;

    public DashBoard(String utente, Controllore contr) {
        this.controller = contr;
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 1300, 750);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        PanelCustomBlue panelSuperiore = new PanelCustomBlue();
        panelSuperiore.setBounds(0, 0, 1299, 60);
        this.contentPane.add(panelSuperiore);
        panelSuperiore.setLayout((LayoutManager)null);
        final JPanel sfondo_1 = new JPanel();
        sfondo_1.setBounds(275, 59, 1001, 674);
        this.contentPane.add(sfondo_1);
        sfondo_1.setOpaque(false);
        sfondo_1.setLayout(new BorderLayout(0, 0));
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", 0, 34));
        lblNewLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/media/icons8_menu_48px_1.png")));
        lblNewLabel.setBounds(10, 0, 53, 50);
        panelSuperiore.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(DashBoard.class.getResource("/media/male_user_50px.png")));
        lblNewLabel_1.setBounds(1230, 0, 53, 68);
        panelSuperiore.add(lblNewLabel_1);
        this.txtInserireUsernameDellutente = new JTextField();
        this.txtInserireUsernameDellutente.setForeground(new Color(255, 255, 255));
        this.txtInserireUsernameDellutente.setFont(new Font("SansSerif", 1, 13));
        this.txtInserireUsernameDellutente.setEditable(false);
        this.txtInserireUsernameDellutente.setText("Bentornato/a, " + utente);
        this.txtInserireUsernameDellutente.setBounds(610, 24, 305, 19);
        panelSuperiore.add(this.txtInserireUsernameDellutente);
        this.txtInserireUsernameDellutente.setColumns(10);
        this.txtInserireUsernameDellutente.setOpaque(false);
        this.txtInserireUsernameDellutente.setBorder((Border)null);
        PanelCustomDashboard pannelloMenu = new PanelCustomDashboard();
        pannelloMenu.setLocation(0, 59);
        pannelloMenu.setSize(275, 654);
        pannelloMenu.setLayout((LayoutManager)null);
        this.contentPane.add(pannelloMenu);
        JPanel panel_home = new JPanel();
        panel_home.setBounds(0, 0, 275, 41);
        pannelloMenu.add(panel_home);
        panel_home.setLayout((LayoutManager)null);
        JLabel Home = new JLabel("HOME");
        Home.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PanelHomeDashBoard panel_home = new PanelHomeDashBoard();
                DashBoard.this.controller.SetPanelDashBoard(sfondo_1, panel_home);
            }
        });
        Home.setFont(new Font("SansSerif", 1, 14));
        Home.setBounds(10, 0, 255, 41);
        panel_home.add(Home);
        Home.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/home_28px.png")));
        final JPanel panel_personale = new JPanel();
        panel_personale.setBounds(0, 123, 277, 41);
        pannelloMenu.add(panel_personale);
        panel_personale.setLayout((LayoutManager)null);
        JLabel Personale = new JLabel("Personale");
        Personale.setFont(new Font("SansSerif", 1, 12));
        Personale.setBounds(10, 0, 277, 41);
        panel_personale.add(Personale);
        Personale.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/Add User Group Woman Man_28px.png")));
        final JPanel panel_turtle = new JPanel();
        panel_turtle.setBounds(0, 202, 275, 41);
        pannelloMenu.add(panel_turtle);
        panel_turtle.setLayout((LayoutManager)null);
        JLabel Turtle = new JLabel("Tartarughe");
        Turtle.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PanelTartarughe panelTurtle = new PanelTartarughe();
                DashBoard.this.controller.SetPanelDashBoard(sfondo_1, panelTurtle);
            }
        });
        Turtle.setFont(new Font("SansSerif", 1, 12));
        Turtle.setBounds(10, 0, 255, 41);
        panel_turtle.add(Turtle);
        Turtle.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/turtle_28px.png")));
        final JPanel panel_stats = new JPanel();
        panel_stats.setBounds(0, 281, 275, 41);
        pannelloMenu.add(panel_stats);
        panel_stats.setLayout((LayoutManager)null);
        JLabel Stats = new JLabel("Visualizza Statistiche");
        Stats.setFont(new Font("SansSerif", 1, 12));
        Stats.setBounds(10, 0, 255, 41);
        panel_stats.add(Stats);
        Stats.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/combo_chart_28px.png")));
        final JPanel panel_logout = new JPanel();
        panel_logout.setBounds(0, 585, 277, 41);
        pannelloMenu.add(panel_logout);
        panel_logout.setLayout((LayoutManager)null);
        JLabel logout = new JLabel("LOGOUT");
        logout.setFont(new Font("SansSerif", 1, 12));
        logout.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/logout_28px.png")));
        logout.setBounds(10, 0, 255, 41);
        panel_logout.add(logout);
        JLabel lblNewLabel_7 = new JLabel("Info Personale");
        lblNewLabel_7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PanelPersonale personale = new PanelPersonale(DashBoard.this.controller);
                DashBoard.this.controller.SetPanelDashBoard(sfondo_1, personale);
            }
        });
        lblNewLabel_7.setFont(new Font("SansSerif", 1, 12));
        lblNewLabel_7.setBounds(10, 325, 265, 41);
        pannelloMenu.add(lblNewLabel_7);
        lblNewLabel_7.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/more_info_28px.png")));
        final JPanel panel_CartellaMedica = new JPanel();
        panel_CartellaMedica.setLayout((LayoutManager)null);
        panel_CartellaMedica.setBounds(0, 364, 275, 41);
        pannelloMenu.add(panel_CartellaMedica);
        JLabel Cartella_Medica = new JLabel("Cartella Medica");
        Cartella_Medica.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/health_book_28px.png")));
        Cartella_Medica.setFont(new Font("SansSerif", 1, 12));
        Cartella_Medica.setBounds(10, 0, 265, 41);
        panel_CartellaMedica.add(Cartella_Medica);
        final JPanel panel_laboratorio = new JPanel();
        panel_laboratorio.setBounds(0, 163, 277, 41);
        pannelloMenu.add(panel_laboratorio);
        panel_laboratorio.setLayout((LayoutManager)null);
        panel_laboratorio.setOpaque(false);
        JLabel Laboratorio = new JLabel("Laboratorio");
        Laboratorio.setBounds(10, 0, 255, 41);
        panel_laboratorio.add(Laboratorio);
        Laboratorio.setFont(new Font("SansSerif", 1, 12));
        Laboratorio.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/laboratory_28px.png")));
        final JPanel panel_vasche = new JPanel();
        panel_vasche.setBounds(0, 243, 277, 41);
        pannelloMenu.add(panel_vasche);
        panel_vasche.setLayout((LayoutManager)null);
        panel_vasche.setOpaque(false);
        JLabel Vasche = new JLabel("Vasche del Centro");
        Vasche.setBounds(10, 0, 257, 41);
        panel_vasche.add(Vasche);
        Vasche.setFont(new Font("SansSerif", 1, 12));
        Vasche.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/rectangular_aquarium_28px.png")));
        final JPanel panel_donazioni = new JPanel();
        panel_donazioni.setBounds(0, 405, 277, 41);
        pannelloMenu.add(panel_donazioni);
        panel_donazioni.setLayout((LayoutManager)null);
        panel_donazioni.setOpaque(false);
        JLabel labelDonazioni = new JLabel("Donazioni\r\n");
        labelDonazioni.setBounds(10, 0, 265, 34);
        panel_donazioni.add(labelDonazioni);
        labelDonazioni.setIcon(new ImageIcon(DashBoard.class.getResource("/Media/bank_euro_28px.png")));
        labelDonazioni.setFont(new Font("SansSerif", 1, 12));
        Personale.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                sfondo_1.removeAll();
                sfondo_1.add(new PanelPersonale(DashBoard.this.controller));
                sfondo_1.repaint();
                sfondo_1.revalidate();
            }

            public void mouseEntered(MouseEvent e) {
                panel_personale.setBackground(new Color(187, 187, 187));
            }

            public void mouseExited(MouseEvent e) {
                panel_personale.setBackground(new Color(240, 240, 240));
            }
        });
        Laboratorio.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel_laboratorio.setBackground(new Color(187, 187, 187));
                panel_laboratorio.setOpaque(true);
            }

            public void mouseExited(MouseEvent e) {
                panel_laboratorio.setBackground(new Color(255, 255, 255));
                panel_laboratorio.setOpaque(false);
            }
        });
        Turtle.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel_turtle.setBackground(new Color(187, 187, 187));
            }

            public void mouseExited(MouseEvent e) {
                panel_turtle.setBackground(new Color(240, 240, 240));
            }
        });
        Vasche.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel_vasche.setBackground(new Color(187, 187, 187));
                panel_vasche.setOpaque(true);
            }

            public void mouseExited(MouseEvent e) {
                panel_vasche.setBackground(new Color(255, 255, 255));
                panel_vasche.setOpaque(false);
            }
        });
        Stats.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel_stats.setBackground(new Color(187, 187, 187));
            }

            public void mouseExited(MouseEvent e) {
                panel_stats.setBackground(new Color(240, 240, 240));
            }
        });
        Cartella_Medica.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel_CartellaMedica.setBackground(new Color(187, 187, 187));
            }

            public void mouseExited(MouseEvent e) {
                panel_CartellaMedica.setBackground(new Color(240, 240, 240));
            }
        });
        labelDonazioni.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel_donazioni.setBackground(new Color(187, 187, 187));
                panel_donazioni.setOpaque(true);
            }

            public void mouseExited(MouseEvent e) {
                panel_donazioni.setBackground(new Color(255, 255, 255));
                panel_donazioni.setOpaque(false);
            }

            public void mouseClicked(MouseEvent e) {
                sfondo_1.removeAll();
                sfondo_1.add(new PannelloDonazioni(DashBoard.this.controller));
                sfondo_1.repaint();
                sfondo_1.revalidate();
            }
        });
        logout.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel_logout.setBackground(new Color(187, 187, 187));
            }

            public void mouseExited(MouseEvent e) {
                panel_logout.setBackground(new Color(240, 240, 240));
            }

            public void mouseClicked(MouseEvent e) {
                DashBoard.this.controller.GoToHome(sfondo_1);
            }
        });
    }
}
