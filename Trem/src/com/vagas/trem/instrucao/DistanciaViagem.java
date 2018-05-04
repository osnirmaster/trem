package com.vagas.trem.instrucao;

import com.vagas.trem.grafico.Grafico;

public class DistanciaViagem implements Instrucao{
	
	private String instrucao;
	
	public DistanciaViagem(String instrucao) {
		
		this.instrucao = instrucao;
	}

	public void processarInstrucao() {
		// TODO Auto-generated method stub
		
		System.out.println("Linha: " + instrucao);	
		
	}

}
