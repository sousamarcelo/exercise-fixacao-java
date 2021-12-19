import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

public class Secao04_Aula30_5 {
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int codigoPeça1 = sc.nextInt();
		int quantidadePeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		
		int codigoPeça2 = sc.nextInt();
		int quantidadePeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorTotal = quantidadePeca1*valorUnitarioPeca1 + quantidadePeca2*valorUnitarioPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
		
	}

}
