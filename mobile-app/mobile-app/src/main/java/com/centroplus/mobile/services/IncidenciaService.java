package com.centroplus.mobile.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.centroplus.mobile.models.Incidencia;
import com.centroplus.mobile.repositories.*;

public class IncidenciaService {
    private IncidenciaRepository incidenciaRepository;

    public IncidenciaService() {
        incidenciaRepository = new IncidenciaRepository();
    }

    public List<Incidencia> findAll() {
        return incidenciaRepository.findAll();
    }

    public boolean crearIncidencia(Integer idUsuario, String asunto, String descripcion) {
        if (asunto == null || asunto.isEmpty()) {
            return false;
        }
        if (descripcion == null || descripcion.isEmpty()) {
            return false;
        }
        Integer nuevoId = incidenciaRepository.findAll().size() + 1;
        Incidencia incidencia = new Incidencia(nuevoId, idUsuario, asunto, descripcion, LocalDate.now().toString(),
                "ABIERTA");
        incidenciaRepository.save(incidencia);
        return true;
    }

    public boolean cambiarEstado(Integer id, String estado) {
        Incidencia incidencia = incidenciaRepository.findById(id);
        if (incidencia == null) {
            return false;
        }
        incidencia.setEstado(estado);
        incidenciaRepository.update(incidencia);
        return true;
    }

    public List<Incidencia> findByUsuario(Integer idUsuario) {
        List<Incidencia> incidenciasUsuario = new ArrayList<>();
        for (Incidencia incidencia : incidenciaRepository.findAll()) {
            if (incidencia.getIdUsuario() == idUsuario) {
                incidenciasUsuario.add(incidencia);
            }
        }
        return incidenciasUsuario;
    }

    public Incidencia findById(int id) {

        for (Incidencia incidencia : incidenciaRepository.findAll()) {

            if (incidencia.getId() == id) {

                return incidencia;
            }
        }

        return null;
    }

    public boolean delete(int id) {

        Incidencia incidencia = findById(id);

        if (incidencia == null) {

            return false;
        }

        incidenciaRepository.delete(id);

        return true;
    }
}