package application;
import java.util.InputMismatchException;
//Figura 3.9: AccountTest.java entrada e saida de numeros de ponto flutuante com objetos Account
import java.util.Scanner;
import entities.Account;
public class AccountTest 
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		//Exibe saldo inicial de cada objeto
		System.out.printf("%s balance: $%.2f %n",
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",
				account2.getName(), account2.getBalance());
		
		//cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
	
		try {	
			System.out.print("Enter deposit amount for account1: "); //prompt
			double depositAmount = input.nextDouble(); // obtém a entrada do usuário
			System.out.printf("%nadding %.2f to account1 balance%n%n", 
					depositAmount);
			account1.deposit(depositAmount); // adiciona o saldo de account1
			
			// exibe os saldos
			System.out.printf("%s balance: $%.2f %n",
					account1.getName(),account1.getBalance()); 
			System.out.printf("%s balance: $%.2f %n%n",
					account2.getName(),account2.getBalance()); 
		}catch (InputMismatchException e) {
			System.out.println("input error, account balance 1 not updated");
		}
		
		try {
			System.out.print("\nEnter deposit amount for account2: "); // prompt
			double depositAmount = sc.nextDouble(); // obtém a entrada do usuário
			System.out.printf("%nadding %.2f to account2 balance%n%n", 
					depositAmount);
			account2.deposit(depositAmount); // adiciona ao saldo de account2
		
			
			//exibe os saldos
			System.out.printf("%s balance: $%.2f %n",
					account1.getName(),account1.getBalance()); 
			System.out.printf("%s balance: $%.2f %n%n",
					account2.getName(),account2.getBalance()); 
		}catch (InputMismatchException e) {
			System.out.println("input error, account balance 2 not updated");
		}
	}//fim de main
}//Fim da classe AccountTest
