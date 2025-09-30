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
}
