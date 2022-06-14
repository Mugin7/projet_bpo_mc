package Experts;

import Exceptions.ParserManquantException;
import UNO.Cartes.Carte;
import UNO.Partie;

public abstract class Expert {
    private Expert suivant = null;
    private Partie partie;

    public Expert(Expert suivant, Partie partie) {
        this.suivant = suivant;
        this.partie = partie;
    }

    public void traiter(Carte carte) throws Exception {
        if (saitJouer(carte))
            jouer(carte);
        else if (aUnSuivant())
            getSuivant().traiter(carte);
        else
            throw new ParserManquantException();
    }

    private Expert getSuivant() {
        return suivant;
    }

    private boolean aUnSuivant() {
        return suivant != null;
    }

    public abstract void jouer(Carte carte) throws Exception;

    public abstract boolean saitJouer(Carte carte);
}
