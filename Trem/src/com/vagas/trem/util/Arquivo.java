package com.vagas.trem.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivo {
	
	
	public List<String> getComandos(){
		
		Scanner entrada = null;
		List<String>linha = new ArrayList<String>();
		
		try {
			entrada = new Scanner( new FileInputStream("input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(entrada.hasNextLine()) {
			
			linha.add(entrada.nextLine());
		}
		
		entrada.close();
		return linha;
				
	}
	

}
