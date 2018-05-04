package com.vagas.trem.instrucao;

import java.util.ArrayList;
import java.util.List;

import com.vagas.trem.grafico.Grafico;

public class InstrucaoImpl {
	
	private List<String> comandos;
	
	public InstrucaoImpl(List<String> comandos) {
		this.comandos = comandos;
	}
	
	
	public List<Instrucao> getInstrucoes(){
		List<Instrucao>instrucoes = new ArrayList<Instrucao>();
		
		for(String comando : comandos) {
			
			Instrucao linhaInstrucao = getComandoLinhas(comando);
			
			if(linhaInstrucao != null)
				instrucoes.add((linhaInstrucao) );
		}
		
		return instrucoes;
	}
	
	
	public Instrucao getComandoLinhas(String linha) {
		
		int indice = linha.indexOf(":");
		String comando = linha.substring(0, indice);
		
		Instrucao linhaComando = null;
		
		if(comando.toUpperCase().equals("GRAFICO")) {
			linhaComando = new Grafico(linha);
		} else if(comando.toUpperCase().equals("DISTANCIA")) {
			linhaComando = new DistanciaViagem(linha);
		} else if(comando.toUpperCase().equals("ANALISE_ROTA")) {
			linhaComando = new AnaliseRota(linha);
		} else if(comando.toUpperCase().equals("VIAGEM_CURTA")) {
			linhaComando = new ViagemCurta(linha);
		}else {
            System.out.println("Comando: " + comando + " não existe");
        }

		return linhaComando;
	}
	
}
