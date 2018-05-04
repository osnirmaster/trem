package com.vagas.trem.grafico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vagas.trem.instrucao.Instrucao;

public class Grafico implements Instrucao {
	
	
	private static String instrucao;
	private static String titulo ;
	private static String[] bordas;
	
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
	
	public static List getBordas() {
		
		titulo = instrucao.substring(0, instrucao.indexOf(":")) ;
		bordas = instrucao.substring(instrucao.indexOf(":") + 1).split(",") ;
		
		List colecaoBordas = new ArrayList(Arrays.asList(bordas));
		
		return colecaoBordas;
	}


}
