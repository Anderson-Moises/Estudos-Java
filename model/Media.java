package model;

import java.util.Scanner;

public class Media {
        public static void executar() {            
                Scanner in = new Scanner(System.in);
                
                System.out.print("Digite o primeiro valor para calcular a média: ");
                int media1 = in.nextInt();

                System.out.print("Digite o segundo valor para calcular a média: ");
                int media2 = in.nextInt();

                System.out.print("Digite o terceiro valor para calcular a média: ");
                int media3 = in.nextInt();

                int media = (media1 + media2 + media3) / 3;

                System.out.printf("A média dos três valores é %d.", media);


                in.close();
        }
    
}
