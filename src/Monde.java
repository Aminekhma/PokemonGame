

public class Monde {
	private int[][] Tab;
	private final int TailleX=50,TailleY=20;
	private PanPok p;
	private Jcombat jc;
	
	public Monde() {
		Tab=new int[TailleY][TailleX];
		for(int i=1;i<TailleY;i++) {	
			for(int j=1;j<TailleX;j++) {
				if(Math.random()>=0.75) 
					Tab[i][j]=0;
				else 
					Tab[i][j]=1;
			}
		}
	}
	
	public void BougerDresseur(Dresseur d,int x, Fenetre f) {
		
		if(x==1) {
			if(d.getX()-1>=1) 
				d.ChangerX(d.getX()-1);
		}
		if(x==3) {
			if(d.getX()+1<TailleX) 
				d.ChangerX(d.getX()+1);
	
		}
		if(x==5) {
			if(d.getY()-1>=1) 
				d.ChangerY(d.getY()-1);
		}
		if(x==2) {
			if(d.getY()+1<TailleY) 
				d.ChangerY(d.getY()+1);
		}
		if(x==7) {
			Combat c=new Combat(d, new Dresseur("Red",6));
			f.setV(false);
			c.commencer(f);
		}
		if(x==9) {
			System.out.println("\nFIN DU JEU, MERCI D'AVOIR TESTE NOTRE JEU !");
			 System.exit(0);
		}
	}
	public boolean Aggro(Dresseur d) {
		if(Tab[d.getY()][d.getX()]==0 && Math.random()>=0.85 && d.getX()!= TailleX/2) {
			return true;
		}
		return false;
	}
	public void Bouger(Dresseur d,int x, Fenetre f) {
		
		 BougerDresseur(d,x,f);
		 
		 if(Aggro(d) && x!=9) {
		
			 f.setV(false);
			 Combat c=new Combat(d,new Dresseur());
			 Thread t = new Thread(new RunImpl(c));
			 
			 t.start();
			 System.out.println("\n\n\n\n\n<<<  UN POKEMON SAUVAGE APPARAIT !!! >>> \n\n\n\n");
			 try{
					Thread.sleep(1500); 
				}catch(Exception e){
					e.printStackTrace();
				}
			 c.commencer(f);
			
		 }	
	}
	public int [][] getTab(){
		return Tab;
	}
	
	public int getX() {
		return TailleX;
	}
	public int getY() {
		return TailleY;
	}
	
	public Jcombat getJc() {
		return jc;
	}
	//afficher pokemon
}
