package ead.poo.u6.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainFile {

	public static void main(String[] args) throws IOException {
		
		var arquivo = new File("./teste.txt");
		System.out.println("Tamanho (bytes): " + arquivo.length());
		System.out.println("Modificação: " + arquivo.lastModified());
		
		FileReader fr = null;
		try {
			fr = new FileReader(arquivo);
			
			int c;
			while ((c = fr.read()) != -1) {
				System.out.println(c + " -> " + (char)c);
			}
			
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		} finally {
			if (fr != null) {
				fr.close();
			}
		}
	}
}
