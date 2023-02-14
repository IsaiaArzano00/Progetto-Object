package DAO;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
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
	public int InserisciOperatore(String Nome,String Cognome,String Codice_Fiscale , String Residenza , String Data_Inizio,int Compenso,String sede)
	{
		int rowinsert=0;
		
		try {
			ResultSet rd = statement.executeQuery("SELECT S.ID_SEDE FROM CENTRO  AS C JOIN SEDE AS S ON S.ID_CENTRO =C.ID_CENTRO "
					+ " WHERE C.NOME LIKE '"+sede+"'  ;");
			String id_sede = new String();
			while(rd.next())
			{
				id_sede = rd.getString("id_sede");
			}
			
			rowinsert =statement.executeUpdate("INSERT INTO OPERATORE VALUES (DEFAULT ,'"+Nome+"' , '"+Cognome+"' , '"+Residenza+"' , "
					+ "'"+Codice_Fiscale+"' , '"+Data_Inizio+"' , null , "+Compenso+", '"+id_sede+"' );");
			
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
	
	
	
}
