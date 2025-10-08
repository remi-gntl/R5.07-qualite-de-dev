package com.controle.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void fizzBuzz_de_1_devrait_retourner_1() {
        // GIVEN
        int nombre = 1;

        // WHEN
        String resultat = FizzBuzz.de(nombre);

        // THEN
        Assertions.assertThat(resultat).isEqualTo("1");
    }
}
