package com.centroplus.mobile.services;

import com.centroplus.mobile.models.Actividad;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActividadServiceTest {

    @Test
    void findAllFuncionaTest() {
        ActividadService service = new ActividadService();

        List<Actividad> lista = service.findAll();

        assertNotNull(lista);
        assertTrue(lista.size() > 0);
    }

    @Test
    void findByIdFuncionaTest() {
        ActividadService service = new ActividadService();

        Actividad actividad = service.findById(1);

        assertNotNull(actividad);
    }

    @Test
    void reservarPlazaFuncionaTest() {
        ActividadService service = new ActividadService();

        boolean resultado = service.reservarPlaza(1);

        assertTrue(resultado);
    }

    @Test
    void cancelarPlazaFuncionaTest() {
        ActividadService service = new ActividadService();

        service.reservarPlaza(1);
        boolean resultado = service.cancelarPlaza(1);

        assertTrue(resultado);
    }

    @Test
    void findCompletasFuncionaTest() {
        ActividadService service = new ActividadService();

        List<Actividad> completas = service.findCompletas();

        assertNotNull(completas);
    }

    @Test
    void calcularIngresosFuncionaTest() {
        ActividadService service = new ActividadService();

        double total = service.calcularIngresosTotales();

        assertTrue(total >= 0);
    }
}