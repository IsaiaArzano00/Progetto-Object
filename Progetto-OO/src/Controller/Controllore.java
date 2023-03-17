package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.time.LocalTime;
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
	private InserimentoDonazione insertDonazione;
	private ModificaDonazione modificadonazione;
	private Donazione donation;
	private Cartella_Medica cartellamedica;
	private InserimentoCartellaMedica insertcartella;
	private ModificaCartellaMedica modificacartella;
	private InserimentoVasca inserimentovasca;
	private InserimentoLaboratorio inserimentolaboratorio;
	private Laboratorio lab;
	private Vasca vasca_centro;
	private Tartaruga turtle;
	private InserimentoTartarugaPrima inserimentotartarugaprima;
	private InserimentoTartarugaRiammissione inserttartarugariammissione;
	private InserimentoTarghetta inserimentotarghetta;
	private Targhetta targhetta_metallica;
	private Centro centro_recupero;
	private InserimentoCentro inserimentocentro;
	private Cartella_Medica_Degenza cartella_degenza;
	private InserimentoVisita inserimentovisita;
	private OccupareVasca gestionevasca;
	private InserimentoCibo inserimentocibo;
	private InserimentoPersonale inserimentopersonale;
	private Ricercatore ricercatore_centro;
	private Tecnico_di_Laboratorio tecnico_di_laboratorio;
	private Medico_Veterinario medico_veterinario;
	private Operatore operatore_centro;
	
	
	
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
		PanelTable.setBounds(0, 0, 991, 399);
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
	
	public boolean InsertPersonale()
	{
		int rowinsert=0;
		boolean check_insert=false ;
		
		if(inserimentopersonale.GetQualifica().equals("Operatore"))
			 rowinsert=operatore.InserisciOperatore(GetOperatore());
		else if(inserimentopersonale.GetQualifica().equals("Ricercatore"))
			rowinsert=ricercatore.InserisciRicercatore(GetRicercatore());
		else if(inserimentopersonale.GetQualifica().equals("Medico Veterinario"))
			 rowinsert=medico.InserisciMedico(GetMedico());
		else if(inserimentopersonale.GetQualifica().equals("Tecnico di Laboratorio"))
			 rowinsert=tecnico.InserisciTecnico(GetTecnicoDiLaboratorio());
		
		if(rowinsert>0)
			check_insert=true;
		
		return check_insert;
	}
	
	public boolean InsertDonazione()
	{
		int rowinsert=0;
		boolean check_insert=false ;
		Donazione don= GetDonazione();
		rowinsert = donazione.InserisciDonazione(don);
		
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
	
	public boolean InsertTartarugaRiammissione()
	{
		int rowinsert=tartaruga.InserisciTartaruga(GetTartarugaRiammissione());
		
		if(rowinsert>0)
			return true;
		else
			return false;
		
	}
	
	public boolean InsertTartarugaPrimoIngresso()
	{
		int rowinsert=tartaruga.InserisciTartarugaPrimo(GetTartarugaPrima());
		
		if(rowinsert>0)
			return true;
		else
			return false;
	}
	
	public DonazioneDAO getDonazioneDAO() {
		return donazione;
	}
	
	public boolean modificaDonazione() {
		int rowupdate = donazione.modificaDonazione(GetDonazioneModifica());
		if(rowupdate>0)
			return true;
		else
			return false;
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
		PanelTable.setBounds(0, 0, 981, 336);
		actual.removeAll();
		actual.add(PanelTable);
		actual.repaint();
		actual.revalidate();


	}
	
	public boolean InserisciLaboratorio()
	{
		int rowinsert = laboratorio.InserisciLaboratorio(GetLaboratorio());
		if(rowinsert>0)
			return true;
		else
			return false;
	}
	
	public boolean InserisciVasca ()
	{
		int rowinsert=vasca.InsertVasca(GetVasca());
		if(rowinsert>0)
			return true;
		else
			return false;
	}

	public boolean InserisciVisita()
	{
		int rowinsert=degenza.InserisciVisita(GetVisitaDegenza());
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

	public boolean InserisciCibo()
	{
		int rowinsert=occupare.InserisciCibo(GetControlloVasca());
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

	
	
	
	public void InserimentoDonazionePage() { insertDonazione= new InserimentoDonazione(this);
							}
	public void RimozioneDonazionePage() {new RimozioneDonazione(this);}
	public void ListaDonazioniPage() {new ViewDonazioni(this);	}
	public void ModificaDonazioniPage() {modificadonazione = new ModificaDonazione(this);} 
	
	public void InserimentoCartellaMedicaPage() { insertcartella= new InserimentoCartellaMedica(this);}
	public void ModificaCartellaMedicaPage(String id) {modificacartella=new ModificaCartellaMedica(this,id);}
	
	public void InserimentoLaboratorioPage() {inserimentolaboratorio=new InserimentoLaboratorio(this);}
	public void InserimentovascaPage() {inserimentovasca=new InserimentoVasca(this);}
	
	public void InserimentoTurtlePrimaPage() {inserimentotartarugaprima=new InserimentoTartarugaPrima(this);}
	public void InserimentoTurtleRiammssionePage() {inserttartarugariammissione=new InserimentoTartarugaRiammissione(this);}
	public void InserimentoTarghettaPage() {inserimentotarghetta=new InserimentoTarghetta(this);}
	
	public void InserimentoCentroPage() {inserimentocentro = new InserimentoCentro(this);}
	public void InserimentoVisitaPage() {inserimentovisita = new InserimentoVisita(this);}
	public void InserimentoCiboPage() {inserimentocibo=new InserimentoCibo(this);}
	
	public void InserimentoPersonalePage() {inserimentopersonale=new InserimentoPersonale(this);}
	
	public ArrayList<String> ListaTartarugheSenzaTarghetta()
	{
		return tartaruga.ListaTurtleSenzaTarghetta();
	}
	
	public boolean InserisciTarghetta()
	{
		int rowinsert = targhetta.InserisciTarghetta(GetTarghetta());
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
	
	public boolean InsertCartellaMedica()
	{
		int rowinsert= cartella.InserisciCartellaMedica(GetCartellaMedica());
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
	
	public boolean UpdateCartellaMedica()
	{
		int rowupdate = cartella.ModificaDatiCartellaMedica(GetCartellaMedicaModifica());
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
	
	public JTable SetTableLaboratorio()
	{
		String[] tblHead={"ID Laboratorio", "Numero Laboratorio", "Finalità", "ID Sede"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		for(int i=0 ; i<laboratorio.listaLaboratori().size();i++)
		{
			Object [] rowdata = new Object[6];
			rowdata[0]=laboratorio.listaLaboratori().get(i).getId_laboratorio();
			rowdata[1]=laboratorio.listaLaboratori().get(i).getNumero_lab();
			rowdata[2]=laboratorio.listaLaboratori().get(i).getFinalita_laboratorio();
			rowdata[3]=laboratorio.listaLaboratori().get(i).getId_sede();
			
			
			dtm.addRow(rowdata);
		}
		tbl.setRowHeight(50);
		return tbl;
	}
	public JTable SetTableVasche()
	{
		String[] tblHead={"Codice Vasca ", "Capacità ", "Temperatura " ,"Centro"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		for(int i=0 ; i<vasca.listaVasche().size();i++)
		{
			Object [] rowdata = new Object[4];
			rowdata[0]=vasca.listaVasche().get(i).getCodice_vasca();
			rowdata[1]=vasca.listaVasche().get(i).getCapacita_vasca();
			rowdata[2]=vasca.listaVasche().get(i).getTemperatura_acqua();
			rowdata[3]=vasca.listaVasche().get(i).getNome_centro();
			
			
			dtm.addRow(rowdata);
		}
		tbl.setRowHeight(50);
		return tbl;
	}
	
	public JTable SetTableCentri()
	{
		String[] tblHead={"Codice Centro ","Nome", "Partita IVA ", "Indirizzo " ,"Numero Telefono"};
		DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
		
		JTable tbl=new JTable(dtm);
		tbl.setEnabled(false);
		for(int i=0 ; i<centro.listaCentri().size();i++)
		{
			Object [] rowdata = new Object[5];
			rowdata[0]=centro.listaCentri().get(i).getID_Centro();
			rowdata[1]=centro.listaCentri().get(i).getNome();
			rowdata[2]=centro.listaCentri().get(i).getPartita_Iva();
			rowdata[3]=centro.listaCentri().get(i).getIndirizzo();
			rowdata[4]=centro.listaCentri().get(i).getNumero_Telefono();
			
			
			dtm.addRow(rowdata);
		}
		tbl.setRowHeight(50);
		return tbl;
	}
	
	public boolean InserisciCentro()
	{
		int rowinsert = centro.InserisciCentro(GetCentro());
		if(rowinsert>0)
			return true;
		else
			return false;
	}
	public ArrayList<String> ListaIDCentro()
	{
		return centro.getIDCentri();
	}
	
	public Centro RecuperaCentro (String id)
	{
		return centro.RecuperaCentro(id);
	}
	
	public boolean EliminaCentro(String id)
	{
		int rowdelete=centro.EliminaCentro(id);
		if(rowdelete>0)
			return true;
		else
			return false;
	}
	
	public int eseguiFunzioneTartarugheAccolte(int anno)
	{
		return tartaruga.eseguiFunzioneTartarugheAccolte(anno);
	}
	
	public int eseguiFunzioneTartarugheRilasciate(int anno)
	{
		return tartaruga.eseguiFunzioneTartarugheRilasciate(anno);
	}
	
	public int eseguiFunzioneTartarugheMorte(int anno)
	{
		return tartaruga.eseguiFunzioneTartarugheMorte(anno);
	}
	
	public Donazione GetDonazione() {
		donation = new Donazione();
		
		donation.setEmailDonatore(insertDonazione.getemaildonate());
		donation.setImportoDonazione(insertDonazione.getImportoDonate());
		donation.setIdCentro(insertDonazione.getCentroDonate());
		donation.setMetodoPagamento(insertDonazione.getMetodoPagamento());
		donation.setDataDonazione(insertDonazione.getDateDonate());

		return donation;
	}
	
	public Donazione GetDonazioneModifica() {
		donation = new Donazione();
		
		donation.setEmailDonatore(modificadonazione.getemaildonate());
		donation.setImportoDonazione(modificadonazione.getImportoDonate());
		donation.setIdCentro(modificadonazione.getCentroDonate());
		donation.setMetodoPagamento(modificadonazione.getMetodoPagamento());
		donation.setDataDonazione(modificadonazione.getDateDonate());

		return donation;
	}
	
	public Cartella_Medica GetCartellaMedica()
	{
		cartellamedica=new Cartella_Medica();
		
		cartellamedica.setCondizioni_becco(insertcartella.getCondizioniBecco());
		cartellamedica.setCondizioni_coda(insertcartella.getCondizioniCoda());
		cartellamedica.setCondizioni_collo(insertcartella.getCondizioniCollo());
		cartellamedica.setCondizioni_generali(insertcartella.getCondizioniGenerali());
		cartellamedica.setCondizioni_naso(insertcartella.getCondizioniNaso());
		cartellamedica.setCondizioni_occhi(insertcartella.getCondizioniOcchi());
		cartellamedica.setCondizioni_pinna(insertcartella.getCondizioniPinne());
		cartellamedica.setCondizioni_testa(insertcartella.getCondizioniTesta());
		cartellamedica.setData_Apertura_Cartella(insertcartella.getDateDonate());
		cartellamedica.setId_tartaruga(insertcartella.getTurtle());
		cartellamedica.setLarghezza(insertcartella.getLarghezza());
		cartellamedica.setLunghezza(insertcartella.getLunghezza());
		cartellamedica.setLuogo_ritrovamento(insertcartella.getLuogo());
		cartellamedica.setMatricola_medico(insertcartella.getMedico());
		cartellamedica.setPeso(insertcartella.getPeso());
		cartellamedica.setSpecie(insertcartella.getSpecie());
		
		return cartellamedica;
		
	}
	public Cartella_Medica GetCartellaMedicaModifica()
	{
		cartellamedica=new Cartella_Medica();
		
		cartellamedica.setId_cartella_medica(modificacartella.getIdCartella());
		cartellamedica.setCondizioni_becco(modificacartella.getCondizioniBecco());
		cartellamedica.setCondizioni_coda(modificacartella.getCondizioniCoda());
		cartellamedica.setCondizioni_collo(modificacartella.getCondizioniCollo());
		cartellamedica.setCondizioni_generali(modificacartella.getCondizioniGenerali());
		cartellamedica.setCondizioni_naso(modificacartella.getCondizioniNaso());
		cartellamedica.setCondizioni_occhi(modificacartella.getCondizioniOcchi());
		cartellamedica.setCondizioni_pinna(modificacartella.getCondizioniPinne());
		cartellamedica.setCondizioni_testa(modificacartella.getCondizioniTesta());
		cartellamedica.setData_Apertura_Cartella(modificacartella.getDateDonate());
		cartellamedica.setId_tartaruga(modificacartella.getTurtle());
		cartellamedica.setLarghezza(modificacartella.getLarghezza());
		cartellamedica.setLunghezza(modificacartella.getLunghezza());
		cartellamedica.setLuogo_ritrovamento(modificacartella.getLuogo());
		cartellamedica.setMatricola_medico(modificacartella.getMedico());
		cartellamedica.setPeso(modificacartella.getPeso());
		cartellamedica.setSpecie(modificacartella.getSpecie());
		
		return cartellamedica;
		
	}
	public Laboratorio GetLaboratorio()
	{
		lab=new Laboratorio();
		
		lab.setFinalita_laboratorio(inserimentolaboratorio.getFinalita());
		lab.setId_sede(inserimentolaboratorio.getCentro());
		lab.setNumero_lab(inserimentolaboratorio.getNumero());
		
		return lab;
		
	}
	
	public Vasca GetVasca()
	{
		vasca_centro = new Vasca();
		
		vasca_centro.setCapacita_vasca(inserimentovasca.getCapacita());
		vasca_centro.setTemperatura_acqua(inserimentovasca.getTemperatura());
		vasca_centro.setNome_centro(inserimentovasca.getCentro());
		
		return vasca_centro;
	}
	
	public Tartaruga GetTartarugaPrima()
	{
		turtle = new Tartaruga();
		
		turtle.setNome(inserimentotartarugaprima.GetNome());
		turtle.setData_accoglienza_centro(inserimentotartarugaprima.GetDate());
		turtle.setID_Sede(inserimentotartarugaprima.GetCentro());
		turtle.setEta(inserimentotartarugaprima.GetEta());
		
		return turtle;
	}
	
	public Tartaruga GetTartarugaRiammissione()
	{
		turtle = new Tartaruga();
		
		turtle.setNome(inserttartarugariammissione.GetNome());
		turtle.setData_accoglienza_centro(inserttartarugariammissione.GetDate());
		turtle.setID_Sede(inserttartarugariammissione.GetCentro());
		turtle.setEta(inserttartarugariammissione.GetEta());
		turtle.setId_tartaruga(inserttartarugariammissione.GetNumTarghetta());
		
		return turtle;
	}
	
	public Targhetta GetTarghetta()
	{
		targhetta_metallica = new Targhetta();
		
		targhetta_metallica.setData_emissione_targhetta(inserimentotarghetta.getData());
		targhetta_metallica.setId_tartaruga(inserimentotarghetta.getTurtle());
		targhetta_metallica.setMatricola_operatore(inserimentotarghetta.getMatricolaOpe());
		targhetta_metallica.setPresenza_chip_GPS(inserimentotarghetta.getSceltaGPS());
		
		return targhetta_metallica;
	}
	
	public Centro GetCentro()
	{
		centro_recupero = new Centro();
		
		centro_recupero.setCodice_Ateco(inserimentocentro.getCodiceAteco());
		centro_recupero.setE_mail(inserimentocentro.getEmail());
		centro_recupero.setE_mail_PEC(inserimentocentro.getEmailPEC());
		centro_recupero.setIBAN(inserimentocentro.getIBAN());
		centro_recupero.setIndirizzo(inserimentocentro.getIndirizzo());
		centro_recupero.setNome(inserimentocentro.getNome());
		centro_recupero.setNumero_Atto_Costitutivo(inserimentocentro.getNumeroAtto());
		centro_recupero.setNumero_Telefono(inserimentocentro.getTelefono());
		centro_recupero.setPartita_Iva(inserimentocentro.getPartitaIVA());
		centro_recupero.setRagione_Sociale(inserimentocentro.getRagioneSociale());
		
		return centro_recupero;
	}
	
	public Cartella_Medica_Degenza GetVisitaDegenza()
	{
		cartella_degenza = new Cartella_Medica_Degenza();
		
		cartella_degenza.setData_controllo(inserimentovisita.GetData());
		cartella_degenza.setFarmaco_somministrato(inserimentovisita.GetFarmaco());
		cartella_degenza.setId_tartaruga(inserimentovisita.GetTurtle());
		cartella_degenza.setMatricola_medico(inserimentovisita.GetMatricolaMedico());
		cartella_degenza.setPeso(inserimentovisita.GetPeso());
		cartella_degenza.setValutazione_condizioni_generali(inserimentovisita.GetCondizione());
		
		return cartella_degenza;
	}
	
	public OccupareVasca GetControlloVasca()
	{
		gestionevasca = new OccupareVasca();
		
		gestionevasca.setData_versamento_cibo(inserimentocibo.GetData());
		gestionevasca.setMatricola_operatore(inserimentocibo.GetMatricolaOpe());
		gestionevasca.setQuantita_cibo_inserito(inserimentocibo.GetPesoInserito());
		gestionevasca.setQuantita_cibo_rimosso(inserimentocibo.GetPesoRimosso());
		gestionevasca.setTipologia_cibo_inserito(inserimentocibo.GetTipologiaCibo());
		gestionevasca.setCodice_vasca(inserimentocibo.GetCodiceVasca());
		
		return gestionevasca;
	}
	
	public Operatore GetOperatore()
	{
		operatore_centro = new Operatore();
		
		operatore_centro.setCodice_Fiscale(inserimentopersonale.GetCodiceFiscale());
		operatore_centro.setCognome(inserimentopersonale.GetCognome());
		operatore_centro.setData_Inizio_Lavoro(inserimentopersonale.GetData());
		operatore_centro.setNome(inserimentopersonale.GetNome());
		operatore_centro.setResidenza(inserimentopersonale.GetIndirizzo());
		operatore_centro.setSede(inserimentopersonale.GetCentro());
		operatore_centro.setCompenso(0);
		
		return operatore_centro;
	}
	
	public Ricercatore GetRicercatore()
	{
		ricercatore_centro = new Ricercatore();
		
		ricercatore_centro.setCodice_Fiscale(inserimentopersonale.GetCodiceFiscale());
		ricercatore_centro.setCognome(inserimentopersonale.GetCognome());
		ricercatore_centro.setData_Inizio_Lavoro(inserimentopersonale.GetData());
		ricercatore_centro.setNome(inserimentopersonale.GetNome());
		ricercatore_centro.setResidenza(inserimentopersonale.GetIndirizzo());
		ricercatore_centro.setSede(inserimentopersonale.GetCentro());
		ricercatore_centro.setCompenso(0);
		
		return ricercatore_centro;
	}
	
	public Medico_Veterinario GetMedico()
	{
		medico_veterinario = new Medico_Veterinario();
		
		medico_veterinario.setCodice_Fiscale(inserimentopersonale.GetCodiceFiscale());
		medico_veterinario.setCognome(inserimentopersonale.GetCognome());
		medico_veterinario.setData_Inizio_Lavoro(inserimentopersonale.GetData());
		medico_veterinario.setNome(inserimentopersonale.GetNome());
		medico_veterinario.setResidenza(inserimentopersonale.GetIndirizzo());
		medico_veterinario.setSede(inserimentopersonale.GetCentro());
		medico_veterinario.setCompenso(0);
		
		return medico_veterinario;
	}
	
	public Tecnico_di_Laboratorio GetTecnicoDiLaboratorio()
	{
		tecnico_di_laboratorio = new Tecnico_di_Laboratorio();
		
		tecnico_di_laboratorio.setCodice_Fiscale(inserimentopersonale.GetCodiceFiscale());
		tecnico_di_laboratorio.setCognome(inserimentopersonale.GetCognome());
		tecnico_di_laboratorio.setData_Inizio_Lavoro(inserimentopersonale.GetData());
		tecnico_di_laboratorio.setNome(inserimentopersonale.GetNome());
		tecnico_di_laboratorio.setResidenza(inserimentopersonale.GetIndirizzo());
		tecnico_di_laboratorio.setSede(inserimentopersonale.GetCentro());
		tecnico_di_laboratorio.setCompenso(0);
		
		return tecnico_di_laboratorio;
	}
}




