package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}
	public String getNom() {
		return nom;
	}
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	protected void parler(String texte) {
		System.out.println(nom + " :" + "\"" + texte + "\"");
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle "+ nom + " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonFavorite+" ! GLOUPS !");
	}
	
	public void acheter(String bien,int prix) {
		if (prix<quantiteArgent) {
			parler("J'ai " + quantiteArgent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("J'ai " + quantiteArgent+" sous en poche." );
		}
	}
	
	protected void gagnerArgent(int gain) {
		quantiteArgent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		quantiteArgent-=perte;
	}

}
