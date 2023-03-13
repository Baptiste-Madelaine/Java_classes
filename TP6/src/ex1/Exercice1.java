package ex1;

import java.util.ArrayList;
import java.util.Random;

public class Exercice1 {
	
	private static final Etudiant listEtu[] = new Etudiant[1000];
	
	
	public static void main(String[] args) {
		for(int i = 0; i < 1000; i++) {
			Etudiant temp;
			Random r = new Random();
			int r2 = r.nextInt(5)+4;
			StringBuilder builder1 = new StringBuilder(r2);
			StringBuilder builder2 = new StringBuilder(r2);
			for(int j = 0; j < r2; j++) {
				char c1 = (char)(r.nextInt(26) + 'a');
				char c2 = (char)(r.nextInt(26) + 'a');
				builder1.append(c1);
				builder2.append(c2);
			}
			if(r.nextBoolean()) {
				temp = new Etudiant(builder1.toString(), builder2.toString(), Genre.HOMME);
			}
			else {
				temp = new Etudiant(builder1.toString(), builder2.toString(), Genre.FEMME);
			}
			
			listEtu[i] = temp;
			
		}
		System.out.println(listEtu[0].toString());
	}
}