package com.remi.arabicroman;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String resultat = "";

        // Traiter les 10
        while (nbr >= 10) {
            resultat += "X";
            nbr -= 10;
        }

        // Traiter les 5
        if (nbr >= 5) {
            resultat += "V";
            nbr -= 5;
        }

        // Traiter les 1
        while (nbr >= 1) {
            resultat += "I";
            nbr -= 1;
        }

        return resultat;
    }
}