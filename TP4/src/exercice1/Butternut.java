package exercice1;

public class Butternut extends Courge{
	private static float price;
	public Butternut(float p, float po, int e, boolean v, boolean s) {
		super(po, e, v ,s);
		price = p;
	}
	public void setPrice(float p) {price = p;}
	public float getPrice() {return price;}
}
