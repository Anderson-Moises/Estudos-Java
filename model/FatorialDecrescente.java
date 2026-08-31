package model;

import java.util.Scanner;

public class FatorialDecrescente {
    public static void executar() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o número para saber o valor fatorial: ");
		int n = in.nextInt();
		int fat = 1;
		
		for(int i = n; i >= 1; i--) {
			
			fat *= i;
		
		}
		
		System.out.printf("O número fatorial de %d é %d!", n, fat);
		
		in.close();
	}
}
