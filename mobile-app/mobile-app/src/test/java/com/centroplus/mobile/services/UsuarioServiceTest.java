package com.centroplus.mobile.services;

import com.centroplus.mobile.models.Usuario;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioServiceTest {

    @Test
    void findAllFuncionaTest() {
        UsuarioService service = new UsuarioService();

        List<Usuario> lista = service.findAll();

        assertNotNull(lista);
        assertEquals(2, lista.size());
    }

    @Test
    void findByIdFuncionaTest() {
        UsuarioService service = new UsuarioService();

        Usuario usuario = service.findById(1);

        assertNotNull(usuario);
        assertEquals("Carlos", usuario.getNombre());
    }

    @Test
    void findByIdNullTest() {
        UsuarioService service = new UsuarioService();

        Usuario usuario = service.findById(99);

        assertNull(usuario);
    }
}