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

    public int InserisciDonazione(Donazione don) {
        int rowinsert = 0;

        try {
            ResultSet rs = this.statement.executeQuery("SELECT C.ID_CENTRO FROM CENTRO  AS C WHERE C.NOME LIKE '" + don.getIdCentro() + "'  ;");
            new String();
            rs.next();
            String id_centro = rs.getString("id_centro");
            rowinsert = this.statement.executeUpdate("INSERT INTO DONAZIONE (importo_donazione, email_donatore, data_donazione, metodo_pagamento, id_centro) VALUES (" + don.getimportoDonazione() + ", '" + don.getEmailDonatore() + "', '"+don.getDataDonazione()+"' , '" + don.getMetodoPagamento() + "' ,'" + id_centro + "');");
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

    public int rimuoviDonazione(String idDonazione) {
    	int rowdelete=0;
        try {
            rowdelete=statement.executeUpdate("DELETE FROM DONAZIONE AS D WHERE D.id_donazione LIKE '" + idDonazione + "';"); 
            return rowdelete;
            }
         catch (SQLException var3) {
            var3.printStackTrace();
            return rowdelete;
        }
    }

    public int modificaDonazione(Donazione don) {
    	int rowupdate =0;
        try {
            rowupdate=statement.executeUpdate("UPDATE DONAZIONE SET importo_donazione = " +don.getimportoDonazione()+ ", email_donatore = '" +don.getEmailDonatore()+ "' , data_donazione = '" +don.getDataDonazione()+ "' , metodo_pagamento = '" +don.getMetodoPagamento()+ "' WHERE id_donazione = '" +don.getIdDonazione()+ "';");
         
            return rowupdate;
        } catch (SQLException var7) {
            var7.printStackTrace();
            return rowupdate;
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
