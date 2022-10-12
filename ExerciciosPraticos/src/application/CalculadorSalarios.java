package application;
/*(Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga 
as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40 
horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu 
programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado. 
Utilize a classe Scanner para inserir os dados.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.SalariosCalculador;

public class CalculadorSalarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<SalariosCalculador> list = new ArrayList<SalariosCalculador>();
		
		Integer qtdFunc = 3;
		Integer i = 0;
		
		while (i < qtdFunc) {
			System.out.print("Nome do funcionario: ");
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int hsTb = sc.nextInt();
			System.out.print("Valor da hora: ");
			Double vlHs = sc.nextDouble();
			sc.nextLine();
			list.add(new SalariosCalculador(nome, hsTb, vlHs));
			i++;
			System.out.println("-----------------------------");
		}
		
		System.out.println("================================");
		for (SalariosCalculador dados : list) {
			System.out.println(dados);
			System.out.println("Salario sem hora extra: " + String.format("%.2f", dados.salBase()));
			System.out.println("Total de horas extras: " + dados.hrExtra());
			System.out.println("Valor de cada hora extra: " + String.format("%.2f", dados.valorExtra()));
			System.out.println("Valor total das horas extras: " + String.format("%.2f", dados.valorTotalExtra()));
			System.out.println();
			System.out.println("SALARIO BRUTO DA SEMANA: " + String.format("%.2f", dados.salBruto()));
			System.out.println("----------------------------");
		}
		
		sc.close();
	}

}
