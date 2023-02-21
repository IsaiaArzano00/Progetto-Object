package DAO;

import java.sql.ResultSet;
import java.sql.Statement;

import connection.Connessione;

public class LaboratorioDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public LaboratorioDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}

}
