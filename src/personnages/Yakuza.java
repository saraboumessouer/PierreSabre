package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=4;
	
	public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom , boissonFavorite, quantiteArgent);
		this.clan=clan;
	}
	
	public int getReputation() {
		return reputation;
	}



	public void extorquer(Commercant victime) {
		reputation+=1;
		int somme=victime.getQuantiteArgent();
		String nom=victime.getNom();
		super.gagnerArgent(somme);
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		super.parler(nom+" ,si tu tiens à la vie donne moi ta bourse!");
		victime.seFaireExtorquer();
		super.parler("J'ai piqué les "+somme+" sous de "+nom+", ce qui me fait "+ this.getQuantiteArgent()+" sous dans ma poche. HI! HI!" );
	}
	
	public int perdre() {
		reputation-=1;
		int somme=super.getQuantiteArgent();
		super.perdreArgent(somme);
		super.parler("J'ai perdu mon duel et mes "+somme+" sous, snif... J'ai déshonoré le clan de "+clan);
		return somme;
		
	}
	
	public int gagner(int gain) {
		reputation+=1;
		super.gagnerArgent(gain);
		super.parler("Ce ronin pensait vraiment battre "+super.getNom()+" du clan de "+clan+ " ? Je l'ai dépouillé de ses "+gain+" sous.");
		return gain;
	}
	
	
}
