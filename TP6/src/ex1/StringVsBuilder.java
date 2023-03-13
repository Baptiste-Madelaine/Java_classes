package ex1;

import java.util.Random;

import ex1.Etudiant;
import ex1.Genre;

public class StringVsBuilder {

	public static void main(String[] args) {
		
		Etudiant etudiants[] = new Etudiant[1000];
		
		Random r = new Random();
		
		long before = System.currentTimeMillis();
		for(int e = 0; e < 1000; e++) {
			String prenom = "";
			
			
		}
		long after = System.currentTimeMillis();
		System.out.println(after-before);
		
		
		for(int e = 0; e < 1000; e++) {
			StringBuilder prenom = new StringBuilder();
			
		}
		
	}

}
