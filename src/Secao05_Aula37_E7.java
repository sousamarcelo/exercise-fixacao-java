import java.util.Locale;
import java.util.Scanner;

/*
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
 */

public class Secao05_Aula37_E7 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		double x = sc.nextDouble();
		System.out.print("Digite o valor de y: ");
		double y = sc.nextDouble();
		
		String saida = null;
		
		if (x > 0 && y > 0) {
			saida = "Q1";
		} else if (x < 0 && y < 0) {
			saida = "Q3";
		} else if (x < 0 && y > 0) {
			saida = "Q2";
		} else if (x > 0 && y < 0) {
			saida = "Q4";
		} else if (x == 0 && y ==0) {
			saida = "Origem";
		} else if (x == 0) {
			saida = "Eixo y";
		} else {
			saida = "Eixo x";
		}
		
		System.out.println(saida);
		    
		sc.close();
	}

}
