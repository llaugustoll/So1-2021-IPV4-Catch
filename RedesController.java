package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class RedesController {
	public RedesController(){
		super();
	}
	
	public String Sistema() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void Processos(String a , String b , String l ,String process, String processl) {
		String arry[] = new String[20];
		HashMap<Integer, String> lines = new HashMap<Integer, String>();
		int lineNumber = 0 ; 
		if(b.intern() == a) {
			try {
				Process p = Runtime.getRuntime().exec(process);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer  = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					System.out.println(linha);
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		if (b.intern() == l){
			
			try {
				Process p = Runtime.getRuntime().exec(processl);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer  = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					lines.put(lineNumber,linha);
					lineNumber++;
					if (linha.contains("inet")== true && !linha.contains("inet6")== true) {
						System.out.println(lines.get(lineNumber-2));	
						System.out.println(linha);					
						}
					linha = buffer.readLine();
				}
				
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}