import com.sun.java.swing.*;

public class Jcombat extends JFrame{

	 public Jcombat(PanPok p) {

		this.setTitle("Pokemon");
		this.setSize(600,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(p);
		this.setVisible(true);
		this.setAlwaysOnTop(true);
		 
	 }
	 
	 public void setV(boolean b) {
			this.setVisible(b);
	}
	 
	 public void setC(PanPok p) {
		this.setContentPane(p);
		this.revalidate();
		repaint();
	 }
}
