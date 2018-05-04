package com.vagas.trem.rotas;

public class RoteiroBorda {

	private String inicio;
	private String fim;
	private int peso;
	
	public RoteiroBorda(String inicio, String fim, int peso) {
		this.inicio = inicio;
		this.fim = fim;
		this.peso = peso;
	}
	
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getFim() {
		return fim;
	}
	public void setFim(String fim) {
		this.fim = fim;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
