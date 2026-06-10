package com.centroplus.mobile.models;

public class Actividad {

    private int id;
    private String nombre;
    private String tipoActividad;
    private int duracion;
    private double precio;
    private int plazasMaximas;
    private int plazasOcupadas;

    /**
     * Constructor vacio de la clase
     */
    public Actividad() {}

    /**
     * Constructor para busquedas de la clase
     * @param id
     */
    public Actividad(int id) {
        this.id = id;
    }

    /**
     * Constructor de la clase
     * @param id Identificador de la actividad
     * @param nombre Nombre de la actividad
     * @param tipoActividad Tipo de actividad
     * @param duracion Duracion de la actividad
     * @param precio Precio de la actividad
     * @param plazasMaximas Plazas Maximas de la actividad
     * @param plazasOcupadas Plazas Ocupadas de la actividad
     */
    public Actividad(int id, String nombre, String tipoActividad, int duracion, double precio, int plazasMaximas, int plazasOcupadas) {

        this.id = id;
        this.nombre = nombre;
        this.tipoActividad = tipoActividad;
        this.duracion = duracion;
        this.precio = precio;
        this.plazasMaximas = plazasMaximas;
        this.plazasOcupadas = plazasOcupadas;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getPlazasMaximas() {
        return plazasMaximas;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
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
        Actividad other = (Actividad) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Actividad [id=" + id + ", nombre=" + nombre + ", tipoActividad=" + tipoActividad + ", duracion="
                + duracion + ", precio=" + precio + ", plazasMaximas=" + plazasMaximas + ", plazasOcupadas="
                + plazasOcupadas + "]";
    }

    
}