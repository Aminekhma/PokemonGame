public class RunImpl implements Runnable {
  private Combat cb;

  public RunImpl(Combat cb){
    this.cb = cb;
  }
  public void run() {
	    PanPok p= new PanPok(cb);
	    Jcombat jc= new Jcombat(p);
	    p.requestFocus();
	    p.repaint();
	    jc.requestFocus();
	    jc.repaint();
  }
}