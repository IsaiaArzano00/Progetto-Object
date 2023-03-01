package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connection.Connessione;
import DTO.Tartaruga;

public class TartarugaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public TartarugaDAO() {
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//INSERT TARTARUGA PRIMO INGRESSO
	public int InserisciTartarugaPrimo(String nome,int eta  ,String data_accoglienza_centro,String sede)
	{
		int rowinsert =0;
		try
		{
			ResultSet rd = statement.executeQuery("SELECT S.ID_SEDE FROM CENTRO  AS C JOIN SEDE AS S ON S.ID_CENTRO =C.ID_CENTRO "
					+ " WHERE C.NOME LIKE '"+sede+"'  ;");
			String id_sede = new String();
			while(rd.next())
			{
				id_sede = rd.getString("id_sede");
			}
			
			rowinsert=statement.executeUpdate("INSERT INTO TARTARUGA VALUES (DEFAULT , '"+nome+"' , "+eta+" , 'NULL' "
					+ " , '"+data_accoglienza_centro+"' , FALSE , FALSE, NULL, NULL , '"+id_sede+"' , NULL , NULL );");
			
			return rowinsert;
		}catch(SQLException e )
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	//INSERIMENTO TARTARUGA RIAMMISSIONE
	public int InserisciTartaruga(String nome,int eta , String old_number_targhetta ,String data_accoglienza_centro,String sede)
	{
		int rowinsert =0;
		try
		{
			ResultSet rd = statement.executeQuery("SELECT S.ID_SEDE FROM CENTRO  AS C JOIN SEDE AS S ON S.ID_CENTRO =C.ID_CENTRO "
					+ " WHERE C.NOME LIKE '"+sede+"'  ;");
			String id_sede = new String();
			while(rd.next())
			{
				id_sede = rd.getString("id_sede");
			}
			
			rowinsert=statement.executeUpdate("INSERT INTO TARTARUGA VALUES (DEFAULT , '"+nome+"' , "+eta+" , '"+old_number_targhetta+"' "
					+ " , '"+data_accoglienza_centro+"' , FALSE , FALSE, NULL, NULL , '"+id_sede+"' , NULL , NULL );");
			
			return rowinsert;
		}catch(SQLException e )
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	//CHECK ID TARTARUGA ESISTE
	public boolean checkid_turtle(String id)
	{
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM TARTARUGA WHERE ID_TARTARUGA LIKE '"+id+"' ;");
			return rs.next();
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	//NUMERO TARTARUGHE ACCOLTE 
	public int NumeroTartarugheAccolte()
	{
		int number=0;
		try {
			ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM TARTARUGA;");
			while(rs.next())
			{
				number = rs.getInt("count");
			}
			return number;
		} catch (SQLException e) {
			e.printStackTrace();
			return number; 
		}
	}
	
	
	

	
	//LISTA TARTARUGHE IN TUTTI I CENTRI 
	public ArrayList<Tartaruga> ListaTartarugheAll ()
	{
		ArrayList<Tartaruga> tartarughe = new ArrayList<Tartaruga>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM TARTARUGA;");
			while (rs.next())
			{
				Tartaruga tartaruga = new Tartaruga();
				tartaruga.setId_tartaruga(rs.getString("id_tartaruga"));
				tartaruga.setNome(rs.getString("nome"));
				tartaruga.setEta(rs.getInt("eta"));
				tartaruga.setOld_number_targhetta(rs.getString("old_number_targhetta"));
				tartaruga.setData_accoglienza_centro(rs.getDate("data_accoglienza_centro"));
				tartaruga.setEventuale_rilascio(rs.getBoolean("eventuale_rilascio"));
				tartaruga.setEventuale_morte(rs.getBoolean("eventuale_morte"));
				tartaruga.setEventuale_data_rilascio(rs.getDate("eventuale_data_rilascio"));
				tartaruga.setEventuale_data_morte(rs.getDate("eventuale_data_morte"));
				tartaruga.setID_Sede(rs.getString("id_sede"));
				tartaruga.setID_CartellaMedica(rs.getString("id_cartellamedica"));
				tartaruga.setCodice_vasca(rs.getString("codice_vasca"));
				tartaruga.setNumero_targhetta(rs.getString("numero_targhetta"));
				
				tartarughe.add(tartaruga);
			}
			
			return tartarughe;
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return tartarughe;}
		}
	
	
	
	//LISTA TARTARUGHE PER CENTRO
	public ArrayList<Tartaruga> ListaTurtleCenter(String centro)
	{
		ArrayList<Tartaruga> tartarughe = new ArrayList<Tartaruga>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM TARTARUGA AS T JOIN SEDE AS S ON T.ID_SEDE=S.ID_SEDE"
					+ " JOIN CENTRO AS C ON C.ID_CENTRO = S.ID_CENTRO "
					+ " WHERE C.NOME = '"+centro+"' ;");
			while (rs.next())
			{
				Tartaruga tartaruga = new Tartaruga();
				tartaruga.setId_tartaruga(rs.getString("id_tartaruga"));
				tartaruga.setNome(rs.getString("nome"));
				tartaruga.setEta(rs.getInt("eta"));
				tartaruga.setOld_number_targhetta(rs.getString("old_number_targhetta"));
				tartaruga.setData_accoglienza_centro(rs.getDate("data_accoglienza_centro"));
				tartaruga.setEventuale_rilascio(rs.getBoolean("eventuale_rilascio"));
				tartaruga.setEventuale_morte(rs.getBoolean("eventuale_morte"));
				tartaruga.setEventuale_data_rilascio(rs.getDate("eventuale_data_rilascio"));
				tartaruga.setEventuale_data_morte(rs.getDate("eventuale_data_morte"));
				tartaruga.setID_Sede(rs.getString("id_sede"));
				tartaruga.setID_CartellaMedica(rs.getString("id_cartellamedica"));
				tartaruga.setCodice_vasca(rs.getString("codice_vasca"));
				tartaruga.setNumero_targhetta(rs.getString("numero_targhetta"));
				
				tartarughe.add(tartaruga);
			}
			
			return tartarughe;
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return tartarughe;}
	}
	
