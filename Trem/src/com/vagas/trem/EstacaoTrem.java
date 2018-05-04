package com.vagas.trem;

import java.util.ArrayList;
import java.util.List;

import com.vagas.trem.instrucao.Instrucao;
import com.vagas.trem.instrucao.InstrucaoImpl;
import com.vagas.trem.util.Arquivo;

public class EstacaoTrem {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Arquivo arquivo = new Arquivo();
		
		List<String> linhas = new ArrayList<String>(arquivo.getComandos()) ;
		InstrucaoImpl instrucoes = new InstrucaoImpl(linhas);
		
		List<Instrucao> comandos = instrucoes.getInstrucoes();
	
		for(Instrucao comando : comandos) {
			
			comando.processarInstrucao();

		}

	}

}
