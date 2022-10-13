package application;
//Figura 5.1: WhileCounter.java
//Repetição controlada por contador com a instrução de repetição while.
public class WhileCounter {

	public static void main(String[] args) {
		
		int counter = 1; //declara e inicializa a variavel de controle
		
		while (counter <= 10) //condição de continuação do Loop
		{
			System.out.printf("%d ", counter);
			++counter; //variavel de controle de incremento
		}

		System.out.println();
	}
}//fim da classe WhileCounter
