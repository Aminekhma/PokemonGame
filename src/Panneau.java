import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.File;


public class Panneau extends JPanel implements KeyListener{
	private Monde m;
	private Fenetre fen;
	private Dresseur d;
	public Image IMG_BUSH;
	public Image IMG_GRASS;
	public Image IMG_PLAYER;
	public Image IMG_WATER;
	public Image IMG_SWIM;
	public final int t=20;
	
	public Panneau(Monde mo, Dresseur d,Fenetre f) {

		m=mo;
		this.d=d;
		fen=f;
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
	}
	
	public void paintComponent(Graphics g) {
		try {
			IMG_BUSH = ImageIO.read(new File("IMAGES\\bush.png"));
			IMG_GRASS = ImageIO.read(new File("IMAGES\\grass.png"));
			IMG_PLAYER = ImageIO.read(new File("IMAGES\\player_00.png"));
			IMG_WATER = ImageIO.read(new File("IMAGES\\water.png"));
			 IMG_SWIM = ImageIO.read(new File("IMAGES\\swim.png"));		
			
			for(int i=0;i<=m.getX();i++) {
				for(int j=0;j<=m.getY();j++) {
					
					if(i==0 || i == m.getX() || j== 0 || j==m.getY() || i== m.getX()/2)
						g.drawImage(IMG_WATER, i*t, j*t,t,t, this);
					
					else {
						g.drawImage(IMG_GRASS, i*t, j*t,t,t, this);
						if(m.getTab()[j][i]==0)
							g.drawImage(IMG_BUSH, i*t, j*t,t,t, this);
					}
				}
			}
			
			if(d.getX() == m.getX()/2) {
				g.drawImage(IMG_SWIM,d.getX()*t, d.getY()*t,t,t, this);
			}
			else
				g.drawImage(IMG_PLAYER,d.getX()*t, d.getY()*t,t,t, this);
		
			
		}catch(IOException e) {
			e.printStackTrace();
		} 
	}
	
	
	public void keyPressed(KeyEvent e)
	{
	
		int c= e.getKeyCode();
		
		if(c== KeyEvent.VK_NUMPAD7 || c== KeyEvent.VK_7 ) {
			m.Bouger(d,7,fen);
			repaint();
		}
		
		if(c== KeyEvent.VK_NUMPAD9 || c== KeyEvent.VK_9) {
			m.Bouger(d,9,fen);
			repaint();
		}
		
		if(c== KeyEvent.VK_LEFT) {
			m.Bouger(d,1,fen);
			repaint();
		}
		
		if(c== KeyEvent.VK_UP) {
			m.Bouger(d,5, fen);
			repaint();

		}
		
		if(c== KeyEvent.VK_RIGHT) {
			m.Bouger(d,3,fen);
			repaint();


		}
		if(c== KeyEvent.VK_DOWN) {
			m.Bouger(d,2,fen);
			repaint();
			
		}
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
	public int getT() {
		return t;
	}
	
}