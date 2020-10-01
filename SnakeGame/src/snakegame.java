import java.awt.Color;
import javax.swing.JFrame;

public class snakegame{

	public static void main(String[] args) {
		
		JFrame J = new JFrame();
		game G = new game();
		
		J.setBounds(100, 100, 600, 600);
		J.setResizable(false);
		J.setBackground(Color.BLACK);
		J.setVisible(true);
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		J.add(G);
		

	}
}
