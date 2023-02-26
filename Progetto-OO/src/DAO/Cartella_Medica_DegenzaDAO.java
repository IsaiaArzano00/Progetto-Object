package DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connection.Connessione;
import DTO.Cartella_Medica_Degenza;

public class Cartella_Medica_DegenzaDAO {
	private Connessione connection;
	private Statement statement;
	private ResultSet ResultSet;
	
	public Cartella_Medica_DegenzaDAO() {
		connection=Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT CARTELLA MEDICA DEGENZA
	public int InserisciVisita(String date, String farmaco , int peso , String condizioni , String id_turtle , String medico)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO CARTELLA_DEGENZA(data_controllo,farmaco_somministrato,peso,valutazione_condizioni_generali,id_tartaruga, matricola_medico,id_cartelladegenza)"
					+ " VALUES ('"+date+"' , '"+farmaco+"' , "+peso+" , '"+condizioni+"' , '"
					+id_turtle+"' , '"+medico+"', DEFAULT  );");
					
			return rowinsert;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	//LISTA VISITE TARTARUGA
	public ArrayList<Cartella_Medica_Degenza> listavisiteturtle(String turtle)
	{
		ArrayList<Cartella_Medica_Degenza> visite_turtle = new ArrayList<Cartella_Medica_Degenza>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM CARTELLA_DEGENZA WHERE ID_TARTARUGA LIKE '"+turtle+"' ; ");
			while(rs.next())
			{
				Cartella_Medica_Degenza visita = new Cartella_Medica_Degenza();
				visita.setData_controllo(rs.getDate("data_controllo"));
				visita.setFarmaco_somministrato(rs.getString("farmaco_somministrato"));
				visita.setId_tartaruga(turtle);
				visita.setPeso(rs.getInt("peso"));
				visita.setValutazione_condizioni_generali(rs.getString("valutazione_condizioni_generali"));
				
				visite_turtle.add(visita);
				
			}
			
		return visite_turtle;
		
		}catch(SQLException e)
		{
			e.printStackTrace();
			return visite_turtle;
		}
	}
	
}
