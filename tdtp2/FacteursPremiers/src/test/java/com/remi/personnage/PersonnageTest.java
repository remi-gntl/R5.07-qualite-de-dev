package com.remi.personnage;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PersonnageTest {

    @Test
    public void nouveauPersonnageEstOrienteNord() {
        //given
        Personnage p = new Personnage();

        //when
        Orientation orientation = p.getOrientation();

        //then
        assertThat(orientation).isEqualTo(Orientation.NORD);
    }

    @Test
    public void tournerDeZeroQuartDeTourNeChangePasOrientation() {
        Personnage p = new Personnage();

        Orientation orientation = p.tourner(0);

        assertThat(orientation).isEqualTo(Orientation.NORD);
    }

    @Test
    public void tournerDUnQuartDeTourDeNordDonneEst() {
        Personnage p = new Personnage();

        Orientation orientation = p.tourner(1);

        assertThat(orientation).isEqualTo(Orientation.EST);
    }
}
