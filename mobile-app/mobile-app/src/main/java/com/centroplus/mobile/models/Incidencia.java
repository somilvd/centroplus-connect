package com.centroplus.mobile.models;

public class Incidencia {

    private int id;
    private int idUsuario;
    private String asunto;
    private String descripcion;
    private String fecha;
    private String estado;
    
    /**
     * Constructor vacio de la clase
     */
    public Incidencia() {}

    /**
     * Constructor para busquedas de la clase
     * @param id Identificador de la incidencia
     */
    public Incidencia(int id) {
        this.id = id;
    }

    /**
     * Constructor de la clase
     * @param id Identificador de la incidencia
     * @param idUsuario Identificador del usuario
     * @param asunto Asunto de la incidencia
     * @param descripcion Descripcion de la incidencia
     * @param fecha Fecha de la incidencia
     * @param estado Estado de la incidencia
     */
    public Incidencia(int id, int idUsuario, String asunto, String descripcion, String fecha, String estado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Incidencia other = (Incidencia) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Incidencia [id=" + id + ", idUsuario=" + idUsuario + ", asunto=" + asunto + ", descripcion="
                + descripcion + ", fecha=" + fecha + ", estado=" + estado + "]";
    }    
}