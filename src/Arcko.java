public class Arcko extends Plante implements Attaquer,Crie{
	protected static int cpt=1; //compteur
	
	public Arcko() {
		super("Arcko");
		cpt1="Ecras'Face";
		cpt2="Vol-vie";
		cpt3="Vive-Attaque";
		cpt4="Tranch'Herbe";
		id=cpt++;
		hpMax=hp;
	}
	
	//Competences 
	public void competence1(Pokemon p) { //Pokemon p est le pokemon qui subie la competence
		System.out.println(nom+" attaque "+cpt1+" !");
		if(Math.random()>0.05) { //une probabilite de 5% d'echouer
			p.subir(this,35);
			try{
			     Thread.sleep(800); 
			  }catch(Exception e){
			     e.printStackTrace();
			  }
		}
		else
			System.out.println("Le pokemon "+p.nom+" esquive l'attaque !");
	}
	public void competence2(Pokemon p) {
		System.out.println(nom+" utilise "+cpt2+" !");
		if(Math.random()>0.1) { //proba de 10% d'echouer
			p.subir(this,40);
			try{
			     Thread.sleep(800); 
			  }catch(Exception e){
			     e.printStackTrace();
			  }
		}
		else
			System.out.println("Le pokemon "+p.nom+" esquive l'attaque !");
	}
	public void competence3(Pokemon p) {
		System.out.println(nom+" lance "+cpt3+" !");
		if(Math.random()>0.1) { //proba de 10% d'echouer
			p.subir(this,40);
			try{
			     Thread.sleep(800); 
			  }catch(Exception e){
			     e.printStackTrace();
			  }
		}
		else
			System.out.println("Le pokemon "+p.nom+" esquive l'attaque !");
	}	
	public void competence4(Pokemon p) {
		System.out.println(nom+" lance "+cpt4+" !");
		if(Math.random()>0.2) { //proba de 20% d'echouer
			p.subir(this,55);
			try{
			     Thread.sleep(800); 
			  }catch(Exception e){
			     e.printStackTrace();
			  }
		}
		else
			System.out.println("Le pokemon "+p.nom+" esquive l'attaque !");
	}
	
	//les affichages
	public String toString() {
		return "Arcko";
	}
	public void crie() {
		System.out.println(this.toString());
	}
	
}
