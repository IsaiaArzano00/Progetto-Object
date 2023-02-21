package DAO;

import java.sql.ResultSet;
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
	
}
