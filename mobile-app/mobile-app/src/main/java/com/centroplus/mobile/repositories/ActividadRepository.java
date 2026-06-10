package com.centroplus.mobile.repositories;

import java.util.ArrayList;
import java.util.List;
import com.centroplus.mobile.models.Actividad;

public class ActividadRepository {
    private List<Actividad> actividades;

    public ActividadRepository() {
        actividades = new ArrayList<>();
        actividades.add(new Actividad(1, "Fútbol", "Deportiva", 60, 15, 20, 10));
        actividades.add(new Actividad(2, "Boxeo", "Deportiva", 45, 12, 15, 15));
        actividades.add(new Actividad(3, "Informatica", "Academica", 90, 25, 30, 12));
    }

    public List<Actividad> findAll() {
        return actividades;
    }

    public Actividad findById(Integer id) {
        for (Actividad actividad : actividades) {
            if (actividad.getId() == id) {
                return actividad;
            }
        }
        return null;
    }

    public void save(Actividad actividad) {
        actividades.add(actividad);
    }

    public void update(Actividad actividadActualizada) {
        for (int i = 0; i < actividades.size(); i++) {
            if (actividades.get(i).getId() == actividadActualizada.getId()) {
                actividades.set(i, actividadActualizada);
                return;
            }
        }
    }

    public void delete(Integer id) {
        Actividad actividad = findById(id);
        if (actividad != null) {
            actividades.remove(actividad);
        }
    }
}