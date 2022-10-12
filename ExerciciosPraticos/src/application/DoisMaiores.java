package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoisMaiores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		
		int counter = 0;
		int largest = 0;
		int largestTwo = 0;
		int i = 1;
		
		while (counter < 10) {
			System.out.print("Digite o "+i+"º numero: ");
			int number = sc.nextInt();		
			counter++;
			i++;
			list.add(number);
		}
		
		System.out.println("========================");
		for (Integer nu : list) {
			System.out.print(nu + " ");
			if (nu > largest) {
				largest = nu;
			}
		}
		
		for (Integer nu2 : list) {
			if (nu2 > largestTwo && nu2 < largest) {
				largestTwo = nu2;
			}
		}
		
		System.out.println();
		System.out.println("==========================");
		System.out.println("Maior numero digitado: " + largest);
		System.out.println("Segundo maior numero digitado: " + largestTwo);
		
		sc.close();
	}

}
