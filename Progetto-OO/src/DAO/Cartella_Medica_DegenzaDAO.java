package DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.Connessione;

public class Cartella_Medica_DegenzaDAO {
	private Connessione connection;
	private Statement statement;
	private ResultSet ResultSet;
	
	public Cartella_Medica_DegenzaDAO() {
		connection=Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT CARTELLA MEDICA DEGENZA
	public int InserisciVisita(String date, String farmaco , int peso , String condizioni , String id_turtle , String medico)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO CARTELLA_DEGENZA(data_controllo,farmaco_somministrato,peso,valutazione_condizioni_generali,id_tartaruga, matricola_medico,id_cartelladegenza)"
					+ " VALUES ('"+date+"' , '"+farmaco+"' , "+peso+" , '"+condizioni+"' , '"
					+id_turtle+"' , '"+medico+"', DEFAULT  );");
					
			return rowinsert;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	
}
