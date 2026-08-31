package model;

import java.util.Scanner;

public class NumerosPrimosRaiz {
    public static void executar() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número para saber se ele é primo: ");
		int numero = in.nextInt();
		int raiz = (int) Math.sqrt(numero);
		boolean primo = true;
		int i = 3;
		
		if (numero <= 1) {
			
		
			System.out.printf("O número %d não é primo!!!", numero);
			
		} else if (numero == 2){
			
			System.out.printf("O número %d é primo!!!", numero);
			
		} else if (numero % 2 == 0) {
			
			System.out.printf("O número %d não é primo!!!", numero);
			
		} else {
		
			
			for (; i <= raiz; i+=2) {
				
				
				if (numero % i ==0) {
					
					primo = false;
					break;
					
				}
				
			}
			
				
				if (primo) {
					
					System.out.printf("O número %d é primo!!!", numero);
					
				} else {
					
					System.out.printf("O número %d não é primo!!!", numero);
				}
			
		}

		
		
		in.close();
	}
}
