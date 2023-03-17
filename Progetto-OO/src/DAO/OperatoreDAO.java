package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import DTO.Operatore;
import connection.Connessione;

public class OperatoreDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	
	public OperatoreDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT IN OPERATORE
	public int InserisciOperatore(Operatore operatore)
	{
		int rowinsert=0;
		
		try {
			ResultSet rd = statement.executeQuery("SELECT S.ID_SEDE FROM CENTRO  AS C JOIN SEDE AS S ON S.ID_CENTRO =C.ID_CENTRO "
					+ " WHERE C.NOME LIKE '"+operatore.getSede()+"'  ;");
			String id_sede = new String();
			while(rd.next())
			{
				id_sede = rd.getString("id_sede");
			}
			
			rowinsert =statement.executeUpdate("INSERT INTO OPERATORE VALUES (DEFAULT ,'"+operatore.getNome()+"' , '"+operatore.getCognome()+"' , '"+operatore.getResidenza()+"' , "
					+ "'"+operatore.getCodice_Fiscale()+"' , '"+operatore.getData_Inizio_Lavoro()+"' , null , "+operatore.getCompenso()+", '"+id_sede+"' );");
			
			return rowinsert;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	//ELENCO DEGLI OPERATORI PER CENTRO 
	public ArrayList<Operatore> ListaOperatoriPerCentro(String centro)
	{
		ArrayList<Operatore> operatori = new ArrayList<Operatore>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM OPERATORE AS O JOIN SEDE AS S ON O.ID_SEDE = S.ID_SEDE "
					+ " JOIN CENTRO AS C ON S.ID_CENTRO=C.ID_CENTRO"
					+ " WHERE C.NOME='"+centro+"' ;");
			while(rs.next())
			{
				Operatore operatore = new Operatore();
				operatore.setMatricola_Ope(rs.getString("matricola_operatore"));
				operatore.setNome(rs.getString("nome"));
				operatore.setCognome(rs.getString("cognome"));
				operatore.setResidenza(rs.getString("residenza"));
				operatore.setCodice_Fiscale(rs.getString("codice_fiscale"));
				operatore.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
				operatore.setData_Fine_Lavoro(null);
				operatore.setCompenso(rs.getInt("compenso"));
				operatore.setSede(centro);
				
				operatori.add(operatore);
			}
			
			return operatori;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return operatori;
			
		}
	}
	
	
	//ELENCO DEGLI OPERATORI IN TUTTI I CENTRI 
	public ArrayList<Operatore> ListaOperatori()
	{
		ArrayList<Operatore> operatori = new ArrayList<Operatore>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM OPERATORE ");
			while(rs.next())
			{
				Operatore operatore = new Operatore();
				operatore.setMatricola_Ope(rs.getString("matricola_operatore"));
				operatore.setNome(rs.getString("nome"));
				operatore.setCognome(rs.getString("cognome"));
				operatore.setResidenza(rs.getString("residenza"));
				operatore.setCodice_Fiscale(rs.getString("codice_fiscale"));
				operatore.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
				operatore.setData_Fine_Lavoro(null);
				operatore.setCompenso(rs.getInt("compenso"));
				
				
				
				operatori.add(operatore);
			}
			
			return operatori;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return operatori;
			
		}
	}
	
	//CHECK SE MATRICOLA OPERATORE ESISTE 
	public boolean CheckMatricolaOperatore(String matricola)
	{
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM OPERATORE WHERE MATRICOLA_OPERATORE LIKE '"+matricola+"' ;");
			return rs.next();
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	//NUMERO OPERATORI IN TUTTI I CENTRI 
	public int NumeroOperatori()
	{
		int number=0;
		try {
			ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM OPERATORE;");
			while(rs.next())
			{
				number = rs.getInt("count");
			}
			return number;
		} catch (SQLException e) {
			e.printStackTrace();
			return number; 
		}
	}
	
	//LISTA MATRICOLA OPERATORE
	public ArrayList<String> ListaMatricolaOperatore()
	{
		ArrayList<String> lista_matricola = new ArrayList<String>();
		try {
			ResultSet rs = statement.executeQuery("SELECT MATRICOLA_OPERATORE FROM OPERATORE ;");
			while(rs.next())
			{
				String matricola = rs.getString("matricola_operatore");
				lista_matricola.add(matricola);
			}
			return lista_matricola;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return lista_matricola;
		}
	}
	//RECUPERA DATI OPERATORE 
	public Operatore RecuperaOperatore(String matricola)
	{
		Operatore operatore = new Operatore();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM OPERATORE WHERE MATRICOLA_OPERATORE = '"+matricola+"' ;");
			while(rs.next())
			{
				operatore.setMatricola_Ope(rs.getString("matricola_operatore"));
				operatore.setNome(rs.getString("nome"));
				operatore.setCognome(rs.getString("cognome"));
				operatore.setResidenza(rs.getString("residenza"));
				operatore.setCodice_Fiscale(rs.getString("codice_fiscale"));
				operatore.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
				operatore.setData_Fine_Lavoro(null);
				operatore.setCompenso(rs.getInt("compenso"));
				operatore.setSede(rs.getString("id_sede"));
			}
			
			return operatore;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return operatore;
			
		}
	}
	
	//DELETE OPERATORE
	public int DeleteOperatore(String matricola)
	{
		int rowdelete=0;
		try {
			rowdelete=statement.executeUpdate("DELETE FROM OPERATORE WHERE MATRICOLA_OPERATORE = '"+matricola+"' ;");
			return rowdelete;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowdelete;
		}
	}
	
}
