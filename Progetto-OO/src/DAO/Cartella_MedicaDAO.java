package DAO;

import java.sql.ResultSet;
import java.sql.Statement;

import connection.Connessione;

public class Cartella_MedicaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;

	public Cartella_MedicaDAO() {
		connection=Connessione.getConnessione();
		statement =connection.getStatement();
	}
}
