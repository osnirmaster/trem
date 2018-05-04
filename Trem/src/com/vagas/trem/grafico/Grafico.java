package com.vagas.trem.grafico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vagas.trem.instrucao.Instrucao;

public class Grafico implements Instrucao {
	
	
	private static String instrucao;
	private static String titulo ;
	private static String[] grafico;
	
	public Grafico(String instrucao) {
		
		this.instrucao = instrucao;
	}

	public String getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(String instrucao) {
		this.instrucao = instrucao;
	}
	
	public void processarInstrucao() {
		
		System.out.println(instrucao);
	}
	
	public static List<String> getGrafico() {
		
		titulo = instrucao.substring(0, instrucao.indexOf(":")) ;
		grafico = instrucao.substring(instrucao.indexOf(":") + 1).replaceAll(" ", "").trim().split(",") ;
		
		List<String> bordas = new ArrayList<String>();
		
		for(int i = 0; i <= grafico.length; i++) {
			
			bordas.add(grafico[i].toString());
		}
		
		List colecaoBordas = new ArrayList(bordas);
		
		return colecaoBordas;
	}


}
