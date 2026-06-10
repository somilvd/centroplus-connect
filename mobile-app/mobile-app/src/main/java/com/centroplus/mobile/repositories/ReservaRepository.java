package com.centroplus.mobile.repositories;

import java.util.ArrayList;
import java.util.List;
import com.centroplus.mobile.models.Reserva;

public class ReservaRepository {
    private List<Reserva> reservas;

    public ReservaRepository() {
        reservas = new ArrayList<>();
    }

    public List<Reserva> findAll() {
        return reservas;
    }

    public Reserva findById(Integer id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId().equals(id)) {
                return reserva;
            }
        }
        return null;
    }

    public void save(Reserva reserva) {
        reservas.add(reserva);
    }

    public void update(Reserva reservaActualizada) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId().equals(reservaActualizada.getId())) {
                reservas.set(i, reservaActualizada);
                return;
            }
        }
    }

    public void delete(Integer id) {
        Reserva reserva = findById(id);
        if (reserva != null) {
            reservas.remove(reserva);
        }
    }
}