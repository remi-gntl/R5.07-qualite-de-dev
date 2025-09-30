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
}

