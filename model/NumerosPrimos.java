package model;

import java.util.Scanner;

public class NumerosPrimos {

    public static void executar() {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor para saber se ele é número primo: ");
        int numero = in.nextInt();
        boolean primo = true;
        int i = 2;
        
        if (numero <= 1) {
            System.out.printf("%d não é númmero primo!", numero);
        } else {
            for (; numero > i; i++) {
                 
                if (numero % i == 0) {
                    primo = false;
                    break;

                } 
            }
                if (primo){
                    System.out.printf("%d é número primo!", numero);
      
                    } else {
                    System.out.printf("%d não é número primo!", numero);

                    }
            }

        in.close();
    }    

}
