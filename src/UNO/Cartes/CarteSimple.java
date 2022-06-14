package UNO.Cartes;

import Enums.Couleur;
import Enums.Valeur;

public class CarteSimple extends CarteColoree {
    private final Valeur valeur;

    public CarteSimple(Couleur couleur, Valeur valeur) {
        super(couleur);
        this.valeur = valeur;
    }

    public Valeur getValeur() {
        return valeur;
    }
}
