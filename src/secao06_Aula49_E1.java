import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
2200
1020
2022
2002
 */

public class secao06_Aula49_E1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		int senhaPadrao = 2002;
		
		while (senha != senhaPadrao) {
			System.out.println("Senha Invalida!");
			System.out.println("-------------------------");
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
