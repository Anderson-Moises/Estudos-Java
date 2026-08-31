package model;

import java.util.Scanner;

public class PalindromoExtremidades {
    public static void executar() {
	    Scanner in = new Scanner(System.in);
		
	    System.out.print("Digite alguma coisa para saber se é um palíndromo. ");
	    String palavra = in.next();
		
	    boolean palindromo = true;
		
	    for (int i = 0; i < palavra.length() / 2; i++) {
			
		    char esquerda = palavra.charAt(i); 
		    char direita = palavra.charAt((palavra.length()-1)-i);
			
		    if (esquerda != direita) {
				
			palindromo = false;
			break;

		    }
			
	    }
		
		
		if (palindromo) {
			
		    System.out.printf("%s é um palíndromo!!!", palavra);
		
	    } else {
			
		    System.out.printf("%s não é um palíndromo!!!", palavra);
			
	    }


        in.close();
        
    }
}
