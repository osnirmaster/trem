package com.vagas.trem.rotas;

import java.util.ArrayList;
import java.util.List;

import com.vagas.trem.grafico.Grafico;
import com.vagas.trem.instrucao.Instrucao;

public class Borda {

	private static String incio;
	private static String fim;
	private static int peso;
	private static List bordas;
//	private static List<RoteiroBorda> pares;
	
	public static List<RoteiroBorda> getBordas() {
		
		ArrayList<String> graficos = new ArrayList(Grafico.getGrafico()) ;
		List<RoteiroBorda>pares = new ArrayList<RoteiroBorda>();
		
		for(String grafico : graficos) {
	
			RoteiroBorda roteiro = new RoteiroBorda(grafico.substring(0,1),
					   									grafico.substring(1,2), 
					   									Integer.valueOf(grafico.substring(2,3)));
			if(roteiro != null)		
				pares.add(roteiro);
		}		
		return pares;
		
	}
}
