
public class TestThread extends Thread {
	private PanPok p;
	private Combat c;
  public TestThread(String name , Combat c){
    super(name);
    this.c=c;
  }
  
  public void run(){
	p= new PanPok(c);
    Jcombat jc= new Jcombat(p);
    p.requestFocus();
    p.repaint();
    jc.requestFocus();
    jc.repaint();
  }       
}