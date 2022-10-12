package application;

import java.util.Scanner;

/*(Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. Por 
exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em 
um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de 
erro e permita que o usuário insira um novo valor.*/
public class Palindromos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma sequencia de 5 numeros inteiros: ");
		int n = sc.nextInt();
		
		int num = n;
		String s = Integer.toString(num);
		System.out.println(s.length() + " digitos");
		System.out.println("______________________________________________");
		
		while (s.length() != 5) {
			System.out.print("Digite uma sequencia de 5 numeros inteiros: ");
			n = sc.nextInt();
			num = n;
			s = Integer.toString(num);
			System.out.println(s.length() + " digitos");
			System.out.println("______________________________________________");
		}
		
        int orig = n;     
        int r = 0;

        while (n > 0)
        {
            int d = n % 10; //Captura cada dígito

            r = r * 10 + d; 
            // (^) Adiciona o dígito na variável 'r'.
            // Como usamos a base 10, tudo o que já existe 
            // em r precisa ser mulplicado por 10

            n = n / 10;
            // Controla o loop
        }

        System.out.println(orig == r ? "É Palindromo" : "Não é Palindromo");
		
		sc.close();
	}

}
