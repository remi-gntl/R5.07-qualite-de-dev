package com.remi.arabicroman;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {
    @Test
    public void convertUnDonneI() {
        // given
        int nombre = 1;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("I");
    }

    @Test
    public void convertCinqDonneV() {
        // given
        int nombre = 5;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("V");
    }

    @Test
    public void convertDixDonneX() {
        // given
        int nombre = 10;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("X");
    }

    @Test
    public void convertDeuxDonneII() {
        // given
        int nombre = 2;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("II");
    }

    @Test
    public void convertTroisDonneIII() {
        // given
        int nombre = 3;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("III");
    }

    @Test
    public void convertSixDonneVI() {
        // given
        int nombre = 6;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("VI");
    }

    @Test
    public void convertQuatreDonneIV() {
        // given
        int nombre = 4;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("IV");
    }

    @Test
    public void convertNeufDonneIX() {
        // given
        int nombre = 9;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("IX");
    }

    @Test
    public void convertQuatorzeDonneXIV() {
        // given
        int nombre = 14;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("XIV");
    }

    @Test
    public void convertDixNeufDonneXIX() {
        // given
        int nombre = 19;

        // when
        String resultat = ArabicRomanNumerals.convert(nombre);

        // then
        assertThat(resultat).isEqualTo("XIX");
    }

    @Test
    public void convertTrenteNeufDonneXXXIX() {
        // given
        int nombre = 39;
        // when
        String resultat = ArabicRomanNumerals.convert(nombre);
        // then
        assertThat(resultat).isEqualTo("XXXIX");
    }

    @Test
    public void convertQuaranteDonneXL() {
        // given
        int nombre = 40;
        // when
        String resultat = ArabicRomanNumerals.convert(nombre);
        // then
        assertThat(resultat).isEqualTo("XL");
    }

    @Test
    public void convertCinquanteDonneL() {
        // given
        int nombre = 50;
        // when
        String resultat = ArabicRomanNumerals.convert(nombre);
        // then
        assertThat(resultat).isEqualTo("L");
    }
}

