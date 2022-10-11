package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ClienteConta;

/*(Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o 
limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.
O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e 
determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve 
exibir a mensagem "Limite de crédito excedido".*/
public class CalculadorLimiteCredito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ClienteConta> list = new ArrayList<ClienteConta>();
		
		System.out.print("Numero da conta: ");
		int nunConta = sc.nextInt();
		System.out.print("Saldo Inicial: ");
		int saldoIni = sc.nextInt();
		System.out.print("Total de gastos: ");
		int gastoMes = sc.nextInt();
		System.out.print("Creditos no mes: ");
		int credMes = sc.nextInt();
		System.out.print("Limite de credito autorizado: ");
		int credLimit = sc.nextInt();
		
		ClienteConta cliente = new ClienteConta(nunConta, saldoIni, gastoMes, credMes, credLimit);
		list.add(cliente);
		
		System.out.println("===================================================");
		System.out.println(cliente);
		System.out.println("Novo saldo = " + cliente.novoSaldo());
		if (cliente.novoSaldo() <= cliente.getCredAutorizado()) {
			System.out.println("Limite de credito não excedido! Tudo ok com a compra.");
		}else {
			System.out.println("Limite de credito excedido! Compra não autorizada. Diminua o valor da compra!");
		}
		
		sc.close();
	}

}
