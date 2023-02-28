package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.Connessione;

public class TarghettaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public TarghettaDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT TARGHETTA
	public int InserisciTarghetta(String turtle,String matricola , String date , String GPS)
	{
		int rowinsert =0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO TARGHETTA VALUES (DEFAULT , '"+date+"' , "+GPS+" , '"+matricola+"' , '"+turtle+"' );");
			
			return rowinsert;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	
}
