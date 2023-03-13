package application;

public class Usine extends Batiments{
	private String nom_usine;
	private int nb_emp;
	private int nb_liv;
	
	public Usine(String n, String a, float s, String n_U) {
		super(n, a, s);
		nom_usine = n_U;
	}
	public String getNomUsine() {
		return nom_usine;
	}
	public void affiche() {
		System.out.println(this.getAddr() + this.getName() + this.getSurface() + nom_usine);
	}
	public int getCategorie() {
		return 1;
	}
	public float FluxVehicule() {
		return (float)(nb_liv + 0.75 * nb_emp)*2;
	}
	public boolean equals(Usine usi) {
		if(usi == this) {
			return true;
		}
		return false;
	}
}
