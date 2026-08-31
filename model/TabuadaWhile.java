package model;

import java.util.Scanner;

public class TabuadaWhile {
    public static void executar() {
		
	Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
	System.out.print("Digite um valor para realização da multiplicação: ");	
		
	System.out.printf("\nA multiplicação de %d é:\n", x);
		int i = 0;
		
		while (i <= 10) {
			
			int res = i;
			System.out.printf("%d x %d = %d", x, i, res);
		
		i++;
		}
		
		in.close();
	}
}
