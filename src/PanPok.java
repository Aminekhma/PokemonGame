import javax.swing.JPanel;
import javax.imageio.ImageIO;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.File;

public class PanPok extends JPanel{

	public Image IMG_CARA;
	public Image IMG_BULBI;
	public Image IMG_SALA;
	public Image IMG_ARKO;
	public Image IMG_GOBOU;
	public Image IMG_POUSSI;
	public Image IMG_TIPL;
	public Image IMG_TORTI;
	public Image IMG_OUIST;
	private Combat c;
	private Fenetre fen;
	private final int t =200;
	private final int n = 150;
	private final int y = 10;
	
	public PanPok(Combat c){
		this.c=c;

	}
	
	public void paintComponent(Graphics g) {
		try {
			
			IMG_CARA = ImageIO.read(new File("IMAGES/carapuce.png"));
			IMG_BULBI = ImageIO.read(new File("IMAGES/bulbizarre.png"));
			IMG_SALA = ImageIO.read(new File("IMAGES/salameche.png"));
			IMG_ARKO = ImageIO.read(new File("IMAGES/arko.png"));
			IMG_GOBOU = ImageIO.read(new File("IMAGES/gobou.png"));
			IMG_POUSSI = ImageIO.read(new File("IMAGES/poussifeu.png"));
			IMG_TIPL = ImageIO.read(new File("IMAGES/tiplouf.png"));
			IMG_TORTI = ImageIO.read(new File("IMAGES/tortipouss.png"));
			IMG_OUIST = ImageIO.read(new File("IMAGES/ouisticram.png"));
			
			
			// dresseur 1
			if(c.getPd1().getNom().equals("Carapuce"))	
				g.drawImage(IMG_CARA, 0, y,t,t, this);
			if(c.getPd1().getNom().equals("Bulbizarre"))	
				g.drawImage(IMG_BULBI, 0, y,t,t, this);
			if(c.getPd1().getNom().equals("Salameche"))	
				g.drawImage(IMG_SALA, 0, y,t,t, this);
			if(c.getPd1().getNom().equals("Arcko"))	
				g.drawImage(IMG_ARKO, 0, y,t,t, this);
			if(c.getPd1().getNom().equals("Gobou"))	
				g.drawImage(IMG_GOBOU, 0, y,t,t, this);
			if(c.getPd1().getNom().equals("Poussifeu"))	
				g.drawImage(IMG_POUSSI, 0, y,t,t, this);
			if(c.getPd1().getNom().equals("Tiplouf"))	
				g.drawImage(IMG_TIPL, 0, y,t,t, this);
			if(c.getPd1().getNom().equals("Tortipouss"))	
				g.drawImage(IMG_TORTI, 0, y,t,t, this);
			if(c.getPd1().getNom().equals("Ouisticram"))	
				g.drawImage(IMG_OUIST, 0, y,t,t, this);
			
			// dresseur 2
			if(c.getPd2().getNom().equals("Carapuce"))	
				g.drawImage(IMG_CARA, t+n, y,t,t, this);
			if(c.getPd2().getNom().equals("Bulbizarre"))	
				g.drawImage(IMG_BULBI, t+n, y,t,t, this);
			if(c.getPd2().getNom().equals("Salameche"))	
				g.drawImage(IMG_SALA, t+n, y,t,t, this);
			if(c.getPd2().getNom().equals("Arcko"))	
				g.drawImage(IMG_ARKO,  t+n, y,t,t, this);
			if(c.getPd2().getNom().equals("Gobou"))	
				g.drawImage(IMG_GOBOU,  t+n, y,t,t, this);
			if(c.getPd2().getNom().equals("Poussifeu"))	
				g.drawImage(IMG_POUSSI,  t+n, y,t,t, this);
			if(c.getPd2().getNom().equals("Tiplouf"))	
				g.drawImage(IMG_TIPL, t+n, y,t,t, this);
			if(c.getPd2().getNom().equals("Tortipouss"))	
				g.drawImage(IMG_TORTI, t+n,y,t,t, this);
			if(c.getPd2().getNom().equals("Ouisticram"))	
				g.drawImage(IMG_OUIST,  t+n, y,t,t, this);
			
			g.drawString(" VS ", t+70, 100);
			
		}catch(IOException e) {
			e.printStackTrace();
		} 
	}
	
}
