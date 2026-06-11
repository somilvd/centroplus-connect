package com.centroplus.mobile.services;

import java.time.LocalDate;
import java.util.List;

import com.centroplus.mobile.models.Actividad;
import com.centroplus.mobile.models.Reserva;
import com.centroplus.mobile.repositories.*;

public class ReservaService {

    private ReservaRepository reservaRepository;
    private ActividadService actividadService;

    public ReservaService() {

        reservaRepository = new ReservaRepository();
        actividadService = new ActividadService();
    }

    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    public boolean crearReserva(Integer idUsuario, Integer idActividad) {

        Actividad actividad = actividadService.findById(idActividad);

        if (actividad == null)
            return false;

        int disponibles = actividad.getPlazasMaximas() - actividad.getPlazasOcupadas();

        if (disponibles <= 0)
            return false;

        Reserva nuevaReserva = new Reserva(
                reservaRepository.findAll().size() + 1,
                idUsuario,
                idActividad,
                LocalDate.now().toString(),
                "ACTIVA");

        reservaRepository.save(nuevaReserva);

        return actividadService.reservarPlaza(idActividad);
    }

    public boolean cancelarReserva(Integer idReserva) {

        Reserva reserva = reservaRepository.findById(idReserva);

        if (reserva == null) {
            return false;
        }

        actividadService.cancelarPlaza(reserva.getIdActividad());

        reserva.setEstado("CANCELADA");

        return reservaRepository.update(reserva);
    }
}