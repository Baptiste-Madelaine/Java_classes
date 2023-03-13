package exercice1;

public class ExceptionDeTasVide extends Exception{
	private Joueur joueur;
	public ExceptionDeTasVide(String m, Joueur j) {
		super(m);
		joueur = j;
	}
	public Joueur getJoueur() {
		return joueur;
	}
	public String toString() {
		return "Tas de carte vide du joueur !";
	}
}
