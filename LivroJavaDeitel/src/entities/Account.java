package entities;
//Figura 3.8: Account.java
//Classe Account com uma variavel de instancia balance do tipo double e um construtor
//e metodo deposit que executa a validação..
public class Account 
{
	private String name; //variavel de isntancia
	private double balance; //variavel de instancia
	
	//Construtor de Account que recebe dois parametros
	public Account(String name, double balance) 
	{
		this.name = name;
		
		//valida que o balance é maior que 0.0; se não for,
		//a variavel de instancia balance mantem seu valor inicial padrão de 0.0
		if (balance > 0.0)//se o saldo for valido
			this.balance = balance;//o atribui a variavel de instancia balance 
	}
	
	//metodo que deposita (adiciona) apenas a quantia valida no saldo
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)//se depositAmount for valido
			balance = balance + depositAmount;
	}
	
	//metodo retorna o saldo da conta
	public double getBalance() 
	{
		return balance;
	}
	
	//metodo que define o nome
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//metodo que retorna o nome
	public String getName()
	{
		return name; //retorna o valor de name ao chamador
	}//fim do metodo getName
}//fim da classe Account