	//LISTA DEGLI ID DELLE TARTARUGHE
	public ArrayList<String> ListaTurtleID()
	{
		ArrayList<String> listaid = new ArrayList<String>();
		try {
			ResultSet rs = statement.executeQuery("SELECT ID_TARTARUGA FROM TARTARUGA ORDER BY ID_TARTARUGA ASC ;");
			while(rs.next())
			{
				String id = rs.getString("id_tartaruga");
				listaid.add(id);
			}
		return listaid;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return listaid;
		}
	}
	
	//LISTA DEGLI ID DELLE TARTARUGHE PER SEDE SELEZIONATA
	public ArrayList<String> ListaTurtleIDSede(String sede)
	{
		ArrayList<String> listaid = new ArrayList<String>();
		try {
			ResultSet rs = statement.executeQuery("SELECT ID_TARTARUGA FROM TARTARUGA WHERE ID_SEDE LIKE '"+sede+"'  ;");
			while(rs.next())
			{
				String id = rs.getString("id_tartaruga");
				listaid.add(id);
			}
		return listaid;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return listaid;
		}
	}
	
	//LISTA DEGLI ID DELLE TARTARUGHE SENZA TARGHETTA 
	public ArrayList<String> ListaTurtleSenzaTarghetta()
	{
		ArrayList<String> listaturtle = new ArrayList<String>();
		try {
			ResultSet rs = statement.executeQuery("SELECT ID_TARTARUGA FROM TARTARUGA WHERE NUMERO_TARGHETTA IS NULL ;");
			while(rs.next())
			{
				String id = rs.getString("id_tartaruga");
				listaturtle.add(id);
			}
			return listaturtle;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return listaturtle;
		}
	}
	
	//LISTA DEGLI ID DELLE TARTARUGHE DA RILASCIARE
		public ArrayList<String> ListaTurtleRilascio()
		{
			ArrayList<String> listaid = new ArrayList<String>();
			try {
				ResultSet rs = statement.executeQuery("SELECT ID_TARTARUGA FROM TARTARUGA WHERE EVENTUALE_RILASCIO IS FALSE AND EVENTUALE_MORTE IS FALSE ;");
				while(rs.next())
				{
					String id = rs.getString("id_tartaruga");
					listaid.add(id);
				}
			return listaid;
				
			}catch(SQLException e)
			{
				e.printStackTrace();
				return listaid;
			}
		}
		
	
	//RECUPERA DATI TARTARUGA
	public Tartaruga RecoveryTurtle(String id)
	{
		Tartaruga turtle = new Tartaruga();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM TARTARUGA WHERE ID_TARTARUGA LIKE '"+id+"'  ;");
			while(rs.next())
			{
				turtle.setId_tartaruga(rs.getString("id_tartaruga"));
				turtle.setNome(rs.getString("nome"));
				turtle.setEta(rs.getInt("eta"));
				turtle.setOld_number_targhetta(rs.getString("old_number_targhetta"));
				turtle.setData_accoglienza_centro(rs.getDate("data_accoglienza_centro"));
				turtle.setEventuale_rilascio(rs.getBoolean("eventuale_rilascio"));
				turtle.setEventuale_morte(rs.getBoolean("eventuale_morte"));
				turtle.setEventuale_data_rilascio(rs.getDate("eventuale_data_rilascio"));
				turtle.setEventuale_data_morte(rs.getDate("eventuale_data_morte"));
				turtle.setID_Sede(rs.getString("id_sede"));
				turtle.setID_CartellaMedica(rs.getString("id_cartellamedica"));
				turtle.setCodice_vasca(rs.getString("codice_vasca"));
				turtle.setNumero_targhetta(rs.getString("numero_targhetta"));
			}
			
		return turtle;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return turtle;
		}
	}
	
	//UPDATE RILASCIO TARTARUGA
	public int RilascioTurtle(String id,String date)
	{
		int rowupdate=0;
		try {
			rowupdate=statement.executeUpdate("UPDATE  TARTARUGA SET Eventuale_Rilascio = TRUE, Eventuale_Data_Rilascio ='"+date+"' WHERE ID_Tartaruga = '"+id+"' ;" );
			
			return rowupdate;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowupdate;
		}
	}
	
	//UPDATE MORTE TARTARUGA 
	public int MorteTurtle(String id,String date)
	{
		int rowupdate=0;
		try {
			rowupdate=statement.executeUpdate("UPDATE  TARTARUGA SET Eventuale_Morte = TRUE, Eventuale_Data_Morte ='"+date+"' WHERE ID_Tartaruga = '"+id+"' ;" );
			
			return rowupdate;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowupdate;
		}
	}
	
	//DELETE TARTARUGA 
	public int DeleteTurtle(String id_turtle)
	{
		int rowdelete=0;
		try {
			rowdelete=statement.executeUpdate("DELETE FROM TARTARUGA WHERE ID_TARTARUGA = '"+id_turtle+"' ;");
			return rowdelete;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowdelete;
		}
	}
}


	
