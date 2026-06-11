package com.centroplus.mobile.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void constructorCompletoTest() {

        Usuario usuario = new Usuario(
                1,
                "Juan",
                "12345678A",
                "juan@gmail.com",
                666666666,
                "ADMIN"
        );

        assertEquals("Juan", usuario.getNombre());
        assertEquals("ADMIN", usuario.getTipo_usuario());
    }

    @Test
    void settersTest() {

        Usuario usuario = new Usuario();

        usuario.setId(1);
        usuario.setNombre("Ana");
        usuario.setDni("11111111B");
        usuario.setEmail("ana@gmail.com");
        usuario.setTelefono(999999999);
        usuario.setTipo_usuario("USER");

        assertEquals("Ana", usuario.getNombre());
        assertEquals("USER", usuario.getTipo_usuario());
    }

    @Test
    void constructorIdTest() {

        Usuario usuario = new Usuario(7);

        assertEquals(7, usuario.getId());
    }
}