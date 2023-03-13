package exercice1;

public class Courge {
	private float poids;
	private int numEmp;
	private boolean vendu;
	private boolean seme;
	
	public Courge(float _poids, int _emp, boolean _vendu, boolean _seme) {
		poids = _poids;
		numEmp = _emp;
		vendu = _vendu;
		seme = _seme;
	}
	public void setPoids(float p) { poids = p;}
	public void setEmp(int e) {numEmp = e;}
	public void setVendu(boolean v) {vendu = v;}
	public void setSeme(boolean s) {seme = s;}
	
	public float getPoids() {return poids;}
	public int getEmp() {return numEmp;}
	public boolean getVendu() {return vendu;}
	public boolean getSeme() {return seme;}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courge other = (Courge) obj;
		return numEmp == other.numEmp && Float.floatToIntBits(poids) == Float.floatToIntBits(other.poids)
				&& seme == other.seme && vendu == other.vendu;
	}
	
	
}
