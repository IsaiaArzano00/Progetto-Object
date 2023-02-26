package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.Medico_Veterinario;
import connection.Connessione;

public class Medico_VeterinarioDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public Medico_VeterinarioDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}

	//INSERT MEDICO VETERINARIO
	
	public int InserisciMedico (String Nome,String Cognome,String Codice_Fiscale , String Residenza , String Data_Inizio,int Compenso,String sede)
	{
		int rowinsert=0;
		
		try {
			ResultSet rd = statement.executeQuery("SELECT S.ID_SEDE FROM CENTRO  AS C JOIN SEDE AS S ON S.ID_CENTRO =C.ID_CENTRO "
					+ " WHERE C.NOME LIKE '"+sede+"'  ;");
			String id_sede = new String();
			while(rd.next())
			{
				id_sede = rd.getString("id_sede");
			}
			
			rowinsert =statement.executeUpdate("INSERT INTO MEDICO_VETERINARIO VALUES (DEFAULT ,'"+Nome+"' , '"+Cognome+"' , '"+Residenza+"' , "
					+ "'"+Codice_Fiscale+"' , '"+Data_Inizio+"' , null , "+Compenso+", '"+id_sede+"' );");
			
			return rowinsert;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	
	//LISTA DEI MEDICI VETERINARI PER CENTRO
	public ArrayList<Medico_Veterinario> ListaMedici_VetPerCentro(String centro)
	{
		ArrayList<Medico_Veterinario> medici = new ArrayList<Medico_Veterinario>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM MEDICO_VETERINARIO AS MV JOIN SEDE AS S ON S.ID_SEDE = MV.ID_SEDE"
					+ " JOIN CENTRO AS C ON S.ID_CENTRO=C.ID_CENTRO "
					+ "WHERE C.NOME='"+centro+"' ; ");
			while(rs.next())
			{
				Medico_Veterinario medico = new Medico_Veterinario();
				medico.setMatricola_medico(rs.getString("matricola_medico"));
				medico.setNome(rs.getString("nome"));
				medico.setCognome(rs.getString("cognome"));
				medico.setResidenza(rs.getString("residenza"));
				medico.setCodice_Fiscale(rs.getString("codice_fiscale"));
				medico.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
				medico.setData_Fine_Lavoro(null);
				medico.setCompenso(rs.getInt("compenso"));
				medico.setSede(rs.getString("id_sede"));
				
				medici.add(medico);
			}
			return medici;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return medici;
		}
	}
	
	//LISTA DEI MEDICI VETERIANRI IN TUTTI I CENTRI 
	public ArrayList<Medico_Veterinario> ListaMedici_Vet()
	{
		ArrayList<Medico_Veterinario> medici = new ArrayList<Medico_Veterinario>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM MEDICO_VETERINARIO;");
			while(rs.next())
			{
				Medico_Veterinario medico = new Medico_Veterinario();
				medico.setMatricola_medico(rs.getString("matricola_medico"));
				medico.setNome(rs.getString("nome"));
				medico.setCognome(rs.getString("cognome"));
				medico.setResidenza(rs.getString("residenza"));
				medico.setCodice_Fiscale(rs.getString("codice_fiscale"));
				medico.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
				medico.setData_Fine_Lavoro(null);
				medico.setCompenso(rs.getInt("compenso"));
				medico.setSede(rs.getString("id_sede"));
				
				medici.add(medico);
			}
			return medici;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return medici;
		}
	}
	
	//CHECK MATRICOLA MEDICO ESISTE
	public boolean CheckMatricola(String matricola)
	{
		
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM MEDICO_VETERINARIO WHERE MATRICOLA_MEDICO LIKE '"+matricola+"' ;");
			return rs.next();
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	//NUMERO VETERINARI IN TUTTI I CENTRI 
		public int NumeroMedici()
		{
			int number=0;
			try {
				ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM MEDICO_VETERINARIO;");
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
}


