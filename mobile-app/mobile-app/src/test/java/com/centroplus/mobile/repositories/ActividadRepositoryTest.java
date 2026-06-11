package com.centroplus.mobile.repositories;

import com.centroplus.mobile.models.Actividad;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActividadRepositoryTest {

    @Test
    void findAllFuncionaTest() {
        ActividadRepository repo = new ActividadRepository();

        List<Actividad> lista = repo.findAll();

        assertNotNull(lista);
        assertEquals(3, lista.size());
    }

    @Test
    void findByIdFuncionaTest() {
        ActividadRepository repo = new ActividadRepository();

        Actividad actividad = repo.findById(1);

        assertNotNull(actividad);
        assertEquals("Fútbol", actividad.getNombre());
    }

    @Test
    void findByIdNoExisteTest() {
        ActividadRepository repo = new ActividadRepository();

        Actividad actividad = repo.findById(99);

        assertNull(actividad);
    }

    @Test
    void saveFuncionaTest() {
        ActividadRepository repo = new ActividadRepository();

        boolean resultado = repo.save(new Actividad(10));

        assertTrue(resultado);
        assertEquals(4, repo.findAll().size());
    }

    @Test
    void updateFuncionaTest() {
        ActividadRepository repo = new ActividadRepository();

        Actividad nueva = new Actividad(1, "Yoga", "Deportiva", 60, 10, 20, 5);

        boolean resultado = repo.update(nueva);

        assertTrue(resultado);
        assertEquals("Yoga", repo.findById(1).getNombre());
    }

    @Test
    void deleteFuncionaTest() {
        ActividadRepository repo = new ActividadRepository();

        boolean resultado = repo.delete(1);

        assertTrue(resultado);
        assertNull(repo.findById(1));
    }
}