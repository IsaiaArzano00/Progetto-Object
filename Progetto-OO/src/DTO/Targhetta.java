package DTO;

import java.sql.Date;

public class Targhetta {
	private String numero_targhetta;
	private Date data_emissione_targhetta;
	private boolean presenza_chip_GPS;
	private String matricola_operatore;
	private String id_tartaruga;
	
	
	public String getNumero_targhetta() {
		return numero_targhetta;
	}
	public void setNumero_targhetta(String numero_targhetta) {
		this.numero_targhetta = numero_targhetta;
	}
	public Date getData_emissione_targhetta() {
		return data_emissione_targhetta;
	}
	public void setData_emissione_targhetta(Date data_emissione_targhetta) {
		this.data_emissione_targhetta = data_emissione_targhetta;
	}
	public boolean isPresenza_chip_GPS() {
		return presenza_chip_GPS;
	}
	public void setPresenza_chip_GPS(boolean presenza_chip_GPS) {
		this.presenza_chip_GPS = presenza_chip_GPS;
	}
	public String getMatricola_operatore() {
		return matricola_operatore;
	}
	public void setMatricola_operatore(String matricola_operatore) {
		this.matricola_operatore = matricola_operatore;
	}
	public String getId_tartaruga() {
		return id_tartaruga;
	}
	public void setId_tartaruga(String id_tartaruga) {
		this.id_tartaruga = id_tartaruga;
	}
	

}
