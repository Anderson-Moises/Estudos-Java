package model;
import java.util.Scanner;
public class ParouImpar {

    public static void executar() {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor desejado: ");
        int x = in.nextInt();

        if (x % 2 == 0) {
            System.out.printf("O valor %d é par.", x);
        } else {
            System.out.println("o valor" + " " + x + " " + "é ímpar");
        }

        in.close();
    }
}