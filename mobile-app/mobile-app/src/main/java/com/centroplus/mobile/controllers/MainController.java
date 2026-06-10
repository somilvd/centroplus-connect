package com.centroplus.mobile.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.centroplus.mobile.models.Actividad;
import com.centroplus.mobile.models.Incidencia;
import com.centroplus.mobile.models.Reserva;
import com.centroplus.mobile.services.*;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

    @FXML
    private ListView<String> listaActividades;

    @FXML
    private ListView<String> listaReservas;

    @FXML
    private ListView<String> listaIncidencias;

    @FXML
    private TextField textoAsunto;

    @FXML
    private TextArea textoDescripcion;

    @FXML
    private Label labelActividades;

    @FXML
    private Label labelReservas;

    private ActividadService actividadService;
    private ReservaService reservaService;
    private IncidenciaService incidenciaService;

    private final Integer USUARIO_ACTUAL = 1;

    @Override
    public void initialize(URL url, ResourceBundle resources) {

        actividadService = new ActividadService();
        reservaService = new ReservaService();
        incidenciaService = new IncidenciaService();

        refreshAll();
    }

    private void refreshAll() {

        cargarActividades();
        cargarReservas();
        cargarIncidencias();
        actualizarInicio();
    }

    private void actualizarInicio() {

        labelActividades.setText(
                String.valueOf(actividadService.findAll().size()));

        int reservasActivas = 0;

        for (Reserva r : reservaService.findAll()) {

            if (!r.getEstado().equalsIgnoreCase("CANCELADA")) {
                reservasActivas++;
            }
        }

        labelReservas.setText(
                String.valueOf(reservasActivas));
    }

    private void cargarActividades() {

        listaActividades.getItems().clear();

        for (Actividad a : actividadService.findAll()) {

            int disponibles = a.getPlazasMaximas() - a.getPlazasOcupadas();

            listaActividades.getItems().add(
                    a.getId()
                            + " - "
                            + a.getNombre()
                            + " | plazas: "
                            + disponibles
                            + " | "
                            + a.getPrecio()
                            + "€");
        }
    }

    private void cargarReservas() {

        listaReservas.getItems().clear();

        for (Reserva r : reservaService.findAll()) {

            if (!r.getEstado().equalsIgnoreCase("CANCELADA")) {

                Actividad actividad = actividadService.findById(
                        r.getIdActividad());

                String nombreActividad = (actividad != null)
                        ? actividad.getNombre()
                        : "Desconocida";

                listaReservas.getItems().add(
                        "Reserva "
                                + r.getId()
                                + " | "
                                + nombreActividad);
            }
        }
    }

    private void cargarIncidencias() {

        listaIncidencias.getItems().clear();

        for (Incidencia i : incidenciaService.findAll()) {

            listaIncidencias.getItems().add(
                    i.getId()
                            + " | "
                            + i.getAsunto()
                            + " | "
                            + i.getEstado());
        }
    }

    @FXML
    public void reservarActividad() {

        String seleccion = listaActividades
                .getSelectionModel()
                .getSelectedItem();

        if (seleccion == null) {

            mostrar(
                    "Selecciona una actividad",
                    Alert.AlertType.WARNING);

            return;
        }

        int idActividad = Integer.parseInt(
                seleccion.split("-")[0].trim());

        boolean ok = reservaService.crearReserva(
                USUARIO_ACTUAL,
                idActividad);

        mostrar(
                ok
                        ? "Reserva realizada"
                        : "No disponible",
                ok
                        ? Alert.AlertType.INFORMATION
                        : Alert.AlertType.ERROR);

        refreshAll();
    }

    @FXML
    public void cancelarReserva() {

        String seleccion = listaReservas
                .getSelectionModel()
                .getSelectedItem();

        if (seleccion == null) {

            mostrar(
                    "Selecciona una reserva",
                    Alert.AlertType.WARNING);

            return;
        }

        int idReserva = Integer.parseInt(
                seleccion
                        .split("\\|")[0]
                        .replace("Reserva", "")
                        .trim());

        boolean ok = reservaService.cancelarReserva(idReserva);

        mostrar(
                ok
                        ? "Reserva cancelada"
                        : "Error al cancelar",
                ok
                        ? Alert.AlertType.INFORMATION
                        : Alert.AlertType.ERROR);

        refreshAll();
    }

    @FXML
    public void enviarIncidencia() {

        boolean ok = incidenciaService.crearIncidencia(
                USUARIO_ACTUAL,
                textoAsunto.getText(),
                textoDescripcion.getText());

        if (ok) {

            textoAsunto.clear();
            textoDescripcion.clear();
        }

        mostrar(
                ok
                        ? "Incidencia creada"
                        : "Completa todos los campos",
                ok
                        ? Alert.AlertType.INFORMATION
                        : Alert.AlertType.ERROR);

        cargarIncidencias();
    }

    @FXML
    public void verIncidencia() {

        String seleccion = listaIncidencias
                .getSelectionModel()
                .getSelectedItem();

        if (seleccion == null) {

            mostrar(
                    "Selecciona una incidencia",
                    Alert.AlertType.WARNING);

            return;
        }

        int id = Integer.parseInt(
                seleccion.split("\\|")[0].trim());

        Incidencia i = incidenciaService.findById(id);

        mostrar(
                "ASUNTO:\n"
                        + i.getAsunto()
                        + "\n\nDESCRIPCIÓN:\n"
                        + i.getDescripcion()
                        + "\n\nESTADO:\n"
                        + i.getEstado(),
                Alert.AlertType.INFORMATION);
    }

    @FXML
    public void eliminarIncidencia() {

        String seleccion = listaIncidencias
                .getSelectionModel()
                .getSelectedItem();

        if (seleccion == null) {

            mostrar(
                    "Selecciona una incidencia",
                    Alert.AlertType.WARNING);

            return;
        }

        int id = Integer.parseInt(
                seleccion.split("\\|")[0].trim());

        boolean ok = incidenciaService.delete(id);

        mostrar(
                ok
                        ? "Incidencia eliminada"
                        : "No se pudo eliminar",
                ok
                        ? Alert.AlertType.INFORMATION
                        : Alert.AlertType.ERROR);

        cargarIncidencias();
    }

    private void mostrar(
            String mensaje,
            Alert.AlertType tipo) {

        Alert alert = new Alert(tipo);

        alert.setHeaderText(null);
        alert.setContentText(mensaje);

        alert.showAndWait();
    }
}