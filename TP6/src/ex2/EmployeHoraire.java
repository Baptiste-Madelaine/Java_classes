package ex2;

public class EmployeHoraire extends Employe{
	public int nbHeures;
	public double tarifHoraire;
	private double percentHoraire;
	public EmployeHoraire(String n, int nbH, double tA, double phS) {
		super(n);
		this.nbHeures = nbH;
	}
	public double getSalaire() {
		double SalaireFinale=0.0;
		SalaireFinale += nbHeures*tarifHoraire;
		return SalaireFinale;
	}
}
