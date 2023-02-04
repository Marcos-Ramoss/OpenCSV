package com.banco.opencsvapplication;

import java.io.File;
import java.io.FileWriter;
import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpencsvapplicationApplication {
	
	private static final String CSV_PATH = "/tmp/ generatedCsv.csv"; 

	public static void main(String[] args) {
		try { 	
		System.out.println(" iniciando CSV ");
		
		FileWriter fw = new FileWriter(new File(CSV_PATH));	
		CSVWriter cw = new CSVWriter(fw);
		String[] headers = {"nome" , "email", "telefone"};  
		
		List<String[]> data = new ArrayList<String[]>();
		String[] item1 = { "Marcos", "Contato@marcosRamos.com", "3345 - 1338"};	
		String[] item2 = { "Jhon", 	"Contato@jhonFreiras.com", "3345 - 4547"};
		String[] item3 = { "João", 	"Contato@JoãoRamos.com", "3345 - 1245"};
		
		data.add(headers);
		data.add(item1);
		data.add(item2);
		data.add(item3);
		
		cw.writeAll(data);
		
		cw.close();
		fw.close();
		
		
		System.out.println("");
		}
		
		
		catch(Exception e) {
			e.printStackTrace(); 
		}
		
	
	
}
}