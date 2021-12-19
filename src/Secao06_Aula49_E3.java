import java.util.Locale;
import java.util.Scanner;

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo
 */

public class Secao06_Aula49_E3 {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tipoCombustivel = sc.nextInt();
		
		int alcohol1 = 0;
		int Gasoline2 = 0;
		int diesel3 = 0;
		
		while (tipoCombustivel != 4) {
			switch (tipoCombustivel) {
			case 1:
				alcohol1 += 1;
				break;
			case 2:
				Gasoline2 += 1;
				break;
			case 3:
				diesel3 += 1;
				break;
			}
			
			tipoCombustivel = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcohol1);
		System.out.println("Gasolina: " + Gasoline2);
		System.out.println("Diesel: " + diesel3);
		
		sc.close();
	}

}
