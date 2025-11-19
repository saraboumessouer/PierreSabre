package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
	}
	
	public int seFaireExtorquer() {
		super.parler("J'ai tout perdu! Le monde est trop injuste...");
		int somme=super.getQuantiteArgent();
		super.perdreArgent(somme);
		return somme;
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler(argent+ " sous ! Je te remercie généreux donateur!");	
	}
	
}
