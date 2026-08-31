package model;
import java.util.Scanner;
public class TabuadaFor {
    
    public static void executar() {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor para a tabuada: ");
        int tab = in.nextInt();

        System.out.println("\nA tabuada de" + " " + tab + " " + "é: \n");

        for(int i = 0; i <= 10; i++ ) {

            int res = tab * i;
            System.out.printf("%d x %d = %d%n", tab, i, res);
        }

        in.close();
    }
}
