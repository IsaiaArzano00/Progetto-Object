package DAO;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.Connessione;

public class SedeDAO {
	private Connessione connection;
	private Statement statement;
	private ResultSet ResultSet;
	
	public SedeDAO()
	{
		connection=Connessione.getConnessione();
		statement=connection.getStatement();
	}
	
	public ArrayList<String> getIDSede()
	{
		
		ArrayList<String> id_sede = new ArrayList<String>();
		try
		{
			ResultSet rs = statement.executeQuery("SELECT ID_SEDE FROM SEDE;");
			while(rs.next())
			{
				String nome = new String();
				nome=rs.getString("id_sede");
				
				id_sede.add(nome);
			}
			
		return id_sede;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return id_sede;
			
		}
	}

}
