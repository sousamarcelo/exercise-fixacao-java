import java.util.IllegalFormatCodePointException;
import java.util.Locale;
import java.util.Scanner;

/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

 */

public class Secao05_Aula37_E4 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();	
		
		int total;
		
		if (horaInicial < horaFinal) {
			total = horaFinal - horaInicial;			
		} else {
			total = (24-horaInicial) + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + total + " HORA(S)" );
		
		sc.close();
	}

}
