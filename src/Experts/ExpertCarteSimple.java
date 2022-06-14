package Experts;

import UNO.Cartes.Carte;
import UNO.Partie;

public class ExpertCarteSimple extends Expert {

    public ExpertCarteSimple(Expert e, Partie p) {
        super(e, p);
    }

    @Override
    public void jouer(Carte carte) throws Exception {

    }

    @Override
    public boolean saitJouer(Carte carte) {
        /*if ((carte.getCouleur() == Couleur.ROUGE || carte.getCouleur() == Couleur.BLEU || carte.getCouleur() == Couleur.JAUNE || carte.getCouleur() == Couleur.VERT) && (carte.getValeur() == Valeur.ZERO || carte.getValeur() == Valeur.UN || carte.getValeur() == Valeur.DEUX || carte.getValeur() == Valeur.TROIS || carte.getValeur() == Valeur.QUATRE || carte.getValeur() == Valeur.CINQ || carte.getValeur() == Valeur.SIX || carte.getValeur() == Valeur.SEPT || carte.getValeur() == Valeur.HUIT || carte.getValeur() == Valeur.NEUF))
            return true;
        else
            return false; */
    }
}
