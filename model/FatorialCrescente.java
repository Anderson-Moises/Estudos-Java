package model;

import java.util.Scanner;

public class FatorialCrescente {
    public static void executar() {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número para ter o valor fatorial: ");
        int n = in.nextInt();
        int fat = 1;
       
        for (int i = 1; i <= n; i++) {

            fat = fat * i;    
        
        }

        System.out.printf("O fatorial do número %d é %d.", n, fat);
      
        in.close();
    }
    
}
