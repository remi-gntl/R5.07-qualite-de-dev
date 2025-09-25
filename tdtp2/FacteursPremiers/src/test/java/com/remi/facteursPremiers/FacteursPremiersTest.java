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
    public void generate2_doitRetourner2() {
        //given
        int nombre = 2;

        //when
        List<Integer> resultat = FacteursPremiers.generate(nombre);

        //Then
        assertThat(resultat).containsExactly(2);
    }

    @Test
    public void generate6_doitRetourner2et3() {

        int nombre = 6;

        List<Integer> resultat = FacteursPremiers.generate(nombre);

        assertThat(resultat).containsExactly(2,3);
    }

    @Test
    public void generate8_doitRetourner2_2_2() {
        int nombre = 8;

        List<Integer> resultat = FacteursPremiers.generate(nombre);

        assertThat(resultat).containsExactly(2, 2, 2);
    }
}