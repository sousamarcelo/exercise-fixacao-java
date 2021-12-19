import java.util.Locale;
import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.

obs: vers�o do professo, mais elegante

 */

public class Secao05_Aula37_E3_V2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}
				
		sc.close();
	}

}
