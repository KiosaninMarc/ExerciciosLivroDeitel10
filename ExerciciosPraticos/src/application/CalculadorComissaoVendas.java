package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Vendas;

public class CalculadorComissaoVendas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da venda: ");
		double valor = sc.nextDouble();
		
		List<Vendas> list = new ArrayList<Vendas>();
		
		Double fixoSemanal = 200.00;
		Double soma = 0.0;
		while (valor != 0) {
			soma += valor;
			list.add(new Vendas(valor));
			System.out.print("Digite o valor da venda: ");
			valor = sc.nextDouble();
		}
		
		System.out.println("=============================");
		int i = 1;
		for (Vendas v : list) {
			System.out.println("Valor da "+ i + "ª venda" + v.toString());
			i++;
		}
		
		System.out.println("=============================");
		double comissao = soma * 0.09;
		double totalReceber = comissao + fixoSemanal;
		System.out.println("Valor total das vendas: " + String.format("%.2f", soma));
		System.out.println("Comissão sobre as vendas: 9%");
		System.out.println("Valor da comissão da semana: " + String.format("%.2f", comissao));
		System.out.println("Pagamento Fixo Semanal: " + String.format("%.2f", fixoSemanal));
		System.out.println("Total liquido que o vendedor tem a receber essa semana: " + String.format("%.2f", totalReceber));
		
		sc.close();
	}

}
