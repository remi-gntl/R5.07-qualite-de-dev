package com.remi.personnage;

public class Personnage {
    private Orientation orientation;

    public Personnage(){
        this.orientation = Orientation.NORD;
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
