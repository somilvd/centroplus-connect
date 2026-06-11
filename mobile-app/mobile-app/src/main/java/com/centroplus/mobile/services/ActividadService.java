package com.centroplus.mobile.services;

import java.util.ArrayList;
import java.util.List;
import com.centroplus.mobile.models.Actividad;
import com.centroplus.mobile.repositories.*;

public class ActividadService {
    private ActividadRepository repository;

    public ActividadService() {
        repository = new ActividadRepository();
    }

    public List<Actividad> findAll() {
        return repository.findAll();
    }

    public Actividad findById(Integer id) {
        return repository.findById(id);
    }

    public boolean reservarPlaza(Integer idActividad) {
        Actividad actividad = repository.findById(idActividad);
        if (actividad == null || (actividad.getPlazasOcupadas() >= actividad.getPlazasMaximas())) {
            return false;
        }

        actividad = new Actividad(actividad.getId(), actividad.getNombre(), actividad.getTipoActividad(),
                actividad.getDuracion(), actividad.getPrecio(), actividad.getPlazasMaximas(),
                actividad.getPlazasOcupadas() + 1);
                
        return repository.update(actividad);
    }

    public boolean cancelarPlaza(Integer idActividad) {
        Actividad actividad = repository.findById(idActividad);

        if (actividad == null || actividad.getPlazasOcupadas() <= 0) {
            return false;
        }

        actividad = new Actividad(actividad.getId(), actividad.getNombre(), actividad.getTipoActividad(),
                actividad.getDuracion(), actividad.getPrecio(), actividad.getPlazasMaximas(),
                actividad.getPlazasOcupadas() - 1);

        return repository.update(actividad);
    }

    public List<Actividad> findCompletas() {
        List<Actividad> completas = new ArrayList<>();

        for (Actividad actividad : repository.findAll()) {

            if (actividad.getPlazasOcupadas() >= actividad.getPlazasMaximas()) {
                completas.add(actividad);
            }
        }
        return completas;
    }

    public double calcularIngresosTotales() {
        double total = 0;
        for (Actividad actividad : repository.findAll()) {
            total += actividad.getPrecio() * actividad.getPlazasOcupadas();
        }
        return total;
    }
}