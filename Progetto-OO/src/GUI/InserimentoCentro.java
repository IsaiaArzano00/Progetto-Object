package GUI;

import javax.swing.JPanel;

import Components.PanelCustomBlue;
import Controller.Controllore;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class InserimentoCentro extends JFrame {
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
	public InserimentoCentro(Controllore contr) {
		setResizable(false);
		controller=contr;
		setBounds(0, 0, 714, 590);
		setVisible(true);
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
		lblNewLabel.setIcon(new ImageIcon(InserimentoCentro.class.getResource("/Media/downtown_80px.png")));
		lblNewLabel.setBounds(10, 10, 139, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INSERISCI CENTRO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(103, 10, 210, 51);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserire i dati del nuovo Centro. ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(103, 61, 241, 24);
		panel.add(lblNewLabel_2);
		
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
		partitaIVA.setFont(new Font("SansSerif", Font.BOLD, 12));
		partitaIVA.setOpaque(false);
		partitaIVA.setForeground(Color.WHITE);
		partitaIVA.setColumns(10);
		partitaIVA.setBorder(null);
		partitaIVA.setBounds(147, 142, 169, 19);
		sfondo.add(partitaIVA);
		
		Nome = new JTextField();
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
		CodiceAteco.setFont(new Font("SansSerif", Font.BOLD, 12));
		CodiceAteco.setOpaque(false);
		CodiceAteco.setForeground(Color.WHITE);
		CodiceAteco.setColumns(10);
		CodiceAteco.setBorder(null);
		CodiceAteco.setBounds(147, 276, 169, 19);
		sfondo.add(CodiceAteco);
		
		RagioneSociale = new JTextField();
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
		e_mail.setFont(new Font("SansSerif", Font.BOLD, 12));
		e_mail.setOpaque(false);
		e_mail.setForeground(Color.WHITE);
		e_mail.setColumns(10);
		e_mail.setBorder(null);
		e_mail.setBounds(500, 142, 169, 19);
		sfondo.add(e_mail);
		
		e_mail_PEC = new JTextField();
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
		NumeroTelefono.setFont(new Font("SansSerif", Font.BOLD, 12));
		NumeroTelefono.setOpaque(false);
		NumeroTelefono.setForeground(Color.WHITE);
		NumeroTelefono.setColumns(10);
		NumeroTelefono.setBorder(null);
		NumeroTelefono.setBounds(500, 278, 169, 19);
		sfondo.add(NumeroTelefono);
		
		IBAN = new JTextField();
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
		
		JLabel Inserisci = new JLabel("");
		Inserisci.setIcon(new ImageIcon(InserimentoCentro.class.getResource("/Media/save_50px.png")));
		Inserisci.setBounds(610, 479, 77, 72);
		sfondo.add(Inserisci);
		
		JLabel GoBack = new JLabel("");
		GoBack.setIcon(new ImageIcon(InserimentoCentro.class.getResource("/Media/undo_50px.png")));
		GoBack.setBounds(10, 487, 71, 64);
		sfondo.add(GoBack);
		
		//LISTENER 
		GoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InserimentoCentro.this.setVisible(false);
			}
		});
		
		Inserisci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object String;
				if(partitaIVA.getText().isEmpty())
					alertPartitaNonInserito();
				else if(Nome.getText().isEmpty())
					alertNomeNonInserito();
				else if(CodiceAteco.getText().isEmpty())
					alertCodiceAtecoNonInserito();
				else if(RagioneSociale.getText().isEmpty())
					alertRagioneSocialeNonInserita();
				else if(e_mail.getText().isEmpty())
					alertEMailNonInserita();
				else if(e_mail_PEC.getText().isEmpty())
					alertPECNonInserita();
				else if(NumeroTelefono.getText().isEmpty())
					alertNumeroTelefonoNonInserito();
				else if (IBAN.getText().isEmpty())
					alertIBANNonInserito();
				else if(Atto.getText().isEmpty())
					alertAttoNonInserito();
				else if (Indirizzo.getText().isEmpty())
					alertIndirizzoNonInserito();
				else 
				{
					boolean flag = controller.InserisciCentro();
					if(flag)
					{
						alertInserimentoRiuscito();
						InserimentoCentro.this.setVisible(false);
					}
					else
					{
						alertInserimentoFallito();
					}
				}
				
			}
		});

	}
	//FUNCTION
	public String getPartitaIVA()
	{
		String partita_iva = partitaIVA.getText();
		return partita_iva;
	}
	public String getNome()
	{
		String nome =Nome.getText();
		return nome;
	}
	public String getCodiceAteco()
	{
		String codice_ateco=CodiceAteco.getText();
		return codice_ateco;
	}
	public String getRagioneSociale()
	{
		String ragione_sociale=RagioneSociale.getText();
		return ragione_sociale;
	}
	public String getEmail()
	{
		String email =e_mail.getText();
		return email;
	}
	public String getEmailPEC()
	{
		String emailPEC=e_mail_PEC.getText();
		return emailPEC;
	}
	public String getTelefono()
	{
		String telefono=NumeroTelefono.getText();
		return telefono;
	}
	public String getIBAN()
	{
		String codice_iban = IBAN.getText();
		return codice_iban;
	}
	public String getNumeroAtto()
	{
		String numero_atto=Atto.getText();
		return numero_atto;
	}
	public String getIndirizzo()
	{
		String indirizzo=Indirizzo.getText();
		return indirizzo;
	}
	//ALERT
	public void alertNomeNonInserito() {
		JOptionPane.showMessageDialog(this, "Nome  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertPartitaNonInserito() {
		JOptionPane.showMessageDialog(this, "Partita IVA del Centro  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertRagioneSocialeNonInserita() {
		JOptionPane.showMessageDialog(this, "Ragione sociale del Centro  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertCodiceAtecoNonInserito() {
		JOptionPane.showMessageDialog(this, "Codice Ateco del Centro  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertEMailNonInserita() {
		JOptionPane.showMessageDialog(this, "e-mail del Centro  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertPECNonInserita() {
		JOptionPane.showMessageDialog(this, "email PEC  del Centro  non inserita!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertNumeroTelefonoNonInserito() {
		JOptionPane.showMessageDialog(this, "Recapito telefonico del Centro  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertIBANNonInserito() {
		JOptionPane.showMessageDialog(this, "IBAN del Centro  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertAttoNonInserito() {
		JOptionPane.showMessageDialog(this, "Numero atto del Centro  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertIndirizzoNonInserito() {
		JOptionPane.showMessageDialog(this, "Indirizzo sede legale del Centro  non inserito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertInserimentoFallito() {
		JOptionPane.showMessageDialog(this, "Inserimento del Centro non riuscito!","<ATTENZIONE>", JOptionPane.WARNING_MESSAGE);
	}
	public void alertInserimentoRiuscito() {
		JOptionPane.showMessageDialog(this, "Inserimento del Centro  riuscito!","<ATTENZIONE>", JOptionPane.INFORMATION_MESSAGE);
	}
}
