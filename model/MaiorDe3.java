package model;
import java.util.Scanner;
public class MaiorDe3 {
    public static void executar() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int primeiro = in.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int segundo = in.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int terceiro = in.nextInt();
		
		
		System.out.print("O maior número dos três valores é: ");
			
			
	
			
			
			if (primeiro>segundo && primeiro>terceiro) {
			
				System.out.println(primeiro);
		
			} else if (segundo>primeiro && segundo>terceiro){
			
				System.out.println(segundo);
			
			} else {
			
				System.out.println(terceiro);
			}
		
		
		in.close();
	}
}