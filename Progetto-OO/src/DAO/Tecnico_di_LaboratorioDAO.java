package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

}
