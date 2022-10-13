package application;
import java.util.Locale;
//Figura 5.6: Interest.java Calculos de juros compostos com for.
public class Interest {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double amount; //Quantia em deposito ao fim de cada ano
		double principal = 1000.0; //Quantia inicial antes dos juros
		double rate = 0.05; //taxa de juros
		
		//exibe cabeçalhos
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		//Calcula quantidade de deposito para cada um dos dez anos
		for (int year = 1; year <= 10; ++year)
		{
			//Calcula nova quantidade durante ano especificado
			amount = principal * Math.pow(1.0 + rate, year);
			
			//Exibe o ano e a quantidade
			System.out.printf("%4d%,20.2f%n", year, amount);
		}
	}
}//Fim da classe Interest
