package com.afop.disquera.model;

public class Genero {
    private int idGenero;
    private String nombreGenero;
    private Boolean estadoGenero;

    public Genero() {}

    public Genero(int idGenero, String nombreGenero, Boolean estadoGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
        this.estadoGenero = estadoGenero;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public Boolean getEstadoGenero() {
        return estadoGenero;
    }

    public void setEstadoGenero(Boolean estadoGenero) {
        this.estadoGenero = estadoGenero;
    }

    // Métodos adicionales
    public void listar() {}
    public void registrar() {}
    public void eliminar(int id) {}
    public void consultaId(int id) {}
    public void actualizar(int id) {}
    public void cambiarEstado() {}
}