import java.util.Locale;
import java.util.Scanner;

/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */

public class Secao06_Aula54_E3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidade = sc.nextInt();

		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;

		double mediaPonderada1 = 0;
		double mediaPonderada2 = 0;
		double mediaPonderada3 = 0;

		for (int i = 1; i <= quantidade; i++) {
			for (int j = 1; j <= 3; j++) {
				double valor = sc.nextDouble();
				if (j == 1) {
					valor1 = valor;
				} else if (j == 2) {
					valor2 = valor;
				} else {
					valor3 = valor;
				}
			}
			if (i == 1) {
				mediaPonderada1 = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / (2.0 + 3.0 + 5.0);
			} else if (i == 2) {
				mediaPonderada2 = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / (2.0 + 3.0 + 5.0);
			} else {
				mediaPonderada3 = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / (2.0 + 3.0 + 5.0);
			}
		}
		System.out.println();
		for (int i = 1; i <= quantidade; i++) {
			if (i == 1) {
				System.out.println(String.format("%.1f%n", mediaPonderada1));
			} else if (i == 2) {
				System.out.println(String.format("%.1f%n", mediaPonderada2));
			} else {
				System.out.println(String.format("%.1f%n", mediaPonderada3));
			}
		}

		sc.close();
	}

}
