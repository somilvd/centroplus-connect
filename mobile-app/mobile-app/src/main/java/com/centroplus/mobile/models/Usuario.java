package com.centroplus.mobile.models;

public class Usuario {

    Integer id;
    String nombre;
    String dni;
    String email;
    Integer telefono;
    String tipo_usuario;

    /**
     * Constructor vacio de la clase
     */
    public Usuario() {
    }

    /**
     * Constructor para busquedas de la clase
     * 
     * @param id Identificador del usuario
     */
    public Usuario(Integer id) {
        this.id = id;
    }

    /**
     * Contructor de la clase
     * 
     * @param id Identificador del usuario
     * @param nombre Nombre del usuario
     * @param dni Dni del usuario
     * @param email Email del usuario
     * @param telefono Telefono del usuario
     * @param tipo_usuario Tipo de usuario
     */
    public Usuario(Integer id, String nombre, String dni, String email, Integer telefono, String tipo_usuario) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.tipo_usuario = tipo_usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

}
