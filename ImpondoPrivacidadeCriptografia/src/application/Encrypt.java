package application;

import java.util.Locale;
import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ALGORITMO DE CRIPTOGRAFIA");
		System.out.println("_________________________");
		
		double x1 = 0;
		double x2 = 0;
		double x3 = 0;
		double x4 = 0;
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int n3 = sc.nextInt();
		System.out.print("Digite o quarto numero: ");
		int n4 = sc.nextInt();
		
		x1 = (double) (n1 + 7) / 10;
		x2 = (double) (n2 + 7) / 10;
		x3 = (double) (n3 + 7) / 10;
		x4 = (double) (n4 + 7) / 10;
		
		System.out.println("____________________________");
		System.out.println("Numeros Criptografados");
		System.out.println(String.format("%.1f", x3) 
				+ String.format(" %.1f", x4) 
				+ String.format(" %.1f", x1) 
				+ String.format(" %.1f", x2));
		
		sc.close();
	}
}
