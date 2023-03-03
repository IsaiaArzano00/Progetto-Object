package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.Connessione;
import DTO.Cartella_Medica;


public class Cartella_MedicaDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;

	public Cartella_MedicaDAO() {
		connection=Connessione.getConnessione();
		statement =connection.getStatement();
	}
	
	
	public Cartella_Medica recuperaCartellaMedica(String idTartaruga) {
		Cartella_Medica cm = new Cartella_Medica();
		
		  try {
	            ResultSet rs = statement.executeQuery("SELECT * FROM CARTELLA_MEDICA AS CM WHERE CM.id_tartaruga LIKE '" + idTartaruga + "'  ;");
	            rs.next();
	            cm.setId_cartella_medica(rs.getString("id_cartellamedica"));
	            cm.setSpecie(rs.getString("specie"));
	            cm.setLunghezza(rs.getDouble("lunghezza"));
	            cm.setLarghezza(rs.getDouble("larghezza"));
	            cm.setPeso(rs.getDouble("peso"));
	            cm.setLuogo_ritrovamento(rs.getString("luogo_ritrovamento"));
	            cm.setData_Apertura_Cartella(rs.getDate("data_apertura_cartella"));
	            cm.setData_Chiusura_Cartella(rs.getDate("data_chiusura_cartella"));
	            cm.setCondizioni_generali(rs.getString("condizioni_generali"));
	            cm.setCondizioni_naso(rs.getString("naso"));
	            cm.setCondizioni_becco(rs.getString("becco"));
	            cm.setCondizioni_pinna(rs.getString("pinne"));
	            cm.setCondizioni_testa(rs.getString("testa"));
	            cm.setCondizioni_occhi(rs.getString("occhi"));
	            cm.setCondizioni_collo(rs.getString("collo"));
	            cm.setCondizioni_coda(rs.getString("coda"));
	            cm.setId_tartaruga(idTartaruga);
	            cm.setMatricola_medico(rs.getString("matricola_medico"));
	            return cm;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return cm;
	        }
	    }
	
	public void rimuoviCartellaMedica(String idTartaruga) {
		try {
			statement.executeUpdate("DELETE FROM CARTELLA_MEDICA CM WHERE CM.id_tartaruga LIKE '" + idTartaruga + "' ;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
