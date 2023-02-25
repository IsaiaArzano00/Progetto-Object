package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.Connessione;

public class OccupareVascaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public OccupareVascaDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT VERSAMENTO CIBO
	public int InserisciCibo(String matricola , String data , String codice_vasca , double cibo_inserito , double cibo_rimosso , String tipologia_cibo)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO OCCUPARE VALUES ('"+matricola+"' , '"+codice_vasca+"' , '"+tipologia_cibo+"' , "
					+cibo_inserito+" , '"+data+"' , "+cibo_rimosso+" ); ");
			
			return rowinsert;
					
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}

}
