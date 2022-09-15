package application;
//Figura 3.2: AccountTest.java cria e manipula um objeto Account
import java.util.Scanner;
import entities.Account;
public class AccountTest 
{
	public static void main(String[] args)
	{
		//Cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//cria um objeto Account e o atribui a myAccount
		Account myAccount = new Account();
		
		//exibe o valor inicial do nome (null)
		System.out.printf("Initialname is: %s%n%n", myAccount.getName());
		
		//solicita e le o nome
		System.out.println("Please enter the name:");
		String theName = input.nextLine(); //le uma linha de texto
		myAccount.setName(theName); //insere theName em myAccount
		System.out.println(); //gera saida de uma linha em branco
		
		//exibe o nome armazenado no objeto myAccount
		System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
	input.close();			
	}
}//Fim da classe AccountTest
