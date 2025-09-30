package com.remi.arabicroman;

public class ArabicRomanNumerals {

    // Table de correspondance : valeurs décroissantes
    private static final int[] VALEURS = {50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLES = {"L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int nbr) {
        StringBuilder resultat = new StringBuilder();

        // Parcourir les valeurs de la plus grande à la plus petite
        for (int i = 0; i < VALEURS.length; i++) {
            // Tant qu'on peut soustraire cette valeur
            while (nbr >= VALEURS[i]) {
                resultat.append(SYMBOLES[i]);
                nbr -= VALEURS[i];
            }
        }

        return resultat.toString();
    }
}