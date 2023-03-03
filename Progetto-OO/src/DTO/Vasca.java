package DTO;

public class Vasca {
	private String codice_vasca;
	private String nome_centro;
	private double capacita_vasca;
	private double temperatura_acqua;
	
	
	public String getCodice_vasca() {
		return codice_vasca;
	}
	public void setCodice_vasca(String codice_vasca) {
		this.codice_vasca = codice_vasca;
	}
	public double getCapacita_vasca() {
		return capacita_vasca;
	}
	public void setCapacita_vasca(double capacita_vasca) {
		this.capacita_vasca = capacita_vasca;
	}
	public double getTemperatura_acqua() {
		return temperatura_acqua;
	}
	public void setTemperatura_acqua(double temperatura_acqua) {
		this.temperatura_acqua = temperatura_acqua;
	}
	public String getNome_centro() {
		return nome_centro;
	}
	public void setNome_centro(String nome_centro) {
		this.nome_centro = nome_centro;
	}
	

}
