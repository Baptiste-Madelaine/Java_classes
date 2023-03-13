package exercice1;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;

/**
 * gere un paquet de cartes
 */

public class PaquetCartes {
    private ArrayList<Carte> paquet;
    private int nbCartes;

    /**
     * cree un paquet vide
      */

    public PaquetCartes(int size){
        this.paquet = new ArrayList<Carte>();
        if(size != 32 && size != 52) {
        	throw new IllegalArgumentException("Nombres de cartes imoossible");
        }
        nbCartes=size;
    }

    /**
     * ajoute une carte au paquet
     * @param c  une carte
     */
    public void ajouter(Carte c)throws ExceptionDeCarteInvalide{
    	for(Carte i : paquet) {
    		if(c.equals(i)) {
    			throw new ExceptionDeCarteInvalide("Déjà dans le paquet");
    		}	
    	}
    	this.paquet.add(c);
    }

    /**
     * @return une chaine de caractères contenant la description de l'ensemble des cartes du paquet.
     */
    @Override
    public String toString() {
        String s = "";
        if (paquet.size() != 0){
            for (int i = 0; i < paquet.size(); i++) {
                s += " " + paquet.get(i) + ", ";
                if ((i % 4) == 3) s += "\n";
            }
        }
        return s;
    }

    /**
     * mélange un paquet de cartes
     */
    public void melanger(){
        int nbcartes = paquet.size();
        Random rand = new Random();
        int nbmelange=nbcartes*10;

        for (int i=0; i<nbmelange; i++){
            int position = rand.nextInt(nbcartes);
            Carte c=paquet.remove(position);
            paquet.add(c);
        }
    }

    /**
     *
     * @return le nombre de cartes du paquet
     */
    public int getNbCartes(){
        return paquet.size();
    }

    /**
     *
     * @return true si le paquet est vide, false sinon
     */
    public boolean estPaquetVide(){
        return paquet.size()==0;
    }

    /**
     *
     * @return la carte du dessus du paquet. La carte est supprimee du paquet.
     * @throws ExceptionDeTasVide 
     */
    public Carte tirerCarteDessus(Joueur j)throws ExceptionDeTasVide{
    	if(paquet.isEmpty()) {
    		throw new ExceptionDeTasVide("Tas vide", j);
    	}
        return paquet.remove(0);
    }

    /**
     * ajoute une carte en dessous du paquet
     * @param c  une carte
     */
    public void mettreCarteDessous(Carte c){
    	if(nbCartes==32 && c.getHauteur().compareTo(Hauteurs.SIX)>0) {
    		throw new ExceptionDeCarteInvalide("Carte impossible dans un jeu 32 Cartes !");
    	}
        paquet.add(c);
    }




}
