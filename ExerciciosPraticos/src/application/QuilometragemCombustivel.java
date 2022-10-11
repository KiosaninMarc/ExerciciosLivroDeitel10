package application;

import java.util.Locale;
import java.util.Scanner;

/*(Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. 
Um motorista mo￾nitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em 
litros utilizados para cada tanque cheio. 
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) 
para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem 
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir 
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.*/
public class QuilometragemCombustivel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas viagems? ");
		int viagem = sc.nextInt();
		
		int kmTotal = 0;
		int ltTotal = 0;
		Double consumoViagem = 0.0;
		int i = 1;
		
		while (i <= viagem) {
			System.out.print("Qual a quilometragem da " + i + "ª viagem? ");
			int km = sc.nextInt();
			System.out.print("Quantos litros consumido? ");
			int lt = sc.nextInt();
			consumoViagem = (double) km / lt;
			System.out.printf("Consumo registrado: %.2f Km/Lt\n ", consumoViagem);
			i++;
			kmTotal += km;
			ltTotal += lt;
			System.out.println("================================");
		}
		
		Double media = (double) kmTotal / ltTotal;
		System.out.println("Quilometragem total percorrida: " + kmTotal + "Km");
		System.out.println("Combustivel total consumido: " + ltTotal + "Lt");
		System.out.printf("Media de consumo registrado: %.2f Km/Lt", media);
		
		sc.close();
	}

}
