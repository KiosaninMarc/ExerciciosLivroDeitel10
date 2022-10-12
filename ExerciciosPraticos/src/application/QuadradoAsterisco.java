package application;
/*(Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um 
quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis 
entre 1 e 20.*/
import java.util.Locale;
import java.util.Scanner;

public class QuadradoAsterisco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String space = " ";
		String asterisco = "*";
		int i = 0;

		System.out.print("Lado do quadrado: ");
		int side = sc.nextInt();

		while (i <= side) {
			System.out.print(asterisco);
			System.out.print(space);
			i++;
		}

		i = 1;
		int x = 1;
		System.out.println();
		while (x < side) {
			System.out.print(asterisco);
			while (i < side) {
				System.out.print(space);
				System.out.print(space);
				i++;
			}
			System.out.print(space);
			System.out.print(asterisco);
			System.out.println();
			x++;
			i = 1;
		}
		
		i = 0;
		while (i <= side) {
			System.out.print(asterisco);
			System.out.print(space);
			i++;
		}
		
		sc.close();
	}

}
