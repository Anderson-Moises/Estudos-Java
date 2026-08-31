package model;

import java.util.Scanner;

public class PalindromoFrase {
    public static void executar() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite alguma coisa para saber se é um palíndromo. ");
		String palindromo = in.nextLine();
		
		String frase = palindromo;
		frase = frase.toLowerCase();
		frase = frase.replaceAll("\\s+", "");
		int tamanho = frase.length();
		String invertida = "";
		
		
		for (int i = tamanho-1; i >= 0; i--) {
			 
			invertida += frase.charAt(i);
			
				
			}
		
		
		if (frase.equals(invertida)) {
			
			System.out.printf("%s é um palíndromo!!!", palindromo);
		
		} else {
			
			System.out.printf("%s não é um palíndromo!!!", palindromo);
			
		}
		
		in.close();
	}
}
