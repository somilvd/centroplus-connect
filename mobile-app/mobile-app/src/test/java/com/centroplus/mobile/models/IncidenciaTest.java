package com.centroplus.mobile.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncidenciaTest {

    @Test
    void constructorCompletoTest() {

        Incidencia incidencia = new Incidencia(
                1,
                2,
                "Error",
                "No funciona",
                "01/01/2025",
                "Abierta"
        );

        assertEquals(1, incidencia.getId());
        assertEquals(2, incidencia.getIdUsuario());
        assertEquals("Error", incidencia.getAsunto());
    }

    @Test
    void settersTest() {

        Incidencia incidencia = new Incidencia();

        incidencia.setId(1);
        incidencia.setIdUsuario(2);
        incidencia.setAsunto("Prueba");
        incidencia.setDescripcion("Descripcion");
        incidencia.setFecha("Hoy");
        incidencia.setEstado("Cerrada");

        assertEquals("Prueba", incidencia.getAsunto());
        assertEquals("Cerrada", incidencia.getEstado());
    }

    @Test
    void equalsTest() {

        Incidencia i1 = new Incidencia(1);
        Incidencia i2 = new Incidencia(1);

        assertEquals(i1, i2);
    }

    @Test
    void hashCodeTest() {

        Incidencia i1 = new Incidencia(1);
        Incidencia i2 = new Incidencia(1);

        assertEquals(i1.hashCode(), i2.hashCode());
    }

    @Test
    void probarToString() {

        Incidencia incidencia = new Incidencia(
                1,
                2,
                "Error",
                "Descripcion",
                "Hoy",
                "Abierta"
        );

        assertTrue(incidencia.toString().contains("Error"));
    }
}