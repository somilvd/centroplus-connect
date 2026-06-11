package com.centroplus.mobile.repositories;

import java.util.ArrayList;
import java.util.List;
import com.centroplus.mobile.models.Incidencia;

public class IncidenciaRepository {
    private List<Incidencia> incidencias;

    public IncidenciaRepository() {
        incidencias = new ArrayList<>();
    }

    public List<Incidencia> findAll() {
        return incidencias;
    }

    public Incidencia findById(Integer id) {
        for (Incidencia incidencia : incidencias) {
            if (incidencia.getId() == id) {
                return incidencia;
            }
        }
        return null;
    }

    public boolean save(Incidencia incidencia) {
        return incidencias.add(incidencia);
    }

    public boolean update(Incidencia incidenciaActualizada) {
        for (int i = 0; i < incidencias.size(); i++) {
            if (incidencias.get(i).getId() == incidenciaActualizada.getId()) {
                incidencias.set(i, incidenciaActualizada);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Integer id) {
        Incidencia incidencia = findById(id);
        if (incidencia != null) {
            return incidencias.remove(incidencia);
        }
        return false;
    }
}