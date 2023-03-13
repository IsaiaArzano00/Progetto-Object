package Controller;

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
import java.awt.Container;
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
	private DonazioneDAO donazione;
	private LaboratorioDAO laboratorio;
	private SedeDAO sede;
	private Cartella_Medica_DegenzaDAO degenza;
	private OccupareVascaDAO occupare;
	private TarghettaDAO targhetta;
	private Cartella_MedicaDAO cartella;
	private IngressiTurtleDAO ingresso;
	
	

	public static void main(String[] args) {
		Controllore controller = new Controllore();
		
	}
	public Controllore()
	{
		
		homepage = new Home(this);
		utente = new UtenteDAO();
		operatore = new OperatoreDAO();
		centro = new CentroDAO();
		ricercatore = new RicercatoreDAO();
		medico= new Medico_VeterinarioDAO();
		tecnico = new Tecnico_di_LaboratorioDAO();
		tartaruga=new TartarugaDAO();
		donazione = new DonazioneDAO();
		vasca=new VascaDAO();
		laboratorio=new LaboratorioDAO();
		sede = new SedeDAO();
		degenza = new Cartella_Medica_DegenzaDAO();
		occupare=new OccupareVascaDAO();
		targhetta = new TarghettaDAO();
		cartella = new Cartella_MedicaDAO();
		ingresso = new IngressiTurtleDAO();
	}
	

	
	public void SetPanelDashBoard(JPanel actualPanel , JPanel selectedPanel)
	{
		actualPanel.removeAll();
		actualPanel.add(selectedPanel);
		actualPanel.repaint();
		actualPanel.revalidate();
	}
	
	public void SetHomePage (JPanel actualPanel , JPanel selectedPanel)
	{
		actualPanel.removeAll();
		actualPanel.add(selectedPanel);
		actualPanel.repaint();
		actualPanel.revalidate();
	}
	public void GoBackHome(JPanel actualPanel , JPanel selectedPanel)
	{
		actualPanel.removeAll();
		actualPanel.add(selectedPanel);
		actualPanel.repaint();
		actualPanel.revalidate();
	}
	
	public void gotodashboard(JComponent panel, String utente)
	{
		panel.getTopLevelAncestor().setVisible(false);
		DashBoard dashboard = new DashBoard(this,utente);
		dashboard.setUndecorated(true);
		dashboard.setVisible(true);
		
		
	}
	public void GoToHome(JComponent panel)
	{
		panel.getTopLevelAncestor().setVisible(false);
		Home home = new Home(this);
		home.setVisible(true);
	}
	
	
	public boolean CheckLogin (String user , String password)
	{
		boolean flag =utente.LoginVerify(user, password);
		return flag;
	}
	
	public boolean RegistraUtente (String user , String password , String e_mail)
	{
		int rowinsert=utente.RegisterUser(user, password, e_mail);
		if(rowinsert>0)
			return true;
		else
			return false;
	}
	
	public boolean CheckUtenteRegistrato(String user , String e_mail)
	{
		boolean  flag = utente.CheckUtente(user, e_mail);
		return flag;
	}
	
	public void VisualizzaPersonale(String qualifica , String centro ,JPanel actual)
	{
		TablePersonale PanelTable = new TablePersonale(qualifica , centro, this);
		PanelTable.setBounds(0, 0, 796, 399);
		actual.removeAll();
		actual.add(PanelTable);
		actual.repaint();
		actual.revalidate();
		
		
	}
	
	public ArrayList<Donazione> getAllDonazioni() {
		return donazione.getDonazioni();
	}
	
	public JTable SetTableDonazioni()
	{
		String[] tblHead={"ID Donazione", "Importo Donazione", "email donatore", "data donazione", "metodo pagamento", "ID Centro"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		for(int i=0 ; i<donazione.getDonazioni().size();i++)
		{
			Object [] rowdata = new Object[6];
			rowdata[0]=donazione.getDonazioni().get(i).getIdDonazione();
			rowdata[1]=donazione.getDonazioni().get(i).getimportoDonazione();
			rowdata[2]=donazione.getDonazioni().get(i).getEmailDonatore();
			rowdata[3]=donazione.getDonazioni().get(i).getDataDonazione();
			rowdata[4]=donazione.getDonazioni().get(i).getMetodoPagamento();
			rowdata[5]=donazione.getDonazioni().get(i).getIdCentro();
			
			dtm.addRow(rowdata);
		}
		tbl.setRowHeight(50);
		return tbl;
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
	
	public ArrayList<String> getIdDonazioni()
	{
		ArrayList<String> donazioni = donazione.getIdDonazioni();
		return donazioni;
	}
	
	public ArrayList<String> getIDSede()
	{
		ArrayList<String> id_sede = sede.getIDSede();
		return id_sede;
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
	
	public boolean InsertDonazione(int importo ,String emailDonatore , String date , String metodoPagamento ,String centro)
	{
		int rowinsert=0;
		boolean check_insert=false ;
		
		rowinsert = donazione.InserisciDonazione(importo, emailDonatore, date, metodoPagamento, centro);
		
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
	
	public boolean InsertTartarugaRiammissione(String nome,int eta , String old_number_targhetta ,String data_accoglienza_centro,String sede)
	{
		int rowinsert=tartaruga.InserisciTartaruga(nome, eta, old_number_targhetta, data_accoglienza_centro, sede);
		
		if(rowinsert>0)
			return true;
		else
			return false;
		
	}
	
	public boolean InsertTartarugaPrimoIngresso(String nome,int eta  ,String data_accoglienza_centro,String sede)
	{
		int rowinsert=tartaruga.InserisciTartarugaPrimo(nome, eta,data_accoglienza_centro, sede);
		
		if(rowinsert>0)
			return true;
		else
			return false;
	}
	
	public DonazioneDAO getDonazioneDAO() {
		return donazione;
	}
	
	public String modificaDonazione(String idDonazione, int importo, String email, String data, String pagamento) {
		return donazione.modificaDonazione(idDonazione, importo,  email,  data,  pagamento);
	}
	
	public Donazione recuperaDonazione(String idDonazione) {
		return donazione.recuperaDonazione(idDonazione);
	}
	
	public JTable SetTableTurtle(String centro)
	{
		String[] tblHead={"ID_TARTARUGA","Nome","Età","Data accoglienza","Sede" };
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);

		JTable tbl=new JTable(dtm);
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
		tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbl.setShowVerticalLines(false);
		tbl.setRowHeight(50);
		return tbl;
	}

	public void VisualizzaTurtle( String centro ,JPanel actual)
	{
		TableTartaruga PanelTable = new TableTartaruga(this,centro);
		PanelTable.setBounds(0, 0, 796, 399);
		actual.removeAll();
		actual.add(PanelTable);
		actual.repaint();
		actual.revalidate();


	}
	
	public boolean InserisciLaboratorio(String finalita , int numero_lab , String sede)
	{
		int rowinsert = laboratorio.InserisciLaboratorio(numero_lab, finalita, sede);
		if(rowinsert>0)
			return true;
		else
			return false;
	}
	
	public boolean InserisciVasca (double capacita , double temperatura , String centro)
	{
		int rowinsert=vasca.InsertVasca(capacita, temperatura, centro);
		if(rowinsert>0)
			return true;
		else
			return false;
	}

	public boolean InserisciVisita(String date , String farmaco , int peso , String condizioni , String id_turtle , String medico)
	{
		int rowinsert=degenza.InserisciVisita(date, farmaco, peso, condizioni, id_turtle, medico);
		if(rowinsert>0)
			return true;
		else
			return false;
	}

	public boolean checkMatricoloMedico(String matricola )
	{
		return medico.CheckMatricola(matricola);
	}

	public boolean checkID_Turtle(String id)
	{
		return tartaruga.checkid_turtle(id);
	}

	public ArrayList<String> IDTurtle()
	{
		ArrayList<String> lista_turtle = tartaruga.ListaTurtleID();
		return lista_turtle;
	}

	public ArrayList<String> IDTurtleSede(String sede)
	{
		ArrayList<String> lista_turtle = tartaruga.ListaTurtleIDSede(sede);
		return lista_turtle;
	}
	
	public void VisualizzaVisite( String turtle ,JPanel sfondo)
	{
		PanelViewVisite PanelTableVisite = new PanelViewVisite(this,turtle);
		PanelTableVisite.setBounds(0, 0, 865, 460);
		sfondo.removeAll();
		sfondo.add(PanelTableVisite);
		sfondo.repaint();
		sfondo.revalidate();
		

	}
	public JTable SetTableVisite(String turtle)
	{
		String[] tblHead={"Data Visita ","Farmaco ","Peso ","Condizioni generali "};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);

		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);

		for ( int i=0 ; i<degenza.listavisiteturtle(turtle).size();i++)
		{
			Object[] rowdata = new Object[5];
			rowdata[0]=degenza.listavisiteturtle(turtle).get(i).getData_controllo();
			rowdata[1]=degenza.listavisiteturtle(turtle).get(i).getFarmaco_somministrato();
			rowdata[2]=degenza.listavisiteturtle(turtle).get(i).getPeso();
			rowdata[3]=degenza.listavisiteturtle(turtle).get(i).getValutazione_condizioni_generali();


			dtm.addRow(rowdata);
		}
		
		tbl.setShowVerticalLines(false);
		tbl.setRowHeight(50);

		return tbl;
	}

	public boolean InserisciCibo(String matricola , String data , String codice_vasca , double cibo_inserito , double cibo_rimosso , String tipologia_cibo)
	{
		int rowinsert=occupare.InserisciCibo(matricola, data, codice_vasca, cibo_inserito, cibo_rimosso, tipologia_cibo);
		if(rowinsert>0)
			return true;
		else
			return false;
	}

	public boolean CheckMatricolaOperatore(String matricola)
	{
		return operatore.CheckMatricolaOperatore(matricola);
	}

	public boolean CheckCodiceVasca(String cod_vasca)
	{
		return vasca.CheckCodiceVasca(cod_vasca); 
	}

	public String NumeroCentri()
	{
		return String.valueOf(centro.qtaCentri());
	}

	public String NumeroTartarugheAccolte()
	{
		return String.valueOf(tartaruga.NumeroTartarugheAccolte());
	}

	public String NumeroVolontari()
	{
		int number = 0;
		number = operatore.NumeroOperatori();
		number=number + ricercatore.NumeroRicercatori();
		number=number + medico.NumeroMedici();
		number=number + tecnico.NumeroTecnici();

		return String.valueOf(number);
	}

	
	
	
	public void InserimentoDonazionePage() { new InserimentoDonazione(this); }
	public void RimozioneDonazionePage() {new RimozioneDonazione(this);}
	public void ListaDonazioniPage() {new ViewDonazioni(this);	}
	public void ModificaDonazioniPage() {new ModificaDonazione(this);};
	
	
	public ArrayList<String> ListaTartarugheSenzaTarghetta()
	{
		return tartaruga.ListaTurtleSenzaTarghetta();
	}
	
	public boolean InserisciTarghetta(String turtle,String matricola_ope, String date , String GPS)
	{
		int rowinsert = targhetta.InserisciTarghetta(turtle, matricola_ope, date, GPS);
		if(rowinsert>0)
			return true;
		else
			return false ;
					
	}
	
	public ArrayList<String> ListaTartarugheDaRilasciare()
	{
		return tartaruga.ListaTurtleRilascio();
	}
	
	public Tartaruga RecuperaTurtle(String id)
	{
		return tartaruga.RecoveryTurtle(id);
	}
	
	public boolean RilasciaTurtle(String id, String date)
	{
		int rowupdate = tartaruga.RilascioTurtle(id, date);
		if(rowupdate>0)
			return true;
		else
			return false;
	}
	
	public boolean MorteTurtle(String id, String date)
	{
		int rowupdate = tartaruga.MorteTurtle(id, date);
		if(rowupdate>0)
			return true;
		else
			return false;
	}
	
	public ArrayList<String> ListaMatricolaPersonale(String qualifica)
	{
		if(qualifica.equals("Operatore"))
			return operatore.ListaMatricolaOperatore();
		else if(qualifica.equals("Medico Veterinario"))
			return medico.ListaMatricolaMedico();
		else if(qualifica.equals("Ricercatore"))
			return ricercatore.ListaMatricolaRicercatore();
		else
			return tecnico.ListaMatricolaTecnico();
	}
	
	public Operatore RecuperaOperatore(String matricola)
	{
		return operatore.RecuperaOperatore(matricola);
	}
	
	public Ricercatore RecuperaRicercatore(String matricola)
	{
		return ricercatore.RecuperaRicercatore(matricola);
	}
	public Tecnico_di_Laboratorio RecuperaTecnico(String matricola)
	{
		return tecnico.RecuperaTecnico(matricola);
	}
	
	public Medico_Veterinario RecuperaMedico(String matricola)
	{
		return medico.RecuperaMedico(matricola);
	}
	
	public boolean EliminaPersonale(String qualifica , String matricola)
	{
		int rowdelete = 0;
		if(qualifica.equals("Operatore"))
			rowdelete = operatore.DeleteOperatore(matricola);
		else if(qualifica.equals("Medico Veterinario"))
			rowdelete=medico.DeleteMedico(matricola);
		else if(qualifica.equals("Ricercatore"))
			rowdelete=ricercatore.DeleteRicercatore(matricola);
		else
			rowdelete=tecnico.DeleteTecnico(matricola);
		if(rowdelete>0)
			return true;
		else
			return false;
		
	}
	
	public Vasca RecuperoVasca(String codicevasca)
	{
		return vasca.RecuperoVasca(codicevasca);
	}
	
	public boolean EliminaVasca(String codicevasca)
	{
		int rowdelete = vasca.EliminaVasca(codicevasca);
		if(rowdelete>0)
			return true;
		else
			return false;
	}
	
	public ArrayList<String> ListaIdLab()
	{
		return laboratorio.ListaIDLab();
	}
	
	public Laboratorio RecuperoLaboratorio(String idLab)
	{
		return laboratorio.RecuperoLab(idLab);
	}
	
	public boolean EliminaLab(String id)
	{
		int rowdelete=laboratorio.EliminaLaboratorio(id);
		if(rowdelete>0)
			return true;
		else
			return false;
	}
	
	public boolean EliminaTurtle(String id_turtle)
	{
		int rowdelete = tartaruga.DeleteTurtle(id_turtle);
		if(rowdelete>0)
			return true;
		else
			return false;
	}
	
	public JTable SetTableVisiteInfoTartaruga(String turtle)
	{
		String[] tblHead={"Data Visita ","Farmaco ","Condizioni generali "};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);

		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);

		for ( int i=0 ; i<degenza.listavisiteturtle(turtle).size();i++)
		{
			Object[] rowdata = new Object[5];
			rowdata[0]=degenza.listavisiteturtle(turtle).get(i).getData_controllo();
			rowdata[1]=degenza.listavisiteturtle(turtle).get(i).getFarmaco_somministrato();
			rowdata[2]=degenza.listavisiteturtle(turtle).get(i).getValutazione_condizioni_generali();


			dtm.addRow(rowdata);
		}
		
		tbl.setShowVerticalLines(false);
		tbl.setRowHeight(50);

		return tbl;
	}
	
	public ArrayList<String> Id_TartarugheSenzaCartellaMedica()
	{
		return tartaruga.ListaTurtleSenzaCartella();
	}
	
	public ArrayList<String> MatricolaMedicoPerCartellaMedica(String turtle)
	{
		return medico.MatricolaMedicoCartellaMedica(turtle);
	}
	
	public boolean InsertCartellaMedica(String id_turtle ,String medico, double peso , double lunghezza , double larghezza , String specie , String luogo , String data, String condizioni_generali , String condizioniCollo,String condizioniTesta,String condizioniOcchi,String condizioniPinne,String condizioniNaso,String condizioniBecco,String condizioniCoda)
	{
		int rowinsert= cartella.InserisciCartellaMedica(id_turtle, medico, peso, lunghezza, larghezza, specie, luogo, data, condizioni_generali, condizioniCollo, condizioniTesta, condizioniOcchi, condizioniPinne, condizioniNaso, condizioniBecco, condizioniCoda);
		if(rowinsert>0)
			return true;
		else
			return false;
	
	}
	
	public ArrayList<String> ListaIDCartella()
	{
		return cartella.listaIDCartellaMedica();
	}
	
	public Cartella_Medica RecuperaCartellaMedica(String id)
	{
		return cartella.recuperaCartellaMedica(id);
	}
	
	public boolean UpdateCartellaMedica(String id, double peso , double lunghezza , double larghezza , String data, String condizioni_generali , String condizioniCollo,String condizioniTesta,String condizioniOcchi,String condizioniPinne,String condizioniNaso,String condizioniBecco,String condizioniCoda)
	{
		int rowupdate = cartella.ModificaDatiCartellaMedica(id, peso, lunghezza, larghezza, data, condizioni_generali, condizioniCollo, condizioniTesta, condizioniOcchi, condizioniPinne, condizioniNaso, condizioniBecco, condizioniCoda);
		if(rowupdate>0)
			return true;
		else
			return false;
	}
	
	public boolean RemoveCartellaMedica(String id)
	{
		int rowdelete=cartella.EliminaCartellaMedica(id);
		if(rowdelete>0)
			return true;
		else
			return false;
		
	}
	
	public JTable SetTableTurtleWithCartellaMedica()
	{
		String[] tblHead={"ID Tartaruga","ID Sede","Nome","Età","Numero Targhetta","Data Accoglienza"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);

		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);

		for ( int i=0 ; i<tartaruga.ListaTartarugaConCartella().size();i++)
		{
			Object[] rowdata = new Object[6];
			rowdata[0]=tartaruga.ListaTartarugaConCartella().get(i).getId_tartaruga();
			rowdata[1]=tartaruga.ListaTartarugaConCartella().get(i).getID_Sede();
			rowdata[2]=tartaruga.ListaTartarugaConCartella().get(i).getNome();
			rowdata[3]=tartaruga.ListaTartarugaConCartella().get(i).getEta();
			rowdata[4]=tartaruga.ListaTartarugaConCartella().get(i).getNumero_targhetta();
			rowdata[5]=tartaruga.ListaTartarugaConCartella().get(i).getData_accoglienza_centro();


			dtm.addRow(rowdata);
		}
		
		tbl.setShowVerticalLines(false);
		tbl.setRowHeight(50);

		return tbl;
	}
	
	public String ID_CM_from_turtle(String id_turtle)
	{
		return cartella.ID_CartellaMedica(id_turtle);
	}
	
	public boolean CambioPassword(String username,String password)
	{
		int rowupdate = utente.ChangePass(username, password);
		if(rowupdate>0)
			return true;
		else
			return false;
	}
	
	public boolean RimuoviDonazione(String id_donazione)
	{
		int rowdelete=donazione.rimuoviDonazione(id_donazione);
		if(rowdelete>0)
			return true;
		else
			return false;
	}
	
	public JTable SetTableIngressiInfoTartaruga(String turtle)
	{
		String[] tblHead={"Tipo ingresso ","Data","Condizioni"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);

		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		
		Object[] rowdata1 = new Object[5];
		rowdata1[0]="PRIMO INGRESSO ";
		rowdata1[1]=ingresso.ingressiTurtle(turtle).get(0).getData().toString();
		rowdata1[2]=ingresso.ingressiTurtle(turtle).get(0).getCondizioni().toString();
		dtm.addRow(rowdata1);
		
		for ( int i=1 ; i<tartaruga.ingressiTurtle(turtle).size();i++)
		{
			Object[] rowdata = new Object[5];
			rowdata[0]="RIAMMISSIONE";
			rowdata[1]=ingresso.ingressiTurtle(turtle).get(i).getData().toString();
			rowdata[2]=ingresso.ingressiTurtle(turtle).get(i).getCondizioni().toString();
			dtm.addRow(rowdata);
		}
		tbl.setShowVerticalLines(false);
		tbl.setRowHeight(50);

		return tbl;
	}
	
	public boolean ControlloPasswordRegister(String password)
	{
		boolean flag = false;
		if(password.length()>8)
			flag=true;
		
		return flag;
	}
	public boolean ControlloNomeUtente(String user)
	{
		boolean flag = false;
		if(user.length()>4 )
			flag = true;
		return flag;
	}
	public boolean ControlloEMailRegister(String email)
	{
		boolean flag = false ;
		if(email.contains("@") && email.length()>2)
			flag =true;
		
		return flag;
	}
}



