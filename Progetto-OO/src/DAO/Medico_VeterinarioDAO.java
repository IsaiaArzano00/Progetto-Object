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
}


