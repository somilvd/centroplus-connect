package com.centroplus.mobile.repositories;

import com.centroplus.mobile.models.Reserva;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservaRepositoryTest {

    @Test
    void findAllFuncionaTest() {
        ReservaRepository repo = new ReservaRepository();

        List<Reserva> lista = repo.findAll();

        assertNotNull(lista);
        assertEquals(0, lista.size());
    }

    @Test
    void saveFuncionaTest() {
        ReservaRepository repo = new ReservaRepository();

        boolean resultado = repo.save(new Reserva(1));

        assertTrue(resultado);
        assertEquals(1, repo.findAll().size());
    }

    @Test
    void findByIdFuncionaTest() {
        ReservaRepository repo = new ReservaRepository();

        Reserva r = new Reserva(1);
        repo.save(r);

        assertNotNull(repo.findById(1));
    }

    @Test
    void findByIdNoExisteTest() {
        ReservaRepository repo = new ReservaRepository();

        assertNull(repo.findById(99));
    }

    @Test
    void updateFuncionaTest() {
        ReservaRepository repo = new ReservaRepository();

        repo.save(new Reserva(1));

        Reserva nueva = new Reserva(1);
        nueva.setEstado("CANCELADA");

        boolean resultado = repo.update(nueva);

        assertTrue(resultado);
    }

    @Test
    void deleteFuncionaTest() {
        ReservaRepository repo = new ReservaRepository();

        repo.save(new Reserva(1));

        boolean resultado = repo.delete(1);

        assertTrue(resultado);
    }
}