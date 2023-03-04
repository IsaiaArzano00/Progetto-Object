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
<<<<<<< BranchIsaia


public int EliminaCartellaMedica(String idTartaruga) {
	int rowinsert = 0;
		try {
		  rowinsert = statement.executeUpdate("DELETE FROM CARTELLA_MEDICA CM WHERE CM.id_tartaruga LIKE '" + idTartaruga + "' ;");
		  return rowinsert;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	return rowinsert;
	}
	
	

public int ModificaDatiCartellaMedica(String id, double peso , double lunghezza , double larghezza , String data, String condizioni_generali , String condizioniCollo,String condizioniTesta,String condizioniOcchi,String condizioniPinne,String condizioniNaso,String condizioniBecco,String condizioniCoda)
	{
		int rowupdate =0;
		try {
			rowupdate=statement.executeUpdate("UPDATE CARTELLA_MEDICA SET PESO ="+peso+" , LUNGHEZZA="+lunghezza+" , LARGHEZZA="+larghezza+""
					+ " , DATA_APERTURA_CARTELLA='"+data+"' , CONDIZIONI_GENERALI = '"+condizioni_generali+"' , collo='"+condizioniCollo+"' , TESTA='"+condizioniTesta+"'"
					+ " , OCCHI='"+condizioniOcchi+"' , PINNE='"+condizioniPinne+"' , NASO='"+condizioniNaso+"' , BECCO ='"+condizioniBecco+"' , CODA='"+condizioniCoda+"' WHERE ID_CARTELLAMEDICA = '"+id+"' ;");
			
			return rowupdate;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowupdate;
		}
	}


























public ArrayList<String> listaIDCartellaMedica()
	{
		ArrayList<String> lista_id = new ArrayList<String>();
		try {
			ResultSet rs = statement.executeQuery("SELECT ID_CARTELLAMEDICA FROM CARTELLA_MEDICA ;");
			while(rs.next())
			{
				String id = rs.getString("id_cartellamedica");
				lista_id.add(id);
			}
			
			return lista_id;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return lista_id;
		}	
	}
=======
>>>>>>> d078258 Modifiche varie
}
