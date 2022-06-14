package Tests;

import Enums.Couleur;
import Enums.Valeur;
import UNO.Cartes.Carte;
import UNO.Joueur;
import UNO.Partie;

public class TestsCartesSimples {

    public TestsCartesSimples(Partie p) {
        p = reinitialiserPartieCarteSimple();
    }

    public Partie reinitialiserPartieCarteSimple() {
       Partie partie = new Partie();

        Joueur Alice = new Joueur("Alice", partie);
        Joueur Bob = new Joueur ("Bob", partie);
        Joueur Charles = new Joueur("Charles", partie);

        Carte c = new Carte(Couleur.VERT, Valeur.DEUX);
        Alice.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.JAUNE, Valeur.SIX);
        Alice.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.ROUGE, Valeur.UN);
        Alice.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.BLEU, Valeur.DEUX);
        Bob.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.JAUNE, Valeur.QUATRE);
        Bob.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.ROUGE, Valeur.NEUF);
        Bob.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.BLEU, Valeur.NEUF);
        Charles.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.BLEU, Valeur.SEPT);
        Charles.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.BLEU, Valeur.ZERO);
        Charles.getLaMain().add(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.VERT, Valeur.HUIT);
        partie.ajouterAuTas(c);
        partie.getLaPioche().remove(c);

        c = new Carte(Couleur.JAUNE, Valeur.SIX);
        partie.getLaPioche().add(c);
        c = new Carte(Couleur.ROUGE, Valeur.QUATRE);
        partie.getLaPioche().add(c);
        c = new Carte(Couleur.VERT, Valeur.DEUX);
        partie.getLaPioche().add(c);
        c = new Carte(Couleur.BLEU, Valeur.CINQ);
        partie.getLaPioche().add(c);
        c = new Carte(Couleur.VERT, Valeur.ZERO);
        partie.getLaPioche().add(c);

        return partie;
    }
}
