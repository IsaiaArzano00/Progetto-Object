package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Connessione {
    private static Connection connection;
    private static Connessione istanza;
    private Statement statement = null;
    private PreparedStatement prpdstmt;

    private Connessione() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException var4) {
            System.err.println(var4);
        }

        try {
            String url = "jdbc:postgresql://localhost:5433/postgres";
            connection = DriverManager.getConnection(url, "postgres", "1234");
        } catch (SQLException var3) {
            var3.printStackTrace();
            System.out.println("Errore in fase di connessione");
        }

        try {
            this.statement = connection.createStatement();
            System.out.println("Connessione OK!");
        } catch (SQLException var2) {
            var2.printStackTrace();
        }

    }

    public static Connessione getConnessione() {
        if (istanza == null) {
            istanza = new Connessione();
        }

        return istanza;
    }

    public Statement getStatement() {
        return this.statement;
    }

    public Connection getConnection() {
        return connection;
    }
}