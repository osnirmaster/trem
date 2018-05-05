package com.vagas.trem.rotas;

public class RoteiroBorda {

	private String inicio;
	private String fim;
	private String par;
	private int peso;
	
	public RoteiroBorda(String inicio, String fim, int peso) {
		this.inicio = inicio;
		this.fim = fim;
		this.peso = peso;
		this.par = inicio + fim;
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
	
	public String getPar() {
		return par;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((par == null) ? 0 : par.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoteiroBorda other = (RoteiroBorda) obj;
		if (par == null) {
			if (other.par != null)
				return false;
		} else if (!par.equals(other.par))
			return false;
		return true;
	}
	
	
	
	
}
