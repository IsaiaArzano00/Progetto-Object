package connection;

import java.sql.*;

public class Connessione {

    private static Connection connection;
    private static Connessione istanza;
    private Statement statement;
    private PreparedStatement prpdstmt;

    private Connessione() {
        //inizializzo lo statement
        statement = null;

        try {
            //carico i driver per la connessione al db
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.err.println(e);
        }

        try {
            // provo ad effettuare la connessione
            String url = "jdbc:postgresql://localhost:5433/postgres";
            connection = DriverManager.getConnection(url, "postgres", "1234");

        } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("Errore in fase di connessione");

        }

        try {
            //se la connessione è andata a buon fine istanzio lo statement
            statement = connection.createStatement();
            System.out.println("Connessione OK!");

        } catch (SQLException e) {

            e.printStackTrace();
        }
        
       
    }
    //metodo per ritornare la connessione ottenuta
    public static Connessione getConnessione() {

        if (istanza == null)
            istanza = new Connessione();

        return istanza;
    }
    //ritorno lo statement istanziato
    public Statement getStatement() {

        return statement;
    }

    public Connection getConnection(){
        return connection;
    }

}
