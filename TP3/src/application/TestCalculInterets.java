package application;
import java.util.ArrayList;
import java.util.Scanner;

import application.*;

public class TestCalculInterets {
	private ArrayList<Compte> tab = new ArrayList<Compte>();
	public static void main(String[] args) {
		Compte compte1 = new Compte("A01", 1000f);
		CompteEpargne compte2;
		compte2 = new CompteEpargne("E99", 1000f, 0.1f);
		compte2.setAnnee(5);
		Compte c;
		String message = "L'argent qui dort ne rapporte rien :";
		c = compte1;
		message += "\n Solde compte " + c.getIdentifiant()+" : "+c.getSolde()+" "+c.getNatureCompte();
		c = compte2;
		message += "\n Solde compte " + c.getIdentifiant()+" : "+c.getSolde()+" "+c.getNatureCompte();
		System.out.println(message);
		creerCompte();
	}
	public static Compte creerCompte() {
		System.out.println("Souhaitez vous créer un compte simple ou épargne ?(s/e)");
		Scanner sc = new Scanner(System.in);
		String oui = sc.nextLine();
		if( oui.equals("s")) {
			System.out.println("A quel nom ?");
			oui = sc.next();
			System.out.println("Avec combien de sousou ?");
			return new Compte(oui, (float)sc.nextDouble());
		}
		else  if(oui.equals("e")) {
			System.out.println("A quel nom ?");
			oui = sc.next();
			System.out.println("Avec combien de sousou ?");
			float non = sc.nextFloat();
			System.out.println("Quel taux d'intêret ?");
			System.out.println("Merci msieur !");
			return new CompteEpargne(oui,non,sc.nextFloat());
		}
		else {
			System.out.println("C'est non !");
			return null;
		}
		
		//return new Compte();
	}
	
}
