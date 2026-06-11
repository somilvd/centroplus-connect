package com.centroplus.mobile.repositories;

import com.centroplus.mobile.models.Incidencia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncidenciaRepositoryTest {

    @Test
    void findAllFuncionaTest() {
        IncidenciaRepository repo = new IncidenciaRepository();

        assertEquals(0, repo.findAll().size());
    }

    @Test
    void saveFuncionaTest() {
        IncidenciaRepository repo = new IncidenciaRepository();

        boolean resultado = repo.save(new Incidencia(1));

        assertTrue(resultado);
        assertEquals(1, repo.findAll().size());
    }

    @Test
    void findByIdFuncionaTest() {
        IncidenciaRepository repo = new IncidenciaRepository();

        Incidencia i = new Incidencia(1);
        repo.save(i);

        assertNotNull(repo.findById(1));
    }

    @Test
    void findByIdNoExisteTest() {
        IncidenciaRepository repo = new IncidenciaRepository();

        assertNull(repo.findById(99));
    }

    @Test
    void updateFuncionaTest() {
        IncidenciaRepository repo = new IncidenciaRepository();

        repo.save(new Incidencia(1));

        Incidencia nueva = new Incidencia(1);
        nueva.setAsunto("Nuevo");

        boolean resultado = repo.update(nueva);

        assertTrue(resultado);
    }

    @Test
    void deleteFuncionaTest() {
        IncidenciaRepository repo = new IncidenciaRepository();

        repo.save(new Incidencia(1));

        boolean resultado = repo.delete(1);

        assertTrue(resultado);
    }
}