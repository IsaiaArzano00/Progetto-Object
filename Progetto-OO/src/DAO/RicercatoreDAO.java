package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;


import DTO.Ricercatore;
import connection.Connessione;

public class RicercatoreDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public RicercatoreDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	//INSERT RICERCATORE 
	
	public int InserisciRicercatore(String Nome,String Cognome,String Codice_Fiscale , String Residenza , String Data_Inizio,int Compenso,String sede)
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
			
			rowinsert =statement.executeUpdate("INSERT INTO RICERCATORE VALUES (DEFAULT ,'"+Nome+"' , '"+Cognome+"' , '"+Residenza+"' , "
					+ "'"+Codice_Fiscale+"' , '"+Data_Inizio+"' , null , "+Compenso+", '"+id_sede+"' );");
			
			return rowinsert;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	//ELENCO DEI RICERCATORI PER CENTRO 
		public ArrayList<Ricercatore> ListaRicercatoriPerCentro(String centro)
		{
			ArrayList<Ricercatore> ricercatori = new  ArrayList<Ricercatore>();
			try {
				ResultSet rs = statement.executeQuery("SELECT * FROM RICERCATORE AS R  JOIN SEDE AS S ON R.ID_SEDE = S.ID_SEDE"
						+ " JOIN CENTRO AS C ON S.ID_CENTRO=C.ID_CENTRO "
						+ "WHERE C.NOME='"+centro+"' ;");
				while(rs.next())
				{
					Ricercatore ricercatore = new Ricercatore();
					ricercatore.setMatricola_Ricercatore(rs.getString("matricola_ricercatore"));
					ricercatore.setNome(rs.getString("nome"));
					ricercatore.setCognome(rs.getString("cognome"));
					ricercatore.setResidenza(rs.getString("residenza"));
					ricercatore.setCodice_Fiscale(rs.getString("codice_fiscale"));
					ricercatore.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
					ricercatore.setData_Fine_Lavoro(null);
					ricercatore.setCompenso(rs.getInt("compenso"));
					ricercatore.setSede(rs.getString("id_sede"));
					
					ricercatori.add(ricercatore);
				}
				
				return ricercatori;
			}
			catch(SQLException e) {
				e.printStackTrace();
				return ricercatori;
				
			}
		}
		
		
		//ELENCO DEI RICERCATORI IN TUTTI I CENTRI 
		public ArrayList<Ricercatore> ListaRicercatori()
		{
			ArrayList<Ricercatore> ricercatori = new  ArrayList<Ricercatore>();
			try {
				ResultSet rs = statement.executeQuery("SELECT * FROM RICERCATORE  ;");
				while(rs.next())
				{
					Ricercatore ricercatore = new Ricercatore();
					ricercatore.setMatricola_Ricercatore(rs.getString("matricola_ricercatore"));
					ricercatore.setNome(rs.getNString("nome"));
					ricercatore.setCognome(rs.getString("cognome"));
					ricercatore.setResidenza(rs.getString("residenza"));
					ricercatore.setCodice_Fiscale(rs.getString("codice_fiscale"));
					ricercatore.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
					ricercatore.setData_Fine_Lavoro(null);
					ricercatore.setCompenso(rs.getInt("compenso"));
					ricercatore.setSede(rs.getString("id_sede"));
					
					ricercatori.add(ricercatore);
				}
				
				return ricercatori;
			}
			catch(SQLException e) {
				e.printStackTrace();
				return ricercatori;
				
			}
		}
		
		//NUMERO RICERCATROI IN TUTTI I CENTRI 
			public int NumeroRicercatori()
			{
				int number=0;
				try {
					ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM RICERCATORE ;");
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

}
