package connection;

import java.sql.*;

public class Connessione {
	
	private static Connection connection;
	private static Connessione istanza ;
	private Statement statement ;
	
	
	private  Connessione ()
	{
		statement = null;
		
		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.err.println(e);
		}
		
		try {

			String url = "jdbc:postgresql://localhost:5432/ProvaPG?currentSchema=progettobdd";
			connection = DriverManager.getConnection(url, "postgres", "123");

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("Tentativo di connessione fallito");

		}

		
		try {

			statement = connection.createStatement();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	public static Connessione getConnessione() {

		if (istanza == null)
			istanza = new Connessione();

		return istanza;
	}

	public Statement getStatement() {

		return statement;
	}

}
