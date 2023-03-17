package DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connection.Connessione;
import DTO.Cartella_Medica_Degenza;
import Controller.Controllore;

public class Cartella_Medica_DegenzaDAO {
	private Connessione connection;
	private Statement statement;
	private ResultSet ResultSet;
	
	public Cartella_Medica_DegenzaDAO() {
		connection=Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT CARTELLA MEDICA DEGENZA
	public int InserisciVisita(Cartella_Medica_Degenza cartella)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO CARTELLA_DEGENZA(data_controllo,farmaco_somministrato,peso,valutazione_condizioni_generali,id_tartaruga, matricola_medico,id_cartelladegenza)"
					+ " VALUES ('"+cartella.getData_controllo()+"' , '"+cartella.getFarmaco_somministrato()+"' , "+cartella.getPeso()+" , '"+cartella.getValutazione_condizioni_generali()+"' , '"
					+cartella.getId_tartaruga()+"' , '"+cartella.getMatricola_medico()+"', DEFAULT  );");
					
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
