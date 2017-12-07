import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Affichage extends JFrame {
	public Affichage(){
		setVisible(true);
		setTitle("Ordonnanceur de processus");
		setSize(1420, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan= new JPanel();
		pan.setBackground(Color.GRAY);
		setContentPane(new Panneau());
		
	}
}

class Panneau extends JPanel{
	public void paintComponent(Graphics s){
		s.drawString("sss",100,100);
		
	}
}