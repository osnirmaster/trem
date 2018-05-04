package com.vagas.trem.instrucao;

public class AnaliseRota implements Instrucao{
	
	private String instrucao;
	
	public AnaliseRota(String instrucao) {
		
		this.instrucao = instrucao;
	}


	@Override
	public void processarInstrucao() {
		// TODO Auto-generated method stub
		
		System.out.println("Linha: " + instrucao);
	}

}
