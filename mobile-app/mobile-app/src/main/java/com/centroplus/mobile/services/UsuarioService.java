package com.centroplus.mobile.services;

import java.util.List;
import com.centroplus.mobile.models.Usuario;
import com.centroplus.mobile.repositories.*;

public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService() {
        usuarioRepository = new UsuarioRepository();
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id);
    }
}