package UNO.Cartes;

import Enums.Couleur;

public abstract class CarteColoree extends Carte {
    private final Couleur couleur;

    public CarteColoree(Couleur couleur) {
        this.couleur = couleur;
    }
}
