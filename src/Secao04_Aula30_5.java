import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
*/

public class Secao04_Aula30_5 {
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int codigoPe�a1 = sc.nextInt();
		int quantidadePeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		
		int codigoPe�a2 = sc.nextInt();
		int quantidadePeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorTotal = quantidadePeca1*valorUnitarioPeca1 + quantidadePeca2*valorUnitarioPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
		
	}

}
