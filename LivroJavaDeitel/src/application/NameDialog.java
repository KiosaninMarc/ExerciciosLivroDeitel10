package application;
//Figura 3.13: NameDialog.Java
// Obtendo a entrada de usuário a partir de um diálogo.
import javax.swing.JOptionPane;
public class NameDialog 
{
	public static void main(String[] args) 
	{
		// pede para o usuario inserir seu nome
		String name = JOptionPane.showInputDialog("What is your name?");
		
		//cria a mensagem
		String message = 
			String.format("Welcome, %s, to Java Programming!", name);
		
		//Exibe a mensagem para cumprimentar o usuario pelo nome
		JOptionPane.showMessageDialog(null, message);
	}//fim de main
}//termina NameDialog
