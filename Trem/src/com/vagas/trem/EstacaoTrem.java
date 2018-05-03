package com.vagas.trem;

import java.util.List;

import com.vagas.trem.util.Arquivo;

public class EstacaoTrem {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Arquivo arquivo = new Arquivo();
		
		List<String> comandos = arquivo.getComandos();
		
		for(String comando : comandos) {
			
			int indice = comando.indexOf(":");
			System.out.println(comando.substring(0,indice));
//			System.out.println(comando);
		}

	}

}
