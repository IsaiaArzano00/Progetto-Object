package DAO;


import java.sql.ResultSet;
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
	
}
