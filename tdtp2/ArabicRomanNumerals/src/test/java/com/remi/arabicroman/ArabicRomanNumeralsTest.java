package com.remi.arabicroman;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {
    @Test
    public void convertUnDonneI() {
        String resultat = ArabicRomanNumerals.convert(1);
        assertThat(resultat).isEqualTo("I");
    }

}