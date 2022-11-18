package main;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
public class dibujarPuntos extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(20, 20, 20, 20);
		g.drawLine(30, 30, 30, 30);
		
		g.setColor(Color.WHITE);
		g.drawLine(40, 40, 40, 40);
		g.drawLine(50, 50, 50, 50);
        
		g.setColor(Color.BLUE);
		g.drawLine(60, 60, 60, 60);
		g.drawLine(70, 70, 70, 70);
        
	}

 

}
