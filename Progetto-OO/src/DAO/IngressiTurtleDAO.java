package DAO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.IngressiTurtle;
import connection.Connessione;

public class IngressiTurtleDAO {
	private Connessione connection ;
	private Statement statement ;
	private ResultSet ResultSet ;
	
	public IngressiTurtleDAO() {
		connection = Connessione.getConnessione();
		statement = connection.getStatement();
	}
	
	//ELENCO INGRESSI TARTARUGHE IN UN CENTRO
		public ArrayList<IngressiTurtle> ingressiTurtle(String id_turtle)
		{
			ArrayList<IngressiTurtle> date_ingr = new ArrayList<IngressiTurtle>();
			try {
				ResultSet rs = statement.executeQuery("SELECT * FROM ingresso_turtle_con_condizioni_1('"+id_turtle+"' ) order by date_col ;");
				while(rs.next())
				{
					IngressiTurtle ingresso = new IngressiTurtle();
					ingresso.setData(rs.getDate(1));
					ingresso.setCondizioni(rs.getString(2));
					date_ingr.add(ingresso);
				}
				
				return date_ingr;
				
			}catch(SQLException e)
			{
				e.printStackTrace();
				return date_ingr;
			}
		}

}
