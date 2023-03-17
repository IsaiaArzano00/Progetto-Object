package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DTO.OccupareVasca;
import connection.Connessione;

public class OccupareVascaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public OccupareVascaDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT VERSAMENTO CIBO
	public int InserisciCibo(OccupareVasca gestione)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO OCCUPARE VALUES ('"+gestione.getMatricola_operatore()+"' , '"+gestione.getCodice_vasca()+"' , '"+gestione.getTipologia_cibo_inserito()+"' , "
					+gestione.getQuantita_cibo_inserito()+" , '"+gestione.getData_versamento_cibo()+"' , "+gestione.getQuantita_cibo_rimosso()+" ); ");
			
			return rowinsert;
					
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}

}
