package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import DTO.Centro;
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
		int number=0;
		try {
			ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM CENTRO;");
			while(rs.next())
			{
				number = rs.getInt("count");
			}
			return number;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return number; 
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
	public ArrayList<Centro> listaCentri()
	{
		ArrayList<Centro> lista_centri = new ArrayList<Centro>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM CENTRO ;");
			while(rs.next())
			{
				Centro centro = new Centro();
				centro.setCodice_Ateco(rs.getString("codice_ateco"));
				centro.setE_mail(rs.getString("e_mail"));
				centro.setE_mail_PEC(rs.getString("e_mail_PEC"));
				centro.setIBAN(rs.getString("iban"));
				centro.setID_Centro(rs.getString("id_centro"));
				centro.setIndirizzo(rs.getString("indirizzo_sede_legale"));
				centro.setNome(rs.getString("nome"));
				centro.setNumero_Atto_Costitutivo(rs.getString("numero_atto_costituitivo"));
				centro.setNumero_Telefono(rs.getString("numero_telefono"));
				centro.setPartita_Iva(rs.getString("partita_iva"));
				centro.setRagione_Sociale(rs.getString("ragione_sociale"));
				
				lista_centri.add(centro);
			}
			
			return lista_centri;
		}catch(SQLException e )
		{
			e.printStackTrace();
			return lista_centri;
		}
	}
	
	public int InserisciCentro(Centro centro)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO CENTRO VALUES (DEFAULT, '"+centro.getPartita_Iva()+"' , '"+centro.getNome()
			+"' , '"+centro.getCodice_Ateco()+"' , '"+centro.getRagione_Sociale()+"' , '"+centro.getNumero_Atto_Costitutivo()+
			"' , '"+centro.getE_mail()+"' , '"+centro.getE_mail_PEC()+"' , '"+centro.getNumero_Telefono()+
			"' , '"+centro.getIndirizzo()+"' , '"+centro.getIBAN()+"' );");
			return rowinsert;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	public ArrayList<String> getIDCentri()
	{
		
		ArrayList<String> IDCentri = new ArrayList<String>();
		try
		{
			ResultSet rs = statement.executeQuery("SELECT ID_CENTRO FROM CENTRO;");
			while(rs.next())
			{
				String id = new String();
				id=rs.getString("id_centro");
				
				IDCentri.add(id);
			}
			
		return IDCentri;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return IDCentri;
			
		}
		
	}
	
	public Centro RecuperaCentro(String id)
	{
		Centro centro = new Centro();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM CENTRO WHERE ID_CENTRO = '"+id+"' ;");
			while(rs.next())
			{
				
				centro.setCodice_Ateco(rs.getString("codice_ateco"));
				centro.setE_mail(rs.getString("e_mail"));
				centro.setE_mail_PEC(rs.getString("e_mail_PEC"));
				centro.setIBAN(rs.getString("iban"));
				centro.setID_Centro(rs.getString("id_centro"));
				centro.setIndirizzo(rs.getString("indirizzo_sede_legale"));
				centro.setNome(rs.getString("nome"));
				centro.setNumero_Atto_Costitutivo(rs.getString("numero_atto_costituitivo"));
				centro.setNumero_Telefono(rs.getString("numero_telefono"));
				centro.setPartita_Iva(rs.getString("partita_iva"));
				centro.setRagione_Sociale(rs.getString("ragione_sociale"));
				
			
			}
			
			return centro;
		}catch(SQLException e )
		{
			e.printStackTrace();
			return centro;
		}
	}
	
	public int EliminaCentro(String id)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("DELETE FROM CENTRO WHERE ID_CENTRO ='"+id+"' ;");
			return rowinsert;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
}