package ClassiDiServizio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import connection.Connessione;

public class EsecutoreFunzioniDBMS {
	
	private static Connessione connection;
    private static CallableStatement cstmt;
    private static Statement statement;
    private static ResultSet rs;

    public EsecutoreFunzioniDBMS() {
    	connection = Connessione.getConnessione();
		statement = connection.getStatement();
    }

  
    
    public int eseguiFunzioneTartarugheAccolte(int Anno){
    	int result = 0;
    	 try {

             //Create a callable statement
             cstmt = connection.prepareCall("{ ? = call number_turtle_accolte_all_year(?) }");

             //Register the OUT parameter
             cstmt.registerOutParameter(1, Types.INTEGER);

             //Set the input parameter
             cstmt.setInt(2, Anno);

             //Execute the statement
             cstmt.execute();

             //Get the result
             result = cstmt.getInt(1);
             System.out.println("Result: " + result);
     
         } catch (SQLException e) {
             e.printStackTrace();
    }
		return result;
   }

	
    
    public int eseguiFunzioneTartarugheRilasciate(int Anno){
    	int result = 0;
    	 try {
             //Create a callable statement
             cstmt = connection.prepareCall("{ ? = call numero_tartarughe_rilasciate_all_year(?) }");

             //Register the OUT parameter
             cstmt.registerOutParameter(1, Types.INTEGER);

             //Set the input parameter
             cstmt.setInt(2, Anno);

             //Execute the statement
             cstmt.execute();

             //Get the result
             result = cstmt.getInt(1);
             System.out.println("Result: " + result);
     
         } catch (SQLException e) {
             e.printStackTrace();
    }
		return result;
   } 
    
    
    public int eseguiFunzioneTartarugheMorte(int Anno){
    	int result = 0;
    	 try {
             //Create a callable statement
             cstmt = connection.prepareCall("{ ? = call numero_tartarughe_morte_all_year(?) }");

             //Register the OUT parameter
             cstmt.registerOutParameter(1, Types.INTEGER);

             //Set the input parameter
             cstmt.setInt(2, Anno);

             //Execute the statement
             cstmt.execute();

             //Get the result
             result = cstmt.getInt(1);
             System.out.println("Result: " + result);
     
         } catch (SQLException e) {
             e.printStackTrace();
    }
		return result;
   } 
    
}
