package application;

public class Villa extends Batiments{
	private boolean piscine;
	private int piece;
	Villa(String n, String a, float s, int p, boolean pi){
		super(n,a,s);
		piscine = pi;
		piece = p;
	}
	Villa(String n, String a, float s){
		super(n,a,s);
		this.piscine = false;
		this.piece = 4;
	}
	public float getImpots() {
		if(piscine) {
			return this.getSurface()*5 + piece * 100 + 500;
		}
		return this.getSurface()*5 + piece * 100;
	}
	public void affiche() {
		System.out.println(this.getAddr() + this.getName() + this.getSurface() + piece + piscine);
	}
	public int getCategorie() {
		return 2;
	}
}
