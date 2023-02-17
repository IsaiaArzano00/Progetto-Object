package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connection.Connessione;

public class VascaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public VascaDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	public ArrayList<String> codiceVascheAll()
	{
		ArrayList<String> codiciVasche = new ArrayList<String>();
		try
		{
			ResultSet rs = statement.executeQuery("SELECT CODICE_VASCA FROM VASCA");
			while(rs.next())
			{
				String codice = rs.getString("codice_vasca");
				codiciVasche.add(codice);
			}
			
			return codiciVasche;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return codiciVasche;
		}
	}
	
	public ArrayList<String> codiceVascheCentro(String centro)
	{
		ArrayList<String> codiciVasche = new ArrayList<String>();
		try
		{
			ResultSet rs = statement.executeQuery("SELECT CODICE_VASCA FROM VASCA WHERE NOME_CENTRO='"+centro+"' ;");
			while(rs.next())
			{
				String codice = rs.getString("codice_vasca");
				codiciVasche.add(codice);
			}
			return codiciVasche;
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return codiciVasche;
		}
		
	}

}
