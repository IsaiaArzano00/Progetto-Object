package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.Cartella_Medica;
import DTO.Cartella_Medica_Degenza;
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
	public int InserisciCartellaMedica(Cartella_Medica cartella)
	{
		int rowinsert=0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO CARTELLA_MEDICA (ID_cartellamedica  ,  Specie , Peso  ,  Lunghezza ,  Larghezza  , Luogo_ritrovamento  ,  Data_Apertura_Cartella  ,  Data_Chiusura_Cartella  , Condizioni_Generali, Testa ,  Occhi "
					+ ",  Pinne  , Naso ,  Becco ,  Collo ,  Coda ,  Matricola_Medico  ,  ID_Tartaruga)"
					+ "VALUES(DEFAULT, '"+cartella.getSpecie()+"' , "+cartella.getPeso()+" , "+cartella.getLunghezza()+" ,"+cartella.getLarghezza()+" , '"+cartella.getLuogo_ritrovamento()+"' , '"+cartella.getData_Apertura_Cartella()+"' , NULL , '"+cartella.getCondizioni_generali()+"' , '"+cartella.getCondizioni_testa()+"' , '"+cartella.getCondizioni_occhi()+"' , '"+cartella.getCondizioni_pinna()+"' , '"+cartella.getCondizioni_naso()+"' , '"+cartella.getCondizioni_becco()+"' , '"+cartella.getCondizioni_collo()+"' , '"+cartella.getCondizioni_coda()+"' , '"+cartella.getMatricola_medico()+"' , '"+cartella.getId_tartaruga()+"' );");
			
			return rowinsert;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	//LISTA ID CARTELLA MEDICA 
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
	
	//RECUPERO CARTELLA MEDICA
	public Cartella_Medica recuperaCartellaMedica(String id)
	{
		Cartella_Medica cartella = new Cartella_Medica();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM CARTELLA_MEDICA WHERE ID_TARTARUGA = '"+id+"' ;");
			while(rs.next())
			{
				cartella.setId_cartella_medica(rs.getString("id_cartellamedica"));
				cartella.setSpecie(rs.getString("specie"));
				cartella.setPeso(rs.getDouble("peso"));
				cartella.setLarghezza(rs.getDouble("larghezza"));
				cartella.setLunghezza(rs.getDouble("lunghezza"));
				cartella.setLuogo_ritrovamento(rs.getString("luogo_ritrovamento"));
				cartella.setData_Apertura_Cartella(rs.getDate("data_apertura_cartella"));
				cartella.setData_Chiusura_Cartella(rs.getDate("data_chiusura_cartella"));
				cartella.setMatricola_medico(rs.getString("matricola_medico"));
				cartella.setId_tartaruga(rs.getString("id_tartaruga"));
				cartella.setCondizioni_becco(rs.getString("becco"));
				cartella.setCondizioni_coda(rs.getString("coda"));
				cartella.setCondizioni_collo(rs.getString("collo"));
				cartella.setCondizioni_generali(rs.getString("condizioni_generali"));
				cartella.setCondizioni_naso(rs.getString("naso"));
				cartella.setCondizioni_occhi(rs.getString("occhi"));
				cartella.setCondizioni_pinna(rs.getString("pinne"));
				cartella.setCondizioni_testa(rs.getString("testa"));
			}
			
			return cartella;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return cartella;
		}
	}
	
	//UPDATE DATI CARTELLA MEDICA 
	public int ModificaDatiCartellaMedica(Cartella_Medica cartella)
	{
		int rowupdate =0;
		try {
			rowupdate=statement.executeUpdate("UPDATE CARTELLA_MEDICA SET PESO ="+cartella.getPeso()+" , LUNGHEZZA="+cartella.getLunghezza()+" , LARGHEZZA="+cartella.getLarghezza()+""
					+ " , DATA_APERTURA_CARTELLA='"+cartella.getData_Apertura_Cartella()+"' , CONDIZIONI_GENERALI = '"+cartella.getCondizioni_generali()+"' , collo='"+cartella.getCondizioni_collo()+"' , TESTA='"+cartella.getCondizioni_testa()+"'"
					+ " , OCCHI='"+cartella.getCondizioni_occhi()+"' , PINNE='"+cartella.getCondizioni_pinna()+"' , NASO='"+cartella.getCondizioni_naso()+"' , BECCO ='"+cartella.getCondizioni_becco()+"' , CODA='"+cartella.getCondizioni_coda()+"' WHERE ID_CARTELLAMEDICA = '"+cartella.getId_cartella_medica()+"' ;");
			
			return rowupdate;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowupdate;
		}
	}
	
	//DELETE CARTELLA MEDICA 
	public int EliminaCartellaMedica(String id)
	{
		int rowdelete=0;
		try {
			rowdelete=statement.executeUpdate("DELETE FROM CARTELLA_MEDICA WHERE ID_CARTELLAMEDICA='"+id+"' ;");
			return rowdelete;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowdelete;
		}
	}
	//RECUPERA ID CARTELLA MEDICA DA TARTARUGA
	public String ID_CartellaMedica(String id)
	{
		String id_med=new String();
		try {
			ResultSet rs = statement.executeQuery("SELECT ID_CARTELLAMEDICA FROM CARTELLA_MEDICA WHERE ID_TARTARUGA = '"+id+"' ;");
			while(rs.next())
			{
				id_med=rs.getString("id_cartellamedica");
			}
			
			return id_med;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return id_med;
		}
		
	}
	

}
