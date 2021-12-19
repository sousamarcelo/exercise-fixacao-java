import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

public class Secão05_Aula37_E2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		
	}

}
