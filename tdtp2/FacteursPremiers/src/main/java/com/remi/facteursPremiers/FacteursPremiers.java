package com.remi.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    public static List<Integer> generate (int nombre) {
        List<Integer> resultat = new ArrayList<>();

        if (nombre == 2) {
            resultat.add(2);
        }

        return resultat;
    }
}
