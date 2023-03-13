package application;

public class Batiments {
	private String name;
	private String addr;
	private float surface;
	public float getImpots() {
		return surface*5;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public float getSurface() {
		return surface;
	}
	public Batiments(String n, String a, float s) {
		name = n;
		addr = a;
		surface = s;
	}
	public int getCategorie() {
		return 0;
	}
}
