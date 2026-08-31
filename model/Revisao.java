package model;

import java.util.Scanner;

public class Revisao {
	
	public static void executar() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quantos números serão somados: ");
		int quantidade = in.nextInt();
		int soma = 0;
	
		int[] valores = new int[quantidade];

		/*Receber valores de entrada */
		for (int i = 0; i < valores.length; i++) {

			System.out.print("Digite os números: ");
			valores[i] = in.nextInt();

		}

		/*Laço para somar os valores sem percorrer o array*/
		for (int i = 0; i < quantidade; i++) {

			soma += valores[i];
		}

		System.out.printf("A soma é %d.\n\n", soma);
		
		int adicao = 0;
		int menor = valores[0];
		int maior = valores[0];

		/*Laço para somar, menor e maior percorrendo o array */
		for (int i = 0; i < valores.length; i++) {

			adicao += valores[i];

			if (menor > valores[i]) {

				menor = valores[i];
				
			}

			if (maior < valores[i]) {

				maior = valores[i];
				
			}
		}

		double media = (double) adicao / quantidade;

		System.out.printf("A soma é %d.\n", adicao);
		System.out.printf("O menor valor digitado é %d.\n", menor);
		System.out.printf("O maior valor digitado é %d.\n", maior);
		System.out.printf("A média é %.2f.\n", media);

		/*Laço para verificar se os números da lista são primos */		
		boolean primo = true;

		String primos = "";
		String naoPrimos = "";

		for (int i = 0; i < valores.length; i++) {

			primo = true;

			if (valores[i] <= 1) {

				naoPrimos += valores[i] + " ";

			} else if (valores[i] == 2) {

				primos += valores[i] + " ";

			} else {

				double raiz = Math.sqrt(valores[i]);

				for (int j = 3; j <= raiz; j+=2) {
					if (valores[i] % j == 0) {
						primo = false;
						break;

					}			
				}
				
				if (primo){

						primos += valores[i] + " ";
							
				} else {

					naoPrimos += valores[i] + " ";

				}
			}

		}

		System.out.printf("Os números primos são: %s\n", primos);

		System.out.printf("Os números que não são primos: %s\n", naoPrimos);

		/*Laço para fatorial de cada número da lista */
		for (int i = 0; i < valores.length; i++) {
			
			int fat = 1;
			
			for(int j = valores[i]; j >= 1; j--) {

				fat *= j;
			
			}
			
			System.out.printf("%d! = %d.\n", valores[i], fat);
		}

		/*Laço para saber se número digitado é palíndromo */
		int tamanho = valores.length;
		for (int i = 0; i < tamanho; i++) {

			String numeros = String.valueOf(valores[i]);
			int ultimoIndice = numeros.length()-1;

			String invertida = "";
		
		
			for (int j = ultimoIndice; j >= 0; j--) {
			 
				invertida += numeros.charAt(j);
			
				
				}
		
		
			if (numeros.equals(invertida)) {
			
				System.out.printf("%s é um palíndromo!!!\n", numeros);
		
			} else {
			
				System.out.printf("%s não é um palíndromo!!!\n", numeros);
			
			}

		}

		in.close();
	}

}
