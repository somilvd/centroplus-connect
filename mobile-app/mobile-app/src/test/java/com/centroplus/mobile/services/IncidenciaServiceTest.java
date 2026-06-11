package com.centroplus.mobile.services;

import com.centroplus.mobile.models.Incidencia;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IncidenciaServiceTest {

    @Test
    void findAllFuncionaTest() {
        IncidenciaService service = new IncidenciaService();

        List<Incidencia> lista = service.findAll();

        assertNotNull(lista);
    }

    @Test
    void crearIncidenciaFuncionaTest() {
        IncidenciaService service = new IncidenciaService();

        boolean resultado = service.crearIncidencia(1, "Error", "No funciona");

        assertTrue(resultado);
    }

    @Test
    void crearIncidenciaFallidaTest() {
        IncidenciaService service = new IncidenciaService();

        boolean resultado = service.crearIncidencia(1, "", "");

        assertFalse(resultado);
    }

    @Test
    void cambiarEstadoFuncionaTest() {
        IncidenciaService service = new IncidenciaService();

        service.crearIncidencia(1, "Error", "Descripcion");

        boolean resultado = service.cambiarEstado(1, "CERRADA");

        assertTrue(resultado);
    }

    @Test
    void findByUsuarioFuncionaTest() {
        IncidenciaService service = new IncidenciaService();

        service.crearIncidencia(1, "Error", "Descripcion");

        List<Incidencia> lista = service.findByUsuario(1);

        assertNotNull(lista);
    }

    @Test
    void deleteFuncionaTest() {
        IncidenciaService service = new IncidenciaService();

        service.crearIncidencia(1, "Error", "Descripcion");

        boolean resultado = service.delete(1);

        assertTrue(resultado);
    }
}