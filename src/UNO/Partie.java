package UNO;

import Enums.Couleur;
import UNO.Cartes.Carte;

import java.util.ArrayList;

public class Partie {
    private ArrayList<Carte> laPioche = new ArrayList<>();
    private ArrayList<Carte> leTas = new ArrayList<>();

    private ArrayList<Joueur> lesJoueurs = new ArrayList<>();
    private int nombreJoueurs = 0;
    private Couleur couleurCourante = Couleur.NOIR;
    private Joueur joueurCourant = lesJoueurs.get(0);

    public Partie() {
    }

    /* private void creerPioche() {
        for (Couleur c : Couleur.values()) {
            if (c == Couleur.NOIR) {
                for (int i=0 ; i<4 ; i++) {
                    laPioche.add(new Carte(c, Valeur.PLUS_QUATRE));
                    laPioche.add(new Carte(c, Valeur.CHOIX_COULEUR));
                }
            }
            else {
                for (Valeur v : Valeur.values()) {
                    if (v == Valeur.ZERO)
                        laPioche.add(new Carte(c, v));
                    else if (v != Valeur.CHOIX_COULEUR && v != Valeur.PLUS_QUATRE) {
                        laPioche.add(new Carte(c, v));
                        laPioche.add(new Carte(c, v));
                    }
                }
            }
        }
    }

    public void melangePioche() {
        for (int i=0 ; i < 1000 ; i++) {
            int i1 = new Random().nextInt(laPioche.size());
            int i2 = new Random().nextInt(laPioche.size());
            Collections.swap(laPioche, i1, i2);
        }
    } */

    public void changerCouleurCourante (Couleur c) { this.couleurCourante = c; }
    public void ajouterAuTas (Carte c) { leTas.add(c); }
    public void ajouterJoueur(Joueur j) {
        lesJoueurs.add(j);
        nombreJoueurs++;
    }
    public ArrayList<Carte> getLaPioche() {
        return laPioche;
    }
    public Couleur getCouleurCourante() {
        return couleurCourante;
    }

    public int getNombreJoueurs() { return nombreJoueurs; }

    public Joueur getJoueurCourant() { return joueurCourant; }

    public ArrayList<Joueur> getLesJoueurs() { return lesJoueurs; }
    public ArrayList<Carte> getLeTas() { return leTas; }
    public Carte derniereCarteDuTas () { return leTas.get(leTas.size()-1); }
}
