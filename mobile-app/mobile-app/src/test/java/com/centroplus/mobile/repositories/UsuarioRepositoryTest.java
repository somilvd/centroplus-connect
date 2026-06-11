package com.centroplus.mobile.repositories;

import com.centroplus.mobile.models.Usuario;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioRepositoryTest {

    @Test
    void findAllFuncionaTest() {
        UsuarioRepository repo = new UsuarioRepository();

        List<Usuario> lista = repo.findAll();

        assertNotNull(lista);
        assertEquals(2, lista.size());
    }

    @Test
    void findByIdFuncionaTest() {
        UsuarioRepository repo = new UsuarioRepository();

        Usuario u = repo.findById(1);

        assertNotNull(u);
        assertEquals("Carlos", u.getNombre());
    }

    @Test
    void findByIdNoExisteTest() {
        UsuarioRepository repo = new UsuarioRepository();

        assertNull(repo.findById(99));
    }

    @Test
    void saveFuncionaTest() {
        UsuarioRepository repo = new UsuarioRepository();

        boolean resultado = repo.save(new Usuario(10));

        assertTrue(resultado);
        assertEquals(3, repo.findAll().size());
    }

    @Test
    void updateFuncionaTest() {
        UsuarioRepository repo = new UsuarioRepository();

        Usuario u = new Usuario(1, "Pedro", "123", "p@gmail.com", 111, "CLIENTE");

        boolean resultado = repo.update(u);

        assertTrue(resultado);
        assertEquals("Pedro", repo.findById(1).getNombre());
    }

    @Test
    void deleteFuncionaTest() {
        UsuarioRepository repo = new UsuarioRepository();

        boolean resultado = repo.delete(1);

        assertTrue(resultado);
        assertNull(repo.findById(1));
    }
}