import java.util.Locale;
import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.
 */

public class Secao05_Aula37_E3 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int A;
		int B;
		
		
		if (valor1 > valor2) {
			A = valor1;
			B = valor2;
		} else {
			A = valor2;
			B = valor1;
		}
		
		int divisao = A / B;
		
		if (B * divisao == A) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}
				
		sc.close();
	}

}
