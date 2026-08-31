package model;

import java.util.Scanner;

public class PalindromoInvertido {
    public static void executar() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite alguma coisa para saber se é um palíndromo. ");
		String palavra = in.next();
		
		palavra = palavra.toLowerCase();
		int tamanho = palavra.length();
		String invertida = "";
		
		
		for (int i = tamanho-1; i >= 0; i--) {
			 
			invertida += palavra.charAt(i);
			
				
			}
		
		
		if (palavra.equals(invertida)) {
			
			System.out.printf("%s é um palíndromo!!!", palavra);
		
		} else {
			
			System.out.printf("%s não é um palíndromo!!!", palavra);
			
		}
		
		in.close();
	}
}
