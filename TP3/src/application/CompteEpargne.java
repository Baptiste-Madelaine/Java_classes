package application;


public class CompteEpargne extends Compte{
	private float interet;
	private int annee;
	CompteEpargne(String oui, float s, float s2){
		super(oui, s);
		interet = s2;
	}
	
	public void setAnnee(int oui) {
		annee = oui;
	}
	public void setInterets(float i) {
		interet = i;
	}
	public String getNatureCompte() {
		return "Compte avec interets";
	}
	public int getAnnee() {
		return annee;
	}
	public float getInterets() {
		return interet;
	}
	public float getSolde() {
		return (solde + interet)*annee;
	}
}
