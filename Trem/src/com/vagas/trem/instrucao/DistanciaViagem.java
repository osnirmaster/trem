package com.vagas.trem.instrucao;

public class DistanciaViagem implements Instrucao{
	
	private String instrucao;
	
	public DistanciaViagem(String instrucao) {
		
		this.instrucao = instrucao;
	}

	@Override
	public void processarInstrucao() {
		// TODO Auto-generated method stub
		System.out.println("Linha: " + instrucao);	
		
	}

}
