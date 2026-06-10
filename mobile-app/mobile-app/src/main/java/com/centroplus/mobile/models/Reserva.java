package com.centroplus.mobile.models;

public class Reserva {

    private Integer id;
    private Integer idUsuario;
    private Integer idActividad;
    private String fecha;
    private String estado;

    /**
     * Constructor vacio
     */
    public Reserva() {
    }

    /**
     * Constructor para busquedas
     * @param id Identificador de la reserva
     */
    public Reserva(Integer id) {
        this.id = id;
    }

    /**
     * Constructor de la clase
     * @param id Identificador de la reserva
     * @param idUsuario Identificador del usuario
     * @param idActividad Identificador de la actividad
     * @param fecha Fecha de la reserva
     * @param estado Estado de la reserva
     */
    public Reserva(int id,
            Integer idUsuario,
            Integer idActividad,
            String fecha,
            String estado) {

        this.id = id;
        this.idUsuario = idUsuario;
        this.idActividad = idActividad;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdActividad() {
        return idActividad;
    }
    
    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Reserva other = (Reserva) obj;
        return id != null && id.equals(other.id);
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id +
                ", idUsuario=" + idUsuario +
                ", idActividad=" + idActividad +
                ", fecha=" + fecha +
                ", estado=" + estado + "]";
    }
}