package appli;
import appli.*;

public class Joueur {
	private String nom;
	private PaquetCartes p;
	
	public int nbCartesRestantes() {
		return p.getNbCartes();
	}
	public Carte prendreCarteDessus() {
		return p.tirerCarteDessus();
	}
	public void mettreCarteSousLePaquet(Carte c) {
		p.ajouter(c);
	}
	public void rep() {
		p.afficher();
	}
	public String getNom() {
		return this.nom;
	}
	public Joueur(String nom) {
		this.nom = nom;
		this.p = new PaquetCartes();
	}
}
