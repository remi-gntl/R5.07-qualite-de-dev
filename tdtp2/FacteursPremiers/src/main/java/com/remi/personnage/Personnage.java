package com.remi.personnage;

public class Personnage {
    private Orientation orientation;

    public Personnage(){
        this.orientation = Orientation.NORD;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public Orientation tourner(int fois) {
        Orientation[] orientations = {Orientation.NORD, Orientation.EST, Orientation.SUD, Orientation.OUEST};

        //pos actuelle dans tableau
        int positionActuelle = 0;
        for (int i = 0; i < orientations.length; i++) {
            if (orientations[i] == this.orientation) {
                positionActuelle = i;
                break;
            }
        }

        // Nouvelle position après rotation
        int nouvellePosition = (positionActuelle + fois) % 4;

        // Mise à jour de l'orientation
        this.orientation = orientations[nouvellePosition];

        return this.orientation;
    }
}
