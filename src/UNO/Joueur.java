package UNO;

import Exceptions.CarteNePeutPasEtrePoseeException;
import Exceptions.CarteNonPossedeeException;
import Exceptions.JoueurPasSonTourException;
import UNO.Cartes.Carte;

import java.util.ArrayList;

public class Joueur {
    private Partie partie;
    private String nom;
    private ArrayList<Carte> laMain = new ArrayList<>();
    private boolean aDitUno;

    public Joueur(String nom, Partie p) {
        this.nom = nom;
        this.partie = p;
    }
    public ArrayList<Carte> getLaMain() {
        return laMain;
    }

    public boolean aDitUno() {return aDitUno;}

    public boolean estJoueurCourant() {
        if (this == partie.getJoueurCourant())
            return true;
        else
            return false;
    }

    public void ditUno() {aDitUno = true;}

    @Override
    public String toString() {return nom;}


    public void joueCarte(Carte carte) throws CarteNonPossedeeException, CarteNePeutPasEtrePoseeException, JoueurPasSonTourException {
        if (!estJoueurCourant())
            throw new JoueurPasSonTourException("Ce n'est pas le tour de"+this+"");

        partie.changerCouleurCourante(carte.getCouleur());
        laMain.remove(carte);
        partie.ajouterAuTas(carte);
    }
}
