//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Controller;

import Components.PanelHome;
import Components.PanelLoginPage;
import Components.PanelRegister;
import Components.TablePersonale;
import Components.TableTartaruga;
import DAO.Cartella_Medica_DegenzaDAO;
import DAO.CentroDAO;
import DAO.DonazioneDAO;
import DAO.LaboratorioDAO;
import DAO.Medico_VeterinarioDAO;
import DAO.OperatoreDAO;
import DAO.RicercatoreDAO;
import DAO.SedeDAO;
import DAO.TartarugaDAO;
import DAO.Tecnico_di_LaboratorioDAO;
import DAO.UtenteDAO;
import DAO.VascaDAO;
import DTO.Donazione;
import DTO.Medico_Veterinario;
import DTO.Operatore;
import DTO.Ricercatore;
import DTO.Tartaruga;
import DTO.Tecnico_di_Laboratorio;
import GUI.DashBoard;
import GUI.Home;
import GUI.InserimentoDonazione;
import GUI.InserimentoPersonale;
import GUI.ModificaDonazione;
import GUI.RimozioneDonazione;
import GUI.ViewDonazioni;
import connection.Connessione;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controllore {
    private Home homepage = new Home(this);
    private DashBoard dashboard;
    private Connessione connesione;
    private UtenteDAO utente = new UtenteDAO();
    private OperatoreDAO operatore = new OperatoreDAO();
    private CentroDAO centro = new CentroDAO();
    private RicercatoreDAO ricercatore = new RicercatoreDAO();
    private Medico_VeterinarioDAO medico = new Medico_VeterinarioDAO();
    private Tecnico_di_LaboratorioDAO tecnico = new Tecnico_di_LaboratorioDAO();
    private TartarugaDAO tartaruga = new TartarugaDAO();
    private VascaDAO vasca = new VascaDAO();
    private DonazioneDAO donazione = new DonazioneDAO();
    private LaboratorioDAO laboratorio;
	private SedeDAO sede;
	private Cartella_Medica_DegenzaDAO degenza;

    public static void main(String[] args) {
        new Controllore();
    }

    public Controllore() {
    }

    public void SetPanelDashBoard(JPanel actualPanel, JPanel selectedPanel) {
        actualPanel.removeAll();
        actualPanel.add(selectedPanel);
        actualPanel.repaint();
        actualPanel.revalidate();
    }

    public void SetLoginPage(JPanel panelImage, JPanel panelLogin) {
        PanelHome Home = new PanelHome();
        Home.setBounds(0, 0, 450, 550);
        panelImage.removeAll();
        panelImage.add(Home);
        panelImage.repaint();
        panelImage.revalidate();
        PanelLoginPage Login = new PanelLoginPage(this);
        Login.setBounds(0, 0, 450, 550);
        panelLogin.removeAll();
        panelLogin.add(Login);
        panelLogin.repaint();
        panelLogin.revalidate();
    }

    public void SetRegistrerPage(JPanel panelImage, JPanel PanelRegistrer) {
        PanelHome Home = new PanelHome();
        Home.setBounds(0, 0, 450, 550);
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

    public void gotodashboard(JComponent panel, String utente) {
        panel.getTopLevelAncestor().setVisible(false);
        DashBoard dashboard = new DashBoard(utente, this);
        dashboard.setVisible(true);
    }

    public void GoToHome(JComponent panel) {
        panel.getTopLevelAncestor().setVisible(false);
        Home home = new Home(this);
        home.setVisible(true);
    }

    public boolean CheckLogin(String user, String password) {
        boolean flag = this.utente.LoginVerify(user, password);
        return flag;
    }

    public void RegistraUtente(String user, String password, String e_mail) {
        this.utente.RegisterUser(user, password, e_mail);
    }

    public boolean CheckUtenteRegistrato(String user, String e_mail) {
        boolean flag = this.utente.CheckUtente(user, e_mail);
        return flag;
    }

    public void VisualizzaPersonale(String qualifica, String centro, JPanel actual) {
        TablePersonale PanelTable = new TablePersonale(qualifica, centro, this);
        PanelTable.setBounds(0, 0, 796, 399);
        actual.removeAll();
        actual.add(PanelTable);
        actual.repaint();
        actual.revalidate();
    }

    public ArrayList<Donazione> getAllDonazioni() {
        return this.donazione.getDonazioni();
    }

    public JTable setTable(String qualifica, String centro) {
        JTable tbl = new JTable();
        if (qualifica.equals("Operatore")) {
            tbl = this.FillOperatoreTab(centro);
        } else if (qualifica.equals("Ricercatore")) {
            tbl = this.FillRicercatoreTab(centro);
        } else if (qualifica.equals("Medico Veterinario")) {
            tbl = this.FillMedicoTab(centro);
        } else if (qualifica.equals("Tecnico di Laboratorio")) {
            tbl = this.FillTecnicoTab(centro);
        }

        tbl.setShowVerticalLines(false);
        tbl.setRowHeight(50);
        return tbl;
    }

    public ArrayList<String> getNomeCentri() {
        ArrayList<String> nomi = this.centro.getNomeCentri();
        return nomi;
    }

    public ArrayList<String> getIdDonazioni() {
        ArrayList<String> donazioni = this.donazione.getIdDonazioni();
        return donazioni;
    }

    public JTable FillRicercatoreTab(String centro) {
        String[] tblHead = new String[]{"Matricola", "Nome", "Cognome", "Residenza", "Codice Fiscale", "Data inizio lavoro", "Compenso"};
        DefaultTableModel dtm = new DefaultTableModel(tblHead, 0);
        JTable tbl = new JTable(dtm);
        tbl.setEnabled(false);

        for(int i = 0; i < this.ricercatore.ListaRicercatoriPerCentro(centro).size(); ++i) {
            Object[] rowdata = new Object[]{((Ricercatore)this.ricercatore.ListaRicercatoriPerCentro(centro).get(i)).getMatricola_Ricercatore(), ((Ricercatore)this.ricercatore.ListaRicercatoriPerCentro(centro).get(i)).getNome(), ((Ricercatore)this.ricercatore.ListaRicercatoriPerCentro(centro).get(i)).getCognome(), ((Ricercatore)this.ricercatore.ListaRicercatoriPerCentro(centro).get(i)).getResidenza(), ((Ricercatore)this.ricercatore.ListaRicercatoriPerCentro(centro).get(i)).getCodice_Fiscale(), ((Ricercatore)this.ricercatore.ListaRicercatoriPerCentro(centro).get(i)).getData_Inizio_Lavoro(), ((Ricercatore)this.ricercatore.ListaRicercatoriPerCentro(centro).get(i)).getCompenso()};
            dtm.addRow(rowdata);
        }

        return tbl;
    }

    public JTable FillOperatoreTab(String centro) {
        String[] tblHead = new String[]{"Matricola", "Nome", "Cognome", "Residenza", "Codice Fiscale", "Data inizio lavoro", "Compenso"};
        DefaultTableModel dtm = new DefaultTableModel(tblHead, 0);
        JTable tbl = new JTable(dtm);
        tbl.setEnabled(true);

        for(int i = 0; i < this.operatore.ListaOperatoriPerCentro(centro).size(); ++i) {
            Object[] rowdata = new Object[]{((Operatore)this.operatore.ListaOperatoriPerCentro(centro).get(i)).getMatricola_Ope(), ((Operatore)this.operatore.ListaOperatoriPerCentro(centro).get(i)).getNome(), ((Operatore)this.operatore.ListaOperatoriPerCentro(centro).get(i)).getCognome(), ((Operatore)this.operatore.ListaOperatoriPerCentro(centro).get(i)).getResidenza(), ((Operatore)this.operatore.ListaOperatoriPerCentro(centro).get(i)).getCodice_Fiscale(), ((Operatore)this.operatore.ListaOperatoriPerCentro(centro).get(i)).getData_Inizio_Lavoro(), ((Operatore)this.operatore.ListaOperatoriPerCentro(centro).get(i)).getCompenso()};
            dtm.addRow(rowdata);
        }

        return tbl;
    }

    public JTable FillMedicoTab(String centro) {
        String[] tblHead = new String[]{"Matricola", "Nome", "Cognome", "Residenza", "Codice Fiscale", "Data inizio lavoro", "Compenso"};
        DefaultTableModel dtm = new DefaultTableModel(tblHead, 0);
        JTable tbl = new JTable(dtm);
        tbl.setEnabled(false);

        for(int i = 0; i < this.medico.ListaMedici_VetPerCentro(centro).size(); ++i) {
            Object[] rowdata = new Object[]{((Medico_Veterinario)this.medico.ListaMedici_VetPerCentro(centro).get(i)).getMatricola_medico(), ((Medico_Veterinario)this.medico.ListaMedici_VetPerCentro(centro).get(i)).getNome(), ((Medico_Veterinario)this.medico.ListaMedici_VetPerCentro(centro).get(i)).getCognome(), ((Medico_Veterinario)this.medico.ListaMedici_VetPerCentro(centro).get(i)).getResidenza(), ((Medico_Veterinario)this.medico.ListaMedici_VetPerCentro(centro).get(i)).getCodice_Fiscale(), ((Medico_Veterinario)this.medico.ListaMedici_VetPerCentro(centro).get(i)).getData_Inizio_Lavoro(), ((Medico_Veterinario)this.medico.ListaMedici_VetPerCentro(centro).get(i)).getCompenso()};
            dtm.addRow(rowdata);
        }

        return tbl;
    }

    public JTable FillTecnicoTab(String centro) {
        String[] tblHead = new String[]{"Matricola", "Nome", "Cognome", "Residenza", "Codice Fiscale", "Data inizio lavoro", "Compenso"};
        DefaultTableModel dtm = new DefaultTableModel(tblHead, 0);
        JTable tbl = new JTable(dtm);
        tbl.setEnabled(false);

        for(int i = 0; i < this.tecnico.ListaTecniciPerCentro(centro).size(); ++i) {
            Object[] rowdata = new Object[]{((Tecnico_di_Laboratorio)this.tecnico.ListaTecniciPerCentro(centro).get(i)).getMatricola_TDL(), ((Tecnico_di_Laboratorio)this.tecnico.ListaTecniciPerCentro(centro).get(i)).getNome(), ((Tecnico_di_Laboratorio)this.tecnico.ListaTecniciPerCentro(centro).get(i)).getCognome(), ((Tecnico_di_Laboratorio)this.tecnico.ListaTecniciPerCentro(centro).get(i)).getResidenza(), ((Tecnico_di_Laboratorio)this.tecnico.ListaTecniciPerCentro(centro).get(i)).getCodice_Fiscale(), ((Tecnico_di_Laboratorio)this.tecnico.ListaTecniciPerCentro(centro).get(i)).getData_Inizio_Lavoro(), ((Tecnico_di_Laboratorio)this.tecnico.ListaTecniciPerCentro(centro).get(i)).getCompenso()};
            dtm.addRow(rowdata);
        }

        return tbl;
    }

    public boolean InsertPersonale(String qualifica, String nome, String cognome, String residenza, String cod_fiscale, String date, String centro) {
        int rowinsert = 0;
        boolean check_insert = false;
        if (qualifica.equals("Operatore")) {
            rowinsert = this.operatore.InserisciOperatore(nome, cognome, cod_fiscale, residenza, date, 0, centro);
        } else if (qualifica.equals("Ricercatore")) {
            rowinsert = this.ricercatore.InserisciRicercatore(nome, cognome, cod_fiscale, residenza, date, 0, centro);
        } else if (qualifica.equals("Medico Veterinario")) {
            rowinsert = this.medico.InserisciMedico(nome, cognome, cod_fiscale, residenza, date, 0, centro);
        } else if (qualifica.equals("Tecnico di Laboratorio")) {
            rowinsert = this.tecnico.InserisciTecnico(nome, cognome, cod_fiscale, residenza, date, 0, centro);
        }

        if (rowinsert > 0) {
            check_insert = true;
        }

        return check_insert;
    }

    public boolean InsertDonazione(int importo, String emailDonatore, String date, String metodoPagamento, String centro) {
        boolean check_insert = false;
        int rowinsert = this.donazione.InserisciDonazione(importo, emailDonatore, date, metodoPagamento, centro);
        if (rowinsert > 0) {
            check_insert = true;
        }

        return check_insert;
    }

    public boolean check_CodiceFiscale(String codice_fiscale) {
        return codice_fiscale.length() == 16;
    }

    public JTable TableTurtleDashBoard() {
        String[] tblHead = new String[]{"ID_TARTARUGA", "Nome", "Età", "Data accoglienza", "Sede"};
        DefaultTableModel dtm = new DefaultTableModel(tblHead, 0);
        JTable tbl = new JTable(dtm);
        tbl.setEnabled(false);

        for(int i = 0; i < this.tartaruga.LastTurtleAll().size(); ++i) {
            Object[] rowdata = new Object[]{((Tartaruga)this.tartaruga.LastTurtleAll().get(i)).getId_tartaruga(), ((Tartaruga)this.tartaruga.LastTurtleAll().get(i)).getNome(), ((Tartaruga)this.tartaruga.LastTurtleAll().get(i)).getEta(), ((Tartaruga)this.tartaruga.LastTurtleAll().get(i)).getData_accoglienza_centro(), ((Tartaruga)this.tartaruga.LastTurtleAll().get(i)).getID_Sede()};
            dtm.addRow(rowdata);
        }

        return tbl;
    }

    public ArrayList<String> getCodiceVasche() {
        ArrayList<String> nomi = this.vasca.codiceVascheAll();
        return nomi;
    }

    public ArrayList<String> getCodiceVascheCentro(String centro) {
        ArrayList<String> nomi = this.vasca.codiceVascheCentro(centro);
        return nomi;
    }

    public boolean InsertTartaruga(String nome, int eta, String old_number_targhetta, String data_accoglienza_centro, String sede) {
        int rowinsert = this.tartaruga.InserisciTartaruga(nome, eta, old_number_targhetta, data_accoglienza_centro, sede);
        boolean check_insert = false;
        if (rowinsert > 0) {
            check_insert = true;
        }

        return check_insert;
    }

    public DonazioneDAO getDonazioneDAO() {
        return this.donazione;
    }

    public String modificaDonazione(String idDonazione, int importo, String email, String data, String pagamento) {
        return this.donazione.modificaDonazione(idDonazione, importo, email, data, pagamento);
    }

    public Donazione recuperaDonazione(String idDonazione) {
        return this.donazione.recuperaDonazione(idDonazione);
    }

    public void InserimentoPersonale() {
        new InserimentoPersonale(this);
    }

    public void InserimentoDonazionePage() {
        new InserimentoDonazione(this);
    }

    public void RimozioneDonazionePage() {
        new RimozioneDonazione(this);
    }

    public void ListaDonazioniPage() {
        new ViewDonazioni(this);
    }

    public void ModificaDonazioniPage() {
        new ModificaDonazione(this);
    }
	
	public ArrayList<String> getIDSede()
	{
		ArrayList<String> id_sede = sede.getIDSede();
		return id_sede;
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


}
