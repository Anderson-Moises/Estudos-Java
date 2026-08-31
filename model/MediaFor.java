package model;
import java.util.Scanner;

public class MediaFor {
    public static void executar() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quantos valores deseja informar? ");
		int quantidade = in.nextInt();
		
		if (quantidade <= 0) {
		    System.out.println("É necessário informar pelo menos um valor.");
		    in.close();
		    return;
		}
		
		double[] valores = new double[quantidade];
		
		for (int i = 0; i < valores.length; i++ ) {
			
			System.out.printf("Digite o %dº valor para calcular a média: ", i+1);
            valores[i] = in.nextDouble();
			
		}
		
		
		
		double soma = 0;
		
		for (int i = 0; i < valores.length; i++) {
			
			soma += valores[i];
		}
		
		double media = soma / valores.length;
		
		System.out.printf("A média dos valores informados é: %.2f", media);
		
		in.close();
	}

}
