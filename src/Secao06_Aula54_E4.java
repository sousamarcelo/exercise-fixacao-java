import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

public class Secao06_Aula54_E4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			if (valor2 == 0) {
				System.out.println("Divis�o impossivel!");
			} else {
				System.out.println(valor1 / valor2);
			}
			
		}
		
		sc.close();
	}

}
