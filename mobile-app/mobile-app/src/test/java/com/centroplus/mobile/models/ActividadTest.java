package com.centroplus.mobile.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ActividadTest {
    @Test
    void constructorCompletoTest() {

        Actividad actividad = new Actividad(
                1,
                "Yoga",
                "Deportiva",
                60,
                15.5,
                20,
                10
        );

        assertEquals(1, actividad.getId());
        assertEquals("Yoga", actividad.getNombre());
        assertEquals("Deportiva", actividad.getTipoActividad());
        assertEquals(60, actividad.getDuracion());
        assertEquals(15.5, actividad.getPrecio());
    }

    @Test
    void constructorIdTest() {

        Actividad actividad = new Actividad(3);

        assertEquals(3, actividad.getId());
    }

    @Test
    void equalsTest() {

        Actividad a1 = new Actividad(1);
        Actividad a2 = new Actividad(1);

        assertTrue(a1.equals(a2));
    }

    @Test
    void hashCodeTest() {

        Actividad a1 = new Actividad(1);
        Actividad a2 = new Actividad(1);

        assertEquals(a1.hashCode(), a2.hashCode());
    }

    @Test
    void toStringTest() {

        Actividad actividad = new Actividad(
                1,
                "Yoga",
                "Deportiva",
                60,
                15.5,
                20,
                10
        );

        assertNotNull(actividad.toString());
        assertTrue(actividad.toString().contains("Yoga"));
    }
}
