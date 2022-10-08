package application;
//Figura 4.19: DrawPanelTest.java
//Criando JFrame para exibirum DrawPanel.
import javax.swing.JFrame;
import entities.DrawPanel;
public class DrawPanelTest {

	public static void main(String[] args) {
		//cria um painel que contem nosso desenho
		DrawPanel panel = new DrawPanel();
		
		//cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();
		
		//configura o frame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);//adiciona o painel ao frame
		application.setSize(250, 250);//configura o tamanho do frame
		application.setVisible(true);
	}
}//fim da classe DrawPanelTest
