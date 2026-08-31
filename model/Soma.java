package model;
import java.util.Scanner;
public class Soma {
    public static void executar() {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = in.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = in.nextInt();

        int res = a + b;
        System.out.println("A soma é: " + res);

        in.close();
    }
}
