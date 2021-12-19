import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */
public class Secao06_Aula54_E7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (int )Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}
		sc.close();
	}

}
