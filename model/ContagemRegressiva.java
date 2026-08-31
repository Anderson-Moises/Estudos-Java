package model;

import java.util.Scanner;

public class ContagemRegressiva {

    public static void executar() {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor para iniciar a contagem regressiva: ");
        int contagem = in.nextInt();

        System.out.print("Digite um valor para finalizar a contagem regressiva: ");
        int regressiva = in.nextInt();

        System.out.print("\nA contagem regressiva é:\n");

        for(int i = contagem; i >= regressiva; i-- ) {

            System.out.printf("%d\n", i);
        }

        System.out.println("Fim da contagem!!!");

        in.close();
    }
}
