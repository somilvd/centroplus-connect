package com.centroplus.mobile.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void constructorCompletoTest() {

        Reserva reserva = new Reserva(
                1,
                2,
                3,
                "01/01/2025",
                "Activa"
        );

        assertEquals(1, reserva.getId());
        assertEquals(2, reserva.getIdUsuario());
        assertEquals(3, reserva.getIdActividad());
    }

    @Test
    void settersTest() {

        Reserva reserva = new Reserva();

        reserva.setId(10);
        reserva.setIdUsuario(5);
        reserva.setIdActividad(8);
        reserva.setFecha("Hoy");
        reserva.setEstado("Cancelada");

        assertEquals(10, reserva.getId());
        assertEquals("Cancelada", reserva.getEstado());
    }

    @Test
    void equalsTest() {

        Reserva r1 = new Reserva(1);
        Reserva r2 = new Reserva(1);

        assertEquals(r1, r2);
    }

    @Test
    void hashCodeTest() {

        Reserva r1 = new Reserva(1);
        Reserva r2 = new Reserva(1);

        assertEquals(r1.hashCode(), r2.hashCode());
    }

    @Test
    void toStringTest() {

        Reserva reserva = new Reserva(
                1,
                2,
                3,
                "Hoy",
                "Activa"
        );

        assertTrue(reserva.toString().contains("Activa"));
    }
}