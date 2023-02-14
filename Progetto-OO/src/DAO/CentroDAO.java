package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import DTO.Operatore;
import connection.Connessione;

public class CentroDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	
	public CentroDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	public int qtaCentri()
	{
		try {
			ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM CENTRO;");
			return rs.getInt(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public ArrayList<String> getNomeCentri()
	{
		
		ArrayList<String> nomeCentri = new ArrayList<String>();
		try
		{
			ResultSet rs = statement.executeQuery("SELECT NOME FROM CENTRO;");
			while(rs.next())
			{
				String nome = new String();
				nome=rs.getString("nome");
				
				nomeCentri.add(nome);
			}
			
		return nomeCentri;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return nomeCentri;
			
		}
	}
}