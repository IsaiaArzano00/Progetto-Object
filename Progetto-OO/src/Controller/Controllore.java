package Controller;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Components.*;
import DAO.*;
import GUI.*;
import DTO.*;
import connection.Connessione;
public class Controllore {
	
	
	private Home homepage;
	private DashBoard dashboard;
	private Connessione connesione;
	private UtenteDAO utente;
	private OperatoreDAO operatore;
	private CentroDAO centro;
	private RicercatoreDAO ricercatore;
	private Medico_VeterinarioDAO medico;
	private Tecnico_di_LaboratorioDAO tecnico;
	private TartarugaDAO tartaruga;
	private VascaDAO vasca;


	public static void main(String[] args) {
		Controllore controller = new Controllore();
		Home home = new Home();
		home.setVisible(true);
		
	}
	public Controllore()
	{
	
		

		utente = new UtenteDAO();
		operatore = new OperatoreDAO();
		centro = new CentroDAO();
		ricercatore = new RicercatoreDAO();
		medico= new Medico_VeterinarioDAO();
		tecnico = new Tecnico_di_LaboratorioDAO();
		tartaruga=new TartarugaDAO();
		vasca=new VascaDAO();
	}

	
	public void SetPanelDashBoard(JPanel actualPanel , JPanel selectedPanel)
	{
		actualPanel.removeAll();
		actualPanel.add(selectedPanel);
		actualPanel.repaint();
		actualPanel.revalidate();
	}
	
	public void SetLoginPage (JPanel panelImage, JPanel panelLogin )
	{
		
		PanelHome Home = new PanelHome();
		Home.setBounds(0, 0, 450,550);
		panelImage.removeAll();
		panelImage.add(Home);
		panelImage.repaint();
		panelImage.revalidate();
		

		PanelLoginPage Login = new PanelLoginPage();
		Login.setBounds(0, 0, 450, 550);
		panelLogin.removeAll();
		panelLogin.add(Login);
		panelLogin.repaint();
		panelLogin.revalidate();
		
		
		
	}
	
	public void SetRegistrerPage (JPanel panelImage , JPanel PanelRegistrer)
	{
		PanelHome Home = new PanelHome();
		Home.setBounds(0, 0, 450,550);
		panelImage.removeAll();
		panelImage.add(Home);
		panelImage.repaint();
		panelImage.revalidate();
		
		PanelRegister Register = new PanelRegister();
		Register.setBounds(0, 0, 450, 550);
		PanelRegistrer.removeAll();
		PanelRegistrer.add(Register);
		PanelRegistrer.repaint();
		PanelRegistrer.revalidate();
	}
	
	
	public void gotodashboard(JComponent panel, String utente)
	{
		panel.getTopLevelAncestor().setVisible(false);
		DashBoard dashboard = new DashBoard(utente);
		dashboard.setUndecorated(true);
		dashboard.setVisible(true);
		
		
	}
	public void GoToHome(JComponent panel)
	{
		panel.getTopLevelAncestor().setVisible(false);
		Home home = new Home();
		home.setVisible(true);
	}
	
	
	public boolean CheckLogin (String user , String password)
	{
		boolean flag =utente.LoginVerify(user, password);
		return flag;
	}
	
	public void RegistraUtente (String user , String password , String e_mail)
	{
		utente.RegisterUser(user, password, e_mail);
	}
	
	public boolean CheckUtenteRegistrato(String user , String e_mail)
	{
		boolean  flag = utente.CheckUtente(user, e_mail);
		return flag;
	}
	
	public void VisualizzaPersonale(String qualifica , String centro ,JPanel actual)
	{
		TablePersonale PanelTable = new TablePersonale(qualifica , centro);
		PanelTable.setBounds(0, 0, 796, 399);
		actual.removeAll();
		actual.add(PanelTable);
		actual.repaint();
		actual.revalidate();
		
		
	}
	
	
	public JTable setTable(String qualifica,String centro)
	{
		JTable tbl = new JTable();
		if(qualifica.equals("Operatore"))
			 tbl= FillOperatoreTab(centro);
		else if(qualifica.equals("Ricercatore"))
			tbl=FillRicercatoreTab(centro);
		else if(qualifica.equals("Medico Veterinario"))
			tbl=FillMedicoTab(centro);
		else if(qualifica.equals("Tecnico di Laboratorio"))
			tbl=FillTecnicoTab(centro);
		
		tbl.setShowVerticalLines(false);
		tbl.setRowHeight(50);
		return tbl;
		
	}
	
	public ArrayList<String> getNomeCentri()
	{
		ArrayList<String> nomi = centro.getNomeCentri();
		return nomi;
	}
	
