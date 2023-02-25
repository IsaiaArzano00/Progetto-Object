//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package DTO;

import java.sql.Date;

public class Donazione {
    private String idDonazione;
    private int importoDonazione;
    private String emailDonatore;
    private Date dataDonazione;
    private String metodoPagamento;
    private String idCentro;

    public Donazione() {
    }

    public String getIdDonazione() {
        return this.idDonazione;
    }

    public int getimportoDonazione() {
        return this.importoDonazione;
    }

    public String getEmailDonatore() {
        return this.emailDonatore;
    }

    public Date getDataDonazione() {
        return this.dataDonazione;
    }

    public String getMetodoPagamento() {
        return this.metodoPagamento;
    }

    public String getIdCentro() {
        return this.idCentro;
    }

    public void setIdDonazione(String id) {
        this.idDonazione = id;
    }

    public void setImportoDonazione(int importo) {
        this.importoDonazione = importo;
    }

    public void setEmailDonatore(String email) {
        this.emailDonatore = email;
    }

    public void setDataDonazione(Date data) {
        this.dataDonazione = data;
    }

    public void setMetodoPagamento(String metodo) {
        this.metodoPagamento = metodo;
    }

    public void setIdCentro(String id) {
        this.idCentro = id;
    }
}
