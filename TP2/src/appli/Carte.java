package appli;

public class Carte {
	private static String hauteurStr[] = {"inconnu","inconnu","inconnu","inconnu","inconnu","inconnu","inconnu",
	                           "sept", "huit", "neuf", "dix", "valet", "dame", "roi", "as"};
	private static String couleurStr[] = {"trefle","carreau","coeur","pique"};
	private int hauteur;
	private int couleur;
	
	public int getHauteur() {
		return this.hauteur;
	}
	public int getCouleur() {
		return this.couleur;
	}
	public String toString() {
		return Carte.hauteurStr[hauteur] + " de " + Carte.couleurStr[couleur];
	}
	public Carte(int h, int c) {
		if(h < 7 || h > 14 || c < 0 || c > 3) {
			throw new IllegalArgumentException("Carte Illegale");
		}
		this.hauteur = h;
		this.couleur = c;
	}
}
