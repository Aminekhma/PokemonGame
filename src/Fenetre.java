import java.awt.*;



public class Fenetre extends JFrame{
	private Panneau pan;
	private Paccueil p;
	private JPanel co= new JPanel();
	
	private int x,y;
	private JButton b = new JButton("START");
	
	public Fenetre(Monde m, Dresseur d) {
		
		pan= new Panneau(m,d,this);
		p= new Paccueil(this);
		
		x=(m.getX()+2)*pan.getT();
		y=(m.getY()+3)*pan.getT()+10;
		
		this.setTitle("Pokémon");
		this.setSize(x,y);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		co.setLayout(new BorderLayout());
		co.add(p, BorderLayout.CENTER);
		co.add(b, BorderLayout.SOUTH);
		b.addActionListener(new EcouteurBoutonChanger());
		
		this.setContentPane(co);
		
		this.setVisible(true);
		setAlwaysOnTop(true);
		playSound();
	}
	
	public void setV(boolean b) {
		this.setVisible(b);
	}
	
	public void setC() {
		this.setContentPane(pan);
		this.revalidate();
		pan.requestFocus();
		System.out.println(" /!\\  A LIRE SVP :  /!\\ \n\nBIENVENUE DANS LE MONDE DES POKEMONS !!!\nVOTRE OBJECTIF EST DE PERDRE DU TEMPS DANS CETTE MAP EN VOUS PROMENANT OU BIEN EN FAISANT DES COMBATS POKEMON.\nC'EST TOUT, MERCI AHAHA !!!\n\n(AIDES: Deplacez-vous en utilisant les flèches | Entrez '7' pour un combat contre un dresseur | '9' pour quitter.)\n(PS: AHH OUI J'OUBLIAIS, tu seras priver de musique de fond si tu passe plus de 5 minutes sur ce jeu).\n");
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public Panneau getP() {
		return pan;
	}
	
	public class EcouteurBoutonChanger implements ActionListener{
        public void actionPerformed(ActionEvent clic) {
            //Appelle la méthode de changement de panel
            Fenetre.this.setC();
        }
    }
	
	public void playSound() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("MUSIC\\pokemon_m.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	 
}
