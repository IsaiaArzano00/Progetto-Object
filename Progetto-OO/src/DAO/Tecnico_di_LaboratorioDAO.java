package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.Ricercatore;
import DTO.Tecnico_di_Laboratorio;
import connection.Connessione;

public class Tecnico_di_LaboratorioDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public Tecnico_di_LaboratorioDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	//INSERT TECNICO DI LABORATORIO
	
	public int InserisciTecnico(String Nome,String Cognome,String Codice_Fiscale , String Residenza , String Data_Inizio,int Compenso,String sede)
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
			
			rowinsert =statement.executeUpdate("INSERT INTO TECNICO_DI_LABORATORIO VALUES (DEFAULT ,'"+Nome+"' , '"+Cognome+"' , '"+Residenza+"' , "
					+ "'"+Codice_Fiscale+"' , '"+Data_Inizio+"' , null , "+Compenso+", '"+id_sede+"' );");
			
			return rowinsert;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	
	//LISTA TECNICI PER CENTRO 
	public ArrayList<Tecnico_di_Laboratorio> ListaTecniciPerCentro(String centro)
	{
		ArrayList<Tecnico_di_Laboratorio> tecnici = new ArrayList<Tecnico_di_Laboratorio>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM TECNICO_DI_LABORATORIO AS TDL JOIN SEDE AS S ON TDL.ID_SEDE=S.ID_SEDE "
					+ " JOIN CENTRO AS C ON S.ID_CENTRO=C.ID_CENTRO "
					+ " WHERE C.NOME='"+centro+"' ; ");
			while(rs.next())
			{
				Tecnico_di_Laboratorio tecnico = new Tecnico_di_Laboratorio();
				tecnico.setMatricola_TDL(rs.getString("matricola_TDL"));
				tecnico.setNome(rs.getString("nome"));
				tecnico.setCognome(rs.getString("cognome"));
				tecnico.setResidenza(rs.getString("residenza"));
				tecnico.setCodice_Fiscale(rs.getString("codice_fiscale"));
				tecnico.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
				tecnico.setData_Fine_Lavoro(null);
				tecnico.setCompenso(rs.getInt("compenso"));
				
				tecnici.add(tecnico);
				
			}
			return tecnici;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return tecnici;
		}
	}
	
	//NUMERO TECNICI IN TUTTI I CENTRI 
		public int NumeroTecnici()
		{
			int number=0;
			try {
				ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM TECNICO_DI_LABORATORIO;");
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
		
		//LISTA MATRICOLA OPERATORE
		public ArrayList<String> ListaMatricolaTecnico()
		{
			ArrayList<String> lista_matricola = new ArrayList<String>();
			try {
				ResultSet rs = statement.executeQuery("SELECT MATRICOLA_TDL FROM TECNICO_DI_LABORATORIO ;");
				while(rs.next())
				{
					String matricola = rs.getString("matricola_tdl");
					lista_matricola.add(matricola);
				}
				return lista_matricola;
				
			}catch(SQLException e) {
				e.printStackTrace();
				return lista_matricola;
			}
		}
		//RECUPERA DATI TECNICO 
		public Tecnico_di_Laboratorio RecuperaTecnico(String matricola)
		{
			Tecnico_di_Laboratorio tecnico = new Tecnico_di_Laboratorio();
			try {
				ResultSet rs = statement.executeQuery("SELECT * FROM TECNICO_DI_LABORATORIO WHERE MATRICOLA_TDL = '"+matricola+"' ;");
				while(rs.next())
				{
					
					tecnico.setMatricola_TDL(rs.getString("matricola_TDL"));
					tecnico.setNome(rs.getString("nome"));
					tecnico.setCognome(rs.getString("cognome"));
					tecnico.setResidenza(rs.getString("residenza"));
					tecnico.setCodice_Fiscale(rs.getString("codice_fiscale"));
					tecnico.setData_Inizio_Lavoro(rs.getDate("data_inizio_lavoro"));
					tecnico.setData_Fine_Lavoro(null);
					tecnico.setCompenso(rs.getInt("compenso"));
					tecnico.setSede(rs.getString("id_sede"));
				}
				
				return tecnico;
			}
			catch(SQLException e) {
				e.printStackTrace();
				return tecnico;	
			}
			}
	
		//DELETE TECNICO DI LABORATORIO
		public int DeleteTecnico(String matricola)
		{
			int rowdelete=0;
			try {
				rowdelete=statement.executeUpdate("DELETE FROM TECNICO_DI_LABORATORIO WHERE MATRICOLA_TDL = '"+matricola+"' ;");
				return rowdelete;
				
			}catch(SQLException e)
			{
				e.printStackTrace();
				return rowdelete;
			}
		}


}
