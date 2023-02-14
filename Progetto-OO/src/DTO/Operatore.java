package DTO;

import java.sql.Date;

public class Operatore {



	private String Matricola_Ope;
	private String Nome;
	private String Cognome;
	private String Residenza;
	private String Codice_Fiscale;
	private Date Data_Inizio_Lavoro ;
	private Date Data_Fine_Lavoro;
	private int Compenso;
	private String Sede;
	



public Operatore() {
	
}
public Operatore(String nome, String cognome) {
	super();
	Nome = nome;
	Cognome = cognome;
}


public String getMatricola_Ope() {
	return Matricola_Ope;
}


public void setMatricola_Ope(String matricola_Ope) {
	Matricola_Ope = matricola_Ope;
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

public String toString()
{
	return this.Matricola_Ope+"   "+this.Nome + "   " +  this.Cognome +"   "+this.Codice_Fiscale+"    "+this.Residenza+"   "+this.Data_Inizio_Lavoro;
}


}
