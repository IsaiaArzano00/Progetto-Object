package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.Connessione;

public class Cartella_MedicaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;

	public Cartella_MedicaDAO() {
		connection=Connessione.getConnessione();
		statement =connection.getStatement();
	}
	
	//INSERT CARTELLA MEDICA 
	public int InserisciCartellaMedica(String id_turtle ,String medico, double peso , double lunghezza , double larghezza , String specie , String luogo , String data, String condizioni_generali , String condizioniCollo,String condizioniTesta,String condizioniOcchi,String condizioniPinne,String condizioniNaso,String condizioniBecco,String condizioniCoda)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO CARTELLA_MEDICA (ID_cartellamedica  ,  Specie , Peso  ,  Lunghezza ,  Larghezza  , Luogo_ritrovamento  ,  Data_Apertura_Cartella  ,  Data_Chiusura_Cartella  , Condizioni_Generali, Testa ,  Occhi "
					+ ",  Pinne  , Naso ,  Becco ,  Collo ,  Coda ,  Matricola_Medico  ,  ID_Tartaruga)"
					+ "VALUES(DEFAULT, '"+specie+"' , "+peso+" , "+lunghezza+" ,"+larghezza+" , '"+luogo+"' , '"+data+"' , NULL , '"+condizioni_generali+"' , '"+condizioniTesta+"' , '"+condizioniOcchi+"' , '"+condizioniPinne+"' , '"+condizioniNaso+"' , '"+condizioniBecco+"' , '"+condizioniCollo+"' , '"+condizioniCollo+"' , '"+medico+"' , '"+id_turtle+"' );");
			
			return rowinsert;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
}
