package DTO;

import java.sql.Date;


public class Cartella_Medica_Degenza {
	private String id_cartella_degeza;
	private Date data_controllo;
	private String farmaco_somministrato;
	private int peso;
	private String valutazione_condizioni_generali;
	private String matricola_medico;
	private String id_tartaruga;
	
	public String getId_cartella_degeza() {
		return id_cartella_degeza;
	}
	public void setId_cartella_degeza(String id_cartella_degeza) {
		this.id_cartella_degeza = id_cartella_degeza;
	}
	public Date getData_controllo() {
		return data_controllo;
	}
	public void setData_controllo(Date data_controllo) {
		this.data_controllo = data_controllo;
	}
	public String getFarmaco_somministrato() {
		return farmaco_somministrato;
	}
	public void setFarmaco_somministrato(String farmaco_somministrato) {
		this.farmaco_somministrato = farmaco_somministrato;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getValutazione_condizioni_generali() {
		return valutazione_condizioni_generali;
	}
	public void setValutazione_condizioni_generali(String valutazione_condizioni_generali) {
		this.valutazione_condizioni_generali = valutazione_condizioni_generali;
	}
	public String getMatricola_medico() {
		return matricola_medico;
	}
	public void setMatricola_medico(String matricola_medico) {
		this.matricola_medico = matricola_medico;
	}
	public String getId_tartaruga() {
		return id_tartaruga;
	}
	public void setId_tartaruga(String id_tartaruga) {
		this.id_tartaruga = id_tartaruga;
	}
	

}
