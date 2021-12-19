import java.util.Locale;
import java.util.Scanner;

//obs: esse do professor já processa a media junto com cada valor de entrada. o meu atende melhor o exercicio proposto, por primeiro pegar todos os valores de entrada e depois realiza os calculos e madia

public class Secao06_Aula54_E3_V2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}
}
