package main;

import java.awt.Color;

import javax.swing.JFrame;


public class app {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame ventana= new JFrame("Dibujando puntos");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setBackground(Color.BLACK);
		ventana.setSize(200, 200);
		ventana.setLocationRelativeTo(null);        
      //  Container contenedor = ventana.getContentPane();
        // contenedor.setBackground(Color.BLACK);
		//ventana.setLayout(null);
		
		
		dibujarPuntos panel = new dibujarPuntos();
		//contenedor.add(panel);
		ventana.add(panel);

		ventana.setVisible(true);
		
	}

}
