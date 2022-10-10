package entities;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanelTwo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	//desenha um x a partir dos cantos do painel
	public void paintComponent(Graphics g) {
		//chama paintComponent para assegurar que o nainel é exibido corretamente
		super.paintComponent(g);
		
		int n = 6;
		int x2 = 0;
		int y2 = 0;
		int widht = getWidth();//largura total
		int height = getHeight();//altura total
		
		//desenha uma linha a partir do canto superior esquerdo até o inferior direito
		// modelo para orientação - g.drawLine(height, height, widht, height);

		int x1 = 360;
		int y1 = 115;
		for (int i = 0; i < n; i++) {
			g.setColor(Color.BLACK);
			g.drawLine(x1, y1, x2, y2);
			x1 -= 20;
			y1 += 20;
		}
		
		x1 = 235;
		y1 = 235;
		for (int i = 0; i < n; i++) {
			g.setColor(Color.BLACK);
			g.drawLine(x1, y1, x2, y2);
			x1 -= 20;
			y1 += 20;
		}
				
		x1 = 360;
		y1 = 115;
		for (int i = 0; i < n; i++) {
			g.setColor(Color.BLACK);
			g.drawLine(x1, y1, widht, height);
			x1 -= 20;
			y1 += 20;
		}
		
		x1 = 235;
		y1 = 235;
		for (int i = 0; i < n; i++) {
			g.setColor(Color.BLACK);
			g.drawLine(x1, y1, widht, height);
			x1 -= 20;
			y1 += 20;
		}
		
		//desenha uma linha a partir do canto inferior esquerdo ate o superior direito
		n = 11;
		x1 = 420;
		y1 = 385;
		y2 = 0;
		for (int i = 0; i < n; i++) {
			g.setColor(Color.BLACK);
			g.drawLine(x1, y1, widht, y2);
			x1 -= 35;
			y1 -= 35;
		}
		
		x1 = 0;
		x2 = 420;
		y2 = 385;
		for (int i = 0; i < n; i++) {
			g.setColor(Color.BLACK);
			g.drawLine(x1, height, x2, y2);
			x2 -= 35;
			y2 -= 35;
		}
		
		/*		
		g.drawLine(0, height, 360, 325);
		g.drawLine(0, height, 340, 305);
		g.drawLine(0, height, 320, 285);
		g.drawLine(0, height, 300, 265);
		g.drawLine(0, height, 280, 245);
		g.drawLine(0, height, 260, 225);
		*/
	}
}