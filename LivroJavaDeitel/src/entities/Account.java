package entities;
//Figura 3.1: Account.java
//Classe Account que contem uma variavelde instancia name
//e metodos para configurar e obter seu valor.
public class Account 
{
	private String name; //variavel de isntancia
	
	//metodo para definir o nome do objeto
	public void setName(String name) 
	{
		this.name = name; //armazena o nome
	}
	
	//metodo para recuperar o nome do onjeto
	public String getName() 
	{
		return name; //retorna valor do nome para o chamador
	}
}//fim da classe Account
