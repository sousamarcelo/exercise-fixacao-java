import java.util.Locale;
import java.util.Scanner;

/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

public class Secao06_Aula54_E2 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade?: ");
		int n = sc.nextInt();
		
		int inside = 0;
		int outside = 0;
		
		for(int i = 1; i <= n; i++) {
			
			int valor = sc.nextInt();
			
			if (valor >= 10 && valor <=20) {
				inside += 1;
			} else {
				outside += 1;
			}		
			
			
		}
		
		System.out.println(inside + " in");
		System.out.println(outside + " out");
		
		sc.close();
	}

}
