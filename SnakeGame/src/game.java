import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;

public class game extends JPanel implements KeyListener, ActionListener{

	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int[] snakexlength = new int[500];
	private int[] snakeylength = new int[500];
	private boolean left = false;
	private boolean right = true;
	private boolean up = false;
	private boolean down = false;
	private int lengthofsnake = 3;
	private Timer timer;
	private int speed = 100;
	private int moves = 0; 
  private int xpos=50;
  private int ypos=50;
 
	
	public game() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	timer =new Timer(speed,this);
		timer.start();
		
	}
	
	public void paint(Graphics g) {

//		g.setColor(Color.blue);
//		g.drawRect(0, 10,580, 50);
		if(moves==0) {
	moves++;
		for(int i = 0;i<3;i++) {
		
		g.setColor(Color.yellow);
		g.drawRect(xpos,ypos,snakexlength[i],snakeylength[i]);
		}
		}
		snakexlength[0] = 30;
		snakexlength[1] = 60;
		snakexlength[2] = 90;
		snakeylength[0] = 30;
		snakeylength[1] = 30;
		snakeylength[2] = 30;
		
		if(moves>0) {
		for(int i = 0;i<3;i++) {
			g.setColor(Color.yellow);
		g.drawRect(xpos,ypos,30,30);
		
		}
		}
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			
			moves++;
			right = true;
			left=false;
			up=false;
			down =false;
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			moves++;
			right = false;
			left=true;
			up=false;
			down =false;
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP) {
			moves++;
			right = false;
			left=false;
			up=true;
			down =false;
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			moves++;
			right = false;
			left=false;
			up=false;
			down =true;
		}
	
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timer.start();
		
		if(right) {
			xpos+=30;
			
		}
		else if(up) {
			
			ypos-=30;
			
		}
else if(down) {
			
			ypos+=30;
			
		}
else if(left) {
	
	xpos-=30;
	
}
		
		repaint();
	
	}

}
