package exercice1;

public class Potiron extends Courge{
	private static float price;
	public Potiron(float p, float po, int e, boolean v, boolean s) {
		super(po, e, v ,s);
		price = p;
	}
	public void setPrice(float p) {price = p;}
	public float getPrice() {return price;}
}
