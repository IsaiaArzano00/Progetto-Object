package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.Laboratorio;
import connection.Connessione;

public class LaboratorioDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public LaboratorioDAO()
	{
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}

	
	//INSERT NUOVO LABORATORIO
	public int InserisciLaboratorio(Laboratorio lab)
	{
		int rowinsert =0;
		try {
			rowinsert=statement.executeUpdate("INSERT INTO LABORATORIO VALUES(DEFAULT, '"+lab.getNumero_lab()+"' , '"+lab.getFinalita_laboratorio()+"' , '"+lab.getId_sede()+"' );");
			return rowinsert;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowinsert;
		}
	}
	
	//RECUPERO ID LABORATORIO 
	public ArrayList<String> ListaIDLab()
	{
		ArrayList<String> listaID = new ArrayList<String>();
		try {
			ResultSet rs =statement.executeQuery("SELECT ID_LABORATORIO FROM LABORATORIO ;");
			while(rs.next())
				listaID.add(rs.getString("id_laboratorio"));
			
			return listaID;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return listaID;
		}
	}
	
	//RECUPERO LABORATORIO
	public Laboratorio RecuperoLab(String id)
	{
		Laboratorio lab = new Laboratorio();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM LABORATORIO WHERE ID_LABORATORIO = '"+id+"' ;");
			while(rs.next())
			{
				lab.setId_laboratorio(rs.getString("id_laboratorio"));
				lab.setFinalita_laboratorio(rs.getString("finalita_laboratorio"));
				lab.setNumero_lab(rs.getInt("numero_lab"));
				lab.setId_sede(rs.getString("id_sede"));
			}
			return lab;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return lab;
		}
	}
	
	//DELETE LABORATORIO 
	public int EliminaLaboratorio(String id)
	{
		int rowdelete=0;
		try {
			rowdelete=statement.executeUpdate("DELETE FROM LABORATORIO WHERE ID_LABORATORIO = '"+id+"' ;");
			return rowdelete;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			return rowdelete;
		}
	}
	
	//LISTA DEI LABORATORI
	public ArrayList<Laboratorio> listaLaboratori()
	{
		ArrayList<Laboratorio> lista = new ArrayList<Laboratorio>();
		try {
			ResultSet rs = statement.executeQuery("SELECT * FROM LABORATORIO ;");
			while(rs.next())
			{
				Laboratorio lab = new Laboratorio();
				lab.setId_laboratorio(rs.getString("id_laboratorio"));
				lab.setFinalita_laboratorio(rs.getString("finalita_laboratorio"));
				lab.setNumero_lab(rs.getInt("numero_lab"));
				lab.setId_sede(rs.getString("id_sede"));
				
				lista.add(lab);
			}
			return lista;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return lista;
		}
	}
}
