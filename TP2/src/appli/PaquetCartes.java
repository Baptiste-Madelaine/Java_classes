package appli;
import java.util.ArrayList;
import java.util.Random;

import fr.unicaen.iutgon.info.carte.*;

public class PaquetCartes {
	private ArrayList<Carte> oui = new ArrayList<Carte>();
	private Random alea = new Random();
	
	public void ajouter(Carte card) {
		oui.add(card);
	}
	public int getNbCartes() {
		return oui.size();
	}
	public boolean estPaquetVide() {
		if(getNbCartes()!=0) {
			return false;
		}
		return true;
	}
	public Carte tirerCarteDessus() {
		Carte temp = oui.get(0);
		oui.remove(0);
		return temp;
	}
	public void mettreenDessous(Carte c) {
		ajouter(c);
	}
	public void afficher()  {
		for(Carte c:oui) {
			c.toString();
		}
	}
	public void melanger() {
		for(int i = 0; i < oui.size(); i++) {
			int temp = alea.nextInt(oui.size());
			Carte non = oui.get(temp);
			oui.remove(temp);
			oui.add(non);
		}
	}
	public void main() {
		
	}
}