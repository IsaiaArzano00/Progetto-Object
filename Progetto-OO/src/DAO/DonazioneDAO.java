//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package DAO;

import DTO.Donazione;
import connection.Connessione;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DonazioneDAO {
    private Connessione connection = Connessione.getConnessione();
    private Statement statement;
    private ResultSet ResultSet;

    public DonazioneDAO() {
        this.statement = this.connection.getStatement();
    }

    public int InserisciDonazione(int importo, String emailDonatore, String date, String metodoPagamento, String centro) {
        int rowinsert = 0;

        try {
            ResultSet rs = this.statement.executeQuery("SELECT C.ID_CENTRO FROM CENTRO  AS C WHERE C.NOME LIKE '" + centro + "'  ;");
            new String();
            rs.next();
            String id_centro = rs.getString("id_centro");
            rowinsert = this.statement.executeUpdate("INSERT INTO DONAZIONE (importo_donazione, email_donatore, data_donazione, metodo_pagamento, id_centro) VALUES (" + importo + ", '" + emailDonatore + "', '" + date + "', '" + metodoPagamento + "' ,'" + id_centro + "');");
            return rowinsert;
        } catch (SQLException var9) {
            var9.printStackTrace();
            return rowinsert;
        }
    }

    public Donazione recuperaDonazione(String idDonazione) {
        Donazione don = new Donazione();

        try {
            ResultSet rs = this.statement.executeQuery("SELECT * FROM DONAZIONE AS D WHERE D.id_donazione LIKE '" + idDonazione + "'  ;");
            rs.next();
            don.setIdDonazione(idDonazione);
            don.setImportoDonazione(rs.getInt("importo_donazione"));
            don.setEmailDonatore(rs.getString("email_donatore"));
            don.setDataDonazione(rs.getDate("data_donazione"));
            don.setMetodoPagamento(rs.getString("metodo_pagamento"));
            don.setIdCentro(rs.getString("id_centro"));
            return don;
        } catch (SQLException var4) {
            var4.printStackTrace();
            return don;
        }
    }

    public boolean rimuoviDonazione(String idDonazione) {
        try {
            if (this.statement.executeUpdate("DELETE FROM DONAZIONE AS D WHERE D.id_donazione LIKE '" + idDonazione + "';") > 0) {
            }

            return true;
        } catch (SQLException var3) {
            var3.printStackTrace();
            return false;
        }
    }

    public String modificaDonazione(String idDonazione, int importo, String email, String data, String metodoPagamento) {
        try {
            if (this.statement.executeUpdate("UPDATE DONAZIONE AS D SET importo_donazione = " + importo + ", email_donatore = '" + email + "' , data_donazione = '" + data + "' , metodo_pagamento = '" + metodoPagamento + "' WHERE D.id_donazione = '" + idDonazione + "';") > 0) {
            }

            return "modifica riuscita";
        } catch (SQLException var7) {
            var7.printStackTrace();
            return var7.getErrorCode() == 1 ? "email non valida!" : var7.getLocalizedMessage();
        }
    }

    public ArrayList<String> getIdDonazioni() {
        ArrayList<String> idDonazioni = new ArrayList();

        try {
            ResultSet rs = this.statement.executeQuery("SELECT id_donazione FROM DONAZIONE;");

            while(rs.next()) {
                new String();
                String id = rs.getString("id_donazione");
                idDonazioni.add(id);
            }

            return idDonazioni;
        } catch (SQLException var4) {
            var4.printStackTrace();
            return idDonazioni;
        }
    }

    public ArrayList<Donazione> getDonazioni() {
        ArrayList<Donazione> Donazioni = new ArrayList();

        try {
            ResultSet rs = this.statement.executeQuery("SELECT * FROM DONAZIONE;");

            while(rs.next()) {
                Donazione don = new Donazione();
                don.setIdDonazione(rs.getString("id_donazione"));
                don.setImportoDonazione(rs.getInt("importo_donazione"));
                don.setEmailDonatore(rs.getString("email_donatore"));
                don.setDataDonazione(rs.getDate("data_donazione"));
                don.setMetodoPagamento(rs.getString("metodo_pagamento"));
                don.setIdCentro(rs.getString("id_centro"));
                Donazioni.add(don);
            }

            return Donazioni;
        } catch (SQLException var4) {
            var4.printStackTrace();
            return Donazioni;
        }
    }
}
