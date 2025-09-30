package com.remi.arabicroman;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        if(nbr == 5)
        {
            return "V";
        }
        else if (nbr == 10) {
            return "X";
        }
        return "I";
    }
}