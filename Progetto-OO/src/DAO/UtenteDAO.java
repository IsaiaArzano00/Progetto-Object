package DAO;

import java.sql.*;

import connection.Connessione;

public class UtenteDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public UtenteDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	public boolean LoginVerify (String username , String password)
	{
		try {
			ResultSet rs = statement.executeQuery("SELECT *  FROM UTENTE WHERE USERNAME='"
													+username+"' AND password='"+password+"' ;");
			
				return rs.next();	
			
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public void RegisterUser (String username , String password ,String e_mail )
	{
		try {
			statement.executeQuery("INSERT INTO UTENTE VALUES ('"+username+"' , '"+password+"' , '"+e_mail+"' );");
			
			
		}catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}
	public boolean CheckUtente(String username , String e_mail)
	{
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM UTENTE WHERE USERNAME='"+username+"' OR E_MAIL='"+e_mail+"' ;");
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
