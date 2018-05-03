package com.vagas.trem.grafico;

import com.vagas.trem.instrucao.Instrucao;

public class Grafico implements Instrucao {
	
	
	private String instrucao;
	
	public Grafico(String instrucao) {
		
		this.instrucao = instrucao;
	}

	public String getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(String instrucao) {
		this.instrucao = instrucao;
	}

}
