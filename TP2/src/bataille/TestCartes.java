package bataille;

import fr.unicaen.iutgon.info.carte.Carte;
import fr.unicaen.iutgon.info.carte.PaquetCartes;

public class TestCartes {
	public static int nb = 1;
	PaquetCartes pc;
	
	public TestCartes() {
		pc = new PaquetCartes();
	}
	
	public void testeCartes() {
		Carte c = new Carte(7, 0);
		pc.ajouter(c);
		c = new Carte(7, 1);
		pc.ajouter(c);
		c = new Carte(7, 2);
		pc.ajouter(c);
	}
	public void remplitPaquet() {
		for(int i = 7; i <= 14; i++) {
			for(int j = 0; j <=3; j++) {
				Carte c = new Carte(i,j);
				pc.ajouter(c);
			}
		}
	}
	public void testeTirer() {
		while(!pc.estPaquetVide()) {
			System.out.println(nb +" : "+pc.tirerCarteDessus());
			nb++;
		}
	}
	public static void main(String[] args) {
		TestCartes tc = new TestCartes();
		tc.testeCartes();
		tc.remplitPaquet();
		tc.pc.melanger();
		System.out.println(tc.pc);
		tc.testeTirer();
	}
}
