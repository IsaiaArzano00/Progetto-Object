package DTO;

import java.sql.Date;

public class Tartaruga {
	private String id_tartaruga;
	private String nome;
	private int eta;
	private String old_number_targhetta;
	private Date data_accoglienza_centro;
	private boolean eventuale_rilascio;
	private boolean eventuale_morte;
	private Date eventuale_data_rilascio;
	private Date eventuale_data_morte;
	private String ID_Sede;
	private String ID_CartellaMedica;
	private String codice_vasca;
	private String numero_targhetta;
	
	
	
	public String getId_tartaruga() {
		return id_tartaruga;
	}
	public void setId_tartaruga(String id_tartaruga) {
		this.id_tartaruga = id_tartaruga;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getOld_number_targhetta() {
		return old_number_targhetta;
	}
	public void setOld_number_targhetta(String old_number_targhetta) {
		this.old_number_targhetta = old_number_targhetta;
	}
	public Date getData_accoglienza_centro() {
		return data_accoglienza_centro;
	}
	public void setData_accoglienza_centro(Date data_accoglienza_centro) {
		this.data_accoglienza_centro = data_accoglienza_centro;
	}
	public boolean isEventuale_rilascio() {
		return eventuale_rilascio;
	}
	public void setEventuale_rilascio(boolean eventuale_rilascio) {
		this.eventuale_rilascio = eventuale_rilascio;
	}
	public boolean isEventuale_morte() {
		return eventuale_morte;
	}
	public void setEventuale_morte(boolean eventuale_morte) {
		this.eventuale_morte = eventuale_morte;
	}
	public Date getEventuale_data_rilascio() {
		return eventuale_data_rilascio;
	}
	public void setEventuale_data_rilascio(Date eventuale_data_rilascio) {
		this.eventuale_data_rilascio = eventuale_data_rilascio;
	}
	public Date getEventuale_data_morte() {
		return eventuale_data_morte;
	}
	public void setEventuale_data_morte(Date eventuale_data_morte) {
		this.eventuale_data_morte = eventuale_data_morte;
	}
	public String getID_Sede() {
		return ID_Sede;
	}
	public void setID_Sede(String iD_Sede) {
		ID_Sede = iD_Sede;
	}
	public String getID_CartellaMedica() {
		return ID_CartellaMedica;
	}
	public void setID_CartellaMedica(String iD_CartellaMedica) {
		ID_CartellaMedica = iD_CartellaMedica;
	}
	public String getCodice_vasca() {
		return codice_vasca;
	}
	public void setCodice_vasca(String codice_vasca) {
		this.codice_vasca = codice_vasca;
	}
	public String getNumero_targhetta() {
		return numero_targhetta;
	}
	public void setNumero_targhetta(String numero_targhetta) {
		this.numero_targhetta = numero_targhetta;
	}
	
	

}
