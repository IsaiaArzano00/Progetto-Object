package DTO;

import java.sql.Date;

public class Ricercatore {



	private String Matricola_Ricercatore;
	private String Nome;
	private String Cognome;
	private String Residenza;
	private String Codice_Fiscale;
	private Date Data_Inizio_Lavoro ;
	private Date Data_Fine_Lavoro;
	private int Compenso;
	private String Sede;
	



public Ricercatore() {
	
}
public Ricercatore(String nome, String cognome) {
	super();
	Nome = nome;
	Cognome = cognome;
}


public String getMatricola_Ricercatore() {
	return Matricola_Ricercatore;
}


public void setMatricola_Ricercatore(String matricola_ricercatore) {
	Matricola_Ricercatore = matricola_ricercatore;
}


public String getNome() {
	return Nome;
}


public void setNome(String nome) {
	Nome = nome;
}


public String getCognome() {
	return Cognome;
}


public void setCognome(String cognome) {
	Cognome = cognome;
}


public String getResidenza() {
	return Residenza;
}


public void setResidenza(String residenza) {
	Residenza = residenza;
}


public String getCodice_Fiscale() {
	return Codice_Fiscale;
}


public void setCodice_Fiscale(String codice_Fiscale) {
	Codice_Fiscale = codice_Fiscale;
}


public Date getData_Inizio_Lavoro() {
	return Data_Inizio_Lavoro;
}


public void setData_Inizio_Lavoro(Date data_Inizio_Lavoro) {
	Data_Inizio_Lavoro = data_Inizio_Lavoro;
}


public Date getData_Fine_Lavoro() {
	return Data_Fine_Lavoro;
}


public void setData_Fine_Lavoro(Date data_Fine_Lavoro) {
	Data_Fine_Lavoro = data_Fine_Lavoro;
}


public int getCompenso() {
	return Compenso;
}


public void setCompenso(int compenso) {
	Compenso = compenso;
}


public String getSede() {
	return Sede;
}


public void setSede(String sede) {
	Sede = sede;
}




}
