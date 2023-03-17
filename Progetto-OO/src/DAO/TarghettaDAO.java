package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DTO.Targhetta;
import connection.Connessione;

public class TarghettaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public TarghettaDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT TARGHETTA
	public int InserisciTarghetta(Targhetta targhetta)
	{
		int rowinsert =0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO TARGHETTA VALUES (DEFAULT , '"+targhetta.getData_emissione_targhetta()+"' , '"+targhetta.isPresenza_chip_GPS()+"' , '"+targhetta.getMatricola_operatore()+"' , '"+targhetta.getId_tartaruga()+"' );");
			
			return rowinsert;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	
}
