package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	public Ronin(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
		
	}
	
	public void donner(Commercant beneficiaire) {
		int somme=(super.getQuantiteArgent())/10;
		super.perdreArgent(somme);
		super.parler(beneficiaire.getNom()+" prend ces "+somme+" sous.");
		beneficiaire.recevoir(somme);
		honneur+=1;
		
	}
	
	public void provoquer(Yakuza adversaire) {
		int force=2*honneur;
		super.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force>=adversaire.getReputation()) {
			honneur+=1;
			super.parler("Je t'ai eu petit yakusa!");
			super.gagnerArgent(adversaire.perdre());
		}
		else {
			honneur-=1;
			super.parler("J'ai perdu contre ce yakusa, mon honneur et ma bourse ont en pris un coup");
			super.perdreArgent(adversaire.gagner(super.getQuantiteArgent()));
		}
		
		
	}
	

}
