import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

public class Secao04_Aula30_2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores de A, B, C e D: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int produto = (A*B - C*D);
		
		System.out.println("DIFERENÇA = " + produto);
		
		
		sc.close();
		
	}

}
