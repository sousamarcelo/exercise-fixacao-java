import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
 */

public class Secao05_Aula37_E1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		if (valor < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}

}
