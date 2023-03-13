package exercice;

import exercice.TestPositif;
import bataille.*;

public class TestPositif {
	public static int numeroTest1 = 1;
	public void testerPositif(int n) {
		
		if( 0 <= n) {
			this.afficherMessage("succes");
		}else {
			this.afficherMessage("echec");
		}
		numeroTest1++;
	}
	public void afficherMessage(String message) {
		System.out.println(numeroTest1 + " : " + message);
	}
	public static void main(String[] args) {
		TestPositif t = new TestPositif();
		t.testerPositif(10);
		t.testerPositif(-10);
	}
	
}
