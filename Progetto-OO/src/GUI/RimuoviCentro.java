package GUI;

import javax.swing.JPanel;

import Components.PanelCustomBlue;
import Controller.Controllore;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class RimuoviCentro extends JDialog {
	private JTextField partitaIVA;
	private JTextField Nome;
	private JTextField CodiceAteco;
	private JTextField RagioneSociale;
	private JTextField e_mail;
	private JTextField e_mail_PEC;
	private JTextField NumeroTelefono;
	private JTextField IBAN;
	private JTextField Atto;
	private JTextField Indirizzo;
	private Controllore controller;

	/**
	 * Create the panel.
	 */
	public RimuoviCentro(Controllore contr) {
		setResizable(false);
		controller=contr;
		setBounds(100, 100, 714, 590);
		setModal(true);
		getContentPane().setLayout(null);
		
		PanelCustomBlue sfondo = new PanelCustomBlue();
		sfondo.setBounds(0, 0, 714, 689);
		getContentPane().add(sfondo);
		sfondo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0, 70));
		panel.setBounds(0, 0, 714, 116);
		sfondo.add(panel);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(RimuoviCentro.class.getResource("/Media/downtown_80px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RIMUOVI CENTRO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(103, 10, 210, 51);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Selezionare il Centro da rimuovere : ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(103, 61, 210, 24);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBoxCentro = new JComboBox();
		comboBoxCentro.setBounds(323, 64, 196, 21);
		panel.add(comboBoxCentro);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(351, 126, 24, 300);
		sfondo.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Partita IVA : ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 144, 71, 13);
		sfondo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nome : ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 208, 45, 13);
		sfondo.add(lblNewLabel_4);
		
		partitaIVA = new JTextField();
		partitaIVA.setEditable(false);
		partitaIVA.setFont(new Font("SansSerif", Font.BOLD, 12));
		partitaIVA.setOpaque(false);
		partitaIVA.setForeground(Color.WHITE);
		partitaIVA.setColumns(10);
		partitaIVA.setBorder(null);
		partitaIVA.setBounds(147, 142, 169, 19);
		sfondo.add(partitaIVA);
		
		Nome = new JTextField();
		Nome.setHorizontalAlignment(SwingConstants.CENTER);
		Nome.setEditable(false);
		Nome.setFont(new Font("SansSerif", Font.BOLD, 12));
		Nome.setOpaque(false);
		Nome.setForeground(Color.WHITE);
		Nome.setColumns(10);
		Nome.setBorder(null);
		Nome.setBounds(147, 206, 187, 19);
		sfondo.add(Nome);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(147, 160, 179, 38);
		sfondo.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(147, 226, 179, 38);
		sfondo.add(separator_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Codice Ateco : ");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 278, 94, 13);
		sfondo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ragione Sociale : ");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(10, 342, 102, 13);
		sfondo.add(lblNewLabel_4_1);
		
		CodiceAteco = new JTextField();
		CodiceAteco.setEditable(false);
		CodiceAteco.setFont(new Font("SansSerif", Font.BOLD, 12));
		CodiceAteco.setOpaque(false);
		CodiceAteco.setForeground(Color.WHITE);
		CodiceAteco.setColumns(10);
		CodiceAteco.setBorder(null);
		CodiceAteco.setBounds(147, 276, 169, 19);
		sfondo.add(CodiceAteco);
		
		RagioneSociale = new JTextField();
		RagioneSociale.setEditable(false);
		RagioneSociale.setFont(new Font("SansSerif", Font.BOLD, 12));
		RagioneSociale.setOpaque(false);
		RagioneSociale.setForeground(Color.WHITE);
		RagioneSociale.setColumns(10);
		RagioneSociale.setBorder(null);
		RagioneSociale.setBounds(147, 340, 187, 19);
		sfondo.add(RagioneSociale);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(147, 294, 179, 38);
		sfondo.add(separator_1_2);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(147, 360, 179, 38);
		sfondo.add(separator_1_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("e-mail :");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(363, 144, 71, 13);
		sfondo.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("e-mail PEC : ");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(363, 208, 71, 13);
		sfondo.add(lblNewLabel_4_2);
		
		e_mail = new JTextField();
		e_mail.setEditable(false);
		e_mail.setFont(new Font("SansSerif", Font.BOLD, 12));
		e_mail.setOpaque(false);
		e_mail.setForeground(Color.WHITE);
		e_mail.setColumns(10);
		e_mail.setBorder(null);
		e_mail.setBounds(500, 142, 169, 19);
		sfondo.add(e_mail);
		
		e_mail_PEC = new JTextField();
		e_mail_PEC.setEditable(false);
		e_mail_PEC.setFont(new Font("SansSerif", Font.BOLD, 12));
		e_mail_PEC.setOpaque(false);
		e_mail_PEC.setForeground(Color.WHITE);
		e_mail_PEC.setColumns(10);
		e_mail_PEC.setBorder(null);
		e_mail_PEC.setBounds(500, 206, 187, 19);
		sfondo.add(e_mail_PEC);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(500, 160, 179, 38);
		sfondo.add(separator_1_3);
		
		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setBounds(500, 226, 179, 38);
		sfondo.add(separator_1_1_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Numero Telefono : ");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(363, 280, 109, 13);
		sfondo.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("IBAN : ");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_4_3.setBounds(363, 344, 45, 13);
		sfondo.add(lblNewLabel_4_3);
		
		NumeroTelefono = new JTextField();
		NumeroTelefono.setEditable(false);
		NumeroTelefono.setFont(new Font("SansSerif", Font.BOLD, 12));
		NumeroTelefono.setOpaque(false);
		NumeroTelefono.setForeground(Color.WHITE);
		NumeroTelefono.setColumns(10);
		NumeroTelefono.setBorder(null);
		NumeroTelefono.setBounds(500, 278, 169, 19);
		sfondo.add(NumeroTelefono);
		
		IBAN = new JTextField();
		IBAN.setEditable(false);
		IBAN.setFont(new Font("SansSerif", Font.BOLD, 12));
		IBAN.setOpaque(false);
		IBAN.setForeground(Color.WHITE);
		IBAN.setColumns(10);
		IBAN.setBorder(null);
		IBAN.setBounds(500, 342, 187, 19);
		sfondo.add(IBAN);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setBounds(500, 296, 179, 38);
		sfondo.add(separator_1_4);
		
		JSeparator separator_1_1_3 = new JSeparator();
		separator_1_1_3.setBounds(500, 362, 179, 38);
		sfondo.add(separator_1_1_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Numero atto  : ");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(10, 402, 127, 13);
		sfondo.add(lblNewLabel_3_4);
		
		Atto = new JTextField();
		Atto.setEditable(false);
		Atto.setFont(new Font("SansSerif", Font.BOLD, 12));
		Atto.setOpaque(false);
		Atto.setForeground(Color.WHITE);
		Atto.setColumns(10);
		Atto.setBorder(null);
		Atto.setBounds(147, 400, 169, 19);
		sfondo.add(Atto);
		
		JLabel lblNewLabel_3_5 = new JLabel("Indirizzo Sede legale : ");
		lblNewLabel_3_5.setForeground(Color.WHITE);
		lblNewLabel_3_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(363, 404, 139, 13);
		sfondo.add(lblNewLabel_3_5);
		
		Indirizzo = new JTextField();
		Indirizzo.setEditable(false);
		Indirizzo.setFont(new Font("SansSerif", Font.BOLD, 12));
		Indirizzo.setOpaque(false);
		Indirizzo.setForeground(Color.WHITE);
		Indirizzo.setColumns(10);
		Indirizzo.setBorder(null);
		Indirizzo.setBounds(500, 402, 169, 19);
		sfondo.add(Indirizzo);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(147, 421, 179, 38);
		sfondo.add(separator_1_1_1_1);
		
		JSeparator separator_1_1_1_2 = new JSeparator();
		separator_1_1_1_2.setBounds(498, 421, 179, 38);
		sfondo.add(separator_1_1_1_2);
		
		JLabel Elimina = new JLabel("");
		
		Elimina.setIcon(new ImageIcon(RimuoviCentro.class.getResource("/Media/cancel_50px.png")));
		Elimina.setBounds(610, 479, 77, 72);
		sfondo.add(Elimina);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(RimuoviCentro.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(10, 487, 71, 64);
		sfondo.add(GoBack);
		for(int i=0;i<controller.ListaIDCentro().size();i++)
		{
			comboBoxCentro.addItem(controller.ListaIDCentro().get(i).toString());
		}
		//LISTENER 
		
		comboBoxCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id_centro = (String) comboBoxCentro.getSelectedItem();
				Nome.setText(controller.RecuperaCentro(id_centro).getNome());
				partitaIVA.setText(controller.RecuperaCentro(id_centro).getPartita_Iva());
				CodiceAteco.setText(controller.RecuperaCentro(id_centro).getCodice_Ateco());
				RagioneSociale.setText(controller.RecuperaCentro(id_centro).getRagione_Sociale());
				e_mail.setText(controller.RecuperaCentro(id_centro).getE_mail());
				e_mail_PEC.setText(controller.RecuperaCentro(id_centro).getE_mail_PEC());
				NumeroTelefono.setText(controller.RecuperaCentro(id_centro).getNumero_Telefono());
				IBAN.setText(controller.RecuperaCentro(id_centro).getIBAN());
				Atto.setText(controller.RecuperaCentro(id_centro).getNumero_Atto_Costitutivo());
				Indirizzo.setText(controller.RecuperaCentro(id_centro).getIndirizzo());
			}
		});
		GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RimuoviCentro.this.setVisible(false);
			}
		});
		Elimina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id_centro = (String) comboBoxCentro.getSelectedItem();
				boolean flag=controller.EliminaCentro(id_centro);
				if(flag)
				{
					alertEliminazioneRiuscita(id_centro);
					RimuoviCentro.this.setVisible(false);
				}
				else
					alertEliminazioneFallita(id_centro);
			}
		});
		

	}

	public void alertEliminazioneFallita(String id) {
		JOptionPane.showMessageDialog(this, "Rimozione del Centro : "+id+" non riuscita !","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertEliminazioneRiuscita(String id) {
		JOptionPane.showMessageDialog(this, "Rimozione del Centro : "+id+"  riuscita !","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
}
