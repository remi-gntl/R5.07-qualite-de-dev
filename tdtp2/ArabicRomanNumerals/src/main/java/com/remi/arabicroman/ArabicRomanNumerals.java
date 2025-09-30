package com.remi.arabicroman;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String resultat = "";

        // Traiter les 50
        while (nbr >= 50) {
            resultat += "L";
            nbr -= 50;
        }

        // Traiter le 40
        if (nbr >= 40) {
            resultat += "XL";
            nbr -= 40;
        }

        // Traiter les 10
        while (nbr >= 10) {
            resultat += "X";
            nbr -= 10;
        }

        // Traiter le 9
        if (nbr == 9) {
            resultat += "IX";
            nbr -= 9;
        }

        // Traiter les 5
        if (nbr >= 5) {
            resultat += "V";
            nbr -= 5;
        }

        // Traiter le 4
        if (nbr == 4) {
            resultat += "IV";
            nbr -= 4;
        }

        // Traiter les 1
        while (nbr >= 1) {
            resultat += "I";
            nbr -= 1;
        }

        return resultat;
    }
}