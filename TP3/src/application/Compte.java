package application;

public class Compte {
	
	private String identifiant;
	protected float solde;
	
	public Compte(String oui, float non) {
		if(non < 0) {
			throw new IllegalArgumentException("Solde, négatif");
		}
		identifiant = oui;
		solde = non;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}
	public float getSolde() {
		return solde;
	}
	public String getNatureCompte() {
		return "Compte simple";
	}
	
}
