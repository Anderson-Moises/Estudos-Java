package model;

import java.util.Scanner;

public class AnalisePalavra {
    public static void executar() {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = in.next();

        System.out.print("A palavra digitada é: "+ texto);
        System.out.print("\nO tamanho da palavra digitada é: "+ texto.length());
        System.out.print("\nA primeira letra da palavra é: "+ texto.charAt(0));
        System.out.print("\n A última letra da palavra é: "+ texto.charAt(texto.length()-1));
        System.out.print("\n A última posição da palavra é: "+ (texto.length()-1));

        if (texto.charAt(0) == texto.charAt(texto.length()-1)) {

            System.out.print("\nPrimeira e última posição são iguais!!");
        
        } else {

            System.out.print("\nPrimeira e última posição são diferentes!!");
        }


        for (int i = texto.length()-1; i >= 0; i--) {

            char letra = texto.charAt(i);
            System.out.printf("\nPosição %d -> %c", i, letra);

        }

        in.close();
    }
}    
