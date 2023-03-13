package exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestExceptions {

	private static PaquetCartes paquet;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joueur j1 = new Joueur("Eude");
		Scanner s = new Scanner(System.in);
		paquet = new PaquetCartes(52);
		paquet.ajouter(null);
		Integer a = 3;
		System.out.println(a.compareTo(4));
		while(!paquet.estPaquetVide()) {
			System.out.println("Il y a "+ paquet.toString());
			System.out.println("Tu retires combien ?");
			int oui = s.nextInt();
			for(int i = 0; i < oui ; i++) {
				try {
					paquet.tirerCarteDessus(null);
				} catch (ExceptionDeTasVide e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					i = oui;
				}
			}
		}
		
	}

}
