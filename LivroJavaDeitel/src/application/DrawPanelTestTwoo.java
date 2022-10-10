package application;

import javax.swing.JFrame;

import entities.DrawPanelTwo;

public class DrawPanelTestTwoo {

	public static void main(String[] args) {
		//cria um painel que contem nosso desenho
		DrawPanelTwo panel = new DrawPanelTwo();
		
		//cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();
		
		//configura o frame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);//adiciona o painel ao frame
		application.setSize(500, 500);//configura o tamanho do frame
		application.setVisible(true);
	}

}
