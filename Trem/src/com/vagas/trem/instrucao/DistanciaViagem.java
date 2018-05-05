package com.vagas.trem.instrucao;

import java.util.ArrayList;
import java.util.List;

import com.vagas.trem.grafico.Grafico;
import com.vagas.trem.rotas.Borda;
import com.vagas.trem.rotas.RoteiroBorda;
import com.vagas.trem.util.ParNaoEncontradoException;

public class DistanciaViagem implements Instrucao{
	
	private String instrucao;
	
	public DistanciaViagem(String instrucao) {
		
		this.instrucao = instrucao;
	}

	public void processarInstrucao() {
		// TODO Auto-generated method stub
		
		int indice = instrucao.indexOf(":");
		List<String>pares = new ArrayList<String>(criarSteps(instrucao.substring(indice + 1).trim())); 
		List<RoteiroBorda> listasBordas =  Borda.getBordas();
		
		int peso = 0;
		boolean encontrou = true;
		for(String par : pares) {
			for(RoteiroBorda borda : listasBordas) {
				if(borda.getPar().equals(par)) {
					peso += borda.getPeso();
					encontrou = true;
					break;
				}else {
					encontrou = false;
				}
			}
		}	
		
		if(!encontrou) {
			System.out.println("Não foram encontradas rotas");
		}else
			System.out.println(pares + " " + peso);
		
	}
	
	
	public List criarSteps(String borda) {
		
		String[] estacao = borda.split("-");
		List<String> conjunto = new ArrayList<String>();
		
		for(int i = 0; i < estacao.length - 1; i++) {
			if(estacao[i+1] != null) {
				conjunto.add(estacao[i] + estacao[i+1]);
			}
			
		}
		
		return conjunto;
	}

}
