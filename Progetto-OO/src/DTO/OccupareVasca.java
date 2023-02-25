package DTO;

import java.sql.Date;

public class OccupareVasca {
	private String matricola_operatore;
	private String codice_vasca;
	private Date data_versamento_cibo;
	private String tipologia_cibo_inserito;
	private double quantita_cibo_inserito;
	private double quantita_cibo_rimosso;
	public String getMatricola_operatore() {
		return matricola_operatore;
	}
	public void setMatricola_operatore(String matricola_operatore) {
		this.matricola_operatore = matricola_operatore;
	}
	public String getCodice_vasca() {
		return codice_vasca;
	}
	public void setCodice_vasca(String codice_vasca) {
		this.codice_vasca = codice_vasca;
	}
	public Date getData_versamento_cibo() {
		return data_versamento_cibo;
	}
	public void setData_versamento_cibo(Date data_versamento_cibo) {
		this.data_versamento_cibo = data_versamento_cibo;
	}
	public String getTipologia_cibo_inserito() {
		return tipologia_cibo_inserito;
	}
	public void setTipologia_cibo_inserito(String tipologia_cibo_inserito) {
		this.tipologia_cibo_inserito = tipologia_cibo_inserito;
	}
	public double getQuantita_cibo_inserito() {
		return quantita_cibo_inserito;
	}
	public void setQuantita_cibo_inserito(double quantita_cibo_inserito) {
		this.quantita_cibo_inserito = quantita_cibo_inserito;
	}
	public double getQuantita_cibo_rimosso() {
		return quantita_cibo_rimosso;
	}
	public void setQuantita_cibo_rimosso(double quantita_cibo_rimosso) {
		this.quantita_cibo_rimosso = quantita_cibo_rimosso;
	}
	
	

}
