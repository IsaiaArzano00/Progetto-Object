package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
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

	
	//INSERT NUOVO LABORATORIO
	public int InserisciLaboratorio(int numero_lab , String finalita , String sede)
	{
		int rowinsert =0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO LABORATORIO VALUES(DEFAULT, '"+numero_lab+"' , '"+finalita+"' , '"+sede+"' );");
			return rowinsert;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
}
