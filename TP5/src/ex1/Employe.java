package ex1;

import java.io.Serializable;

public abstract class Employe{
	
	private final String nom;
	
	public abstract double getSalaire();

	public String getNom() {
		return nom;
	}

	public Employe(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + "]";
	}
	
}
