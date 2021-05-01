
public class Dresseur implements DresseurPokemon{
	private String nom;
	private int x,y;
	private Pokemon[] tabP; //les pokemons du dresseur
	//private int argent, pokeball;    pas encore ajouter
	private int taille;
	public final int nbP=9; //nb differents pokemons existant
	private int s;
	private int potion;
	private int pokeball;
	
	public Dresseur(String nom, int j) {
		x=1;
		y=1;
		potion=15;
		pokeball=15;
		s=0;
		taille=j;
		this.nom=nom;
		tabP= new Pokemon [6];
		int p_pkm; // nb aleatoire entre 0 et nbP non compris
		
		for(int i=0;i<taille;i++) { //initialisation de tabP
			p_pkm= (int)(Math.random()*nbP);
			if(p_pkm == 0)
				tabP[i]= new Carapuce();
			else if(p_pkm == 1)
				tabP[i]= new Salameche();
			else if(p_pkm == 2)
				tabP[i]= new Bulbizarre();
			else if(p_pkm == 3)
				tabP[i]= new Gobou();
			else if(p_pkm == 4)
				tabP[i]= new Poussifeu();
			else if(p_pkm == 5)
				tabP[i]= new Arcko();
			else if(p_pkm == 6)
				tabP[i]= new Tiplouf();
			else if(p_pkm == 7)
				tabP[i]= new Tortipouss();
			else if(p_pkm == 8)
				tabP[i]= new Ouisticram();
			//else if + les autres pokemons
				
		}
		
	}
	
	public Dresseur() { //pour pokemon sauvage
		s=1;
		taille=1;
		tabP= new Pokemon [taille];
		int p_pkm= (int)(Math.random()*nbP);
		
		if(p_pkm == 0)
			tabP[0]= new Carapuce();
		else if(p_pkm == 1)
			tabP[0]= new Salameche();
		else if(p_pkm == 2)
			tabP[0]= new Bulbizarre();
		else if(p_pkm == 3)
			tabP[0]= new Gobou();
		else if(p_pkm == 4)
			tabP[0]= new Poussifeu();
		else if(p_pkm == 5)
			tabP[0]= new Arcko();
		else if(p_pkm == 6)
			tabP[0]= new Tiplouf();
		else if(p_pkm == 7)
			tabP[0]= new Tortipouss();
		else if(p_pkm == 8)
			tabP[0]= new Ouisticram();
		//else if + les autres pokemons
		
		
		nom=tabP[0].getNom();
	}
	
	public void presenter() {
		System.out.println("Je suis "+nom);
	}
	
	public void choisir(int i) {
		int p=(int)(Math.random()*4);
		if(p==0)
			System.out.println(nom+": "+tabP[i].getNom()+ " a toi de jouer !");
		else if (p==1)
			System.out.println(nom+": "+tabP[i].getNom()+ " fonce !");
		else if (p==2)
			System.out.println(nom+": "+tabP[i].getNom()+ " go !");
		else
			System.out.println(nom+": "+tabP[i].getNom()+ " je te choisi !");
	}
	
	public void afficher_pok() {
		for(int i=0;i<taille;i++)
			System.out.println((i+1)+": "+tabP[i].getNom()+" "+tabP[i].getId()+"\n");
	}
	
	public int etat() { //retourne l'indice du premier pokemon en vie, -1 sinon
		for(int i=0;i<taille;i++) {
			if(tabP[i].getenVie()==1)
				return i;
		}
		System.out.println("Le dresseur "+nom+" n'est plus en etat de se battre !");
		return -1;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Pokemon[] getTabP() {
		return tabP;
	}
	
	public int getS() {
		return s;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void ChangerX(int x) {
		this.x=x;
	}
	public void ChangerY(int y) {
		this.y=y;
	}
	public int getTaille() {
		return taille;
	}
	
	public int getPotion() {
		return potion;
	}
	
	public int getPokeball() {
		return pokeball;
	}
	public void setTaille(int taille) {
		this.taille=taille;
	}
	public void setPotion(int potion) {
		this.potion=potion;
	}
	public void setPokeball(int pokeball ){
		this.pokeball=pokeball;
	}
}
