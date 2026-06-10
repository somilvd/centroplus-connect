package com.centroplus.mobile.services;

import java.util.List;
import com.centroplus.mobile.models.Usuario;
import com.centroplus.mobile.repositories.*;

public class UsuarioService {
    private UsuarioRepository repository;

    public UsuarioService() {
        repository = new UsuarioRepository();
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Integer id) {
        return repository.findById(id);
    }
}