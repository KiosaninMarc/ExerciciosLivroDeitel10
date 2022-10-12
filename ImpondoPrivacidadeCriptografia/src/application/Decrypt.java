package application;

import java.util.Locale;
import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ALGORITMO DE DESCRIPTOGRAFIA");
		System.out.println("____________________________");
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		
		System.out.print("Digite o primeiro numero: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double n2 = sc.nextDouble();
		System.out.print("Digite o terceiro numero: ");
		double n3 = sc.nextDouble();
		System.out.print("Digite o quarto numero: ");
		double n4 = sc.nextDouble();
		
		x1 = (int) (n1 * 10 - 7);
		x2 = (int) (n2 * 10 - 7);
		x3 = (int) (n3 * 10 - 7);
		x4 = (int) (n4 * 10 - 7);
		
		System.out.println("____________________________");
		System.out.println("Descriptografia pronta");
		System.out.println(x3 + " " + x4 + " " + x1 + " " + x2);
		
		sc.close();

	}

}
