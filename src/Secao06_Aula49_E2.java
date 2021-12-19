import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

public class Secao06_Aula49_E2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor de y: ");
		int y = sc.nextInt();
		
		String quandrante = null;
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				quandrante = "Primeiro";
			} else if (x < 0 && y < 0){
				quandrante = "Terceiro";
			} else if (y < 0) {
				quandrante = "Quarto";
			} else {
				quandrante = "Segundo";
			}
			
			System.out.println();
			System.out.println(quandrante);
			System.out.println();

			
			System.out.println("------------------------------");
			System.out.print("Digite novamente o valor de x: ");
			x = sc.nextInt();
			System.out.print("Digite novamente o valor de y: ");
			y = sc.nextInt();			
		}
		
		
		
		sc.close();
	}

}
