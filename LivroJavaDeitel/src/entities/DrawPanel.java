package entities;
//Figura 4.18: DrawPanel.java
//Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	//desenha um x a partir dos cantos do painel
	public void paintComponent(Graphics g) {
		
		//chama paintComponent para assegurar que o nainel é exibido corretamente
		super.paintComponent(g);
		
		int widht = getWidth();//largura total
		int height = getHeight();//altura total
		
		//desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, widht, height);
		
		//desenha uma linha a partir do canto inferior esquerdo ate o superior direito
		g.drawLine(0, height, widht, 0);
	}
}//Fim da classe DrawPanel
