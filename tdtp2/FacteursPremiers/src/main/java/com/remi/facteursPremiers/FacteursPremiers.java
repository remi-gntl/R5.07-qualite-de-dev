package com.remi.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    public static List<Integer> generate (int nombre) {
        List<Integer> resultat = new ArrayList<>();

        for(int diviseur = 2; diviseur <= nombre; diviseur++) {
            while (nombre % diviseur == 0) {
                resultat.add(diviseur);
                nombre = nombre / diviseur;
            }
        }

        return resultat;
    }
}