	public JTable FillRicercatoreTab(String centro)
	{
		String[] tblHead={"Matricola","Nome","Cognome","Residenza","Codice Fiscale","Data inizio lavoro" ,"Compenso"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		for(int i=0 ; i<ricercatore.ListaRicercatoriPerCentro(centro).size();i++)
		{
			Object [] rowdata = new Object[7];
			rowdata[0]=ricercatore.ListaRicercatoriPerCentro(centro).get(i).getMatricola_Ricercatore();
			rowdata[1]=ricercatore.ListaRicercatoriPerCentro(centro).get(i).getNome();
			rowdata[2]=ricercatore.ListaRicercatoriPerCentro(centro).get(i).getCognome();
			rowdata[3]=ricercatore.ListaRicercatoriPerCentro(centro).get(i).getResidenza();
			rowdata[4]=ricercatore.ListaRicercatoriPerCentro(centro).get(i).getCodice_Fiscale();
			rowdata[5]=ricercatore.ListaRicercatoriPerCentro(centro).get(i).getData_Inizio_Lavoro();
			rowdata[6]=ricercatore.ListaRicercatoriPerCentro(centro).get(i).getCompenso();
			dtm.addRow(rowdata);
		}
	
		
		return tbl;

	}
	
	public JTable FillOperatoreTab(String centro)
	{
		String[] tblHead={"Matricola","Nome","Cognome","Residenza","Codice Fiscale","Data inizio lavoro" ,"Compenso"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(true);
		for(int i=0 ; i<operatore.ListaOperatoriPerCentro(centro).size();i++)
		{
			Object [] rowdata = new Object[7];
			rowdata[0]=operatore.ListaOperatoriPerCentro(centro).get(i).getMatricola_Ope();
			rowdata[1]=operatore.ListaOperatoriPerCentro(centro).get(i).getNome();
			rowdata[2]=operatore.ListaOperatoriPerCentro(centro).get(i).getCognome();
			rowdata[3]=operatore.ListaOperatoriPerCentro(centro).get(i).getResidenza();
			rowdata[4]=operatore.ListaOperatoriPerCentro(centro).get(i).getCodice_Fiscale();
			rowdata[5]=operatore.ListaOperatoriPerCentro(centro).get(i).getData_Inizio_Lavoro();
			rowdata[6]=operatore.ListaOperatoriPerCentro(centro).get(i).getCompenso();
			
			dtm.addRow(rowdata);
		}
		
		
		return tbl;
	}
	
	public JTable FillMedicoTab(String centro)
	{
		String[] tblHead={"Matricola","Nome","Cognome","Residenza","Codice Fiscale","Data inizio lavoro" ,"Compenso"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		for(int i =0; i<medico.ListaMedici_VetPerCentro(centro).size();i++)
		{
			Object[] rowdata = new Object[7];
			rowdata[0]=medico.ListaMedici_VetPerCentro(centro).get(i).getMatricola_medico();
			rowdata[1]=medico.ListaMedici_VetPerCentro(centro).get(i).getNome();
			rowdata[2]=medico.ListaMedici_VetPerCentro(centro).get(i).getCognome();
			rowdata[3]=medico.ListaMedici_VetPerCentro(centro).get(i).getResidenza();
			rowdata[4]=medico.ListaMedici_VetPerCentro(centro).get(i).getCodice_Fiscale();
			rowdata[5]=medico.ListaMedici_VetPerCentro(centro).get(i).getData_Inizio_Lavoro();
			rowdata[6]=medico.ListaMedici_VetPerCentro(centro).get(i).getCompenso();
			
			dtm.addRow(rowdata);
		}
		
		return tbl;
	}
	
	public JTable FillTecnicoTab(String centro)
	{
		String[] tblHead={"Matricola","Nome","Cognome","Residenza","Codice Fiscale","Data inizio lavoro" ,"Compenso"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		for ( int i=0 ; i<tecnico.ListaTecniciPerCentro(centro).size();i++)
		{
			Object[] rowdata = new Object[7];
			rowdata[0]= tecnico.ListaTecniciPerCentro(centro).get(i).getMatricola_TDL();
			rowdata[1]=tecnico.ListaTecniciPerCentro(centro).get(i).getNome();
			rowdata[2]=tecnico.ListaTecniciPerCentro(centro).get(i).getCognome();
			rowdata[3]=tecnico.ListaTecniciPerCentro(centro).get(i).getResidenza();
			rowdata[4]=tecnico.ListaTecniciPerCentro(centro).get(i).getCodice_Fiscale();
			rowdata[5]=tecnico.ListaTecniciPerCentro(centro).get(i).getData_Inizio_Lavoro();
			rowdata[6]=tecnico.ListaTecniciPerCentro(centro).get(i).getCompenso();
			
			dtm.addRow(rowdata);
		}
		
		return tbl;
	}
	
	public boolean InsertPersonale(String qualifica ,String nome , String cognome , String residenza , String cod_fiscale , String date ,String centro)
	{
		int rowinsert=0;
		boolean check_insert=false ;
		
		if(qualifica.equals("Operatore"))
			 rowinsert=operatore.InserisciOperatore(nome, cognome, cod_fiscale, residenza, date, 0, centro);
		else if(qualifica.equals("Ricercatore"))
			rowinsert=ricercatore.InserisciRicercatore(nome, cognome, cod_fiscale, residenza, date, 0, centro);
		else if(qualifica.equals("Medico Veterinario"))
			 rowinsert=medico.InserisciMedico(nome, cognome, cod_fiscale, residenza, date, 0, centro);
		else if(qualifica.equals("Tecnico di Laboratorio"))
			 rowinsert=tecnico.InserisciTecnico(nome, cognome, cod_fiscale, residenza, date, 0, centro);
		
		if(rowinsert>0)
			check_insert=true;
		
		return check_insert;
	}
	
	public boolean check_CodiceFiscale(String codice_fiscale)
	{
		if(codice_fiscale.length()==16)
			return true;
		else
			return false;
	}
	
	public JTable TableTurtleDashBoard()
	{
		String[] tblHead={"ID_TARTARUGA","Nome","Età","Data accoglienza","Sede" };
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		for ( int i=0 ; i<tartaruga.LastTurtleAll().size();i++)
		{
			Object[] rowdata = new Object[5];
			rowdata[0]=tartaruga.LastTurtleAll().get(i).getId_tartaruga();
			rowdata[1]=tartaruga.LastTurtleAll().get(i).getNome();
			rowdata[2]=tartaruga.LastTurtleAll().get(i).getEta();
			rowdata[3]=tartaruga.LastTurtleAll().get(i).getData_accoglienza_centro();
			rowdata[4]=tartaruga.LastTurtleAll().get(i).getID_Sede();
			
			dtm.addRow(rowdata);
		}
		
		return tbl;
	}
	
	public ArrayList<String> getCodiceVasche()
	{
		ArrayList<String> nomi = vasca.codiceVascheAll();
		return nomi;
	}
	
	public ArrayList<String> getCodiceVascheCentro(String centro)
	{
		ArrayList<String> nomi = vasca.codiceVascheCentro(centro);
		return nomi;
	}
	
	public boolean InsertTartaruga(String nome,int eta , String old_number_targhetta ,String data_accoglienza_centro,String sede)
	{
		int rowinsert=tartaruga.InserisciTartaruga(nome, eta, old_number_targhetta, data_accoglienza_centro, sede);
		boolean check_insert = false ;
		if(rowinsert>0)
			check_insert=true;
		
		return check_insert;
		
	}
	
	public JTable SetTableTurtle(String centro)
	{
		String[] tblHead={"ID_TARTARUGA","Nome","Età","Data accoglienza","Sede" };
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		if(centro.equals("Tutti i Centri"))
		{
			for ( int i=0 ; i<tartaruga.ListaTartarugheAll().size();i++)
			{
				Object[] rowdata = new Object[5];
				rowdata[0]=tartaruga.ListaTartarugheAll().get(i).getId_tartaruga();
				rowdata[1]=tartaruga.ListaTartarugheAll().get(i).getNome();
				rowdata[2]=tartaruga.ListaTartarugheAll().get(i).getEta();
				rowdata[3]=tartaruga.ListaTartarugheAll().get(i).getData_accoglienza_centro();
				rowdata[4]=tartaruga.ListaTartarugheAll().get(i).getID_Sede();
				
				dtm.addRow(rowdata);
			}
		}
		else
		{
			for ( int i=0 ; i<tartaruga.ListaTurtleCenter(centro).size();i++)
			{
				Object[] rowdata = new Object[5];
				rowdata[0]=tartaruga.ListaTurtleCenter(centro).get(i).getId_tartaruga();
				rowdata[1]=tartaruga.ListaTurtleCenter(centro).get(i).getNome();
				rowdata[2]=tartaruga.ListaTurtleCenter(centro).get(i).getEta();
				rowdata[3]=tartaruga.ListaTurtleCenter(centro).get(i).getData_accoglienza_centro();
				rowdata[4]=tartaruga.ListaTurtleCenter(centro).get(i).getID_Sede();
				
				dtm.addRow(rowdata);
			}
		}
		
		tbl.setShowVerticalLines(false);
		tbl.setRowHeight(50);
		return tbl;
	}
	
	public void VisualizzaTurtle( String centro ,JPanel actual)
	{
		TableTartaruga PanelTable = new TableTartaruga(centro);
		PanelTable.setBounds(0, 0, 796, 399);
		actual.removeAll();
		actual.add(PanelTable);
		actual.repaint();
		actual.revalidate();
		
		
	}
	

}
