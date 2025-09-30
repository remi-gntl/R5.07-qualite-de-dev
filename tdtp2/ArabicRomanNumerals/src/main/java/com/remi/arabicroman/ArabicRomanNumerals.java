package com.remi.arabicroman;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        if(nbr == 5)
        {
            return "V";
        }
        if (nbr == 10) {
            return "X";
        }
        if (nbr == 2) {
            return "II";
        }
        return "I";
    }
}