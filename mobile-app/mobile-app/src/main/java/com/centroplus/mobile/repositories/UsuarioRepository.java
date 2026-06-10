package com.centroplus.mobile.repositories;

import java.util.ArrayList;
import java.util.List;
import com.centroplus.mobile.models.Usuario;

public class UsuarioRepository {
    private List<Usuario> usuarios;

    public UsuarioRepository() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "Carlos", "11111111A", "carlos@gmail.com", 666111222, "CLIENTE"));
        usuarios.add(new Usuario(2, "Ana", "22222222B", "ana@gmail.com", 666333444, "CLIENTE"));
    }

    public List<Usuario> findAll() {
        return usuarios;
    }

    public Usuario findById(Integer id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public void save(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void update(Usuario usuarioActualizado) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId().equals(usuarioActualizado.getId())) {
                usuarios.set(i, usuarioActualizado);
                return;
            }
        }
    }

    public void delete(Integer id) {
        Usuario usuarioEliminar = findById(id);
        if (usuarioEliminar != null) {
            usuarios.remove(usuarioEliminar);
        }
    }
}