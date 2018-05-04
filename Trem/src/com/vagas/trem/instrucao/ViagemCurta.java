package com.vagas.trem.instrucao;

public class ViagemCurta implements Instrucao {
	
	
	private String instrucao;
	
	public ViagemCurta(String instrucao) {
		
		this.instrucao = instrucao;
	}

	@Override
	public void processarInstrucao() {
		// TODO Auto-generated method stub
		System.out.println("Linha: " + instrucao);
	}

}
