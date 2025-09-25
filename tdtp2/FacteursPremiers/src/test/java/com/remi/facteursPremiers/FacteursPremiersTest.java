package com.remi.facteursPremiers;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class FacteursPremiersTest {

    @Test
    public void generate1_doitRetournerListeVide() {
        // Given
        int nombre = 1;

        // When
        List<Integer> resultat = FacteursPremiers.generate(nombre);

        // Then
        assertThat(resultat).isEmpty();
    }

    @Test
    public void generate2_doitRetournerListeVide() {
        //given
        int nombre = 2;

        //when
        List<Integer> resultat = FacteursPremiers.generate(nombre);

        //Then
        assertThat(resultat).containsExactly(2);
    }
}