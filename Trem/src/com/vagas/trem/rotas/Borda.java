package com.vagas.trem.rotas;

import java.util.ArrayList;
import java.util.List;

import com.vagas.trem.grafico.Grafico;

public class Borda {

	private static String incio;
	private static String fim;
	private static int peso;
	private static List bordas;
	private static List<RoteiroBorda> pares;
	
	public List<RoteiroBorda> getBordas() {
		
		ArrayList<String> graficos = new ArrayList(Grafico.getGrafico()) ;
		RoteiroBorda borda = null;
		
		for(String grafico : graficos) {
			
			pares.add(new RoteiroBorda(grafico.substring(0),
							 grafico.substring(1), 
							 Integer.valueOf(grafico.substring(2))));
		}
		
		return pares;
		
	}
}
