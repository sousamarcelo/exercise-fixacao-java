import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 */

public class Sec�o05_Aula37_E2 {
	
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
