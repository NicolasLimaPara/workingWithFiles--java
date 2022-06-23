package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		
		File file = new File ("c:\\temp\\testFiles.txt");
		// aqui foi instanciado um objeto do tipo File. Esse objeto vai encapsular todo o precesso de acessar o arquivo e tbm o caminho desse arquivo.
		Scanner sc =  null;
		
		// a abertura do arquivo deve ser feita dentro de um bloco try { pois na hora de abrir o arquivo pode ser gerada uma excecao do tipo IOExeption (Exception) --> precisa ser tratada.
		try  {
			sc = new Scanner(file);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc!=null) { 
				sc.close();
			}
			
		}

	}

}
