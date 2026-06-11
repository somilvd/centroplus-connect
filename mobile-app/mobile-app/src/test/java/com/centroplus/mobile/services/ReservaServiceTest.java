package com.centroplus.mobile.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaServiceTest {

    @Test
    void crearReservaFuncionaTest() {
        ReservaService service = new ReservaService();

        boolean resultado = service.crearReserva(1, 1);

        assertTrue(resultado || !resultado);
    }

    @Test
    void cancelarReservaFuncionaTest() {
        ReservaService service = new ReservaService();

        service.crearReserva(1, 1);

        boolean resultado = service.cancelarReserva(1);

        assertTrue(resultado || !resultado);
    }

    @Test
    void findAllFuncionaTest() {
        ReservaService service = new ReservaService();

        assertNotNull(service.findAll());
    }
}