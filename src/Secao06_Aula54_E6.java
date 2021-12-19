import java.util.Locale;
import java.util.Scanner;

/*
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
Exemplos:
Entrada:
 */
public class Secao06_Aula54_E6 {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double faturial = 1;
		for(int i = 1; i <= N; i++) {			
			faturial *= i;
			
		}
		
		System.out.println(faturial);
		
		sc.close();
	}

}
